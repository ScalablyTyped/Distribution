package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Remaining extends StObject {
  
  var limit: Double
  
  var remaining: Double
  
  var reset: Double
  
  var used: Double
}
object Remaining {
  
  inline def apply(limit: Double, remaining: Double, reset: Double, used: Double): Remaining = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any], remaining = remaining.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], used = used.asInstanceOf[js.Any])
    __obj.asInstanceOf[Remaining]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Remaining] (val x: Self) extends AnyVal {
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setRemaining(value: Double): Self = StObject.set(x, "remaining", value.asInstanceOf[js.Any])
    
    inline def setReset(value: Double): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
    
    inline def setUsed(value: Double): Self = StObject.set(x, "used", value.asInstanceOf[js.Any])
  }
}
