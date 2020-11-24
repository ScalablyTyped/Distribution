package typings.ol.rasterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProcessorOptions extends js.Object {
  
  var imageOps: js.UndefOr[Boolean] = js.native
  
  var lib: js.UndefOr[js.Any] = js.native
  
  def operation(p0: js.Array[_], p1: js.Object): js.Any = js.native
  
  var queue: Double = js.native
  
  var threads: Double = js.native
}
object ProcessorOptions {
  
  @scala.inline
  def apply(operation: (js.Array[_], js.Object) => js.Any, queue: Double, threads: Double): ProcessorOptions = {
    val __obj = js.Dynamic.literal(operation = js.Any.fromFunction2(operation), queue = queue.asInstanceOf[js.Any], threads = threads.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessorOptions]
  }
  
  @scala.inline
  implicit class ProcessorOptionsOps[Self <: ProcessorOptions] (val x: Self) extends AnyVal {
    
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
    def setOperation(value: (js.Array[_], js.Object) => js.Any): Self = this.set("operation", js.Any.fromFunction2(value))
    
    @scala.inline
    def setQueue(value: Double): Self = this.set("queue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreads(value: Double): Self = this.set("threads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageOps(value: Boolean): Self = this.set("imageOps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageOps: Self = this.set("imageOps", js.undefined)
    
    @scala.inline
    def setLib(value: js.Any): Self = this.set("lib", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLib: Self = this.set("lib", js.undefined)
  }
}
