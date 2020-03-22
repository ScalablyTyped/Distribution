package typings.oracleOraclejet.ojcolorpaletteMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.AnonConverterHint
import typings.oracleOraclejet.AnonDefinition
import typings.oracleOraclejet.AnonInstruction
import typings.oracleOraclejet.AnonLabel
import typings.oracleOraclejet.AnonLabelNone
import typings.oracleOraclejet.ojmessagingMod.^
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.grid
import typings.oracleOraclejet.oracleOraclejetStrings.invalidHidden
import typings.oracleOraclejet.oracleOraclejetStrings.invalidShown
import typings.oracleOraclejet.oracleOraclejetStrings.lg
import typings.oracleOraclejet.oracleOraclejetStrings.list
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.pending
import typings.oracleOraclejet.oracleOraclejetStrings.sm
import typings.oracleOraclejet.oracleOraclejetStrings.valid
import typings.oracleOraclejet.oracleOraclejetStrings.xs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojcolorpalette.ojColorPaletteSettableProperties> */
trait ojColorPaletteSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var describedBy: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var displayOptions: js.UndefOr[AnonConverterHint] = js.undefined
  var help: js.UndefOr[AnonInstruction] = js.undefined
  var helpHints: js.UndefOr[AnonDefinition] = js.undefined
  var labelDisplay: js.UndefOr[auto | off] = js.undefined
  var labelHint: js.UndefOr[String] = js.undefined
  var labelledBy: js.UndefOr[String] = js.undefined
  var layout: js.UndefOr[grid | list] = js.undefined
  var messagesCustom: js.UndefOr[js.Array[^]] = js.undefined
  var palette: js.UndefOr[js.Array[AnonLabel]] = js.undefined
  var swatchSize: js.UndefOr[xs | sm | lg] = js.undefined
  var translations: js.UndefOr[AnonLabelNone] = js.undefined
  var valid: js.UndefOr[
    typings.oracleOraclejet.oracleOraclejetStrings.valid | pending | invalidHidden | invalidShown
  ] = js.undefined
  var value: js.UndefOr[typings.oracleOraclejet.ojcolorMod.^] = js.undefined
}

object ojColorPaletteSettablePropertiesLenient {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    describedBy: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    displayOptions: AnonConverterHint = null,
    help: AnonInstruction = null,
    helpHints: AnonDefinition = null,
    labelDisplay: auto | off = null,
    labelHint: String = null,
    labelledBy: String = null,
    layout: grid | list = null,
    messagesCustom: js.Array[^] = null,
    palette: js.Array[AnonLabel] = null,
    swatchSize: xs | sm | lg = null,
    translations: AnonLabelNone = null,
    valid: valid | pending | invalidHidden | invalidShown = null,
    value: typings.oracleOraclejet.ojcolorMod.^ = null
  ): ojColorPaletteSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (describedBy != null) __obj.updateDynamic("describedBy")(describedBy.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (displayOptions != null) __obj.updateDynamic("displayOptions")(displayOptions.asInstanceOf[js.Any])
    if (help != null) __obj.updateDynamic("help")(help.asInstanceOf[js.Any])
    if (helpHints != null) __obj.updateDynamic("helpHints")(helpHints.asInstanceOf[js.Any])
    if (labelDisplay != null) __obj.updateDynamic("labelDisplay")(labelDisplay.asInstanceOf[js.Any])
    if (labelHint != null) __obj.updateDynamic("labelHint")(labelHint.asInstanceOf[js.Any])
    if (labelledBy != null) __obj.updateDynamic("labelledBy")(labelledBy.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (messagesCustom != null) __obj.updateDynamic("messagesCustom")(messagesCustom.asInstanceOf[js.Any])
    if (palette != null) __obj.updateDynamic("palette")(palette.asInstanceOf[js.Any])
    if (swatchSize != null) __obj.updateDynamic("swatchSize")(swatchSize.asInstanceOf[js.Any])
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    if (valid != null) __obj.updateDynamic("valid")(valid.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojColorPaletteSettablePropertiesLenient]
  }
}

