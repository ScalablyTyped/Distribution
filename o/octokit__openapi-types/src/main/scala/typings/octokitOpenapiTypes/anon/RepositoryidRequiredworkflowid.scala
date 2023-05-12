package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepositoryidRequiredworkflowid extends StObject {
  
  @JSName("org")
  var org_ : String
  
  var repository_id: Double
  
  var required_workflow_id: Double
}
object RepositoryidRequiredworkflowid {
  
  inline def apply(org_ : String, repository_id: Double, required_workflow_id: Double): RepositoryidRequiredworkflowid = {
    val __obj = js.Dynamic.literal(repository_id = repository_id.asInstanceOf[js.Any], required_workflow_id = required_workflow_id.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositoryidRequiredworkflowid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RepositoryidRequiredworkflowid] (val x: Self) extends AnyVal {
    
    inline def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    inline def setRepository_id(value: Double): Self = StObject.set(x, "repository_id", value.asInstanceOf[js.Any])
    
    inline def setRequired_workflow_id(value: Double): Self = StObject.set(x, "required_workflow_id", value.asInstanceOf[js.Any])
  }
}
