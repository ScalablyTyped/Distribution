package typings.openlayers.mod.format.filter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openlayers", "format.filter.greaterThanOrEqualTo")
@js.native
object greaterThanOrEqualTo extends js.Object {
  /**
    * Creates a `<PropertyIsGreaterThanOrEqualTo>` comparison operator.
    *
    * @param propertyName Name of the context property to compare.
    * @param expression The value to compare.
    * @returns `<PropertyIsGreaterThanOrEqualTo>` operator.
    * @api
    */
  def apply(propertyName: String, expression: Double): GreaterThanOrEqualTo_ = js.native
}

