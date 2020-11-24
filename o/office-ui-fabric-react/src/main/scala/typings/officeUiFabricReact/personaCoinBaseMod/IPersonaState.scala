package typings.officeUiFabricReact.personaCoinBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPersonaState extends js.Object {
  
  var isImageError: js.UndefOr[Boolean] = js.native
  
  var isImageLoaded: js.UndefOr[Boolean] = js.native
}
object IPersonaState {
  
  @scala.inline
  def apply(): IPersonaState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPersonaState]
  }
  
  @scala.inline
  implicit class IPersonaStateOps[Self <: IPersonaState] (val x: Self) extends AnyVal {
    
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
    def setIsImageError(value: Boolean): Self = this.set("isImageError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsImageError: Self = this.set("isImageError", js.undefined)
    
    @scala.inline
    def setIsImageLoaded(value: Boolean): Self = this.set("isImageLoaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsImageLoaded: Self = this.set("isImageLoaded", js.undefined)
  }
}
