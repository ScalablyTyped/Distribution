package typings.maximMazurokGapiClientStreetviewpublish.gapi.client.streetviewpublish

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Connection extends StObject {
  
  /** Required. The destination of the connection from the containing photo to another photo. */
  var target: js.UndefOr[PhotoId] = js.undefined
}
object Connection {
  
  @scala.inline
  def apply(): Connection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Connection]
  }
  
  @scala.inline
  implicit class ConnectionMutableBuilder[Self <: Connection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTarget(value: PhotoId): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
