package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISourceObjectFiles extends js.Object {
  val Count: Double = js.native
  def Add(Index: Double, SourceObjectFile: ISourceObjectFile): Unit = js.native
  def AddEmptyFile(Title: String, Extension: String): ISourceObjectFile = js.native
  def AddFile(Title: String, Extension: String, SourcePath: String): ISourceObjectFile = js.native
  def Item(Index: Double): ISourceObjectFile = js.native
  def Remove(Index: Double): Unit = js.native
}

object ISourceObjectFiles {
  @scala.inline
  def apply(
    Add: (Double, ISourceObjectFile) => Unit,
    AddEmptyFile: (String, String) => ISourceObjectFile,
    AddFile: (String, String, String) => ISourceObjectFile,
    Count: Double,
    Item: Double => ISourceObjectFile,
    Remove: Double => Unit
  ): ISourceObjectFiles = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), AddEmptyFile = js.Any.fromFunction2(AddEmptyFile), AddFile = js.Any.fromFunction3(AddFile), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
    __obj.asInstanceOf[ISourceObjectFiles]
  }
  @scala.inline
  implicit class ISourceObjectFilesOps[Self <: ISourceObjectFiles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdd(value: (Double, ISourceObjectFile) => Unit): Self = this.set("Add", js.Any.fromFunction2(value))
    @scala.inline
    def setAddEmptyFile(value: (String, String) => ISourceObjectFile): Self = this.set("AddEmptyFile", js.Any.fromFunction2(value))
    @scala.inline
    def setAddFile(value: (String, String, String) => ISourceObjectFile): Self = this.set("AddFile", js.Any.fromFunction3(value))
    @scala.inline
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: Double => ISourceObjectFile): Self = this.set("Item", js.Any.fromFunction1(value))
    @scala.inline
    def setRemove(value: Double => Unit): Self = this.set("Remove", js.Any.fromFunction1(value))
  }
  
}

