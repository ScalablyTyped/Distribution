package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Description extends StObject {
  
  var description: String
  
  var editable: Boolean
  
  var enabled: Boolean
  
  var focusable: Boolean
  
  var role: String
  
  var `type`: String
}
object Description {
  
  inline def apply(
    description: String,
    editable: Boolean,
    enabled: Boolean,
    focusable: Boolean,
    role: String,
    `type`: String
  ): Description = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], editable = editable.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], focusable = focusable.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Description]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Description] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setFocusable(value: Boolean): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
