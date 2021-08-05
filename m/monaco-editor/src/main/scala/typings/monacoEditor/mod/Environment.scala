package typings.monacoEditor.mod

import typings.std.Worker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Environment extends StObject {
  
  var baseUrl: js.UndefOr[String] = js.undefined
  
  var getWorker: js.UndefOr[js.Function2[/* workerId */ String, /* label */ String, Worker]] = js.undefined
  
  var getWorkerUrl: js.UndefOr[js.Function2[/* workerId */ String, /* label */ String, String]] = js.undefined
}
object Environment {
  
  inline def apply(): Environment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Environment]
  }
  
  extension [Self <: Environment](x: Self) {
    
    inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
    
    inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
    
    inline def setGetWorker(value: (/* workerId */ String, /* label */ String) => Worker): Self = StObject.set(x, "getWorker", js.Any.fromFunction2(value))
    
    inline def setGetWorkerUndefined: Self = StObject.set(x, "getWorker", js.undefined)
    
    inline def setGetWorkerUrl(value: (/* workerId */ String, /* label */ String) => String): Self = StObject.set(x, "getWorkerUrl", js.Any.fromFunction2(value))
    
    inline def setGetWorkerUrlUndefined: Self = StObject.set(x, "getWorkerUrl", js.undefined)
  }
}
