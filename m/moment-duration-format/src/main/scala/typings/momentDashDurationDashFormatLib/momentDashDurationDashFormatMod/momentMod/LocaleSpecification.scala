package typings
package momentDashDurationDashFormatLib.momentDashDurationDashFormatMod.momentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocaleSpecification extends js.Object {
  var durationLabelTypes: js.UndefOr[js.Array[DurationLabelTypeDef]] = js.undefined
  var durationLabelsLong: js.UndefOr[DurationLabelDef] = js.undefined
  var durationLabelsShort: js.UndefOr[DurationLabelDef] = js.undefined
  var durationLabelsStandard: js.UndefOr[DurationLabelDef] = js.undefined
  var durationPluralKey: js.UndefOr[
    js.Function3[
      /* token */ java.lang.String, 
      /* integerValue */ scala.Double, 
      /* decimalValue */ scala.Double, 
      java.lang.String
    ]
  ] = js.undefined
  var durationTimeTemplates: js.UndefOr[DurationTimeDef] = js.undefined
}

object LocaleSpecification {
  @scala.inline
  def apply(
    durationLabelTypes: js.Array[DurationLabelTypeDef] = null,
    durationLabelsLong: DurationLabelDef = null,
    durationLabelsShort: DurationLabelDef = null,
    durationLabelsStandard: DurationLabelDef = null,
    durationPluralKey: js.Function3[
      /* token */ java.lang.String, 
      /* integerValue */ scala.Double, 
      /* decimalValue */ scala.Double, 
      java.lang.String
    ] = null,
    durationTimeTemplates: DurationTimeDef = null
  ): LocaleSpecification = {
    val __obj = js.Dynamic.literal()
    if (durationLabelTypes != null) __obj.updateDynamic("durationLabelTypes")(durationLabelTypes)
    if (durationLabelsLong != null) __obj.updateDynamic("durationLabelsLong")(durationLabelsLong)
    if (durationLabelsShort != null) __obj.updateDynamic("durationLabelsShort")(durationLabelsShort)
    if (durationLabelsStandard != null) __obj.updateDynamic("durationLabelsStandard")(durationLabelsStandard)
    if (durationPluralKey != null) __obj.updateDynamic("durationPluralKey")(durationPluralKey)
    if (durationTimeTemplates != null) __obj.updateDynamic("durationTimeTemplates")(durationTimeTemplates)
    __obj.asInstanceOf[LocaleSpecification]
  }
}

