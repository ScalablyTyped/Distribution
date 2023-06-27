package typings.openui5.sapUiModelOdataOdatametamodelMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComplexType
  extends StObject
     with Annotatable {
  
  /**
    * The path to the complex type
    */
  @JSName("$path")
  var $path: String
  
  /**
    * The complex type's name
    */
  var name: String
  
  /**
    * The complex type's namespace
    */
  var namespace: String
  
  /**
    * The complex type's properties
    */
  var property: js.Array[Property]
}
object ComplexType {
  
  inline def apply($path: String, name: String, namespace: String, property: js.Array[Property]): ComplexType = {
    val __obj = js.Dynamic.literal($path = $path.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComplexType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComplexType] (val x: Self) extends AnyVal {
    
    inline def set$path(value: String): Self = StObject.set(x, "$path", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setProperty(value: js.Array[Property]): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyVarargs(value: Property*): Self = StObject.set(x, "property", js.Array(value*))
  }
}
