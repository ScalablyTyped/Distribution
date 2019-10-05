package typings.openlayers.openlayersMod.format.filter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Represents a `<PropertyIsGreaterThan>` comparison operator.
  *
  * @param propertyName Name of the context property to compare.
  * @param expression The value to compare.
  * @api
  */
@JSImport("openlayers", "format.filter.GreaterThan")
@js.native
class GreaterThan protected () extends ComparisonBinary {
  /**
    * @classdesc
    * Represents a `<PropertyIsGreaterThan>` comparison operator.
    *
    * @param propertyName Name of the context property to compare.
    * @param expression The value to compare.
    * @api
    */
  def this(propertyName: String, expression: Double) = this()
}

@JSImport("openlayers", "format.filter.greaterThan")
@js.native
object greaterThan extends js.Object {
  /**
    * Creates a `<PropertyIsGreaterThan>` comparison operator.
    *
    * @param propertyName Name of the context property to compare.
    * @param expression The value to compare.
    * @returns `<PropertyIsGreaterThan>` operator.
    * @api
    */
  def apply(propertyName: String, expression: Double): GreaterThan = js.native
}

