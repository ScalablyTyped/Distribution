package typings.paypalCheckoutServerSdk.ordersLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BusinessName extends StObject {
  
  var business_name: String
  
  var orthography: Orthography
}
object BusinessName {
  
  inline def apply(business_name: String, orthography: Orthography): BusinessName = {
    val __obj = js.Dynamic.literal(business_name = business_name.asInstanceOf[js.Any], orthography = orthography.asInstanceOf[js.Any])
    __obj.asInstanceOf[BusinessName]
  }
  
  extension [Self <: BusinessName](x: Self) {
    
    inline def setBusiness_name(value: String): Self = StObject.set(x, "business_name", value.asInstanceOf[js.Any])
    
    inline def setOrthography(value: Orthography): Self = StObject.set(x, "orthography", value.asInstanceOf[js.Any])
  }
}
