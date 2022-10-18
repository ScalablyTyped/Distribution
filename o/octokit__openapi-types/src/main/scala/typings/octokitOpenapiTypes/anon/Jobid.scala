package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Jobid extends StObject {
  
  /** The unique identifier of the job. */
  var job_id: Double
  
  /** The account owner of the repository. The name is not case sensitive. */
  var owner: String
  
  /** The name of the repository. The name is not case sensitive. */
  var repo: String
}
object Jobid {
  
  inline def apply(job_id: Double, owner: String, repo: String): Jobid = {
    val __obj = js.Dynamic.literal(job_id = job_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Jobid]
  }
  
  extension [Self <: Jobid](x: Self) {
    
    inline def setJob_id(value: Double): Self = StObject.set(x, "job_id", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
