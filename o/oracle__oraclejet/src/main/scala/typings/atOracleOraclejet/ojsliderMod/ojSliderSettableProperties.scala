package typings.atOracleOraclejet.ojsliderMod

import typings.atOracleOraclejet.Anon_ConverterHint
import typings.atOracleOraclejet.Anon_Definition
import typings.atOracleOraclejet.Anon_Instruction
import typings.atOracleOraclejet.Anon_InvalidStep
import typings.atOracleOraclejet.atOracleOraclejetStrings.fromMax
import typings.atOracleOraclejet.atOracleOraclejetStrings.fromMin
import typings.atOracleOraclejet.atOracleOraclejetStrings.horizontal
import typings.atOracleOraclejet.atOracleOraclejetStrings.invalidHidden
import typings.atOracleOraclejet.atOracleOraclejetStrings.invalidShown
import typings.atOracleOraclejet.atOracleOraclejetStrings.pending
import typings.atOracleOraclejet.atOracleOraclejetStrings.single
import typings.atOracleOraclejet.atOracleOraclejetStrings.valid
import typings.atOracleOraclejet.atOracleOraclejetStrings.vertical
import typings.atOracleOraclejet.ojeditablevalueMod.editableValueSettableProperties
import typings.atOracleOraclejet.ojmessagingMod.^
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
  var translations_ojSliderSettableProperties: Anon_InvalidStep
  var `type`: fromMin | fromMax | single
}

object ojSliderSettableProperties {
  @scala.inline
  def apply(
    disabled: Boolean,
    displayOptions: Anon_ConverterHint,
    help: Anon_Instruction,
    helpHints: Anon_Definition,
    labelHint: String,
    messagesCustom: js.Array[^],
    orientation: horizontal | vertical,
    transientValue: Double,
    translations: Anon_InvalidStep,
    `type`: fromMin | fromMax | single,
    valid: valid | pending | invalidHidden | invalidShown,
    describedBy: String = null,
    max: Int | Double = null,
    min: Int | Double = null,
    step: Int | Double = null,
    value: Int | Double = null
  ): ojSliderSettableProperties = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], displayOptions = displayOptions.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], helpHints = helpHints.asInstanceOf[js.Any], labelHint = labelHint.asInstanceOf[js.Any], messagesCustom = messagesCustom.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], transientValue = transientValue.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (describedBy != null) __obj.updateDynamic("describedBy")(describedBy.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojSliderSettableProperties]
  }
}

