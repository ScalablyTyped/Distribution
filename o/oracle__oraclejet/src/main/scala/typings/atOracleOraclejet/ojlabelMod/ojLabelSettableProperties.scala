package typings.atOracleOraclejet.ojlabelMod

import typings.atOracleOraclejet.Anon_DefinitionSource
import typings.atOracleOraclejet.Anon_TooltipHelp
import typings.atOracleOraclejet.atOracleOraclejetMod.baseComponentSettableProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojLabelSettableProperties extends baseComponentSettableProperties {
  var `for`: String | Null
  var help: Anon_DefinitionSource
  var labelId: String | Null
  var showRequired: Boolean | Null
  @JSName("translations")
  var translations_ojLabelSettableProperties: Anon_TooltipHelp
}

object ojLabelSettableProperties {
  @scala.inline
  def apply(
    help: Anon_DefinitionSource,
    translations: Anon_TooltipHelp,
    `for`: String = null,
    labelId: String = null,
    showRequired: js.UndefOr[Boolean] = js.undefined
  ): ojLabelSettableProperties = {
    val __obj = js.Dynamic.literal(help = help, translations = translations)
    if (`for` != null) __obj.updateDynamic("for")(`for`)
    if (labelId != null) __obj.updateDynamic("labelId")(labelId)
    if (!js.isUndefined(showRequired)) __obj.updateDynamic("showRequired")(showRequired)
    __obj.asInstanceOf[ojLabelSettableProperties]
  }
}

