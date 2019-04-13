package typings
package atOracleOraclejetLib.ojcolorpaletteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojColorPaletteSettableProperties
  extends atOracleOraclejetLib.ojeditablevalueMod.editableValueSettableProperties[
      atOracleOraclejetLib.ojcolorMod.^, 
      atOracleOraclejetLib.ojcolorMod.^, 
      atOracleOraclejetLib.ojcolorMod.^
    ] {
  var labelDisplay: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
  var labelledBy: java.lang.String | scala.Null
  var layout: atOracleOraclejetLib.atOracleOraclejetLibStrings.grid | atOracleOraclejetLib.atOracleOraclejetLibStrings.list
  var palette: js.Array[atOracleOraclejetLib.Anon_ColorLabel]
  var swatchSize: atOracleOraclejetLib.atOracleOraclejetLibStrings.xs | atOracleOraclejetLib.atOracleOraclejetLibStrings.sm | atOracleOraclejetLib.atOracleOraclejetLibStrings.lg
  @JSName("translations")
  var translations_ojColorPaletteSettableProperties: atOracleOraclejetLib.Anon_LabelNone
}

object ojColorPaletteSettableProperties {
  @scala.inline
  def apply(
    disabled: scala.Boolean,
    displayOptions: atOracleOraclejetLib.Anon_ConverterHint,
    help: atOracleOraclejetLib.Anon_Instruction,
    helpHints: atOracleOraclejetLib.Anon_Definition,
    labelDisplay: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.off,
    labelHint: java.lang.String,
    layout: atOracleOraclejetLib.atOracleOraclejetLibStrings.grid | atOracleOraclejetLib.atOracleOraclejetLibStrings.list,
    messagesCustom: js.Array[atOracleOraclejetLib.ojmessagingMod.^],
    palette: js.Array[atOracleOraclejetLib.Anon_ColorLabel],
    swatchSize: atOracleOraclejetLib.atOracleOraclejetLibStrings.xs | atOracleOraclejetLib.atOracleOraclejetLibStrings.sm | atOracleOraclejetLib.atOracleOraclejetLibStrings.lg,
    translations: atOracleOraclejetLib.Anon_LabelNone,
    valid: atOracleOraclejetLib.atOracleOraclejetLibStrings.valid | atOracleOraclejetLib.atOracleOraclejetLibStrings.pending | atOracleOraclejetLib.atOracleOraclejetLibStrings.invalidHidden | atOracleOraclejetLib.atOracleOraclejetLibStrings.invalidShown,
    value: atOracleOraclejetLib.ojcolorMod.^,
    describedBy: java.lang.String = null,
    labelledBy: java.lang.String = null
  ): ojColorPaletteSettableProperties = {
    val __obj = js.Dynamic.literal(disabled = disabled, displayOptions = displayOptions, help = help, helpHints = helpHints, labelDisplay = labelDisplay.asInstanceOf[js.Any], labelHint = labelHint, layout = layout.asInstanceOf[js.Any], messagesCustom = messagesCustom, palette = palette, swatchSize = swatchSize.asInstanceOf[js.Any], translations = translations, valid = valid.asInstanceOf[js.Any], value = value)
    if (describedBy != null) __obj.updateDynamic("describedBy")(describedBy)
    if (labelledBy != null) __obj.updateDynamic("labelledBy")(labelledBy)
    __obj.asInstanceOf[ojColorPaletteSettableProperties]
  }
}

