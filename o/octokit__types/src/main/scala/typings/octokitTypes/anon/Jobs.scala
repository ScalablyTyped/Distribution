package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Jobs extends StObject {
  
  var jobs: Double = js.native
  
  var total_ms: Double = js.native
}
object Jobs {
  
  @scala.inline
  def apply(jobs: Double, total_ms: Double): Jobs = {
    val __obj = js.Dynamic.literal(jobs = jobs.asInstanceOf[js.Any], total_ms = total_ms.asInstanceOf[js.Any])
    __obj.asInstanceOf[Jobs]
  }
  
  @scala.inline
  implicit class JobsMutableBuilder[Self <: Jobs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobs(value: Double): Self = StObject.set(x, "jobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal_ms(value: Double): Self = StObject.set(x, "total_ms", value.asInstanceOf[js.Any])
  }
}
