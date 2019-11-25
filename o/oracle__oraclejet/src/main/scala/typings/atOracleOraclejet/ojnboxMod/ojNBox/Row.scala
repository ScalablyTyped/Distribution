package typings.atOracleOraclejet.ojnboxMod.ojNBox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait Row extends js.Object {
  var id: String
  var label: js.UndefOr[String] = js.undefined
  var labelStyle: js.UndefOr[js.Object] = js.undefined
}

object Row {
  @scala.inline
  def apply(id: String, label: String = null, labelStyle: js.Object = null): Row = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Row]
  }
}

