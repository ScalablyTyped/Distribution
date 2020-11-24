package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IObjectFiles extends js.Object {
  
  val Count: Double = js.native
  
  def GetObjectFileByNameForFileSystem(NameForFileSystem: String): IObjectFile = js.native
  
  def GetObjectFileIndexByNameForFileSystem(NameForFileSystem: String): Double = js.native
  
  def Item(Index: Double): IObjectFile = js.native
  
  def Sort(ObjectFileComparer: IObjectFileComparer): Unit = js.native
  
  def ToJSON(): String = js.native
}
object IObjectFiles {
  
  @scala.inline
  def apply(
    Count: Double,
    GetObjectFileByNameForFileSystem: String => IObjectFile,
    GetObjectFileIndexByNameForFileSystem: String => Double,
    Item: Double => IObjectFile,
    Sort: IObjectFileComparer => Unit,
    ToJSON: () => String
  ): IObjectFiles = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], GetObjectFileByNameForFileSystem = js.Any.fromFunction1(GetObjectFileByNameForFileSystem), GetObjectFileIndexByNameForFileSystem = js.Any.fromFunction1(GetObjectFileIndexByNameForFileSystem), Item = js.Any.fromFunction1(Item), Sort = js.Any.fromFunction1(Sort), ToJSON = js.Any.fromFunction0(ToJSON))
    __obj.asInstanceOf[IObjectFiles]
  }
  
  @scala.inline
  implicit class IObjectFilesOps[Self <: IObjectFiles] (val x: Self) extends AnyVal {
    
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
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetObjectFileByNameForFileSystem(value: String => IObjectFile): Self = this.set("GetObjectFileByNameForFileSystem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetObjectFileIndexByNameForFileSystem(value: String => Double): Self = this.set("GetObjectFileIndexByNameForFileSystem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setItem(value: Double => IObjectFile): Self = this.set("Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSort(value: IObjectFileComparer => Unit): Self = this.set("Sort", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToJSON(value: () => String): Self = this.set("ToJSON", js.Any.fromFunction0(value))
  }
}
