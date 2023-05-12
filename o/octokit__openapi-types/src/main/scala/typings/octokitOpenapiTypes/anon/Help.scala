package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings._empty
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.error
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.none_
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.note
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Help extends StObject {
  
  /** @description A short description of the rule used to detect the alert. */
  var description: String
  
  var full_description: js.UndefOr[String] = js.undefined
  
  var help: js.UndefOr[String | Null] = js.undefined
  
  /** @description A link to the documentation for the rule used to detect the alert. */
  var help_uri: js.UndefOr[String | Null] = js.undefined
  
  /** @description A unique identifier for the rule used to detect the alert. */
  var id: String
  
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * @description The severity of the alert.
    * @enum {string|null}
    */
  var severity: none_ | note | warning | error | _empty | Null
  
  var tags: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object Help {
  
  inline def apply(description: String, id: String): Help = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], severity = null)
    __obj.asInstanceOf[Help]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Help] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setFull_description(value: String): Self = StObject.set(x, "full_description", value.asInstanceOf[js.Any])
    
    inline def setFull_descriptionUndefined: Self = StObject.set(x, "full_description", js.undefined)
    
    inline def setHelp(value: String): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
    
    inline def setHelpNull: Self = StObject.set(x, "help", null)
    
    inline def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
    
    inline def setHelp_uri(value: String): Self = StObject.set(x, "help_uri", value.asInstanceOf[js.Any])
    
    inline def setHelp_uriNull: Self = StObject.set(x, "help_uri", null)
    
    inline def setHelp_uriUndefined: Self = StObject.set(x, "help_uri", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSeverity(value: none_ | note | warning | error | _empty): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityNull: Self = StObject.set(x, "severity", null)
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsNull: Self = StObject.set(x, "tags", null)
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
