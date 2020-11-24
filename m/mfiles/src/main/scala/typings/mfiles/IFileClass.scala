package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFileClass extends js.Object {
  
  def Clone(): IFileClass = js.native
  
  var DisplayName: String = js.native
  
  val DotAndExtension: String = js.native
  
  val Extension: String = js.native
  
  val FileClass: String = js.native
  
  def LoadByExtension(Extension: String): Unit = js.native
  
  def LoadByFileClass(Extension: String, FileClass: String): Unit = js.native
  
  def SetFileClassInfo(DotAndFileExtension: String, FileClass: String, FileClassDisplayName: String): Unit = js.native
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
  implicit class IFileClassOps[Self <: IFileClass] (val x: Self) extends AnyVal {
    
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
    def setClone(value: () => IFileClass): Self = this.set("Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("DisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDotAndExtension(value: String): Self = this.set("DotAndExtension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtension(value: String): Self = this.set("Extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileClass(value: String): Self = this.set("FileClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadByExtension(value: String => Unit): Self = this.set("LoadByExtension", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLoadByFileClass(value: (String, String) => Unit): Self = this.set("LoadByFileClass", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetFileClassInfo(value: (String, String, String) => Unit): Self = this.set("SetFileClassInfo", js.Any.fromFunction3(value))
  }
}
