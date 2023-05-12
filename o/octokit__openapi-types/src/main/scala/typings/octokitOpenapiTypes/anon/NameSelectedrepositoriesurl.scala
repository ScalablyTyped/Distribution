package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.`private`
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.all
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.selected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NameSelectedrepositoriesurl extends StObject {
  
  /**
    * Format: date-time
    * @description The date and time at which the variable was created, in ISO 8601 format':' YYYY-MM-DDTHH:MM:SSZ.
    * @example 2019-01-24T22:45:36.000Z
    */
  var created_at: String
  
  /**
    * @description The name of the variable.
    * @example USERNAME
    */
  var name: String
  
  /**
    * Format: uri
    * @example https://api.github.com/organizations/org/variables/USERNAME/repositories
    */
  var selected_repositories_url: js.UndefOr[String] = js.undefined
  
  /**
    * Format: date-time
    * @description The date and time at which the variable was last updated, in ISO 8601 format':' YYYY-MM-DDTHH:MM:SSZ.
    * @example 2019-01-24T22:45:36.000Z
    */
  var updated_at: String
  
  /**
    * @description The value of the variable.
    * @example octocat
    */
  var value: String
  
  /**
    * @description Visibility of a variable
    * @enum {string}
    */
  var visibility: all | `private` | selected
}
object NameSelectedrepositoriesurl {
  
  inline def apply(
    created_at: String,
    name: String,
    updated_at: String,
    value: String,
    visibility: all | `private` | selected
  ): NameSelectedrepositoriesurl = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameSelectedrepositoriesurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NameSelectedrepositoriesurl] (val x: Self) extends AnyVal {
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSelected_repositories_url(value: String): Self = StObject.set(x, "selected_repositories_url", value.asInstanceOf[js.Any])
    
    inline def setSelected_repositories_urlUndefined: Self = StObject.set(x, "selected_repositories_url", js.undefined)
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setVisibility(value: all | `private` | selected): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
  }
}
