package typings.picomatch.parseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Token extends js.Object {
  var output: js.Any
  var `type`: String
  var value: String
}

object Token {
  @scala.inline
  def apply(output: js.Any, `type`: String, value: String): Token = {
    val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
}

