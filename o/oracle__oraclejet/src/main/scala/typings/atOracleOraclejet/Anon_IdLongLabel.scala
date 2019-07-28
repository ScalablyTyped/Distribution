package typings.atOracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdLongLabel extends js.Object {
  var id: String
  var longLabel: js.UndefOr[String] = js.undefined
  var shortLabel: js.UndefOr[String] = js.undefined
}

object Anon_IdLongLabel {
  @scala.inline
  def apply(id: String, longLabel: String = null, shortLabel: String = null): Anon_IdLongLabel = {
    val __obj = js.Dynamic.literal(id = id)
    if (longLabel != null) __obj.updateDynamic("longLabel")(longLabel)
    if (shortLabel != null) __obj.updateDynamic("shortLabel")(shortLabel)
    __obj.asInstanceOf[Anon_IdLongLabel]
  }
}

