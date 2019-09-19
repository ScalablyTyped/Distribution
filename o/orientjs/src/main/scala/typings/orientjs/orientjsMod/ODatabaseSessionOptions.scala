package typings.orientjs.orientjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ODatabaseSessionOptions extends js.Object {
  var name: String
  var password: String
  var username: String
}

object ODatabaseSessionOptions {
  @scala.inline
  def apply(name: String, password: String, username: String): ODatabaseSessionOptions = {
    val __obj = js.Dynamic.literal(name = name, password = password, username = username)
  
    __obj.asInstanceOf[ODatabaseSessionOptions]
  }
}

