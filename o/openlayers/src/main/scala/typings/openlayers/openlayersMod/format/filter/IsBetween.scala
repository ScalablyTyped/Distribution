package typings.openlayers.openlayersMod.format.filter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Represents a `<PropertyIsBetween>` comparison operator.
  *
  * @param propertyName Name of the context property to compare.
  * @param lowerBoundary The lower bound of the range.
  * @param upperBoundary The upper bound of the range.
  * @api
  */
@JSImport("openlayers", "format.filter.IsBetween")
@js.native
class IsBetween protected () extends Comparison {
  /**
    * @classdesc
    * Represents a `<PropertyIsBetween>` comparison operator.
    *
    * @param propertyName Name of the context property to compare.
    * @param lowerBoundary The lower bound of the range.
    * @param upperBoundary The upper bound of the range.
    * @api
    */
  def this(propertyName: String, lowerBoundary: Double, upperBoundary: Double) = this()
}

