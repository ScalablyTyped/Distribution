package typings.paypalCheckoutServerSdk.ordersLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelAuthorizationDirectives extends StObject {
  
  var allow_multiple_captures: Boolean
  
  var expiry_time_offset: Double
  
  var honor_time_offset: Double
  
  var tolerance: ModelAuthTolerance
}
object ModelAuthorizationDirectives {
  
  inline def apply(
    allow_multiple_captures: Boolean,
    expiry_time_offset: Double,
    honor_time_offset: Double,
    tolerance: ModelAuthTolerance
  ): ModelAuthorizationDirectives = {
    val __obj = js.Dynamic.literal(allow_multiple_captures = allow_multiple_captures.asInstanceOf[js.Any], expiry_time_offset = expiry_time_offset.asInstanceOf[js.Any], honor_time_offset = honor_time_offset.asInstanceOf[js.Any], tolerance = tolerance.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelAuthorizationDirectives]
  }
  
  extension [Self <: ModelAuthorizationDirectives](x: Self) {
    
    inline def setAllow_multiple_captures(value: Boolean): Self = StObject.set(x, "allow_multiple_captures", value.asInstanceOf[js.Any])
    
    inline def setExpiry_time_offset(value: Double): Self = StObject.set(x, "expiry_time_offset", value.asInstanceOf[js.Any])
    
    inline def setHonor_time_offset(value: Double): Self = StObject.set(x, "honor_time_offset", value.asInstanceOf[js.Any])
    
    inline def setTolerance(value: ModelAuthTolerance): Self = StObject.set(x, "tolerance", value.asInstanceOf[js.Any])
  }
}
