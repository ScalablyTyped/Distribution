package typings.node.vmMod

import typings.node.anon.JsMemoryEstimate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MemoryMeasurement extends js.Object {
  
  var total: JsMemoryEstimate = js.native
}
object MemoryMeasurement {
  
  @scala.inline
  def apply(total: JsMemoryEstimate): MemoryMeasurement = {
    val __obj = js.Dynamic.literal(total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemoryMeasurement]
  }
  
  @scala.inline
  implicit class MemoryMeasurementOps[Self <: MemoryMeasurement] (val x: Self) extends AnyVal {
    
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
    def setTotal(value: JsMemoryEstimate): Self = this.set("total", value.asInstanceOf[js.Any])
  }
}
