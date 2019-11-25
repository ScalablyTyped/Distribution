package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISourceObjectFiles extends js.Object {
  val Count: Double
  def Add(Index: Double, SourceObjectFile: ISourceObjectFile): Unit
  def AddEmptyFile(Title: String, Extension: String): ISourceObjectFile
  def AddFile(Title: String, Extension: String, SourcePath: String): ISourceObjectFile
  def Item(Index: Double): ISourceObjectFile
  def Remove(Index: Double): Unit
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
}

