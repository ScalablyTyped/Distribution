package typings.newrelic.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TraceMetadata extends js.Object {
  
  /**
    * The current span ID
    */
  var spanId: js.UndefOr[String] = js.native
  
  /**
    * The current trace ID
    */
  var traceId: js.UndefOr[String] = js.native
}
object TraceMetadata {
  
  @scala.inline
  def apply(): TraceMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TraceMetadata]
  }
  
  @scala.inline
  implicit class TraceMetadataOps[Self <: TraceMetadata] (val x: Self) extends AnyVal {
    
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
    def setSpanId(value: String): Self = this.set("spanId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpanId: Self = this.set("spanId", js.undefined)
    
    @scala.inline
    def setTraceId(value: String): Self = this.set("traceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTraceId: Self = this.set("traceId", js.undefined)
  }
}
