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

@js.native
trait ojSliderSettableProperties extends editableValueSettableProperties[Double | Null, Double | Null, Double | Null] {
  var max: Double | Null = js.native
  var min: Double | Null = js.native
  var orientation: horizontal | vertical = js.native
  var step: Double | Null = js.native
  val transientValue: Double = js.native
  @JSName("translations")
  var translations_ojSliderSettableProperties: InvalidStep = js.native
  var `type`: fromMin | fromMax | single = js.native
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
    valid: valid | pending | invalidHidden | invalidShown
  ): ojSliderSettableProperties = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], displayOptions = displayOptions.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], helpHints = helpHints.asInstanceOf[js.Any], labelHint = labelHint.asInstanceOf[js.Any], messagesCustom = messagesCustom.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], transientValue = transientValue.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojSliderSettableProperties]
  }
  @scala.inline
  implicit class ojSliderSettablePropertiesOps[Self <: ojSliderSettableProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOrientation(value: horizontal | vertical): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransientValue(value: Double): Self = this.set("transientValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setTranslations(value: InvalidStep): Self = this.set("translations", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: fromMin | fromMax | single): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxNull: Self = this.set("max", null)
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinNull: Self = this.set("min", null)
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def setStepNull: Self = this.set("step", null)
  }
  
}

