package typings
package atOracleOraclejetLib.ojlabelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojLabelSettableProperties
  extends atOracleOraclejetLib.atOracleOraclejetMod.baseComponentSettableProperties {
  var `for`: java.lang.String | scala.Null
  var help: atOracleOraclejetLib.Anon_DefinitionSource
  var labelId: java.lang.String | scala.Null
  var showRequired: scala.Boolean | scala.Null
  @JSName("translations")
  var translations_ojLabelSettableProperties: atOracleOraclejetLib.Anon_TooltipHelp
}

object ojLabelSettableProperties {
  @scala.inline
  def apply(
    help: atOracleOraclejetLib.Anon_DefinitionSource,
    translations: atOracleOraclejetLib.Anon_TooltipHelp,
    `for`: java.lang.String = null,
    labelId: java.lang.String = null,
    showRequired: js.UndefOr[scala.Boolean] = js.undefined
  ): ojLabelSettableProperties = {
    val __obj = js.Dynamic.literal(help = help, translations = translations)
    if (`for` != null) __obj.updateDynamic("for")(`for`)
    if (labelId != null) __obj.updateDynamic("labelId")(labelId)
    if (!js.isUndefined(showRequired)) __obj.updateDynamic("showRequired")(showRequired)
    __obj.asInstanceOf[ojLabelSettableProperties]
  }
}

