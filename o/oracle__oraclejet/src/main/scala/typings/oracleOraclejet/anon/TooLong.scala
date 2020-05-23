package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooLong extends js.Object {
  var tooLong: js.UndefOr[String] = js.undefined
  var tooShort: js.UndefOr[String] = js.undefined
}

object TooLong {
  @scala.inline
  def apply(tooLong: String = null, tooShort: String = null): TooLong = {
    val __obj = js.Dynamic.literal()
    if (tooLong != null) __obj.updateDynamic("tooLong")(tooLong.asInstanceOf[js.Any])
    if (tooShort != null) __obj.updateDynamic("tooShort")(tooShort.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooLong]
  }
}

