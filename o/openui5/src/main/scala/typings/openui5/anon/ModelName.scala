package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelName extends StObject {
  
  var modelName: String
  
  var path: Any
  
  var propertyPath: Any
}
object ModelName {
  
  inline def apply(modelName: String, path: Any, propertyPath: Any): ModelName = {
    val __obj = js.Dynamic.literal(modelName = modelName.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], propertyPath = propertyPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModelName] (val x: Self) extends AnyVal {
    
    inline def setModelName(value: String): Self = StObject.set(x, "modelName", value.asInstanceOf[js.Any])
    
    inline def setPath(value: Any): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPropertyPath(value: Any): Self = StObject.set(x, "propertyPath", value.asInstanceOf[js.Any])
  }
}
