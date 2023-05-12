package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.`private`
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.all
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.selected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectedrepositoriesurlUpdatedat extends StObject {
  
  /**
    * Format: date-time
    * @description The date and time at which the secret was created, in ISO 8601 format':' YYYY-MM-DDTHH:MM:SSZ.
    */
  var created_at: String
  
  /**
    * @description The name of the secret
    * @example SECRET_NAME
    */
  var name: String
  
  /**
    * Format: uri
    * @description The API URL at which the list of repositories this secret is visible to can be retrieved
    * @example https://api.github.com/user/secrets/SECRET_NAME/repositories
    */
  var selected_repositories_url: String
  
  /**
    * Format: date-time
    * @description The date and time at which the secret was last updated, in ISO 8601 format':' YYYY-MM-DDTHH:MM:SSZ.
    */
  var updated_at: String
  
  /**
    * @description The type of repositories in the organization that the secret is visible to
    * @enum {string}
    */
  var visibility: all | `private` | selected
}
object SelectedrepositoriesurlUpdatedat {
  
  inline def apply(
    created_at: String,
    name: String,
    selected_repositories_url: String,
    updated_at: String,
    visibility: all | `private` | selected
  ): SelectedrepositoriesurlUpdatedat = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selected_repositories_url = selected_repositories_url.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectedrepositoriesurlUpdatedat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SelectedrepositoriesurlUpdatedat] (val x: Self) extends AnyVal {
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSelected_repositories_url(value: String): Self = StObject.set(x, "selected_repositories_url", value.asInstanceOf[js.Any])
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setVisibility(value: all | `private` | selected): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
  }
}
