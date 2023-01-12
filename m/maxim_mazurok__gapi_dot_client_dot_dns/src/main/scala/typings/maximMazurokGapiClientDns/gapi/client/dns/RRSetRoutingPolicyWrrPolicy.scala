package typings.maximMazurokGapiClientDns.gapi.client.dns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RRSetRoutingPolicyWrrPolicy extends StObject {
  
  var items: js.UndefOr[js.Array[RRSetRoutingPolicyWrrPolicyWrrPolicyItem]] = js.undefined
  
  var kind: js.UndefOr[String] = js.undefined
}
object RRSetRoutingPolicyWrrPolicy {
  
  inline def apply(): RRSetRoutingPolicyWrrPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RRSetRoutingPolicyWrrPolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RRSetRoutingPolicyWrrPolicy] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[RRSetRoutingPolicyWrrPolicyWrrPolicyItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: RRSetRoutingPolicyWrrPolicyWrrPolicyItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
