package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRateLimitRemaining extends StObject {
  
  var `X-RateLimit-Limit`: Double
  
  var `X-RateLimit-Remaining`: Double
  
  var `X-RateLimit-Reset`: Double
}
object XRateLimitRemaining {
  
  inline def apply(`X-RateLimit-Limit`: Double, `X-RateLimit-Remaining`: Double, `X-RateLimit-Reset`: Double): XRateLimitRemaining = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("X-RateLimit-Limit")(`X-RateLimit-Limit`.asInstanceOf[js.Any])
    __obj.updateDynamic("X-RateLimit-Remaining")(`X-RateLimit-Remaining`.asInstanceOf[js.Any])
    __obj.updateDynamic("X-RateLimit-Reset")(`X-RateLimit-Reset`.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRateLimitRemaining]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XRateLimitRemaining] (val x: Self) extends AnyVal {
    
    inline def `setX-RateLimit-Limit`(value: Double): Self = StObject.set(x, "X-RateLimit-Limit", value.asInstanceOf[js.Any])
    
    inline def `setX-RateLimit-Remaining`(value: Double): Self = StObject.set(x, "X-RateLimit-Remaining", value.asInstanceOf[js.Any])
    
    inline def `setX-RateLimit-Reset`(value: Double): Self = StObject.set(x, "X-RateLimit-Reset", value.asInstanceOf[js.Any])
  }
}
