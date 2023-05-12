package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.all
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.selected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scope extends StObject {
  
  /** @description The ID of the repository that contains the workflow file. */
  var repository_id: String
  
  /**
    * @description Enable the required workflow for all repositories or selected repositories in the organization.
    * @default all
    * @enum {string}
    */
  var scope: js.UndefOr[selected | all] = js.undefined
  
  /** @description A list of repository IDs where you want to enable the required workflow. You can only provide a list of repository ids when the `scope` is set to `selected`. */
  var selected_repository_ids: js.UndefOr[js.Array[Double]] = js.undefined
  
  /** @description Path of the workflow file to be configured as a required workflow. */
  var workflow_file_path: String
}
object Scope {
  
  inline def apply(repository_id: String, workflow_file_path: String): Scope = {
    val __obj = js.Dynamic.literal(repository_id = repository_id.asInstanceOf[js.Any], workflow_file_path = workflow_file_path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scope]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Scope] (val x: Self) extends AnyVal {
    
    inline def setRepository_id(value: String): Self = StObject.set(x, "repository_id", value.asInstanceOf[js.Any])
    
    inline def setScope(value: selected | all): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setSelected_repository_ids(value: js.Array[Double]): Self = StObject.set(x, "selected_repository_ids", value.asInstanceOf[js.Any])
    
    inline def setSelected_repository_idsUndefined: Self = StObject.set(x, "selected_repository_ids", js.undefined)
    
    inline def setSelected_repository_idsVarargs(value: Double*): Self = StObject.set(x, "selected_repository_ids", js.Array(value*))
    
    inline def setWorkflow_file_path(value: String): Self = StObject.set(x, "workflow_file_path", value.asInstanceOf[js.Any])
  }
}
