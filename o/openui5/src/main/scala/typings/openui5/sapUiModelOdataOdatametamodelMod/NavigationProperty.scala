package typings.openui5.sapUiModelOdataOdatametamodelMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationProperty
  extends StObject
     with Annotatable {
  
  /**
    * The name of the starting point for the navigation; refers to a role defined in the association
    */
  var fromRole: String
  
  /**
    * The name of the navigation property
    */
  var name: String
  
  /**
    * The qualified name of the navigation property's association
    */
  var relationship: String
  
  /**
    * The name of the other end of the relationship; refers to a role defined in the association
    */
  var toRole: String
}
object NavigationProperty {
  
  inline def apply(fromRole: String, name: String, relationship: String, toRole: String): NavigationProperty = {
    val __obj = js.Dynamic.literal(fromRole = fromRole.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], relationship = relationship.asInstanceOf[js.Any], toRole = toRole.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationProperty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NavigationProperty] (val x: Self) extends AnyVal {
    
    inline def setFromRole(value: String): Self = StObject.set(x, "fromRole", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRelationship(value: String): Self = StObject.set(x, "relationship", value.asInstanceOf[js.Any])
    
    inline def setToRole(value: String): Self = StObject.set(x, "toRole", value.asInstanceOf[js.Any])
  }
}
