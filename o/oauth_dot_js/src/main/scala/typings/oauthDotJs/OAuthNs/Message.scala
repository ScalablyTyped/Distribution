package typings.oauthDotJs.OAuthNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An OAuth message is represented as an object like this:
  *   { method: "GET", action: "http://server.com/path", parameters: ... }
  */
trait Message extends js.Object {
  var action: String
  var method: String
  var parameters: ParameterListOrMap
}

object Message {
  @scala.inline
  def apply(action: String, method: String, parameters: ParameterListOrMap): Message = {
    val __obj = js.Dynamic.literal(action = action, method = method, parameters = parameters.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Message]
  }
}

