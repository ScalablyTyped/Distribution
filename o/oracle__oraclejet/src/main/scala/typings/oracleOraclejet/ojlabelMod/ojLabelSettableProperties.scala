package typings.oracleOraclejet.ojlabelMod

import typings.oracleOraclejet.anon.DefinitionSource
import typings.oracleOraclejet.anon.TooltipHelp
import typings.oracleOraclejet.mod.baseComponentSettableProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojLabelSettableProperties extends baseComponentSettableProperties {
  var `for`: String | Null
  var help: DefinitionSource
  var labelId: String | Null
  var showRequired: Boolean | Null
  @JSName("translations")
  var translations_ojLabelSettableProperties: TooltipHelp
}

object ojLabelSettableProperties {
  @scala.inline
  def apply(
    help: DefinitionSource,
    translations: TooltipHelp,
    `for`: String = null,
    labelId: String = null,
    showRequired: Boolean = null.asInstanceOf[Boolean]
  ): ojLabelSettableProperties = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], labelId = labelId.asInstanceOf[js.Any], showRequired = showRequired.asInstanceOf[js.Any])
    __obj.updateDynamic("for")(`for`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojLabelSettableProperties]
  }
}

