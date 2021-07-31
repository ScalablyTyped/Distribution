package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Limit extends StObject {
  
  var limit: Double
  
  var remaining: Double
  
  var reset: Double
}
object Limit {
  
  @scala.inline
  def apply(limit: Double, remaining: Double, reset: Double): Limit = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any], remaining = remaining.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Limit]
  }
  
  @scala.inline
  implicit class LimitMutableBuilder[Self <: Limit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemaining(value: Double): Self = StObject.set(x, "remaining", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReset(value: Double): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
  }
}
