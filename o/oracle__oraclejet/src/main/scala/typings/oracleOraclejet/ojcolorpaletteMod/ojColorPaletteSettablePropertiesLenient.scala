package typings.oracleOraclejet.ojcolorpaletteMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.anon.ConverterHint
import typings.oracleOraclejet.anon.Definition
import typings.oracleOraclejet.anon.Instruction
import typings.oracleOraclejet.anon.Label
import typings.oracleOraclejet.anon.LabelNone
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
@js.native
trait ojColorPaletteSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var describedBy: js.UndefOr[String | Null] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var displayOptions: js.UndefOr[ConverterHint] = js.native
  var help: js.UndefOr[Instruction] = js.native
  var helpHints: js.UndefOr[Definition] = js.native
  var labelDisplay: js.UndefOr[auto | off] = js.native
  var labelHint: js.UndefOr[String] = js.native
  var labelledBy: js.UndefOr[String | Null] = js.native
  var layout: js.UndefOr[grid | list] = js.native
  var messagesCustom: js.UndefOr[js.Array[^]] = js.native
  var palette: js.UndefOr[js.Array[Label]] = js.native
  var swatchSize: js.UndefOr[xs | sm | lg] = js.native
  var translations: js.UndefOr[LabelNone] = js.native
  var valid: js.UndefOr[
    typings.oracleOraclejet.oracleOraclejetStrings.valid | pending | invalidHidden | invalidShown
  ] = js.native
  var value: js.UndefOr[typings.oracleOraclejet.ojcolorMod.^] = js.native
}

object ojColorPaletteSettablePropertiesLenient {
  @scala.inline
  def apply(): ojColorPaletteSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojColorPaletteSettablePropertiesLenient]
  }
  @scala.inline
  implicit class ojColorPaletteSettablePropertiesLenientOps[Self <: ojColorPaletteSettablePropertiesLenient] (val x: Self) extends AnyVal {
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
    def setDescribedBy(value: String): Self = this.set("describedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescribedBy: Self = this.set("describedBy", js.undefined)
    @scala.inline
    def setDescribedByNull: Self = this.set("describedBy", null)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setDisplayOptions(value: ConverterHint): Self = this.set("displayOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayOptions: Self = this.set("displayOptions", js.undefined)
    @scala.inline
    def setHelp(value: Instruction): Self = this.set("help", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHelp: Self = this.set("help", js.undefined)
    @scala.inline
    def setHelpHints(value: Definition): Self = this.set("helpHints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHelpHints: Self = this.set("helpHints", js.undefined)
    @scala.inline
    def setLabelDisplay(value: auto | off): Self = this.set("labelDisplay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelDisplay: Self = this.set("labelDisplay", js.undefined)
    @scala.inline
    def setLabelHint(value: String): Self = this.set("labelHint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelHint: Self = this.set("labelHint", js.undefined)
    @scala.inline
    def setLabelledBy(value: String): Self = this.set("labelledBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelledBy: Self = this.set("labelledBy", js.undefined)
    @scala.inline
    def setLabelledByNull: Self = this.set("labelledBy", null)
    @scala.inline
    def setLayout(value: grid | list): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    @scala.inline
    def setMessagesCustomVarargs(value: ^ *): Self = this.set("messagesCustom", js.Array(value :_*))
    @scala.inline
    def setMessagesCustom(value: js.Array[^]): Self = this.set("messagesCustom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessagesCustom: Self = this.set("messagesCustom", js.undefined)
    @scala.inline
    def setPaletteVarargs(value: Label*): Self = this.set("palette", js.Array(value :_*))
    @scala.inline
    def setPalette(value: js.Array[Label]): Self = this.set("palette", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePalette: Self = this.set("palette", js.undefined)
    @scala.inline
    def setSwatchSize(value: xs | sm | lg): Self = this.set("swatchSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwatchSize: Self = this.set("swatchSize", js.undefined)
    @scala.inline
    def setTranslations(value: LabelNone): Self = this.set("translations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslations: Self = this.set("translations", js.undefined)
    @scala.inline
    def setValid(value: valid | pending | invalidHidden | invalidShown): Self = this.set("valid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValid: Self = this.set("valid", js.undefined)
    @scala.inline
    def setValue(value: typings.oracleOraclejet.ojcolorMod.^): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

