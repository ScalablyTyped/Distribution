package typings.openlayers.openlayersMod.format.filter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Represents a `<PropertyIsNotEqualTo>` comparison operator.
  *
  * @param propertyName Name of the context property to compare.
  * @param expression The value to compare.
  * @param opt_matchCase Case-sensitive?
  * @api
  */
@JSImport("openlayers", "format.filter.NotEqualTo")
@js.native
class NotEqualTo protected () extends ComparisonBinary {
  /**
    * @classdesc
    * Represents a `<PropertyIsNotEqualTo>` comparison operator.
    *
    * @param propertyName Name of the context property to compare.
    * @param expression The value to compare.
    * @param opt_matchCase Case-sensitive?
    * @api
    */
  def this(propertyName: String, expression: String) = this()
  def this(propertyName: String, expression: Double) = this()
  def this(propertyName: String, expression: String, opt_matchCase: Boolean) = this()
  def this(propertyName: String, expression: Double, opt_matchCase: Boolean) = this()
}

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
  def apply(propertyName: String, expression: String): NotEqualTo = js.native
  def apply(propertyName: String, expression: String, opt_matchCase: Boolean): NotEqualTo = js.native
  def apply(propertyName: String, expression: Double): NotEqualTo = js.native
  def apply(propertyName: String, expression: Double, opt_matchCase: Boolean): NotEqualTo = js.native
}

