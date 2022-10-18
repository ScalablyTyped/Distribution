package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AfterInteractive extends StObject {
  
  var afterInteractive: js.UndefOr[js.Array[String]] = js.undefined
  
  var beforeInteractive: js.UndefOr[js.Array[Any]] = js.undefined
  
  var worker: js.UndefOr[js.Array[Any]] = js.undefined
}
object AfterInteractive {
  
  inline def apply(): AfterInteractive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AfterInteractive]
  }
  
  extension [Self <: AfterInteractive](x: Self) {
    
    inline def setAfterInteractive(value: js.Array[String]): Self = StObject.set(x, "afterInteractive", value.asInstanceOf[js.Any])
    
    inline def setAfterInteractiveUndefined: Self = StObject.set(x, "afterInteractive", js.undefined)
    
    inline def setAfterInteractiveVarargs(value: String*): Self = StObject.set(x, "afterInteractive", js.Array(value*))
    
    inline def setBeforeInteractive(value: js.Array[Any]): Self = StObject.set(x, "beforeInteractive", value.asInstanceOf[js.Any])
    
    inline def setBeforeInteractiveUndefined: Self = StObject.set(x, "beforeInteractive", js.undefined)
    
    inline def setBeforeInteractiveVarargs(value: Any*): Self = StObject.set(x, "beforeInteractive", js.Array(value*))
    
    inline def setWorker(value: js.Array[Any]): Self = StObject.set(x, "worker", value.asInstanceOf[js.Any])
    
    inline def setWorkerUndefined: Self = StObject.set(x, "worker", js.undefined)
    
    inline def setWorkerVarargs(value: Any*): Self = StObject.set(x, "worker", js.Array(value*))
  }
}
