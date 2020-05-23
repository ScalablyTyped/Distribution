package typings.oracleOraclejet.ojcollapsibleMod

import typings.oracleOraclejet.mod.baseComponentSettableProperties
import typings.oracleOraclejet.oracleOraclejetStrings.disclosureIcon
import typings.oracleOraclejet.oracleOraclejetStrings.header
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
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], expandArea = expandArea.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojCollapsibleSettableProperties]
  }
}

