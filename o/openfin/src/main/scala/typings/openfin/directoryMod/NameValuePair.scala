package typings.openfin.directoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NameValuePair extends js.Object {
  var name: String
  var value: String
}

object NameValuePair {
  @scala.inline
  def apply(name: String, value: String): NameValuePair = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameValuePair]
  }
}

