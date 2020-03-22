package typings.pathParser.tokeniserMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Token extends js.Object {
  var `match`: String
  var otherVal: js.Any
  var regex: js.UndefOr[RegExp] = js.undefined
  var `type`: String
  var `val`: js.Any
}

object Token {
  @scala.inline
  def apply(`match`: String, otherVal: js.Any, `type`: String, `val`: js.Any, regex: RegExp = null): Token = {
    val __obj = js.Dynamic.literal(otherVal = otherVal.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    if (regex != null) __obj.updateDynamic("regex")(regex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
}

