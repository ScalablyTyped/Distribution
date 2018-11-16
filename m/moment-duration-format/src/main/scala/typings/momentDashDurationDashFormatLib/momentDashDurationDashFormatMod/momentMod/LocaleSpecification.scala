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

