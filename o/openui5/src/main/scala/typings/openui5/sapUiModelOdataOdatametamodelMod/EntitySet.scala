package typings.openui5.sapUiModelOdataOdatametamodelMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntitySet
  extends StObject
     with Annotatable {
  
  /**
    * The qualified name of the entity set's entity type
    */
  var entityType: String
  
  /**
    * The name of the entity set
    */
  var name: String
}
object EntitySet {
  
  inline def apply(entityType: String, name: String): EntitySet = {
    val __obj = js.Dynamic.literal(entityType = entityType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntitySet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EntitySet] (val x: Self) extends AnyVal {
    
    inline def setEntityType(value: String): Self = StObject.set(x, "entityType", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
