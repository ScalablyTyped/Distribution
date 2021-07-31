package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IObjectFiles extends StObject {
  
  val Count: Double
  
  def GetObjectFileByNameForFileSystem(NameForFileSystem: String): IObjectFile
  
  def GetObjectFileIndexByNameForFileSystem(NameForFileSystem: String): Double
  
  def Item(Index: Double): IObjectFile
  
  def Sort(ObjectFileComparer: IObjectFileComparer): Unit
  
  def ToJSON(): String
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
  implicit class IObjectFilesMutableBuilder[Self <: IObjectFiles] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetObjectFileByNameForFileSystem(value: String => IObjectFile): Self = StObject.set(x, "GetObjectFileByNameForFileSystem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetObjectFileIndexByNameForFileSystem(value: String => Double): Self = StObject.set(x, "GetObjectFileIndexByNameForFileSystem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setItem(value: Double => IObjectFile): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSort(value: IObjectFileComparer => Unit): Self = StObject.set(x, "Sort", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToJSON(value: () => String): Self = StObject.set(x, "ToJSON", js.Any.fromFunction0(value))
  }
}
