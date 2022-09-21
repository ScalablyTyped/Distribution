package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.`private`
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.all
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.selected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Selectedrepositoriesurl extends StObject {
  
  /** Format: date-time */
  var created_at: String
  
  /**
    * @description The name of the secret.
    * @example SECRET_TOKEN
    */
  var name: String
  
  /**
    * Format: uri
    * @example https://api.github.com/organizations/org/dependabot/secrets/my_secret/repositories
    */
  var selected_repositories_url: js.UndefOr[String] = js.undefined
  
  /** Format: date-time */
  var updated_at: String
  
  /**
    * @description Visibility of a secret
    * @enum {string}
    */
  var visibility: all | `private` | selected
}
object Selectedrepositoriesurl {
  
  inline def apply(created_at: String, name: String, updated_at: String, visibility: all | `private` | selected): Selectedrepositoriesurl = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selectedrepositoriesurl]
  }
  
  extension [Self <: Selectedrepositoriesurl](x: Self) {
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSelected_repositories_url(value: String): Self = StObject.set(x, "selected_repositories_url", value.asInstanceOf[js.Any])
    
    inline def setSelected_repositories_urlUndefined: Self = StObject.set(x, "selected_repositories_url", js.undefined)
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setVisibility(value: all | `private` | selected): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
  }
}
