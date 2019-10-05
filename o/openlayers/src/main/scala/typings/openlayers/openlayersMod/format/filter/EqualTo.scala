package typings.openlayers.openlayersMod.format.filter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Represents a `<PropertyIsEqualTo>` comparison operator.
  *
  * @param propertyName Name of the context property to compare.
  * @param expression The value to compare.
  * @param opt_matchCase Case-sensitive?
  * @api
  */
@JSImport("openlayers", "format.filter.EqualTo")
@js.native
class EqualTo protected () extends ComparisonBinary {
  /**
    * @classdesc
    * Represents a `<PropertyIsEqualTo>` comparison operator.
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
  def apply(propertyName: String, expression: String): EqualTo = js.native
  def apply(propertyName: String, expression: String, opt_matchCase: Boolean): EqualTo = js.native
  def apply(propertyName: String, expression: Double): EqualTo = js.native
  def apply(propertyName: String, expression: Double, opt_matchCase: Boolean): EqualTo = js.native
}

