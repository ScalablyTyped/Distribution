package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.critical
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.error
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.high
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.low
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.medium
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.none_
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.note
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fulldescription extends StObject {
  
  /** @description A short description of the rule used to detect the alert. */
  var description: js.UndefOr[String] = js.undefined
  
  /** @description description of the rule used to detect the alert. */
  var full_description: js.UndefOr[String] = js.undefined
  
  /** @description Detailed documentation for the rule as GitHub Flavored Markdown. */
  var help: js.UndefOr[String | Null] = js.undefined
  
  /** @description A link to the documentation for the rule used to detect the alert. */
  var help_uri: js.UndefOr[String | Null] = js.undefined
  
  /** @description A unique identifier for the rule used to detect the alert. */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /** @description The name of the rule used to detect the alert. */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * @description The security severity of the alert.
    * @enum {string|null}
    */
  var security_severity_level: js.UndefOr[low | medium | high | critical | Null] = js.undefined
  
  /**
    * @description The severity of the alert.
    * @enum {string|null}
    */
  var severity: js.UndefOr[none_ | note | warning | error | Null] = js.undefined
  
  /** @description A set of tags applicable for the rule. */
  var tags: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object Fulldescription {
  
  inline def apply(): Fulldescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fulldescription]
  }
  
  extension [Self <: Fulldescription](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFull_description(value: String): Self = StObject.set(x, "full_description", value.asInstanceOf[js.Any])
    
    inline def setFull_descriptionUndefined: Self = StObject.set(x, "full_description", js.undefined)
    
    inline def setHelp(value: String): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
    
    inline def setHelpNull: Self = StObject.set(x, "help", null)
    
    inline def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
    
    inline def setHelp_uri(value: String): Self = StObject.set(x, "help_uri", value.asInstanceOf[js.Any])
    
    inline def setHelp_uriNull: Self = StObject.set(x, "help_uri", null)
    
    inline def setHelp_uriUndefined: Self = StObject.set(x, "help_uri", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSecurity_severity_level(value: low | medium | high | critical): Self = StObject.set(x, "security_severity_level", value.asInstanceOf[js.Any])
    
    inline def setSecurity_severity_levelNull: Self = StObject.set(x, "security_severity_level", null)
    
    inline def setSecurity_severity_levelUndefined: Self = StObject.set(x, "security_severity_level", js.undefined)
    
    inline def setSeverity(value: none_ | note | warning | error): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityNull: Self = StObject.set(x, "severity", null)
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsNull: Self = StObject.set(x, "tags", null)
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
