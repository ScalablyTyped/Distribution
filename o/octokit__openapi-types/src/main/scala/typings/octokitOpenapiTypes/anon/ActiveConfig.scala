package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveConfig extends StObject {
  
  var active: Boolean
  
  var config: SecretUrl
  
  var created_at: String
  
  var events: js.Array[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 52, starting with typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.Asterisk, typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.branch_protection_rule, typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.check_run */ Any
  ]
  
  var id: Double
  
  var name: String
  
  var `type`: String
  
  var updated_at: String
}
object ActiveConfig {
  
  inline def apply(
    active: Boolean,
    config: SecretUrl,
    created_at: String,
    events: js.Array[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 52, starting with typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.Asterisk, typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.branch_protection_rule, typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.check_run */ Any
    ],
    id: Double,
    name: String,
    `type`: String,
    updated_at: String
  ): ActiveConfig = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActiveConfig] (val x: Self) extends AnyVal {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setConfig(value: SecretUrl): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setEvents(
      value: js.Array[
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 52, starting with typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.Asterisk, typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.branch_protection_rule, typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.check_run */ Any
        ]
    ): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsVarargs(
      value: (/* import warning: LimitUnionLength.leaveTypeRef Was union type with length 52, starting with typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.Asterisk, typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.branch_protection_rule, typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.check_run */ Any)*
    ): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
  }
}
