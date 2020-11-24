package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdentityContainer extends Entity {
  
  var conditionalAccess: js.UndefOr[NullableOption[ConditionalAccessRoot]] = js.native
}
object IdentityContainer {
  
  @scala.inline
  def apply(): IdentityContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityContainer]
  }
  
  @scala.inline
  implicit class IdentityContainerOps[Self <: IdentityContainer] (val x: Self) extends AnyVal {
    
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
    def setConditionalAccess(value: NullableOption[ConditionalAccessRoot]): Self = this.set("conditionalAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConditionalAccess: Self = this.set("conditionalAccess", js.undefined)
    
    @scala.inline
    def setConditionalAccessNull: Self = this.set("conditionalAccess", null)
  }
}
