package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/format/filter/IsBetween", JSImport.Namespace)
@js.native
object formatFilterIsBetweenMod extends js.Object {
  @js.native
  class default protected ()
    extends typings.ol.formatFilterComparisonMod.default {
    def this(propertyName: String, lowerBoundary: Double, upperBoundary: Double) = this()
  }
  
  type IsBetween = typings.ol.formatFilterComparisonMod.default
}

