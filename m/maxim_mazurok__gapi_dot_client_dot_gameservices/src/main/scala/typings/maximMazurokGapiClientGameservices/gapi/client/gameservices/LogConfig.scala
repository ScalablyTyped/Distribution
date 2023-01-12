package typings.maximMazurokGapiClientGameservices.gapi.client.gameservices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogConfig extends StObject {
  
  /** Cloud audit options. */
  var cloudAudit: js.UndefOr[CloudAuditOptions] = js.undefined
  
  /** Counter options. */
  var counter: js.UndefOr[CounterOptions] = js.undefined
  
  /** Data access options. */
  var dataAccess: js.UndefOr[DataAccessOptions] = js.undefined
}
object LogConfig {
  
  inline def apply(): LogConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LogConfig] (val x: Self) extends AnyVal {
    
    inline def setCloudAudit(value: CloudAuditOptions): Self = StObject.set(x, "cloudAudit", value.asInstanceOf[js.Any])
    
    inline def setCloudAuditUndefined: Self = StObject.set(x, "cloudAudit", js.undefined)
    
    inline def setCounter(value: CounterOptions): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
    
    inline def setCounterUndefined: Self = StObject.set(x, "counter", js.undefined)
    
    inline def setDataAccess(value: DataAccessOptions): Self = StObject.set(x, "dataAccess", value.asInstanceOf[js.Any])
    
    inline def setDataAccessUndefined: Self = StObject.set(x, "dataAccess", js.undefined)
  }
}
