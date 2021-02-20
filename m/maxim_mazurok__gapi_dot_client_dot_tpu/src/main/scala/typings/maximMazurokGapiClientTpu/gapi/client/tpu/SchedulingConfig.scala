package typings.maximMazurokGapiClientTpu.gapi.client.tpu

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchedulingConfig extends StObject {
  
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
  implicit class SchedulingConfigMutableBuilder[Self <: SchedulingConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreemptible(value: Boolean): Self = StObject.set(x, "preemptible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreemptibleUndefined: Self = StObject.set(x, "preemptible", js.undefined)
    
    @scala.inline
    def setReserved(value: Boolean): Self = StObject.set(x, "reserved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedUndefined: Self = StObject.set(x, "reserved", js.undefined)
  }
}
