package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsUrl extends StObject {
  
  var jsUrl: js.UndefOr[String] = js.undefined
  
  var lazyInit: js.UndefOr[Boolean] = js.undefined
  
  var numWorkers: js.UndefOr[Double] = js.undefined
  
  var wasmUrl: js.UndefOr[String] = js.undefined
}
object JsUrl {
  
  inline def apply(): JsUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsUrl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JsUrl] (val x: Self) extends AnyVal {
    
    inline def setJsUrl(value: String): Self = StObject.set(x, "jsUrl", value.asInstanceOf[js.Any])
    
    inline def setJsUrlUndefined: Self = StObject.set(x, "jsUrl", js.undefined)
    
    inline def setLazyInit(value: Boolean): Self = StObject.set(x, "lazyInit", value.asInstanceOf[js.Any])
    
    inline def setLazyInitUndefined: Self = StObject.set(x, "lazyInit", js.undefined)
    
    inline def setNumWorkers(value: Double): Self = StObject.set(x, "numWorkers", value.asInstanceOf[js.Any])
    
    inline def setNumWorkersUndefined: Self = StObject.set(x, "numWorkers", js.undefined)
    
    inline def setWasmUrl(value: String): Self = StObject.set(x, "wasmUrl", value.asInstanceOf[js.Any])
    
    inline def setWasmUrlUndefined: Self = StObject.set(x, "wasmUrl", js.undefined)
  }
}
