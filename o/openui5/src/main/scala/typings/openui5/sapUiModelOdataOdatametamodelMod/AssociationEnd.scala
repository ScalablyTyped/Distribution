package typings.openui5.sapUiModelOdataOdatametamodelMod

import typings.openui5.openui5Strings.Asterisk
import typings.openui5.openui5Strings.`0DotDot1`
import typings.openui5.openui5Strings.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociationEnd
  extends StObject
     with Annotatable {
  
  /**
    * The multiplicity of the association end
    */
  var multiplicity: `0` | `0DotDot1` | Asterisk
  
  /**
    * The name of the association role
    */
  var role: String
  
  /**
    * The qualified name of the entity type at the end of the association
    */
  var `type`: String
}
object AssociationEnd {
  
  inline def apply(multiplicity: `0` | `0DotDot1` | Asterisk, role: String, `type`: String): AssociationEnd = {
    val __obj = js.Dynamic.literal(multiplicity = multiplicity.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociationEnd]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssociationEnd] (val x: Self) extends AnyVal {
    
    inline def setMultiplicity(value: `0` | `0DotDot1` | Asterisk): Self = StObject.set(x, "multiplicity", value.asInstanceOf[js.Any])
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
