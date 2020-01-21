package typings.openlayers.mod.format.filter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openlayers", "format.filter.lessThanOrEqualTo")
@js.native
object lessThanOrEqualTo extends js.Object {
  /**
    * Creates a `<PropertyIsLessThanOrEqualTo>` comparison operator.
    *
    * @param propertyName Name of the context property to compare.
    * @param expression The value to compare.
    * @returns `<PropertyIsLessThanOrEqualTo>` operator.
    * @api
    */
  def apply(propertyName: String, expression: Double): LessThanOrEqualTo_ = js.native
}

