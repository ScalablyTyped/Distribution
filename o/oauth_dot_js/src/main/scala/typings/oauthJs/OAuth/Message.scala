package typings.oauthJs.OAuth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An OAuth message is represented as an object like this:
  *   { method: "GET", action: "http://server.com/path", parameters: ... }
  */
@js.native
trait Message extends js.Object {
  var action: String = js.native
  var method: String = js.native
  var parameters: ParameterListOrMap = js.native
}

object Message {
  @scala.inline
  def apply(action: String, method: String, parameters: ParameterListOrMap): Message = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
  @scala.inline
  implicit class MessageOps[Self <: Message] (val x: Self) extends AnyVal {
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
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setParametersVarargs(value: (js.Tuple2[String, String])*): Self = this.set("parameters", js.Array(value :_*))
    @scala.inline
    def setParameters(value: ParameterListOrMap): Self = this.set("parameters", value.asInstanceOf[js.Any])
  }
  
}

