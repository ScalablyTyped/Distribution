package typings.maximMazurokGapiClientNotebooks.gapi.client.notebooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchedulerAcceleratorConfig extends StObject {
  
  /** Count of cores of this accelerator. */
  var coreCount: js.UndefOr[String] = js.undefined
  
  /** Type of this accelerator. */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchedulerAcceleratorConfig {
  
  inline def apply(): SchedulerAcceleratorConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchedulerAcceleratorConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SchedulerAcceleratorConfig] (val x: Self) extends AnyVal {
    
    inline def setCoreCount(value: String): Self = StObject.set(x, "coreCount", value.asInstanceOf[js.Any])
    
    inline def setCoreCountUndefined: Self = StObject.set(x, "coreCount", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
