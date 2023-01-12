package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentId extends StObject {
  
  /**
    * ID of the owning Component
    */
  var componentId: String
  
  /**
    * ID
    */
  var id: String
  
  /**
    * Name
    */
  var name: String
}
object ComponentId {
  
  inline def apply(componentId: String, id: String, name: String): ComponentId = {
    val __obj = js.Dynamic.literal(componentId = componentId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComponentId] (val x: Self) extends AnyVal {
    
    inline def setComponentId(value: String): Self = StObject.set(x, "componentId", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
