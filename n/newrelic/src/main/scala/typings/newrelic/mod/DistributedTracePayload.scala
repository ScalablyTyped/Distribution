package typings.newrelic.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DistributedTracePayload extends js.Object {
  
  /**
    * The base64 encoded JSON representation of the distributed trace payload.
    */
  def httpSafe(): String = js.native
  
  /**
    * The base64 encoded JSON representation of the distributed trace payload.
    */
  def text(): String = js.native
}
object DistributedTracePayload {
  
  @scala.inline
  def apply(httpSafe: () => String, text: () => String): DistributedTracePayload = {
    val __obj = js.Dynamic.literal(httpSafe = js.Any.fromFunction0(httpSafe), text = js.Any.fromFunction0(text))
    __obj.asInstanceOf[DistributedTracePayload]
  }
  
  @scala.inline
  implicit class DistributedTracePayloadOps[Self <: DistributedTracePayload] (val x: Self) extends AnyVal {
    
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
    def setHttpSafe(value: () => String): Self = this.set("httpSafe", js.Any.fromFunction0(value))
    
    @scala.inline
    def setText(value: () => String): Self = this.set("text", js.Any.fromFunction0(value))
  }
}
