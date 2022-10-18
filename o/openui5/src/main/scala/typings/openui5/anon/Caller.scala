package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Caller extends StObject {
  
  /**
    * identifies the caller of this preprocessor; basis for log or exception messages
    */
  var caller: String
  
  /**
    * the id of the owning Component
    */
  var componentId: String
  
  /**
    * the id
    */
  var id: String
  
  /**
    * the name
    */
  var name: String
}
object Caller {
  
  inline def apply(caller: String, componentId: String, id: String, name: String): Caller = {
    val __obj = js.Dynamic.literal(caller = caller.asInstanceOf[js.Any], componentId = componentId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Caller]
  }
  
  extension [Self <: Caller](x: Self) {
    
    inline def setCaller(value: String): Self = StObject.set(x, "caller", value.asInstanceOf[js.Any])
    
    inline def setComponentId(value: String): Self = StObject.set(x, "componentId", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
