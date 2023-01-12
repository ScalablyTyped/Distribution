package typings.maximMazurokGapiClientNotebooks.gapi.client.notebooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceConfig extends StObject {
  
  /** Verifies core internal services are running. */
  var enableHealthMonitoring: js.UndefOr[Boolean] = js.undefined
  
  /** Cron expression in UTC timezone, used to schedule instance auto upgrade. Please follow the [cron format](https://en.wikipedia.org/wiki/Cron). */
  var notebookUpgradeSchedule: js.UndefOr[String] = js.undefined
}
object InstanceConfig {
  
  inline def apply(): InstanceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstanceConfig] (val x: Self) extends AnyVal {
    
    inline def setEnableHealthMonitoring(value: Boolean): Self = StObject.set(x, "enableHealthMonitoring", value.asInstanceOf[js.Any])
    
    inline def setEnableHealthMonitoringUndefined: Self = StObject.set(x, "enableHealthMonitoring", js.undefined)
    
    inline def setNotebookUpgradeSchedule(value: String): Self = StObject.set(x, "notebookUpgradeSchedule", value.asInstanceOf[js.Any])
    
    inline def setNotebookUpgradeScheduleUndefined: Self = StObject.set(x, "notebookUpgradeSchedule", js.undefined)
  }
}
