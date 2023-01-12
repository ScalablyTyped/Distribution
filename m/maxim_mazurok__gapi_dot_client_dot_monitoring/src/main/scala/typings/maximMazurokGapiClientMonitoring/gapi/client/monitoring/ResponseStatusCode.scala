package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseStatusCode extends StObject {
  
  /** A class of status codes to accept. */
  var statusClass: js.UndefOr[String] = js.undefined
  
  /** A status code to accept. */
  var statusValue: js.UndefOr[Double] = js.undefined
}
object ResponseStatusCode {
  
  inline def apply(): ResponseStatusCode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseStatusCode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseStatusCode] (val x: Self) extends AnyVal {
    
    inline def setStatusClass(value: String): Self = StObject.set(x, "statusClass", value.asInstanceOf[js.Any])
    
    inline def setStatusClassUndefined: Self = StObject.set(x, "statusClass", js.undefined)
    
    inline def setStatusValue(value: Double): Self = StObject.set(x, "statusValue", value.asInstanceOf[js.Any])
    
    inline def setStatusValueUndefined: Self = StObject.set(x, "statusValue", js.undefined)
  }
}
