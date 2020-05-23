package typings.oracleOraclejet.ojprogressMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.anon.AriaIndeterminateProgressText
import typings.oracleOraclejet.oracleOraclejetStrings.bar
import typings.oracleOraclejet.oracleOraclejetStrings.circle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojprogress.ojProgressSettableProperties> */
trait ojProgressSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var max: js.UndefOr[Double] = js.undefined
  var translations: js.UndefOr[AriaIndeterminateProgressText] = js.undefined
  var `type`: js.UndefOr[bar | circle] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object ojProgressSettablePropertiesLenient {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    max: js.UndefOr[Double] = js.undefined,
    translations: AriaIndeterminateProgressText = null,
    `type`: bar | circle = null,
    value: js.UndefOr[Double] = js.undefined
  ): ojProgressSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojProgressSettablePropertiesLenient]
  }
}

