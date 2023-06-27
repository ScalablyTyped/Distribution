package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InboundOutboundPolicyConfiguration extends StObject {
  
  // Defines whether external users coming inbound are allowed.
  var inboundAllowed: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Defines whether internal users are allowed to go outbound.
  var outboundAllowed: js.UndefOr[NullableOption[Boolean]] = js.undefined
}
object InboundOutboundPolicyConfiguration {
  
  inline def apply(): InboundOutboundPolicyConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InboundOutboundPolicyConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InboundOutboundPolicyConfiguration] (val x: Self) extends AnyVal {
    
    inline def setInboundAllowed(value: NullableOption[Boolean]): Self = StObject.set(x, "inboundAllowed", value.asInstanceOf[js.Any])
    
    inline def setInboundAllowedNull: Self = StObject.set(x, "inboundAllowed", null)
    
    inline def setInboundAllowedUndefined: Self = StObject.set(x, "inboundAllowed", js.undefined)
    
    inline def setOutboundAllowed(value: NullableOption[Boolean]): Self = StObject.set(x, "outboundAllowed", value.asInstanceOf[js.Any])
    
    inline def setOutboundAllowedNull: Self = StObject.set(x, "outboundAllowed", null)
    
    inline def setOutboundAllowedUndefined: Self = StObject.set(x, "outboundAllowed", js.undefined)
  }
}
