package typings.maximMazurokGapiClientStoragetransfer.gapi.client.storagetransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoggingConfig extends StObject {
  
  /** For transfers with a PosixFilesystem source, this option enables the Cloud Storage transfer logs for this transfer. */
  var enableOnpremGcsTransferLogs: js.UndefOr[Boolean] = js.undefined
  
  /**
    * States in which `log_actions` are logged. If empty, no logs are generated. Not supported for transfers with PosixFilesystem data sources; use enable_onprem_gcs_transfer_logs
    * instead.
    */
  var logActionStates: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Specifies the actions to be logged. If empty, no logs are generated. Not supported for transfers with PosixFilesystem data sources; use enable_onprem_gcs_transfer_logs instead. */
  var logActions: js.UndefOr[js.Array[String]] = js.undefined
}
object LoggingConfig {
  
  inline def apply(): LoggingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoggingConfig]
  }
  
  extension [Self <: LoggingConfig](x: Self) {
    
    inline def setEnableOnpremGcsTransferLogs(value: Boolean): Self = StObject.set(x, "enableOnpremGcsTransferLogs", value.asInstanceOf[js.Any])
    
    inline def setEnableOnpremGcsTransferLogsUndefined: Self = StObject.set(x, "enableOnpremGcsTransferLogs", js.undefined)
    
    inline def setLogActionStates(value: js.Array[String]): Self = StObject.set(x, "logActionStates", value.asInstanceOf[js.Any])
    
    inline def setLogActionStatesUndefined: Self = StObject.set(x, "logActionStates", js.undefined)
    
    inline def setLogActionStatesVarargs(value: String*): Self = StObject.set(x, "logActionStates", js.Array(value*))
    
    inline def setLogActions(value: js.Array[String]): Self = StObject.set(x, "logActions", value.asInstanceOf[js.Any])
    
    inline def setLogActionsUndefined: Self = StObject.set(x, "logActions", js.undefined)
    
    inline def setLogActionsVarargs(value: String*): Self = StObject.set(x, "logActions", js.Array(value*))
  }
}
