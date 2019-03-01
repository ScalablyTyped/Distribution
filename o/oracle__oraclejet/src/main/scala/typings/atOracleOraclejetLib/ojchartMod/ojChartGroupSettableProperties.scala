package typings
package atOracleOraclejetLib.ojchartMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojChartGroupSettableProperties
  extends atOracleOraclejetLib.atOracleOraclejetMod.JetSettableProperties {
  var drilling: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.inherit
  ] = js.undefined
  var labelStyle: js.UndefOr[js.Object] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var shortDesc: js.UndefOr[java.lang.String] = js.undefined
}

object ojChartGroupSettableProperties {
  @scala.inline
  def apply(
    drilling: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.inherit = null,
    labelStyle: js.Object = null,
    name: java.lang.String = null,
    shortDesc: java.lang.String = null
  ): ojChartGroupSettableProperties = {
    val __obj = js.Dynamic.literal()
    if (drilling != null) __obj.updateDynamic("drilling")(drilling.asInstanceOf[js.Any])
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle)
    if (name != null) __obj.updateDynamic("name")(name)
    if (shortDesc != null) __obj.updateDynamic("shortDesc")(shortDesc)
    __obj.asInstanceOf[ojChartGroupSettableProperties]
  }
}

