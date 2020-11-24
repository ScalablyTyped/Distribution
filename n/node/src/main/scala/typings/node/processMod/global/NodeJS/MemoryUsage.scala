package typings.node.processMod.global.NodeJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MemoryUsage extends js.Object {
  
  var arrayBuffers: Double = js.native
  
  var external: Double = js.native
  
  var heapTotal: Double = js.native
  
  var heapUsed: Double = js.native
  
  var rss: Double = js.native
}
object MemoryUsage {
  
  @scala.inline
  def apply(arrayBuffers: Double, external: Double, heapTotal: Double, heapUsed: Double, rss: Double): MemoryUsage = {
    val __obj = js.Dynamic.literal(arrayBuffers = arrayBuffers.asInstanceOf[js.Any], external = external.asInstanceOf[js.Any], heapTotal = heapTotal.asInstanceOf[js.Any], heapUsed = heapUsed.asInstanceOf[js.Any], rss = rss.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemoryUsage]
  }
  
  @scala.inline
  implicit class MemoryUsageOps[Self <: MemoryUsage] (val x: Self) extends AnyVal {
    
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
    def setArrayBuffers(value: Double): Self = this.set("arrayBuffers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternal(value: Double): Self = this.set("external", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeapTotal(value: Double): Self = this.set("heapTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeapUsed(value: Double): Self = this.set("heapUsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRss(value: Double): Self = this.set("rss", value.asInstanceOf[js.Any])
  }
}
