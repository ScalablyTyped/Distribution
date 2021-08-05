package typings.mochaPhantomjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MochaPhantomJSOptions extends StObject {
  
  var cookies: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  var file: js.UndefOr[String] = js.undefined
  
  var headers: js.UndefOr[js.Any] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
  
  var viewportSize: js.UndefOr[Double] = js.undefined
}
object MochaPhantomJSOptions {
  
  inline def apply(): MochaPhantomJSOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MochaPhantomJSOptions]
  }
  
  extension [Self <: MochaPhantomJSOptions](x: Self) {
    
    inline def setCookies(value: js.Array[js.Any]): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
    
    inline def setCookiesUndefined: Self = StObject.set(x, "cookies", js.undefined)
    
    inline def setCookiesVarargs(value: js.Any*): Self = StObject.set(x, "cookies", js.Array(value :_*))
    
    inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    inline def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setViewportSize(value: Double): Self = StObject.set(x, "viewportSize", value.asInstanceOf[js.Any])
    
    inline def setViewportSizeUndefined: Self = StObject.set(x, "viewportSize", js.undefined)
  }
}
