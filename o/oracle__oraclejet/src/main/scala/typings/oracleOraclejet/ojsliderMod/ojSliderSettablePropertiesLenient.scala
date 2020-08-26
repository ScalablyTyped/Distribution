package typings.oracleOraclejet.ojsliderMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.anon.ConverterHint
import typings.oracleOraclejet.anon.Definition
import typings.oracleOraclejet.anon.Instruction
import typings.oracleOraclejet.anon.InvalidStep
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

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojslider.ojSliderSettableProperties> */
@js.native
trait ojSliderSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var describedBy: js.UndefOr[String | Null] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var displayOptions: js.UndefOr[ConverterHint] = js.native
  var help: js.UndefOr[Instruction] = js.native
  var helpHints: js.UndefOr[Definition] = js.native
  var labelHint: js.UndefOr[String] = js.native
  var max: js.UndefOr[Double | Null] = js.native
  var messagesCustom: js.UndefOr[js.Array[^]] = js.native
  var min: js.UndefOr[Double | Null] = js.native
  var orientation: js.UndefOr[horizontal | vertical] = js.native
  var step: js.UndefOr[Double | Null] = js.native
  var transientValue: js.UndefOr[Double] = js.native
  var translations: js.UndefOr[InvalidStep] = js.native
  var `type`: js.UndefOr[fromMin | fromMax | single] = js.native
  var valid: js.UndefOr[
    typings.oracleOraclejet.oracleOraclejetStrings.valid | pending | invalidHidden | invalidShown
  ] = js.native
  var value: js.UndefOr[Double | Null] = js.native
}

object ojSliderSettablePropertiesLenient {
  @scala.inline
  def apply(): ojSliderSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojSliderSettablePropertiesLenient]
  }
  @scala.inline
  implicit class ojSliderSettablePropertiesLenientOps[Self <: ojSliderSettablePropertiesLenient] (val x: Self) extends AnyVal {
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
    def setLabelHint(value: String): Self = this.set("labelHint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelHint: Self = this.set("labelHint", js.undefined)
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMaxNull: Self = this.set("max", null)
    @scala.inline
    def setMessagesCustomVarargs(value: ^ *): Self = this.set("messagesCustom", js.Array(value :_*))
    @scala.inline
    def setMessagesCustom(value: js.Array[^]): Self = this.set("messagesCustom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessagesCustom: Self = this.set("messagesCustom", js.undefined)
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setMinNull: Self = this.set("min", null)
    @scala.inline
    def setOrientation(value: horizontal | vertical): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    @scala.inline
    def setStepNull: Self = this.set("step", null)
    @scala.inline
    def setTransientValue(value: Double): Self = this.set("transientValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransientValue: Self = this.set("transientValue", js.undefined)
    @scala.inline
    def setTranslations(value: InvalidStep): Self = this.set("translations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslations: Self = this.set("translations", js.undefined)
    @scala.inline
    def setType(value: fromMin | fromMax | single): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setValid(value: valid | pending | invalidHidden | invalidShown): Self = this.set("valid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValid: Self = this.set("valid", js.undefined)
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setValueNull: Self = this.set("value", null)
  }
  
}

