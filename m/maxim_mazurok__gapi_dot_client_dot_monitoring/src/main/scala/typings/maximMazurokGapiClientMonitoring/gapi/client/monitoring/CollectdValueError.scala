package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectdValueError extends StObject {
  
  /** Records the error status for the value. */
  var error: js.UndefOr[Status] = js.undefined
  
  /** The zero-based index in CollectdPayload.values within the parent CreateCollectdTimeSeriesRequest.collectd_payloads. */
  var index: js.UndefOr[Double] = js.undefined
}
object CollectdValueError {
  
  @scala.inline
  def apply(): CollectdValueError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectdValueError]
  }
  
  @scala.inline
  implicit class CollectdValueErrorMutableBuilder[Self <: CollectdValueError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: Status): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
  }
}
