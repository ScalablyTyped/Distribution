package typings.naverWhale.whale.system.cpu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProcessorInfo extends js.Object {
  
  /** Cumulative usage info for this logical processor. */
  var usage: typings.chrome.chrome.system.cpu.ProcessorUsage = js.native
}
object ProcessorInfo {
  
  @scala.inline
  def apply(usage: typings.chrome.chrome.system.cpu.ProcessorUsage): ProcessorInfo = {
    val __obj = js.Dynamic.literal(usage = usage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessorInfo]
  }
  
  @scala.inline
  implicit class ProcessorInfoOps[Self <: ProcessorInfo] (val x: Self) extends AnyVal {
    
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
    def setUsage(value: typings.chrome.chrome.system.cpu.ProcessorUsage): Self = this.set("usage", value.asInstanceOf[js.Any])
  }
}
