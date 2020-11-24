package typings.natsHemera.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Trace extends js.Object {
  
  var duration: Double = js.native
  
  var method: String = js.native
  
  var parentSpanId: String = js.native
  
  var service: String = js.native
  
  var spanId: String = js.native
  
  var timestamp: Double = js.native
  
  var traceId: String = js.native
}
object Trace {
  
  @scala.inline
  def apply(
    duration: Double,
    method: String,
    parentSpanId: String,
    service: String,
    spanId: String,
    timestamp: Double,
    traceId: String
  ): Trace = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], parentSpanId = parentSpanId.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], spanId = spanId.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], traceId = traceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Trace]
  }
  
  @scala.inline
  implicit class TraceOps[Self <: Trace] (val x: Self) extends AnyVal {
    
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
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentSpanId(value: String): Self = this.set("parentSpanId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setService(value: String): Self = this.set("service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpanId(value: String): Self = this.set("spanId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTraceId(value: String): Self = this.set("traceId", value.asInstanceOf[js.Any])
  }
}
