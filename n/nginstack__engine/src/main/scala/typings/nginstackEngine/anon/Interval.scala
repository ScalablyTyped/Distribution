package typings.nginstackEngine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Interval extends StObject {
  
  var interval: js.UndefOr[Double] = js.undefined
  
  var thisArg: js.UndefOr[Any] = js.undefined
}
object Interval {
  
  inline def apply(): Interval = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Interval]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Interval] (val x: Self) extends AnyVal {
    
    inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    inline def setThisArg(value: Any): Self = StObject.set(x, "thisArg", value.asInstanceOf[js.Any])
    
    inline def setThisArgUndefined: Self = StObject.set(x, "thisArg", js.undefined)
  }
}
