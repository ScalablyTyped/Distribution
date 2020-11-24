package typings.officeUiFabricReact.shimmerBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IShimmerState extends js.Object {
  
  /**
    * Flag for knowing when to remove the shimmerWrapper from the DOM.
    */
  var contentLoaded: js.UndefOr[Boolean] = js.native
}
object IShimmerState {
  
  @scala.inline
  def apply(): IShimmerState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IShimmerState]
  }
  
  @scala.inline
  implicit class IShimmerStateOps[Self <: IShimmerState] (val x: Self) extends AnyVal {
    
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
    def setContentLoaded(value: Boolean): Self = this.set("contentLoaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentLoaded: Self = this.set("contentLoaded", js.undefined)
  }
}
