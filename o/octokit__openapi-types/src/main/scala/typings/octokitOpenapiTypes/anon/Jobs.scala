package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Jobs extends StObject {
  
  var jobs: js.Array[Checkrunurl]
  
  var total_count: Double
}
object Jobs {
  
  inline def apply(jobs: js.Array[Checkrunurl], total_count: Double): Jobs = {
    val __obj = js.Dynamic.literal(jobs = jobs.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[Jobs]
  }
  
  extension [Self <: Jobs](x: Self) {
    
    inline def setJobs(value: js.Array[Checkrunurl]): Self = StObject.set(x, "jobs", value.asInstanceOf[js.Any])
    
    inline def setJobsVarargs(value: Checkrunurl*): Self = StObject.set(x, "jobs", js.Array(value*))
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
