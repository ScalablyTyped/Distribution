package typings.openfin.shapesPlatformMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HostContextChangedPayload extends StObject {
  
  var context: js.Any
  
  var reason: HostContextChangedReasons
}
object HostContextChangedPayload {
  
  @scala.inline
  def apply(context: js.Any, reason: HostContextChangedReasons): HostContextChangedPayload = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostContextChangedPayload]
  }
  
  @scala.inline
  implicit class HostContextChangedPayloadMutableBuilder[Self <: HostContextChangedPayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: HostContextChangedReasons): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}
