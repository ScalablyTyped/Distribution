package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISourceObjectFiles extends StObject {
  
  def Add(Index: Double, SourceObjectFile: ISourceObjectFile): Unit
  
  def AddEmptyFile(Title: String, Extension: String): ISourceObjectFile
  
  def AddFile(Title: String, Extension: String, SourcePath: String): ISourceObjectFile
  
  val Count: Double
  
  def Item(Index: Double): ISourceObjectFile
  
  def Remove(Index: Double): Unit
}
object ISourceObjectFiles {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: ISourceObjectFiles] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: (Double, ISourceObjectFile) => Unit): Self = StObject.set(x, "Add", js.Any.fromFunction2(value))
    
    inline def setAddEmptyFile(value: (String, String) => ISourceObjectFile): Self = StObject.set(x, "AddEmptyFile", js.Any.fromFunction2(value))
    
    inline def setAddFile(value: (String, String, String) => ISourceObjectFile): Self = StObject.set(x, "AddFile", js.Any.fromFunction3(value))
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => ISourceObjectFile): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setRemove(value: Double => Unit): Self = StObject.set(x, "Remove", js.Any.fromFunction1(value))
  }
}
