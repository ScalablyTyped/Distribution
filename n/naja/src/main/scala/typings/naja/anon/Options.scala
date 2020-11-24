package typings.naja.anon

import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var options: typings.naja.najaMod.Options = js.native
  
  var payload: typings.naja.najaMod.Payload = js.native
  
  var request: typings.std.Request = js.native
  
  var response: Response = js.native
}
object Options {
  
  @scala.inline
  def apply(
    options: typings.naja.najaMod.Options,
    payload: typings.naja.najaMod.Payload,
    request: typings.std.Request,
    response: Response
  ): Options = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setOptions(value: typings.naja.najaMod.Options): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayload(value: typings.naja.najaMod.Payload): Self = this.set("payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: typings.std.Request): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: Response): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
