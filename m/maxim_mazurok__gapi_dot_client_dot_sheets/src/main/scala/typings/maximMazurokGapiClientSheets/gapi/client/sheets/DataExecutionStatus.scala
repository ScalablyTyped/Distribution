package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataExecutionStatus extends StObject {
  
  /** The error code. */
  var errorCode: js.UndefOr[String] = js.undefined
  
  /** The error message, which may be empty. */
  var errorMessage: js.UndefOr[String] = js.undefined
  
  /** Gets the time the data last successfully refreshed. */
  var lastRefreshTime: js.UndefOr[String] = js.undefined
  
  /** The state of the data execution. */
  var state: js.UndefOr[String] = js.undefined
}
object DataExecutionStatus {
  
  inline def apply(): DataExecutionStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataExecutionStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataExecutionStatus] (val x: Self) extends AnyVal {
    
    inline def setErrorCode(value: String): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setLastRefreshTime(value: String): Self = StObject.set(x, "lastRefreshTime", value.asInstanceOf[js.Any])
    
    inline def setLastRefreshTimeUndefined: Self = StObject.set(x, "lastRefreshTime", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
