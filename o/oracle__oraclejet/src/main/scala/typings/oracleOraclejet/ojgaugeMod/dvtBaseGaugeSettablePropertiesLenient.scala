package typings.oracleOraclejet.ojgaugeMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.AnonLabelAndValue
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojgauge.dvtBaseGaugeSettableProperties> */
trait dvtBaseGaugeSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var trackResize: js.UndefOr[on | off] = js.undefined
  var translations: js.UndefOr[AnonLabelAndValue] = js.undefined
}

object dvtBaseGaugeSettablePropertiesLenient {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    trackResize: on | off = null,
    translations: AnonLabelAndValue = null
  ): dvtBaseGaugeSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (trackResize != null) __obj.updateDynamic("trackResize")(trackResize.asInstanceOf[js.Any])
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[dvtBaseGaugeSettablePropertiesLenient]
  }
}

