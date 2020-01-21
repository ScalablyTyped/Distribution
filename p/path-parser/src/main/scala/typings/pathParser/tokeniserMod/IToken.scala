package typings.pathParser.tokeniserMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToken extends js.Object {
  var `match`: String
  var otherVal: js.Any
  var regex: RegExp
  var `type`: String
  var `val`: js.Any
}

object IToken {
  @scala.inline
  def apply(`match`: String, otherVal: js.Any, regex: RegExp, `type`: String, `val`: js.Any): IToken = {
    val __obj = js.Dynamic.literal(otherVal = otherVal.asInstanceOf[js.Any], regex = regex.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IToken]
  }
}

