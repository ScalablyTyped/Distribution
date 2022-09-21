package typings.nats.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JetStreamApiStats extends StObject {
  
  var errors: Double
  
  var total: Double
}
object JetStreamApiStats {
  
  inline def apply(errors: Double, total: Double): JetStreamApiStats = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[JetStreamApiStats]
  }
  
  extension [Self <: JetStreamApiStats](x: Self) {
    
    inline def setErrors(value: Double): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
