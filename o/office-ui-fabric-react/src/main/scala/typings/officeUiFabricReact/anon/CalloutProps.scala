package typings.officeUiFabricReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalloutProps extends StObject {
  
  /**
    * Default calloutProps is deprecated in favor of private `_defaultCalloutProps`.
    * Remove in next release.
    * @deprecated In favor of private `_defaultCalloutProps`.
    */
  var calloutProps: DirectionalHint
}
object CalloutProps {
  
  inline def apply(calloutProps: DirectionalHint): CalloutProps = {
    val __obj = js.Dynamic.literal(calloutProps = calloutProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalloutProps]
  }
  
  extension [Self <: CalloutProps](x: Self) {
    
    inline def setCalloutProps(value: DirectionalHint): Self = StObject.set(x, "calloutProps", value.asInstanceOf[js.Any])
  }
}
