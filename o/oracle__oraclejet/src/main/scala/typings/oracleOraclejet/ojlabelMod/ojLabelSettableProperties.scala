package typings.oracleOraclejet.ojlabelMod

import typings.oracleOraclejet.AnonDefinitionSource
import typings.oracleOraclejet.AnonTooltipHelp
import typings.oracleOraclejet.mod.baseComponentSettableProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojLabelSettableProperties extends baseComponentSettableProperties {
  var `for`: String | Null
  var help: AnonDefinitionSource
  var labelId: String | Null
  var showRequired: Boolean | Null
  @JSName("translations")
  var translations_ojLabelSettableProperties: AnonTooltipHelp
}

object ojLabelSettableProperties {
  @scala.inline
  def apply(
    help: AnonDefinitionSource,
    translations: AnonTooltipHelp,
    `for`: String = null,
    labelId: String = null,
    showRequired: js.UndefOr[Boolean] = js.undefined
  ): ojLabelSettableProperties = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
    if (`for` != null) __obj.updateDynamic("for")(`for`.asInstanceOf[js.Any])
    if (labelId != null) __obj.updateDynamic("labelId")(labelId.asInstanceOf[js.Any])
    if (!js.isUndefined(showRequired)) __obj.updateDynamic("showRequired")(showRequired.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojLabelSettableProperties]
  }
}

