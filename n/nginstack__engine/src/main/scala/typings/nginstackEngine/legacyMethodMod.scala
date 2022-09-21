package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object legacyMethodMod {
  
  inline def apply(func: js.Function1[/* repeated */ Any, Any], `object`: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(func.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/event/LegacyMethod", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with LegacyMethod {
    def this(func: js.Function1[/* repeated */ Any, Any], `object`: Any) = this()
    
    /* CompleteClass */
    override def call(args: Any*): Any = js.native
    
    /* CompleteClass */
    override def method(arg0: Any*): Any = js.native
    
    /* CompleteClass */
    var `object`: Any = js.native
  }
  @JSImport("@nginstack/engine/lib/event/LegacyMethod", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait LegacyMethod extends StObject {
    
    def call(args: Any*): Any
    
    def method(arg0: Any*): Any
    
    var `object`: Any
  }
  object LegacyMethod {
    
    inline def apply(call: /* repeated */ Any => Any, method: /* repeated */ Any => Any, `object`: Any): LegacyMethod = {
      val __obj = js.Dynamic.literal(call = js.Any.fromFunction1(call), method = js.Any.fromFunction1(method))
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[LegacyMethod]
    }
    
    extension [Self <: LegacyMethod](x: Self) {
      
      inline def setCall(value: /* repeated */ Any => Any): Self = StObject.set(x, "call", js.Any.fromFunction1(value))
      
      inline def setMethod(value: /* repeated */ Any => Any): Self = StObject.set(x, "method", js.Any.fromFunction1(value))
      
      inline def setObject(value: Any): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    }
  }
}
