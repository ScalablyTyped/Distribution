package typings.paypalCheckoutServerSdk.libPaymentsLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinkDescription extends StObject {
  
  var href: String
  
  var method: js.UndefOr[Method] = js.undefined
  
  var rel: String
}
object LinkDescription {
  
  inline def apply(href: String, rel: String): LinkDescription = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], rel = rel.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkDescription]
  }
  
  extension [Self <: LinkDescription](x: Self) {
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: Method): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
  }
}
