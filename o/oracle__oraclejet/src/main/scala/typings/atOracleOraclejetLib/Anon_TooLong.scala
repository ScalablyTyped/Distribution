package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TooLong extends js.Object {
  var tooLong: js.UndefOr[java.lang.String] = js.undefined
  var tooShort: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_TooLong {
  @scala.inline
  def apply(tooLong: java.lang.String = null, tooShort: java.lang.String = null): Anon_TooLong = {
    val __obj = js.Dynamic.literal()
    if (tooLong != null) __obj.updateDynamic("tooLong")(tooLong)
    if (tooShort != null) __obj.updateDynamic("tooShort")(tooShort)
    __obj.asInstanceOf[Anon_TooLong]
  }
}

