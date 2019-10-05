package typings.openlayers.openlayersMod.format.filter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Represents a `<PropertyIsLessThanOrEqualTo>` comparison operator.
  *
  * @param propertyName Name of the context property to compare.
  * @param expression The value to compare.
  * @api
  */
@JSImport("openlayers", "format.filter.LessThanOrEqualTo")
@js.native
class LessThanOrEqualTo protected () extends ComparisonBinary {
  /**
    * @classdesc
    * Represents a `<PropertyIsLessThanOrEqualTo>` comparison operator.
    *
    * @param propertyName Name of the context property to compare.
    * @param expression The value to compare.
    * @api
    */
  def this(propertyName: String, expression: Double) = this()
}

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
  def apply(propertyName: String, expression: Double): LessThanOrEqualTo = js.native
}

