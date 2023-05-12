package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings._empty
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.error
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.none_
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.note
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdSeverity extends StObject {
  
  /** @description A short description of the rule used to detect the alert. */
  var description: String
  
  /** @description A unique identifier for the rule used to detect the alert. */
  var id: String
  
  /**
    * @description The severity of the alert.
    * @enum {string|null}
    */
  var severity: none_ | note | warning | error | _empty | Null
}
object IdSeverity {
  
  inline def apply(description: String, id: String): IdSeverity = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], severity = null)
    __obj.asInstanceOf[IdSeverity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IdSeverity] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setSeverity(value: none_ | note | warning | error | _empty): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityNull: Self = StObject.set(x, "severity", null)
  }
}
