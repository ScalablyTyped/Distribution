package typings.officeUiFabricReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalloutProps extends StObject {
  
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
  implicit class CalloutPropsMutableBuilder[Self <: CalloutProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCalloutProps(value: DirectionalHint): Self = StObject.set(x, "calloutProps", value.asInstanceOf[js.Any])
  }
}
