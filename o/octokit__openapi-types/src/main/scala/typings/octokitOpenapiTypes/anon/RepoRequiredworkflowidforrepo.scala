package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepoRequiredworkflowidforrepo extends StObject {
  
  @JSName("org")
  var org_ : String
  
  var repo: String
  
  var required_workflow_id_for_repo: Double
}
object RepoRequiredworkflowidforrepo {
  
  inline def apply(org_ : String, repo: String, required_workflow_id_for_repo: Double): RepoRequiredworkflowidforrepo = {
    val __obj = js.Dynamic.literal(repo = repo.asInstanceOf[js.Any], required_workflow_id_for_repo = required_workflow_id_for_repo.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepoRequiredworkflowidforrepo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RepoRequiredworkflowidforrepo] (val x: Self) extends AnyVal {
    
    inline def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    inline def setRequired_workflow_id_for_repo(value: Double): Self = StObject.set(x, "required_workflow_id_for_repo", value.asInstanceOf[js.Any])
  }
}
