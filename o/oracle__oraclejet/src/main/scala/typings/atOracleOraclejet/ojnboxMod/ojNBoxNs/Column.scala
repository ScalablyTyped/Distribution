package typings.atOracleOraclejet.ojnboxMod.ojNBoxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait Column extends js.Object {
  var id: String
  var label: js.UndefOr[String] = js.undefined
  var labelStyle: js.UndefOr[js.Object] = js.undefined
}

object Column {
  @scala.inline
  def apply(id: String, label: String = null, labelStyle: js.Object = null): Column = {
    val __obj = js.Dynamic.literal(id = id)
    if (label != null) __obj.updateDynamic("label")(label)
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle)
    __obj.asInstanceOf[Column]
  }
}

