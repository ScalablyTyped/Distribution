package typings.momentDurationFormat.mod.momentAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocaleSpecification extends js.Object {
  
  var durationLabelTypes: js.UndefOr[js.Array[DurationLabelTypeDef]] = js.native
  
  var durationLabelsLong: js.UndefOr[DurationLabelDef] = js.native
  
  var durationLabelsShort: js.UndefOr[DurationLabelDef] = js.native
  
  var durationLabelsStandard: js.UndefOr[DurationLabelDef] = js.native
  
  var durationPluralKey: js.UndefOr[
    js.Function3[/* token */ String, /* integerValue */ Double, /* decimalValue */ Double, String]
  ] = js.native
  
  var durationTimeTemplates: js.UndefOr[DurationTimeDef] = js.native
}
object LocaleSpecification {
  
  @scala.inline
  def apply(): LocaleSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocaleSpecification]
  }
  
  @scala.inline
  implicit class LocaleSpecificationOps[Self <: LocaleSpecification] (val x: Self) extends AnyVal {
    
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
    def setDurationLabelTypesVarargs(value: DurationLabelTypeDef*): Self = this.set("durationLabelTypes", js.Array(value :_*))
    
    @scala.inline
    def setDurationLabelTypes(value: js.Array[DurationLabelTypeDef]): Self = this.set("durationLabelTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDurationLabelTypes: Self = this.set("durationLabelTypes", js.undefined)
    
    @scala.inline
    def setDurationLabelsLong(value: DurationLabelDef): Self = this.set("durationLabelsLong", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDurationLabelsLong: Self = this.set("durationLabelsLong", js.undefined)
    
    @scala.inline
    def setDurationLabelsShort(value: DurationLabelDef): Self = this.set("durationLabelsShort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDurationLabelsShort: Self = this.set("durationLabelsShort", js.undefined)
    
    @scala.inline
    def setDurationLabelsStandard(value: DurationLabelDef): Self = this.set("durationLabelsStandard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDurationLabelsStandard: Self = this.set("durationLabelsStandard", js.undefined)
    
    @scala.inline
    def setDurationPluralKey(value: (/* token */ String, /* integerValue */ Double, /* decimalValue */ Double) => String): Self = this.set("durationPluralKey", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteDurationPluralKey: Self = this.set("durationPluralKey", js.undefined)
    
    @scala.inline
    def setDurationTimeTemplates(value: DurationTimeDef): Self = this.set("durationTimeTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDurationTimeTemplates: Self = this.set("durationTimeTemplates", js.undefined)
  }
}
