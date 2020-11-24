package typings.nightwatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NightwatchTestWorker extends js.Object {
  
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
  implicit class NightwatchTestWorkerOps[Self <: NightwatchTestWorker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkers(value: String): Self = this.set("workers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode_optionsVarargs(value: String*): Self = this.set("node_options", js.Array(value :_*))
    
    @scala.inline
    def setNode_options(value: String | js.Array[String]): Self = this.set("node_options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNode_options: Self = this.set("node_options", js.undefined)
  }
}
