package typings.nightwatch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NightwatchTestWorker extends StObject {
  
  var enabled: Boolean = js.native
  
  var node_options: js.UndefOr[String | js.Array[String]] = js.native
  
  var workers: String = js.native
}
object NightwatchTestWorker {
  
  @scala.inline
  def apply(enabled: Boolean, workers: String): NightwatchTestWorker = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], workers = workers.asInstanceOf[js.Any])
    __obj.asInstanceOf[NightwatchTestWorker]
  }
  
  @scala.inline
  implicit class NightwatchTestWorkerMutableBuilder[Self <: NightwatchTestWorker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode_options(value: String | js.Array[String]): Self = StObject.set(x, "node_options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode_optionsUndefined: Self = StObject.set(x, "node_options", js.undefined)
    
    @scala.inline
    def setNode_optionsVarargs(value: String*): Self = StObject.set(x, "node_options", js.Array(value :_*))
    
    @scala.inline
    def setWorkers(value: String): Self = StObject.set(x, "workers", value.asInstanceOf[js.Any])
  }
}
