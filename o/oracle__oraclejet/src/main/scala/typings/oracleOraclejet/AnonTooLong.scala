package typings.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTooLong extends js.Object {
  var tooLong: js.UndefOr[String] = js.undefined
  var tooShort: js.UndefOr[String] = js.undefined
}

object AnonTooLong {
  @scala.inline
  def apply(tooLong: String = null, tooShort: String = null): AnonTooLong = {
    val __obj = js.Dynamic.literal()
    if (tooLong != null) __obj.updateDynamic("tooLong")(tooLong.asInstanceOf[js.Any])
    if (tooShort != null) __obj.updateDynamic("tooShort")(tooShort.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTooLong]
  }
}

