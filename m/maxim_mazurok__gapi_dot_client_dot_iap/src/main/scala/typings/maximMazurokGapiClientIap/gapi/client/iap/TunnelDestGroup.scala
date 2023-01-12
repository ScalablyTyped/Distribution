package typings.maximMazurokGapiClientIap.gapi.client.iap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TunnelDestGroup extends StObject {
  
  /** null List of CIDRs that this group applies to. */
  var cidrs: js.UndefOr[js.Array[String]] = js.undefined
  
  /** null List of FQDNs that this group applies to. */
  var fqdns: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Required. Immutable. Identifier for the TunnelDestGroup. Must be unique within the project and contain only lower case letters (a-z) and dashes (-). */
  var name: js.UndefOr[String] = js.undefined
}
object TunnelDestGroup {
  
  inline def apply(): TunnelDestGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TunnelDestGroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TunnelDestGroup] (val x: Self) extends AnyVal {
    
    inline def setCidrs(value: js.Array[String]): Self = StObject.set(x, "cidrs", value.asInstanceOf[js.Any])
    
    inline def setCidrsUndefined: Self = StObject.set(x, "cidrs", js.undefined)
    
    inline def setCidrsVarargs(value: String*): Self = StObject.set(x, "cidrs", js.Array(value*))
    
    inline def setFqdns(value: js.Array[String]): Self = StObject.set(x, "fqdns", value.asInstanceOf[js.Any])
    
    inline def setFqdnsUndefined: Self = StObject.set(x, "fqdns", js.undefined)
    
    inline def setFqdnsVarargs(value: String*): Self = StObject.set(x, "fqdns", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
