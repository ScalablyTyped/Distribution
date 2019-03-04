package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdLongLabel extends js.Object {
  var id: java.lang.String
  var longLabel: js.UndefOr[java.lang.String] = js.undefined
  var shortLabel: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_IdLongLabel {
  @scala.inline
  def apply(id: java.lang.String, longLabel: java.lang.String = null, shortLabel: java.lang.String = null): Anon_IdLongLabel = {
    val __obj = js.Dynamic.literal(id = id)
    if (longLabel != null) __obj.updateDynamic("longLabel")(longLabel)
    if (shortLabel != null) __obj.updateDynamic("shortLabel")(shortLabel)
    __obj.asInstanceOf[Anon_IdLongLabel]
  }
}

