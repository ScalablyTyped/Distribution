package typings.node.processMod.global.NodeJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemoryUsage extends StObject {
  
  var arrayBuffers: Double
  
  var external: Double
  
  var heapTotal: Double
  
  var heapUsed: Double
  
  var rss: Double
}
object MemoryUsage {
  
  inline def apply(arrayBuffers: Double, external: Double, heapTotal: Double, heapUsed: Double, rss: Double): MemoryUsage = {
    val __obj = js.Dynamic.literal(arrayBuffers = arrayBuffers.asInstanceOf[js.Any], external = external.asInstanceOf[js.Any], heapTotal = heapTotal.asInstanceOf[js.Any], heapUsed = heapUsed.asInstanceOf[js.Any], rss = rss.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemoryUsage]
  }
  
  extension [Self <: MemoryUsage](x: Self) {
    
    inline def setArrayBuffers(value: Double): Self = StObject.set(x, "arrayBuffers", value.asInstanceOf[js.Any])
    
    inline def setExternal(value: Double): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
    
    inline def setHeapTotal(value: Double): Self = StObject.set(x, "heapTotal", value.asInstanceOf[js.Any])
    
    inline def setHeapUsed(value: Double): Self = StObject.set(x, "heapUsed", value.asInstanceOf[js.Any])
    
    inline def setRss(value: Double): Self = StObject.set(x, "rss", value.asInstanceOf[js.Any])
  }
}
