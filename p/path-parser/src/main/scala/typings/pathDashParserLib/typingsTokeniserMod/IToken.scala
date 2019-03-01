package typings
package pathDashParserLib.typingsTokeniserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToken extends js.Object {
  var `match`: java.lang.String
  var otherVal: js.Any
  var regex: stdLib.RegExp
  var `type`: java.lang.String
  var `val`: js.Any
}

object IToken {
  @scala.inline
  def apply(
    `match`: java.lang.String,
    otherVal: js.Any,
    regex: stdLib.RegExp,
    `type`: java.lang.String,
    `val`: js.Any
  ): IToken = {
    val __obj = js.Dynamic.literal(`match` = `match`, `type` = `type`, `val` = `val`)
    __obj.updateDynamic("otherVal")(otherVal)
    __obj.updateDynamic("regex")(regex)
    __obj.asInstanceOf[IToken]
  }
}

