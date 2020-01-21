package typings.openlayers.mod.format.filter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openlayers", "format.filter.equalTo")
@js.native
object equalTo extends js.Object {
  /**
    * Creates a `<PropertyIsEqualTo>` comparison operator.
    *
    * @param propertyName Name of the context property to compare.
    * @param expression The value to compare.
    * @param opt_matchCase Case-sensitive?
    * @returns `<PropertyIsEqualTo>` operator.
    * @api
    */
  def apply(propertyName: String, expression: String): EqualTo_ = js.native
  def apply(propertyName: String, expression: String, opt_matchCase: Boolean): EqualTo_ = js.native
  def apply(propertyName: String, expression: Double): EqualTo_ = js.native
  def apply(propertyName: String, expression: Double, opt_matchCase: Boolean): EqualTo_ = js.native
}

