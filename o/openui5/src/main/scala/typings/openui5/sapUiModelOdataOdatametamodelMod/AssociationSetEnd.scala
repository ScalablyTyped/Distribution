package typings.openui5.sapUiModelOdataOdatametamodelMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociationSetEnd
  extends StObject
     with Annotatable {
  
  /**
    * The entity set's name at the end of the association
    */
  var entitySet: String
  
  /**
    * The name of the association role
    */
  var role: String
}
object AssociationSetEnd {
  
  inline def apply(entitySet: String, role: String): AssociationSetEnd = {
    val __obj = js.Dynamic.literal(entitySet = entitySet.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociationSetEnd]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssociationSetEnd] (val x: Self) extends AnyVal {
    
    inline def setEntitySet(value: String): Self = StObject.set(x, "entitySet", value.asInstanceOf[js.Any])
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
  }
}
