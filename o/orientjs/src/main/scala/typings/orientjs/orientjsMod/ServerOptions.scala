package typings.orientjs.orientjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerOptions extends js.Object {
  var password: String
  var username: String
}

object ServerOptions {
  @scala.inline
  def apply(password: String, username: String): ServerOptions = {
    val __obj = js.Dynamic.literal(password = password, username = username)
  
    __obj.asInstanceOf[ServerOptions]
  }
}

