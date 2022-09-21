package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Durationms extends StObject {
  
  var duration_ms: Double
  
  var job_id: Double
}
object Durationms {
  
  inline def apply(duration_ms: Double, job_id: Double): Durationms = {
    val __obj = js.Dynamic.literal(duration_ms = duration_ms.asInstanceOf[js.Any], job_id = job_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Durationms]
  }
  
  extension [Self <: Durationms](x: Self) {
    
    inline def setDuration_ms(value: Double): Self = StObject.set(x, "duration_ms", value.asInstanceOf[js.Any])
    
    inline def setJob_id(value: Double): Self = StObject.set(x, "job_id", value.asInstanceOf[js.Any])
  }
}
