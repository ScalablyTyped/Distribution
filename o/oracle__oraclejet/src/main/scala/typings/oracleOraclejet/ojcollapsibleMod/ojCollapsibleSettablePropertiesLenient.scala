package typings.oracleOraclejet.ojcollapsibleMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.oracleOraclejetStrings.disclosureIcon
import typings.oracleOraclejet.oracleOraclejetStrings.header
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojcollapsible.ojCollapsibleSettableProperties> */
trait ojCollapsibleSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var expandArea: js.UndefOr[header | disclosureIcon] = js.undefined
  var expanded: js.UndefOr[Boolean] = js.undefined
  var translations: js.UndefOr[js.Object] = js.undefined
}

object ojCollapsibleSettablePropertiesLenient {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    expandArea: header | disclosureIcon = null,
    expanded: js.UndefOr[Boolean] = js.undefined,
    translations: js.Object = null
  ): ojCollapsibleSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (expandArea != null) __obj.updateDynamic("expandArea")(expandArea.asInstanceOf[js.Any])
    if (!js.isUndefined(expanded)) __obj.updateDynamic("expanded")(expanded.get.asInstanceOf[js.Any])
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojCollapsibleSettablePropertiesLenient]
  }
}

