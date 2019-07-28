package typings.atOracleOraclejet.ojcolorpaletteMod

import typings.atOracleOraclejet.Anon_ColorLabel
import typings.atOracleOraclejet.Anon_ConverterHint
import typings.atOracleOraclejet.Anon_Definition
import typings.atOracleOraclejet.Anon_Instruction
import typings.atOracleOraclejet.Anon_LabelNone
import typings.atOracleOraclejet.atOracleOraclejetStrings.auto
import typings.atOracleOraclejet.atOracleOraclejetStrings.grid
import typings.atOracleOraclejet.atOracleOraclejetStrings.invalidHidden
import typings.atOracleOraclejet.atOracleOraclejetStrings.invalidShown
import typings.atOracleOraclejet.atOracleOraclejetStrings.lg
import typings.atOracleOraclejet.atOracleOraclejetStrings.list
import typings.atOracleOraclejet.atOracleOraclejetStrings.off
import typings.atOracleOraclejet.atOracleOraclejetStrings.pending
import typings.atOracleOraclejet.atOracleOraclejetStrings.sm
import typings.atOracleOraclejet.atOracleOraclejetStrings.valid
import typings.atOracleOraclejet.atOracleOraclejetStrings.xs
import typings.atOracleOraclejet.ojcolorMod.^
import typings.atOracleOraclejet.ojeditablevalueMod.editableValueSettableProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojColorPaletteSettableProperties extends editableValueSettableProperties[^, ^, ^] {
  var labelDisplay: auto | off
  var labelledBy: String | Null
  var layout: grid | list
  var palette: js.Array[Anon_ColorLabel]
  var swatchSize: xs | sm | lg
  @JSName("translations")
  var translations_ojColorPaletteSettableProperties: Anon_LabelNone
}

object ojColorPaletteSettableProperties {
  @scala.inline
  def apply(
    disabled: Boolean,
    displayOptions: Anon_ConverterHint,
    help: Anon_Instruction,
    helpHints: Anon_Definition,
    labelDisplay: auto | off,
    labelHint: String,
    layout: grid | list,
    messagesCustom: js.Array[typings.atOracleOraclejet.ojmessagingMod.^],
    palette: js.Array[Anon_ColorLabel],
    swatchSize: xs | sm | lg,
    translations: Anon_LabelNone,
    valid: valid | pending | invalidHidden | invalidShown,
    value: ^,
    describedBy: String = null,
    labelledBy: String = null
  ): ojColorPaletteSettableProperties = {
    val __obj = js.Dynamic.literal(disabled = disabled, displayOptions = displayOptions, help = help, helpHints = helpHints, labelDisplay = labelDisplay.asInstanceOf[js.Any], labelHint = labelHint, layout = layout.asInstanceOf[js.Any], messagesCustom = messagesCustom, palette = palette, swatchSize = swatchSize.asInstanceOf[js.Any], translations = translations, valid = valid.asInstanceOf[js.Any], value = value)
    if (describedBy != null) __obj.updateDynamic("describedBy")(describedBy)
    if (labelledBy != null) __obj.updateDynamic("labelledBy")(labelledBy)
    __obj.asInstanceOf[ojColorPaletteSettableProperties]
  }
}

