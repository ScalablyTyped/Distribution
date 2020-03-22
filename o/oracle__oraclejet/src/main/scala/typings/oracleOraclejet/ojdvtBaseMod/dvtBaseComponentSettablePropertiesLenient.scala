package typings.oracleOraclejet.ojdvtBaseMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.AnonLabelCountWithTotal
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojdvt-base.dvtBaseComponentSettableProperties> */
trait dvtBaseComponentSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var trackResize: js.UndefOr[on | off] = js.undefined
  var translations: js.UndefOr[AnonLabelCountWithTotal] = js.undefined
}

object dvtBaseComponentSettablePropertiesLenient {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    trackResize: on | off = null,
    translations: AnonLabelCountWithTotal = null
  ): dvtBaseComponentSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (trackResize != null) __obj.updateDynamic("trackResize")(trackResize.asInstanceOf[js.Any])
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[dvtBaseComponentSettablePropertiesLenient]
  }
}

