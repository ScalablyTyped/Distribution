package typings.oracleOraclejet.ojoptionMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojoption.ojOptionSettableProperties> */
trait ojOptionSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object ojOptionSettablePropertiesLenient {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    value: js.Any = null
  ): ojOptionSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojOptionSettablePropertiesLenient]
  }
}

