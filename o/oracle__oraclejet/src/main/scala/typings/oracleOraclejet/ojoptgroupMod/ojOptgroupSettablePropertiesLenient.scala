package typings.oracleOraclejet.ojoptgroupMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojoptgroup.ojOptgroupSettableProperties> */
trait ojOptgroupSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var label: js.UndefOr[String] = js.undefined
}

object ojOptgroupSettablePropertiesLenient {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    label: String = null
  ): ojOptgroupSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojOptgroupSettablePropertiesLenient]
  }
}

