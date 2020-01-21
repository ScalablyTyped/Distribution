package typings.momentDurationFormat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object momentAugmentingMod {
  type DurationLabelDef = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ duration in moment-duration-format.moment-duration-format.moment.DurationToken ]: string}
    */ typings.momentDurationFormat.momentDurationFormatStrings.DurationLabelDef with js.Any
  type DurationTimeDef = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ template in moment-duration-format.moment-duration-format.moment.DurationTemplate ]: string}
    */ typings.momentDurationFormat.momentDurationFormatStrings.DurationTimeDef with js.Any
  type TemplateFunction = js.ThisFunction0[
    /* this */ typings.momentDurationFormat.mod.momentAugmentingMod.DurationFormatSettings, 
    java.lang.String
  ]
}
