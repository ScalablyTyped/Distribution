package typings.openfin.shapesPlatformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HostContextChangedPayload extends js.Object {
  
  var context: js.Any = js.native
  
  var reason: HostContextChangedReasons = js.native
}
object HostContextChangedPayload {
  
  @scala.inline
  def apply(context: js.Any, reason: HostContextChangedReasons): HostContextChangedPayload = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostContextChangedPayload]
  }
  
  @scala.inline
  implicit class HostContextChangedPayloadOps[Self <: HostContextChangedPayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContext(value: js.Any): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: HostContextChangedReasons): Self = this.set("reason", value.asInstanceOf[js.Any])
  }
}
