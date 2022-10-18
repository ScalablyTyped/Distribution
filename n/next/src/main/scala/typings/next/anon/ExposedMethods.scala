package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExposedMethods extends StObject {
  
  var exposedMethods: js.Array[String]
  
  var onRestart: js.UndefOr[
    js.Function3[/* method */ String, /* args */ js.Array[Any], /* attempts */ Double, Unit]
  ] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object ExposedMethods {
  
  inline def apply(exposedMethods: js.Array[String]): ExposedMethods = {
    val __obj = js.Dynamic.literal(exposedMethods = exposedMethods.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExposedMethods]
  }
  
  extension [Self <: ExposedMethods](x: Self) {
    
    inline def setExposedMethods(value: js.Array[String]): Self = StObject.set(x, "exposedMethods", value.asInstanceOf[js.Any])
    
    inline def setExposedMethodsVarargs(value: String*): Self = StObject.set(x, "exposedMethods", js.Array(value*))
    
    inline def setOnRestart(value: (/* method */ String, /* args */ js.Array[Any], /* attempts */ Double) => Unit): Self = StObject.set(x, "onRestart", js.Any.fromFunction3(value))
    
    inline def setOnRestartUndefined: Self = StObject.set(x, "onRestart", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
