package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFileClass extends StObject {
  
  def Clone(): IFileClass
  
  var DisplayName: String
  
  val DotAndExtension: String
  
  val Extension: String
  
  val FileClass: String
  
  def LoadByExtension(Extension: String): Unit
  
  def LoadByFileClass(Extension: String, FileClass: String): Unit
  
  def SetFileClassInfo(DotAndFileExtension: String, FileClass: String, FileClassDisplayName: String): Unit
}
object IFileClass {
  
  @scala.inline
  def apply(
    Clone: () => IFileClass,
    DisplayName: String,
    DotAndExtension: String,
    Extension: String,
    FileClass: String,
    LoadByExtension: String => Unit,
    LoadByFileClass: (String, String) => Unit,
    SetFileClassInfo: (String, String, String) => Unit
  ): IFileClass = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), DisplayName = DisplayName.asInstanceOf[js.Any], DotAndExtension = DotAndExtension.asInstanceOf[js.Any], Extension = Extension.asInstanceOf[js.Any], FileClass = FileClass.asInstanceOf[js.Any], LoadByExtension = js.Any.fromFunction1(LoadByExtension), LoadByFileClass = js.Any.fromFunction2(LoadByFileClass), SetFileClassInfo = js.Any.fromFunction3(SetFileClassInfo))
    __obj.asInstanceOf[IFileClass]
  }
  
  @scala.inline
  implicit class IFileClassMutableBuilder[Self <: IFileClass] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClone(value: () => IFileClass): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDotAndExtension(value: String): Self = StObject.set(x, "DotAndExtension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtension(value: String): Self = StObject.set(x, "Extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileClass(value: String): Self = StObject.set(x, "FileClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadByExtension(value: String => Unit): Self = StObject.set(x, "LoadByExtension", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLoadByFileClass(value: (String, String) => Unit): Self = StObject.set(x, "LoadByFileClass", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetFileClassInfo(value: (String, String, String) => Unit): Self = StObject.set(x, "SetFileClassInfo", js.Any.fromFunction3(value))
  }
}
