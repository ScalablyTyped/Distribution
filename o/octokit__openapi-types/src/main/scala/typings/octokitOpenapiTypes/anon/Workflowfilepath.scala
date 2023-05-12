package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.all
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.selected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Workflowfilepath extends StObject {
  
  /** @description The ID of the repository that contains the workflow file. */
  var repository_id: js.UndefOr[String] = js.undefined
  
  /**
    * @description Enable the required workflow for all repositories or selected repositories in the organization.
    * @default all
    * @enum {string}
    */
  var scope: js.UndefOr[selected | all] = js.undefined
  
  /** @description A list of repository IDs where you want to enable the required workflow. A list of repository IDs where you want to enable the required workflow. You can only provide a list of repository ids when the `scope` is set to `selected`. */
  var selected_repository_ids: js.UndefOr[js.Array[Double]] = js.undefined
  
  /** @description Path of the workflow file to be configured as a required workflow. */
  var workflow_file_path: js.UndefOr[String] = js.undefined
}
object Workflowfilepath {
  
  inline def apply(): Workflowfilepath = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Workflowfilepath]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Workflowfilepath] (val x: Self) extends AnyVal {
    
    inline def setRepository_id(value: String): Self = StObject.set(x, "repository_id", value.asInstanceOf[js.Any])
    
    inline def setRepository_idUndefined: Self = StObject.set(x, "repository_id", js.undefined)
    
    inline def setScope(value: selected | all): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setSelected_repository_ids(value: js.Array[Double]): Self = StObject.set(x, "selected_repository_ids", value.asInstanceOf[js.Any])
    
    inline def setSelected_repository_idsUndefined: Self = StObject.set(x, "selected_repository_ids", js.undefined)
    
    inline def setSelected_repository_idsVarargs(value: Double*): Self = StObject.set(x, "selected_repository_ids", js.Array(value*))
    
    inline def setWorkflow_file_path(value: String): Self = StObject.set(x, "workflow_file_path", value.asInstanceOf[js.Any])
    
    inline def setWorkflow_file_pathUndefined: Self = StObject.set(x, "workflow_file_path", js.undefined)
  }
}
