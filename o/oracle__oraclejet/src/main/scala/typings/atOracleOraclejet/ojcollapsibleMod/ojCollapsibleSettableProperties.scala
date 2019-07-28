package typings.atOracleOraclejet.ojcollapsibleMod

import typings.atOracleOraclejet.atOracleOraclejetMod.baseComponentSettableProperties
import typings.atOracleOraclejet.atOracleOraclejetStrings.disclosureIcon
import typings.atOracleOraclejet.atOracleOraclejetStrings.header
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojCollapsibleSettableProperties extends baseComponentSettableProperties {
  var disabled: Boolean
  var expandArea: header | disclosureIcon
  var expanded: Boolean
}

object ojCollapsibleSettableProperties {
  @scala.inline
  def apply(
    disabled: Boolean,
    expandArea: header | disclosureIcon,
    expanded: Boolean,
    translations: js.Object = null
  ): ojCollapsibleSettableProperties = {
    val __obj = js.Dynamic.literal(disabled = disabled, expandArea = expandArea.asInstanceOf[js.Any], expanded = expanded)
    if (translations != null) __obj.updateDynamic("translations")(translations)
    __obj.asInstanceOf[ojCollapsibleSettableProperties]
  }
}

