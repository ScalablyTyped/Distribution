package typings.openlayers.mod.format.filter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openlayers", "format.filter.notEqualTo")
@js.native
object notEqualTo extends js.Object {
  /**
    * Creates a `<PropertyIsNotEqualTo>` comparison operator.
    *
    * @param propertyName Name of the context property to compare.
    * @param expression The value to compare.
    * @param opt_matchCase Case-sensitive?
    * @returns `<PropertyIsNotEqualTo>` operator.
    * @api
    */
  def apply(propertyName: String, expression: String): NotEqualTo_ = js.native
  def apply(propertyName: String, expression: String, opt_matchCase: Boolean): NotEqualTo_ = js.native
  def apply(propertyName: String, expression: Double): NotEqualTo_ = js.native
  def apply(propertyName: String, expression: Double, opt_matchCase: Boolean): NotEqualTo_ = js.native
}

