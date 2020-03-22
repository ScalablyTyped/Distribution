package typings.oracleOraclejet.ojchartMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.oracleOraclejetStrings.inherit
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojchart.ojChartGroupSettableProperties> */
trait ojChartGroupSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var drilling: js.UndefOr[on | off | inherit] = js.undefined
  var labelStyle: js.UndefOr[js.Object] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var shortDesc: js.UndefOr[String] = js.undefined
}

object ojChartGroupSettablePropertiesLenient {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    drilling: on | off | inherit = null,
    labelStyle: js.Object = null,
    name: String = null,
    shortDesc: String = null
  ): ojChartGroupSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (drilling != null) __obj.updateDynamic("drilling")(drilling.asInstanceOf[js.Any])
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (shortDesc != null) __obj.updateDynamic("shortDesc")(shortDesc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojChartGroupSettablePropertiesLenient]
  }
}

