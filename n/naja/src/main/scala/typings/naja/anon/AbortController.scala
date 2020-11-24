package typings.naja.anon

import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbortController extends js.Object {
  
  var abortController: typings.std.AbortController = js.native
  
  var options: typings.naja.najaMod.Options = js.native
  
  var promise: js.Promise[Response] = js.native
  
  var request: typings.std.Request = js.native
}
object AbortController {
  
  @scala.inline
  def apply(
    abortController: typings.std.AbortController,
    options: typings.naja.najaMod.Options,
    promise: js.Promise[Response],
    request: typings.std.Request
  ): AbortController = {
    val __obj = js.Dynamic.literal(abortController = abortController.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], promise = promise.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbortController]
  }
  
  @scala.inline
  implicit class AbortControllerOps[Self <: AbortController] (val x: Self) extends AnyVal {
    
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
    def setAbortController(value: typings.std.AbortController): Self = this.set("abortController", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: typings.naja.najaMod.Options): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromise(value: js.Promise[Response]): Self = this.set("promise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: typings.std.Request): Self = this.set("request", value.asInstanceOf[js.Any])
  }
}
