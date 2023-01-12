package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Jobruns extends StObject {
  
  var job_runs: js.UndefOr[js.Array[Durationms]] = js.undefined
  
  var jobs: Double
  
  var total_ms: Double
}
object Jobruns {
  
  inline def apply(jobs: Double, total_ms: Double): Jobruns = {
    val __obj = js.Dynamic.literal(jobs = jobs.asInstanceOf[js.Any], total_ms = total_ms.asInstanceOf[js.Any])
    __obj.asInstanceOf[Jobruns]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Jobruns] (val x: Self) extends AnyVal {
    
    inline def setJob_runs(value: js.Array[Durationms]): Self = StObject.set(x, "job_runs", value.asInstanceOf[js.Any])
    
    inline def setJob_runsUndefined: Self = StObject.set(x, "job_runs", js.undefined)
    
    inline def setJob_runsVarargs(value: Durationms*): Self = StObject.set(x, "job_runs", js.Array(value*))
    
    inline def setJobs(value: Double): Self = StObject.set(x, "jobs", value.asInstanceOf[js.Any])
    
    inline def setTotal_ms(value: Double): Self = StObject.set(x, "total_ms", value.asInstanceOf[js.Any])
  }
}
