package typings.photoshop.domCoreModulesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionDescriptor
  extends StObject
     with /* prop */ StringDictionary[Any] {
  
  var _obj: String
}
object ActionDescriptor {
  
  inline def apply(_obj: String): ActionDescriptor = {
    val __obj = js.Dynamic.literal(_obj = _obj.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionDescriptor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActionDescriptor] (val x: Self) extends AnyVal {
    
    inline def set_obj(value: String): Self = StObject.set(x, "_obj", value.asInstanceOf[js.Any])
  }
}
