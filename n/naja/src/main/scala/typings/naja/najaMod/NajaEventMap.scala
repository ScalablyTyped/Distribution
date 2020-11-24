package typings.naja.najaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NajaEventMap extends js.Object {
  
  var abort: AbortEvent = js.native
  
  var before: BeforeEvent = js.native
  
  var complete: CompleteEvent = js.native
  
  var error: ErrorEvent = js.native
  
  var init: InitEvent = js.native
  
  var start: StartEvent = js.native
  
  var success: SuccessEvent = js.native
}
object NajaEventMap {
  
  @scala.inline
  def apply(
    abort: AbortEvent,
    before: BeforeEvent,
    complete: CompleteEvent,
    error: ErrorEvent,
    init: InitEvent,
    start: StartEvent,
    success: SuccessEvent
  ): NajaEventMap = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[NajaEventMap]
  }
  
  @scala.inline
  implicit class NajaEventMapOps[Self <: NajaEventMap] (val x: Self) extends AnyVal {
    
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
    def setAbort(value: AbortEvent): Self = this.set("abort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBefore(value: BeforeEvent): Self = this.set("before", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplete(value: CompleteEvent): Self = this.set("complete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: ErrorEvent): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInit(value: InitEvent): Self = this.set("init", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: StartEvent): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: SuccessEvent): Self = this.set("success", value.asInstanceOf[js.Any])
  }
}
