package typings.oracleOraclejet.ojaccordionMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.AnonId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojaccordion.ojAccordionSettableProperties> */
trait ojAccordionSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var expanded: js.UndefOr[js.Array[AnonId | Double | String]] = js.undefined
  var multiple: js.UndefOr[Boolean] = js.undefined
  var translations: js.UndefOr[js.Object] = js.undefined
}

object ojAccordionSettablePropertiesLenient {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    expanded: js.Array[AnonId | Double | String] = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    translations: js.Object = null
  ): ojAccordionSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (expanded != null) __obj.updateDynamic("expanded")(expanded.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojAccordionSettablePropertiesLenient]
  }
}

