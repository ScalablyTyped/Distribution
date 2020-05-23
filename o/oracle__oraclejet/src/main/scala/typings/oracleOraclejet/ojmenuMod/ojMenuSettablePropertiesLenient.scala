package typings.oracleOraclejet.ojmenuMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.anon.AriaFocusSkipLink
import typings.oracleOraclejet.ojmenuMod.ojMenu.OpenOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojmenu.ojMenuSettableProperties> */
trait ojMenuSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var openOptions: js.UndefOr[OpenOptions] = js.undefined
  var translations: js.UndefOr[AriaFocusSkipLink] = js.undefined
}

object ojMenuSettablePropertiesLenient {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    openOptions: OpenOptions = null,
    translations: AriaFocusSkipLink = null
  ): ojMenuSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (openOptions != null) __obj.updateDynamic("openOptions")(openOptions.asInstanceOf[js.Any])
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojMenuSettablePropertiesLenient]
  }
}

