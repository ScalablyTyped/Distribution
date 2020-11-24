package typings.maximMazurokGapiClientTpu.gapi.client.tpu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchedulingConfig extends js.Object {
  
  /** Defines whether the node is preemptible. */
  var preemptible: js.UndefOr[Boolean] = js.native
  
  /** Whether the node is created under a reservation. */
  var reserved: js.UndefOr[Boolean] = js.native
}
object SchedulingConfig {
  
  @scala.inline
  def apply(): SchedulingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchedulingConfig]
  }
  
  @scala.inline
  implicit class SchedulingConfigOps[Self <: SchedulingConfig] (val x: Self) extends AnyVal {
    
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
    def setPreemptible(value: Boolean): Self = this.set("preemptible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreemptible: Self = this.set("preemptible", js.undefined)
    
    @scala.inline
    def setReserved(value: Boolean): Self = this.set("reserved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReserved: Self = this.set("reserved", js.undefined)
  }
}
