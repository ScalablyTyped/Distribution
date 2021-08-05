package typings.maximMazurokGapiClientTpu.gapi.client.tpu

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchedulingConfig extends StObject {
  
  /** Defines whether the node is preemptible. */
  var preemptible: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the node is created under a reservation. */
  var reserved: js.UndefOr[Boolean] = js.undefined
}
object SchedulingConfig {
  
  inline def apply(): SchedulingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchedulingConfig]
  }
  
  extension [Self <: SchedulingConfig](x: Self) {
    
    inline def setPreemptible(value: Boolean): Self = StObject.set(x, "preemptible", value.asInstanceOf[js.Any])
    
    inline def setPreemptibleUndefined: Self = StObject.set(x, "preemptible", js.undefined)
    
    inline def setReserved(value: Boolean): Self = StObject.set(x, "reserved", value.asInstanceOf[js.Any])
    
    inline def setReservedUndefined: Self = StObject.set(x, "reserved", js.undefined)
  }
}
