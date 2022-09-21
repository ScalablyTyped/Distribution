package typings.nightwatch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NightwatchTestWorker extends StObject {
  
  var enabled: Boolean
  
  var node_options: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var workers: String | Double
}
object NightwatchTestWorker {
  
  inline def apply(enabled: Boolean, workers: String | Double): NightwatchTestWorker = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], workers = workers.asInstanceOf[js.Any])
    __obj.asInstanceOf[NightwatchTestWorker]
  }
  
  extension [Self <: NightwatchTestWorker](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setNode_options(value: String | js.Array[String]): Self = StObject.set(x, "node_options", value.asInstanceOf[js.Any])
    
    inline def setNode_optionsUndefined: Self = StObject.set(x, "node_options", js.undefined)
    
    inline def setNode_optionsVarargs(value: String*): Self = StObject.set(x, "node_options", js.Array(value*))
    
    inline def setWorkers(value: String | Double): Self = StObject.set(x, "workers", value.asInstanceOf[js.Any])
  }
}
