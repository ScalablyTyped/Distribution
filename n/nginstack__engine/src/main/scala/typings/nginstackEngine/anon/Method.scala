package typings.nginstackEngine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Method extends StObject {
  
  def method(arg0: Any): Any
  
  var `object`: Any
}
object Method {
  
  inline def apply(method: Any => Any, `object`: Any): Method = {
    val __obj = js.Dynamic.literal(method = js.Any.fromFunction1(method))
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Method]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Method] (val x: Self) extends AnyVal {
    
    inline def setMethod(value: Any => Any): Self = StObject.set(x, "method", js.Any.fromFunction1(value))
    
    inline def setObject(value: Any): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
  }
}
