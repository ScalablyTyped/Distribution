package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OwnerRepoRequiredworkflowidforrepo extends StObject {
  
  var owner: String
  
  var repo: String
  
  var required_workflow_id_for_repo: Double
}
object OwnerRepoRequiredworkflowidforrepo {
  
  inline def apply(owner: String, repo: String, required_workflow_id_for_repo: Double): OwnerRepoRequiredworkflowidforrepo = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], required_workflow_id_for_repo = required_workflow_id_for_repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[OwnerRepoRequiredworkflowidforrepo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OwnerRepoRequiredworkflowidforrepo] (val x: Self) extends AnyVal {
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    inline def setRequired_workflow_id_for_repo(value: Double): Self = StObject.set(x, "required_workflow_id_for_repo", value.asInstanceOf[js.Any])
  }
}
