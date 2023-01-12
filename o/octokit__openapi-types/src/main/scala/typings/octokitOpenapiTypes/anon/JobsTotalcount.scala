package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobsTotalcount extends StObject {
  
  var jobs: js.Array[Checkrunurl]
  
  var total_count: Double
}
object JobsTotalcount {
  
  inline def apply(jobs: js.Array[Checkrunurl], total_count: Double): JobsTotalcount = {
    val __obj = js.Dynamic.literal(jobs = jobs.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobsTotalcount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JobsTotalcount] (val x: Self) extends AnyVal {
    
    inline def setJobs(value: js.Array[Checkrunurl]): Self = StObject.set(x, "jobs", value.asInstanceOf[js.Any])
    
    inline def setJobsVarargs(value: Checkrunurl*): Self = StObject.set(x, "jobs", js.Array(value*))
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
