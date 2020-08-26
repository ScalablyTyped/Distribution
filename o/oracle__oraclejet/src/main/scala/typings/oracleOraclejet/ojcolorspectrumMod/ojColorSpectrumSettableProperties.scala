package typings.oracleOraclejet.ojcolorspectrumMod

import typings.oracleOraclejet.anon.ConverterHint
import typings.oracleOraclejet.anon.Definition
import typings.oracleOraclejet.anon.Instruction
import typings.oracleOraclejet.anon.LabelHue
import typings.oracleOraclejet.ojcolorMod.^
import typings.oracleOraclejet.ojeditablevalueMod.editableValueSettableProperties
import typings.oracleOraclejet.oracleOraclejetStrings.invalidHidden
import typings.oracleOraclejet.oracleOraclejetStrings.invalidShown
import typings.oracleOraclejet.oracleOraclejetStrings.pending
import typings.oracleOraclejet.oracleOraclejetStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojColorSpectrumSettableProperties extends editableValueSettableProperties[^, ^, ^] {
  var labelledBy: String | Null = js.native
  val transientValue: ^ = js.native
  @JSName("translations")
  var translations_ojColorSpectrumSettableProperties: LabelHue = js.native
}

object ojColorSpectrumSettableProperties {
  @scala.inline
  def apply(
    disabled: Boolean,
    displayOptions: ConverterHint,
    help: Instruction,
    helpHints: Definition,
    labelHint: String,
    messagesCustom: js.Array[typings.oracleOraclejet.ojmessagingMod.^],
    transientValue: ^,
    translations: LabelHue,
    valid: valid | pending | invalidHidden | invalidShown,
    value: ^
  ): ojColorSpectrumSettableProperties = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], displayOptions = displayOptions.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], helpHints = helpHints.asInstanceOf[js.Any], labelHint = labelHint.asInstanceOf[js.Any], messagesCustom = messagesCustom.asInstanceOf[js.Any], transientValue = transientValue.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojColorSpectrumSettableProperties]
  }
  @scala.inline
  implicit class ojColorSpectrumSettablePropertiesOps[Self <: ojColorSpectrumSettableProperties] (val x: Self) extends AnyVal {
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
    def setTransientValue(value: ^): Self = this.set("transientValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setTranslations(value: LabelHue): Self = this.set("translations", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabelledBy(value: String): Self = this.set("labelledBy", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabelledByNull: Self = this.set("labelledBy", null)
  }
  
}

