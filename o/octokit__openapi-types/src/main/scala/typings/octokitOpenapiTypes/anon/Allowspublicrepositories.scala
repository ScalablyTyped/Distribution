package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Allowspublicrepositories extends StObject {
  
  var default: Boolean
  
  var allows_public_repositories: Boolean
  
  var id: Double
  
  var name: String
  
  /**
    * @description If `true`, the runner group will be restricted to running only the workflows specified in the `selected_workflows` array.
    * @default false
    */
  var restricted_to_workflows: js.UndefOr[Boolean] = js.undefined
  
  var runners_url: String
  
  var selected_organizations_url: js.UndefOr[String] = js.undefined
  
  /** @description List of workflows the runner group should be allowed to run. This setting will be ignored unless `restricted_to_workflows` is set to `true`. */
  var selected_workflows: js.UndefOr[js.Array[String]] = js.undefined
  
  var visibility: String
  
  /**
    * @description If `true`, the `restricted_to_workflows` and `selected_workflows` fields cannot be modified.
    * @default false
    */
  var workflow_restrictions_read_only: js.UndefOr[Boolean] = js.undefined
}
object Allowspublicrepositories {
  
  inline def apply(
    allows_public_repositories: Boolean,
    default: Boolean,
    id: Double,
    name: String,
    runners_url: String,
    visibility: String
  ): Allowspublicrepositories = {
    val __obj = js.Dynamic.literal(allows_public_repositories = allows_public_repositories.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], runners_url = runners_url.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[Allowspublicrepositories]
  }
  
  extension [Self <: Allowspublicrepositories](x: Self) {
    
    inline def setAllows_public_repositories(value: Boolean): Self = StObject.set(x, "allows_public_repositories", value.asInstanceOf[js.Any])
    
    inline def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRestricted_to_workflows(value: Boolean): Self = StObject.set(x, "restricted_to_workflows", value.asInstanceOf[js.Any])
    
    inline def setRestricted_to_workflowsUndefined: Self = StObject.set(x, "restricted_to_workflows", js.undefined)
    
    inline def setRunners_url(value: String): Self = StObject.set(x, "runners_url", value.asInstanceOf[js.Any])
    
    inline def setSelected_organizations_url(value: String): Self = StObject.set(x, "selected_organizations_url", value.asInstanceOf[js.Any])
    
    inline def setSelected_organizations_urlUndefined: Self = StObject.set(x, "selected_organizations_url", js.undefined)
    
    inline def setSelected_workflows(value: js.Array[String]): Self = StObject.set(x, "selected_workflows", value.asInstanceOf[js.Any])
    
    inline def setSelected_workflowsUndefined: Self = StObject.set(x, "selected_workflows", js.undefined)
    
    inline def setSelected_workflowsVarargs(value: String*): Self = StObject.set(x, "selected_workflows", js.Array(value*))
    
    inline def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    inline def setWorkflow_restrictions_read_only(value: Boolean): Self = StObject.set(x, "workflow_restrictions_read_only", value.asInstanceOf[js.Any])
    
    inline def setWorkflow_restrictions_read_onlyUndefined: Self = StObject.set(x, "workflow_restrictions_read_only", js.undefined)
  }
}
