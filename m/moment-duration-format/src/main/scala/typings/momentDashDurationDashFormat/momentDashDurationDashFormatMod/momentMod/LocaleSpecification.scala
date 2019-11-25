package typings.momentDashDurationDashFormat.momentDashDurationDashFormatMod.momentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocaleSpecification extends js.Object {
  var durationLabelTypes: js.UndefOr[js.Array[DurationLabelTypeDef]] = js.undefined
  var durationLabelsLong: js.UndefOr[DurationLabelDef] = js.undefined
  var durationLabelsShort: js.UndefOr[DurationLabelDef] = js.undefined
  var durationLabelsStandard: js.UndefOr[DurationLabelDef] = js.undefined
  var durationPluralKey: js.UndefOr[
    js.Function3[/* token */ String, /* integerValue */ Double, /* decimalValue */ Double, String]
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
    durationPluralKey: (/* token */ String, /* integerValue */ Double, /* decimalValue */ Double) => String = null,
    durationTimeTemplates: DurationTimeDef = null
  ): LocaleSpecification = {
    val __obj = js.Dynamic.literal()
    if (durationLabelTypes != null) __obj.updateDynamic("durationLabelTypes")(durationLabelTypes.asInstanceOf[js.Any])
    if (durationLabelsLong != null) __obj.updateDynamic("durationLabelsLong")(durationLabelsLong.asInstanceOf[js.Any])
    if (durationLabelsShort != null) __obj.updateDynamic("durationLabelsShort")(durationLabelsShort.asInstanceOf[js.Any])
    if (durationLabelsStandard != null) __obj.updateDynamic("durationLabelsStandard")(durationLabelsStandard.asInstanceOf[js.Any])
    if (durationPluralKey != null) __obj.updateDynamic("durationPluralKey")(js.Any.fromFunction3(durationPluralKey))
    if (durationTimeTemplates != null) __obj.updateDynamic("durationTimeTemplates")(durationTimeTemplates.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocaleSpecification]
  }
}

