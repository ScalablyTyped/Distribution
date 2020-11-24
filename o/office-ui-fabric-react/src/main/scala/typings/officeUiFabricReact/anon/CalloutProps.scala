package typings.officeUiFabricReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalloutProps extends js.Object {
  
  /**
    * Default calloutProps is deprecated in favor of private `_defaultCalloutProps`.
    * Remove in next release.
    * @deprecated In favor of private `_defaultCalloutProps`.
    */
  var calloutProps: DirectionalHint = js.native
}
object CalloutProps {
  
  @scala.inline
  def apply(calloutProps: DirectionalHint): CalloutProps = {
    val __obj = js.Dynamic.literal(calloutProps = calloutProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalloutProps]
  }
  
  @scala.inline
  implicit class CalloutPropsOps[Self <: CalloutProps] (val x: Self) extends AnyVal {
    
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
    def setCalloutProps(value: DirectionalHint): Self = this.set("calloutProps", value.asInstanceOf[js.Any])
  }
}
