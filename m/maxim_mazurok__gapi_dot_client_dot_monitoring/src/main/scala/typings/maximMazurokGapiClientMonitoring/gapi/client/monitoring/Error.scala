package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Error extends StObject {
  
  /** The number of points that couldn't be written because of status. */
  var pointCount: js.UndefOr[Double] = js.undefined
  
  /** The status of the requested write operation. */
  var status: js.UndefOr[Status] = js.undefined
}
object Error {
  
  @scala.inline
  def apply(): Error = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Error]
  }
  
  @scala.inline
  implicit class ErrorMutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPointCount(value: Double): Self = StObject.set(x, "pointCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointCountUndefined: Self = StObject.set(x, "pointCount", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
