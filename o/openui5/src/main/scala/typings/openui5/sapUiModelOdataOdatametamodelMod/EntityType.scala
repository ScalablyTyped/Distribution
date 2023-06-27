package typings.openui5.sapUiModelOdataOdatametamodelMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntityType
  extends StObject
     with Annotatable {
  
  /**
    * The path to the entity type
    */
  @JSName("$path")
  var $path: String
  
  /**
    * The entity type's key
    */
  var key: EntityKey
  
  /**
    * The entity type's name
    */
  var name: String
  
  /**
    * The entity type's namespace
    */
  var namespace: String
  
  /**
    * The entity type's navigation properties
    */
  var navigationProperty: js.UndefOr[js.Array[NavigationProperty]] = js.undefined
  
  /**
    * The entity type's properties
    */
  var property: js.UndefOr[js.Array[Property]] = js.undefined
}
object EntityType {
  
  inline def apply($path: String, key: EntityKey, name: String, namespace: String): EntityType = {
    val __obj = js.Dynamic.literal($path = $path.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EntityType] (val x: Self) extends AnyVal {
    
    inline def set$path(value: String): Self = StObject.set(x, "$path", value.asInstanceOf[js.Any])
    
    inline def setKey(value: EntityKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNavigationProperty(value: js.Array[NavigationProperty]): Self = StObject.set(x, "navigationProperty", value.asInstanceOf[js.Any])
    
    inline def setNavigationPropertyUndefined: Self = StObject.set(x, "navigationProperty", js.undefined)
    
    inline def setNavigationPropertyVarargs(value: NavigationProperty*): Self = StObject.set(x, "navigationProperty", js.Array(value*))
    
    inline def setProperty(value: js.Array[Property]): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    inline def setPropertyVarargs(value: Property*): Self = StObject.set(x, "property", js.Array(value*))
  }
}
