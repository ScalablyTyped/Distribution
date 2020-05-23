package typings.oracleOraclejet.ojsliderMod

import typings.oracleOraclejet.anon.ConverterHint
import typings.oracleOraclejet.anon.Definition
import typings.oracleOraclejet.anon.Instruction
import typings.oracleOraclejet.anon.InvalidStep
import typings.oracleOraclejet.ojeditablevalueMod.editableValueSettableProperties
import typings.oracleOraclejet.ojmessagingMod.^
import typings.oracleOraclejet.oracleOraclejetStrings.fromMax
import typings.oracleOraclejet.oracleOraclejetStrings.fromMin
import typings.oracleOraclejet.oracleOraclejetStrings.horizontal
import typings.oracleOraclejet.oracleOraclejetStrings.invalidHidden
import typings.oracleOraclejet.oracleOraclejetStrings.invalidShown
import typings.oracleOraclejet.oracleOraclejetStrings.pending
import typings.oracleOraclejet.oracleOraclejetStrings.single
import typings.oracleOraclejet.oracleOraclejetStrings.valid
import typings.oracleOraclejet.oracleOraclejetStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojSliderSettableProperties extends editableValueSettableProperties[Double | Null, Double | Null, Double | Null] {
  var max: Double | Null
  var min: Double | Null
  var orientation: horizontal | vertical
  var step: Double | Null
  val transientValue: Double
  @JSName("translations")
  var translations_ojSliderSettableProperties: InvalidStep
  var `type`: fromMin | fromMax | single
}

object ojSliderSettableProperties {
  @scala.inline
  def apply(
    disabled: Boolean,
    displayOptions: ConverterHint,
    help: Instruction,
    helpHints: Definition,
    labelHint: String,
    messagesCustom: js.Array[^],
    orientation: horizontal | vertical,
    transientValue: Double,
    translations: InvalidStep,
    `type`: fromMin | fromMax | single,
    valid: valid | pending | invalidHidden | invalidShown,
    describedBy: String = null,
    max: Double = null.asInstanceOf[Double],
    min: Double = null.asInstanceOf[Double],
    step: Double = null.asInstanceOf[Double],
    value: Double = null.asInstanceOf[Double]
  ): ojSliderSettableProperties = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], displayOptions = displayOptions.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], helpHints = helpHints.asInstanceOf[js.Any], labelHint = labelHint.asInstanceOf[js.Any], messagesCustom = messagesCustom.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], transientValue = transientValue.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], describedBy = describedBy.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojSliderSettableProperties]
  }
}

