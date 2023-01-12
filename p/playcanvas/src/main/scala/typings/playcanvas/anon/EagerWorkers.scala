package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EagerWorkers extends StObject {
  
  var eagerWorkers: js.UndefOr[Boolean] = js.undefined
  
  var fallbackUrl: js.UndefOr[String] = js.undefined
  
  var glueUrl: js.UndefOr[String] = js.undefined
  
  var lazyInit: js.UndefOr[Boolean] = js.undefined
  
  var maxRetries: js.UndefOr[Double] = js.undefined
  
  var numWorkers: js.UndefOr[Double] = js.undefined
  
  var rgbPriority: js.UndefOr[js.Array[String]] = js.undefined
  
  var rgbaPriority: js.UndefOr[js.Array[String]] = js.undefined
  
  var wasmUrl: js.UndefOr[String] = js.undefined
}
object EagerWorkers {
  
  inline def apply(): EagerWorkers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EagerWorkers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EagerWorkers] (val x: Self) extends AnyVal {
    
    inline def setEagerWorkers(value: Boolean): Self = StObject.set(x, "eagerWorkers", value.asInstanceOf[js.Any])
    
    inline def setEagerWorkersUndefined: Self = StObject.set(x, "eagerWorkers", js.undefined)
    
    inline def setFallbackUrl(value: String): Self = StObject.set(x, "fallbackUrl", value.asInstanceOf[js.Any])
    
    inline def setFallbackUrlUndefined: Self = StObject.set(x, "fallbackUrl", js.undefined)
    
    inline def setGlueUrl(value: String): Self = StObject.set(x, "glueUrl", value.asInstanceOf[js.Any])
    
    inline def setGlueUrlUndefined: Self = StObject.set(x, "glueUrl", js.undefined)
    
    inline def setLazyInit(value: Boolean): Self = StObject.set(x, "lazyInit", value.asInstanceOf[js.Any])
    
    inline def setLazyInitUndefined: Self = StObject.set(x, "lazyInit", js.undefined)
    
    inline def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
    
    inline def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
    
    inline def setNumWorkers(value: Double): Self = StObject.set(x, "numWorkers", value.asInstanceOf[js.Any])
    
    inline def setNumWorkersUndefined: Self = StObject.set(x, "numWorkers", js.undefined)
    
    inline def setRgbPriority(value: js.Array[String]): Self = StObject.set(x, "rgbPriority", value.asInstanceOf[js.Any])
    
    inline def setRgbPriorityUndefined: Self = StObject.set(x, "rgbPriority", js.undefined)
    
    inline def setRgbPriorityVarargs(value: String*): Self = StObject.set(x, "rgbPriority", js.Array(value*))
    
    inline def setRgbaPriority(value: js.Array[String]): Self = StObject.set(x, "rgbaPriority", value.asInstanceOf[js.Any])
    
    inline def setRgbaPriorityUndefined: Self = StObject.set(x, "rgbaPriority", js.undefined)
    
    inline def setRgbaPriorityVarargs(value: String*): Self = StObject.set(x, "rgbaPriority", js.Array(value*))
    
    inline def setWasmUrl(value: String): Self = StObject.set(x, "wasmUrl", value.asInstanceOf[js.Any])
    
    inline def setWasmUrlUndefined: Self = StObject.set(x, "wasmUrl", js.undefined)
  }
}
