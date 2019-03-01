package typings
package oauthDotJsLib.OAuthNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An OAuth message is represented as an object like this:
  *   { method: "GET", action: "http://server.com/path", parameters: ... }
  */
trait Message extends js.Object {
  var action: java.lang.String
  var method: java.lang.String
  var parameters: ParameterListOrMap
}

object Message {
  @scala.inline
  def apply(action: java.lang.String, method: java.lang.String, parameters: ParameterListOrMap): Message = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("action")(action)
    __obj.updateDynamic("method")(method)
    __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
}

