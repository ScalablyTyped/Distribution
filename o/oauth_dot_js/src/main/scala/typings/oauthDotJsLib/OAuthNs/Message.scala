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

