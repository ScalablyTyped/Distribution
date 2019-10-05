package typings.openlayers.openlayersMod.format.filter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Represents a `<PropertyIsLessThan>` comparison operator.
  *
  * @param propertyName Name of the context property to compare.
  * @param expression The value to compare.
  * @api
  */
@JSImport("openlayers", "format.filter.LessThan")
@js.native
class LessThan protected () extends ComparisonBinary {
  /**
    * @classdesc
    * Represents a `<PropertyIsLessThan>` comparison operator.
    *
    * @param propertyName Name of the context property to compare.
    * @param expression The value to compare.
    * @api
    */
  def this(propertyName: String, expression: Double) = this()
}

@JSImport("openlayers", "format.filter.lessThan")
@js.native
object lessThan extends js.Object {
  /**
    * Creates a `<PropertyIsLessThan>` comparison operator.
    *
    * @param propertyName Name of the context property to compare.
    * @param expression The value to compare.
    * @returns `<PropertyIsLessThan>` operator.
    * @api
    */
  def apply(propertyName: String, expression: Double): LessThan = js.native
}

