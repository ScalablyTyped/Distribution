package typings.playcanvas.anon

import typings.playcanvas.mod.ModuleErrorCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorHandler extends StObject {
  
  var errorHandler: js.UndefOr[ModuleErrorCallback] = js.undefined
  
  var fallbackUrl: js.UndefOr[String] = js.undefined
  
  var glueUrl: js.UndefOr[String] = js.undefined
  
  var numWorkers: js.UndefOr[Double] = js.undefined
  
  var wasmUrl: js.UndefOr[String] = js.undefined
}
object ErrorHandler {
  
  inline def apply(): ErrorHandler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorHandler]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ErrorHandler] (val x: Self) extends AnyVal {
    
    inline def setErrorHandler(value: /* error */ String => Any): Self = StObject.set(x, "errorHandler", js.Any.fromFunction1(value))
    
    inline def setErrorHandlerUndefined: Self = StObject.set(x, "errorHandler", js.undefined)
    
    inline def setFallbackUrl(value: String): Self = StObject.set(x, "fallbackUrl", value.asInstanceOf[js.Any])
    
    inline def setFallbackUrlUndefined: Self = StObject.set(x, "fallbackUrl", js.undefined)
    
    inline def setGlueUrl(value: String): Self = StObject.set(x, "glueUrl", value.asInstanceOf[js.Any])
    
    inline def setGlueUrlUndefined: Self = StObject.set(x, "glueUrl", js.undefined)
    
    inline def setNumWorkers(value: Double): Self = StObject.set(x, "numWorkers", value.asInstanceOf[js.Any])
    
    inline def setNumWorkersUndefined: Self = StObject.set(x, "numWorkers", js.undefined)
    
    inline def setWasmUrl(value: String): Self = StObject.set(x, "wasmUrl", value.asInstanceOf[js.Any])
    
    inline def setWasmUrlUndefined: Self = StObject.set(x, "wasmUrl", js.undefined)
  }
}
