package typings.openlayers.openlayersMod.format.filter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Represents a `<PropertyIsGreaterThanOrEqualTo>` comparison operator.
  *
  * @param propertyName Name of the context property to compare.
  * @param expression The value to compare.
  * @api
  */
@JSImport("openlayers", "format.filter.GreaterThanOrEqualTo")
@js.native
class GreaterThanOrEqualTo protected () extends ComparisonBinary {
  /**
    * @classdesc
    * Represents a `<PropertyIsGreaterThanOrEqualTo>` comparison operator.
    *
    * @param propertyName Name of the context property to compare.
    * @param expression The value to compare.
    * @api
    */
  def this(propertyName: String, expression: Double) = this()
}

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
  def apply(propertyName: String, expression: Double): GreaterThanOrEqualTo = js.native
}

