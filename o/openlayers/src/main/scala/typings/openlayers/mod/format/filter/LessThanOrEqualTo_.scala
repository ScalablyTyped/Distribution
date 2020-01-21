package typings.openlayers.mod.format.filter

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
class LessThanOrEqualTo_ protected () extends ComparisonBinary {
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

