package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libObjectDeclarePropertyMod {
  
  inline def apply(obj: Any, prop: String, descriptor: PropertyDescriptor): Unit = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/object/declareProperty", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait PropertyDescriptor extends StObject {
    
    var get: js.UndefOr[js.Function0[Any]] = js.undefined
    
    var set: js.UndefOr[js.Function1[/* arg0 */ Any, Any]] = js.undefined
    
    var value: Any
  }
  object PropertyDescriptor {
    
    inline def apply(value: Any): PropertyDescriptor = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropertyDescriptor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PropertyDescriptor] (val x: Self) extends AnyVal {
      
      inline def setGet(value: () => Any): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
      
      inline def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
      
      inline def setSet(value: /* arg0 */ Any => Any): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
      
      inline def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
