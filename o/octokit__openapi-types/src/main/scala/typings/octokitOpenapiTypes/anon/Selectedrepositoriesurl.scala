package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.active
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.all
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.deleted_
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.selected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Selectedrepositoriesurl extends StObject {
  
  /** Format: date-time */
  var created_at: String
  
  /** @description Unique identifier for a required workflow */
  var id: Double
  
  /** @description Name present in the workflow file */
  var name: String
  
  /** @description Path of the workflow file */
  var path: String
  
  /** @description Ref at which the workflow file will be selected */
  var ref: String
  
  var repository: Branchesurl
  
  /**
    * @description Scope of the required workflow
    * @enum {string}
    */
  var scope: all | selected
  
  /**
    * Format: uri
    * @example https://api.github.com/organizations/org/actions/required_workflows/1/repositories
    */
  var selected_repositories_url: js.UndefOr[String] = js.undefined
  
  /**
    * @description State of the required workflow
    * @enum {string}
    */
  var state: active | deleted_
  
  /** Format: date-time */
  var updated_at: String
}
object Selectedrepositoriesurl {
  
  inline def apply(
    created_at: String,
    id: Double,
    name: String,
    path: String,
    ref: String,
    repository: Branchesurl,
    scope: all | selected,
    state: active | deleted_,
    updated_at: String
  ): Selectedrepositoriesurl = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selectedrepositoriesurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Selectedrepositoriesurl] (val x: Self) extends AnyVal {
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRepository(value: Branchesurl): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setScope(value: all | selected): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setSelected_repositories_url(value: String): Self = StObject.set(x, "selected_repositories_url", value.asInstanceOf[js.Any])
    
    inline def setSelected_repositories_urlUndefined: Self = StObject.set(x, "selected_repositories_url", js.undefined)
    
    inline def setState(value: active | deleted_): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
  }
}
