package typings.natsHemera.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HemeraMessagePayload extends js.Object {
  
  var error: Error | Null = js.native
  
  var meta: js.Any = js.native
  
  var request: Request$ = js.native
  
  var result: js.Any = js.native
  
  var trace: Trace = js.native
}
object HemeraMessagePayload {
  
  @scala.inline
  def apply(meta: js.Any, request: Request$, result: js.Any, trace: Trace): HemeraMessagePayload = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], trace = trace.asInstanceOf[js.Any])
    __obj.asInstanceOf[HemeraMessagePayload]
  }
  
  @scala.inline
  implicit class HemeraMessagePayloadOps[Self <: HemeraMessagePayload] (val x: Self) extends AnyVal {
    
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
    def setMeta(value: js.Any): Self = this.set("meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: Request$): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: js.Any): Self = this.set("result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrace(value: Trace): Self = this.set("trace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: Error): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorNull: Self = this.set("error", null)
  }
}
