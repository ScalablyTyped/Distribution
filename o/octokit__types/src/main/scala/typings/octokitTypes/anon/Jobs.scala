package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Jobs extends StObject {
  
  var jobs: Double
  
  var total_ms: Double
}
object Jobs {
  
  inline def apply(jobs: Double, total_ms: Double): Jobs = {
    val __obj = js.Dynamic.literal(jobs = jobs.asInstanceOf[js.Any], total_ms = total_ms.asInstanceOf[js.Any])
    __obj.asInstanceOf[Jobs]
  }
  
  extension [Self <: Jobs](x: Self) {
    
    inline def setJobs(value: Double): Self = StObject.set(x, "jobs", value.asInstanceOf[js.Any])
    
    inline def setTotal_ms(value: Double): Self = StObject.set(x, "total_ms", value.asInstanceOf[js.Any])
  }
}
