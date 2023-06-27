package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Caller extends StObject {
  
  var caller: String
  
  var componentId: String
  
  var id: String
  
  var name: String
  
  var sync: Boolean
}
object Caller {
  
  inline def apply(caller: String, componentId: String, id: String, name: String, sync: Boolean): Caller = {
    val __obj = js.Dynamic.literal(caller = caller.asInstanceOf[js.Any], componentId = componentId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sync = sync.asInstanceOf[js.Any])
    __obj.asInstanceOf[Caller]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Caller] (val x: Self) extends AnyVal {
    
    inline def setCaller(value: String): Self = StObject.set(x, "caller", value.asInstanceOf[js.Any])
    
    inline def setComponentId(value: String): Self = StObject.set(x, "componentId", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSync(value: Boolean): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
  }
}
