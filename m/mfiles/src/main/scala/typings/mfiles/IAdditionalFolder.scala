package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAdditionalFolder extends js.Object {
  
  def Clone(): IAdditionalFolder = js.native
  
  var Folder: String = js.native
  
  var Impersonation: IImpersonation = js.native
  
  var LimitInMB: Double = js.native
}
object IAdditionalFolder {
  
  @scala.inline
  def apply(Clone: () => IAdditionalFolder, Folder: String, Impersonation: IImpersonation, LimitInMB: Double): IAdditionalFolder = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Folder = Folder.asInstanceOf[js.Any], Impersonation = Impersonation.asInstanceOf[js.Any], LimitInMB = LimitInMB.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAdditionalFolder]
  }
  
  @scala.inline
  implicit class IAdditionalFolderOps[Self <: IAdditionalFolder] (val x: Self) extends AnyVal {
    
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
    def setClone(value: () => IAdditionalFolder): Self = this.set("Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFolder(value: String): Self = this.set("Folder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImpersonation(value: IImpersonation): Self = this.set("Impersonation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitInMB(value: Double): Self = this.set("LimitInMB", value.asInstanceOf[js.Any])
  }
}
