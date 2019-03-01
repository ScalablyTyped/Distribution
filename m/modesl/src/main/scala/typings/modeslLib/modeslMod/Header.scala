package typings
package modeslLib.modeslMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Header extends js.Object {
  var name: java.lang.String
  var value: java.lang.String
}

object Header {
  @scala.inline
  def apply(name: java.lang.String, value: java.lang.String): Header = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Header]
  }
}

