package typings.oracleOraclejet.ojprogressMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.AnonAriaIndeterminateProgressText
import typings.oracleOraclejet.oracleOraclejetStrings.bar
import typings.oracleOraclejet.oracleOraclejetStrings.circle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojprogress.ojProgressSettableProperties> */
trait ojProgressSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var max: js.UndefOr[Double] = js.undefined
  var translations: js.UndefOr[AnonAriaIndeterminateProgressText] = js.undefined
  var `type`: js.UndefOr[bar | circle] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object ojProgressSettablePropertiesLenient {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    max: Int | Double = null,
    translations: AnonAriaIndeterminateProgressText = null,
    `type`: bar | circle = null,
    value: Int | Double = null
  ): ojProgressSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojProgressSettablePropertiesLenient]
  }
}

