package typings.oracleOraclejet.ojbuttonMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.oracleOraclejetStrings.all
import typings.oracleOraclejet.oracleOraclejetStrings.full
import typings.oracleOraclejet.oracleOraclejetStrings.half
import typings.oracleOraclejet.oracleOraclejetStrings.icons
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.oneTabstop
import typings.oracleOraclejet.oracleOraclejetStrings.outlined
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojbutton.ojButtonsetOneSettableProperties> */
trait ojButtonsetOneSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var chroming: js.UndefOr[full | half | outlined] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var display: js.UndefOr[all | icons] = js.undefined
  var focusManagement: js.UndefOr[oneTabstop | none] = js.undefined
  var translations: js.UndefOr[js.Object] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object ojButtonsetOneSettablePropertiesLenient {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    chroming: full | half | outlined = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    display: all | icons = null,
    focusManagement: oneTabstop | none = null,
    translations: js.Object = null,
    value: js.Any = null
  ): ojButtonsetOneSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (chroming != null) __obj.updateDynamic("chroming")(chroming.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (focusManagement != null) __obj.updateDynamic("focusManagement")(focusManagement.asInstanceOf[js.Any])
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojButtonsetOneSettablePropertiesLenient]
  }
}

