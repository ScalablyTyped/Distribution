package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.all
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.selected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Allowspublicrepositories extends StObject {
  
  /**
    * @description Whether the runner group can be used by `public` repositories.
    * @default false
    */
  var allows_public_repositories: js.UndefOr[Boolean] = js.undefined
  
  /** @description Name of the runner group. */
  var name: String
  
  /**
    * @description If `true`, the runner group will be restricted to running only the workflows specified in the `selected_workflows` array.
    * @default false
    */
  var restricted_to_workflows: js.UndefOr[Boolean] = js.undefined
  
  /** @description List of runner IDs to add to the runner group. */
  var runners: js.UndefOr[js.Array[Double]] = js.undefined
  
  /** @description List of organization IDs that can access the runner group. */
  var selected_organization_ids: js.UndefOr[js.Array[Double]] = js.undefined
  
  /** @description List of workflows the runner group should be allowed to run. This setting will be ignored unless `restricted_to_workflows` is set to `true`. */
  var selected_workflows: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * @description Visibility of a runner group. You can select all organizations or select individual organization.
    * @enum {string}
    */
  var visibility: js.UndefOr[selected | all] = js.undefined
}
object Allowspublicrepositories {
  
  inline def apply(name: String): Allowspublicrepositories = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Allowspublicrepositories]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Allowspublicrepositories] (val x: Self) extends AnyVal {
    
    inline def setAllows_public_repositories(value: Boolean): Self = StObject.set(x, "allows_public_repositories", value.asInstanceOf[js.Any])
    
    inline def setAllows_public_repositoriesUndefined: Self = StObject.set(x, "allows_public_repositories", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRestricted_to_workflows(value: Boolean): Self = StObject.set(x, "restricted_to_workflows", value.asInstanceOf[js.Any])
    
    inline def setRestricted_to_workflowsUndefined: Self = StObject.set(x, "restricted_to_workflows", js.undefined)
    
    inline def setRunners(value: js.Array[Double]): Self = StObject.set(x, "runners", value.asInstanceOf[js.Any])
    
    inline def setRunnersUndefined: Self = StObject.set(x, "runners", js.undefined)
    
    inline def setRunnersVarargs(value: Double*): Self = StObject.set(x, "runners", js.Array(value*))
    
    inline def setSelected_organization_ids(value: js.Array[Double]): Self = StObject.set(x, "selected_organization_ids", value.asInstanceOf[js.Any])
    
    inline def setSelected_organization_idsUndefined: Self = StObject.set(x, "selected_organization_ids", js.undefined)
    
    inline def setSelected_organization_idsVarargs(value: Double*): Self = StObject.set(x, "selected_organization_ids", js.Array(value*))
    
    inline def setSelected_workflows(value: js.Array[String]): Self = StObject.set(x, "selected_workflows", value.asInstanceOf[js.Any])
    
    inline def setSelected_workflowsUndefined: Self = StObject.set(x, "selected_workflows", js.undefined)
    
    inline def setSelected_workflowsVarargs(value: String*): Self = StObject.set(x, "selected_workflows", js.Array(value*))
    
    inline def setVisibility(value: selected | all): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
