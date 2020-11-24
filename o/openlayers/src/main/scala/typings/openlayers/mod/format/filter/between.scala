package typings.openlayers.mod.format.filter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openlayers", "format.filter.between")
@js.native
object between extends js.Object {
  
  /**
    * Creates a `<PropertyIsBetween>` comparison operator to test whether an expression
    * value lies within a range given by a lower and upper bound (inclusive).
    *
    * @param propertyName Name of the context property to compare.
    * @param lowerBoundary The lower bound of the range.
    * @param upperBoundary The upper bound of the range.
    * @returns `<PropertyIsBetween>` operator.
    * @api
    */
  def apply(propertyName: String, lowerBoundary: Double, upperBoundary: Double): IsBetween = js.native
}
