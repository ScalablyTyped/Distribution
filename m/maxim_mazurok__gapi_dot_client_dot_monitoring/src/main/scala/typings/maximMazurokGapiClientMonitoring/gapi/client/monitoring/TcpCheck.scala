package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TcpCheck extends StObject {
  
  /** The TCP port on the server against which to run the check. Will be combined with host (specified within the monitored_resource) to construct the full URL. Required. */
  var port: js.UndefOr[Double] = js.undefined
}
object TcpCheck {
  
  inline def apply(): TcpCheck = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TcpCheck]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TcpCheck] (val x: Self) extends AnyVal {
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
  }
}
