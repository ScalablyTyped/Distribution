package typings.officeUiFabricReact.personaTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPersonaPresenceStyles extends js.Object {
  
  var presence: IStyle = js.native
  
  var presenceIcon: IStyle = js.native
}
object IPersonaPresenceStyles {
  
  @scala.inline
  def apply(): IPersonaPresenceStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPersonaPresenceStyles]
  }
  
  @scala.inline
  implicit class IPersonaPresenceStylesOps[Self <: IPersonaPresenceStyles] (val x: Self) extends AnyVal {
    
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
    def setPresence(value: IStyle): Self = this.set("presence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePresence: Self = this.set("presence", js.undefined)
    
    @scala.inline
    def setPresenceNull: Self = this.set("presence", null)
    
    @scala.inline
    def setPresenceIcon(value: IStyle): Self = this.set("presenceIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePresenceIcon: Self = this.set("presenceIcon", js.undefined)
    
    @scala.inline
    def setPresenceIconNull: Self = this.set("presenceIcon", null)
  }
}
