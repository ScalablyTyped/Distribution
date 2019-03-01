package typings
package atOracleOraclejetLib.ojnboxMod.ojNBoxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait Row extends js.Object {
  var id: java.lang.String
  var label: js.UndefOr[java.lang.String] = js.undefined
  var labelStyle: js.UndefOr[js.Object] = js.undefined
}

object Row {
  @scala.inline
  def apply(id: java.lang.String, label: java.lang.String = null, labelStyle: js.Object = null): Row = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    if (label != null) __obj.updateDynamic("label")(label)
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle)
    __obj.asInstanceOf[Row]
  }
}

