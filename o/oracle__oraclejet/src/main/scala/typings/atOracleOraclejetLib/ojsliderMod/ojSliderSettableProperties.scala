package typings
package atOracleOraclejetLib.ojsliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojSliderSettableProperties
  extends atOracleOraclejetLib.ojeditablevalueMod.editableValueSettableProperties[scala.Double | scala.Null, scala.Double | scala.Null, scala.Double | scala.Null] {
  var max: scala.Double | scala.Null
  var min: scala.Double | scala.Null
  var orientation: atOracleOraclejetLib.atOracleOraclejetLibStrings.horizontal | atOracleOraclejetLib.atOracleOraclejetLibStrings.vertical
  var step: scala.Double | scala.Null
  val transientValue: scala.Double
  @JSName("translations")
  var translations_ojSliderSettableProperties: atOracleOraclejetLib.Anon_InvalidStep
  var `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.fromMin | atOracleOraclejetLib.atOracleOraclejetLibStrings.fromMax | atOracleOraclejetLib.atOracleOraclejetLibStrings.single
}

object ojSliderSettableProperties {
  @scala.inline
  def apply(
    disabled: scala.Boolean,
    displayOptions: atOracleOraclejetLib.Anon_ConverterHint,
    help: atOracleOraclejetLib.Anon_Instruction,
    helpHints: atOracleOraclejetLib.Anon_Definition,
    labelHint: java.lang.String,
    messagesCustom: js.Array[atOracleOraclejetLib.ojmessagingMod.^],
    orientation: atOracleOraclejetLib.atOracleOraclejetLibStrings.horizontal | atOracleOraclejetLib.atOracleOraclejetLibStrings.vertical,
    transientValue: scala.Double,
    translations: atOracleOraclejetLib.Anon_InvalidStep,
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.fromMin | atOracleOraclejetLib.atOracleOraclejetLibStrings.fromMax | atOracleOraclejetLib.atOracleOraclejetLibStrings.single,
    valid: atOracleOraclejetLib.atOracleOraclejetLibStrings.valid | atOracleOraclejetLib.atOracleOraclejetLibStrings.pending | atOracleOraclejetLib.atOracleOraclejetLibStrings.invalidHidden | atOracleOraclejetLib.atOracleOraclejetLibStrings.invalidShown,
    describedBy: java.lang.String = null,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    step: scala.Int | scala.Double = null,
    value: scala.Int | scala.Double = null
  ): ojSliderSettableProperties = {
    val __obj = js.Dynamic.literal(disabled = disabled, displayOptions = displayOptions, help = help, helpHints = helpHints, labelHint = labelHint, messagesCustom = messagesCustom, orientation = orientation.asInstanceOf[js.Any], transientValue = transientValue, translations = translations, valid = valid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (describedBy != null) __obj.updateDynamic("describedBy")(describedBy)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojSliderSettableProperties]
  }
}

