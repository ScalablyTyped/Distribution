package typings.officeUiFabricReact.documentCardActivityTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDocumentCardActivityStyles extends js.Object {
  
  var activity: IStyle = js.native
  
  var avatar: IStyle = js.native
  
  var avatars: IStyle = js.native
  
  var details: IStyle = js.native
  
  var name: IStyle = js.native
  
  var root: IStyle = js.native
}
object IDocumentCardActivityStyles {
  
  @scala.inline
  def apply(): IDocumentCardActivityStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDocumentCardActivityStyles]
  }
  
  @scala.inline
  implicit class IDocumentCardActivityStylesOps[Self <: IDocumentCardActivityStyles] (val x: Self) extends AnyVal {
    
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
    def setActivity(value: IStyle): Self = this.set("activity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivity: Self = this.set("activity", js.undefined)
    
    @scala.inline
    def setActivityNull: Self = this.set("activity", null)
    
    @scala.inline
    def setAvatar(value: IStyle): Self = this.set("avatar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvatar: Self = this.set("avatar", js.undefined)
    
    @scala.inline
    def setAvatarNull: Self = this.set("avatar", null)
    
    @scala.inline
    def setAvatars(value: IStyle): Self = this.set("avatars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvatars: Self = this.set("avatars", js.undefined)
    
    @scala.inline
    def setAvatarsNull: Self = this.set("avatars", null)
    
    @scala.inline
    def setDetails(value: IStyle): Self = this.set("details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetails: Self = this.set("details", js.undefined)
    
    @scala.inline
    def setDetailsNull: Self = this.set("details", null)
    
    @scala.inline
    def setName(value: IStyle): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNameNull: Self = this.set("name", null)
    
    @scala.inline
    def setRoot(value: IStyle): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    
    @scala.inline
    def setRootNull: Self = this.set("root", null)
  }
}
