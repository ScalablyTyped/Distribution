package typings.officeUiFabricReact.stackItemTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStackItemTokens extends js.Object {
  
  /**
    * Defines the margin to be applied to the StackItem relative to its container.
    */
  var margin: js.UndefOr[Double | String] = js.native
  
  /**
    * Defines the padding to be applied to the StackItem contents relative to its border.
    */
  var padding: js.UndefOr[Double | String] = js.native
}
object IStackItemTokens {
  
  @scala.inline
  def apply(): IStackItemTokens = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStackItemTokens]
  }
  
  @scala.inline
  implicit class IStackItemTokensOps[Self <: IStackItemTokens] (val x: Self) extends AnyVal {
    
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
    def setMargin(value: Double | String): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    
    @scala.inline
    def setPadding(value: Double | String): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
  }
}
