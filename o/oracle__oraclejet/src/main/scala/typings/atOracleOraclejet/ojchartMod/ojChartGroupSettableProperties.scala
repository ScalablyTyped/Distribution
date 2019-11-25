package typings.atOracleOraclejet.ojchartMod

import typings.atOracleOraclejet.atOracleOraclejetMod.JetSettableProperties
import typings.atOracleOraclejet.atOracleOraclejetStrings.inherit
import typings.atOracleOraclejet.atOracleOraclejetStrings.off
import typings.atOracleOraclejet.atOracleOraclejetStrings.on
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojChartGroupSettableProperties extends JetSettableProperties {
  var drilling: js.UndefOr[on | off | inherit] = js.undefined
  var labelStyle: js.UndefOr[js.Object] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var shortDesc: js.UndefOr[String] = js.undefined
}

object ojChartGroupSettableProperties {
  @scala.inline
  def apply(
    drilling: on | off | inherit = null,
    labelStyle: js.Object = null,
    name: String = null,
    shortDesc: String = null
  ): ojChartGroupSettableProperties = {
    val __obj = js.Dynamic.literal()
    if (drilling != null) __obj.updateDynamic("drilling")(drilling.asInstanceOf[js.Any])
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (shortDesc != null) __obj.updateDynamic("shortDesc")(shortDesc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojChartGroupSettableProperties]
  }
}

