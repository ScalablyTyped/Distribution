package typings.openlayers.mod.format.filter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(propertyName: String, expression: Double): GreaterThan_ = js.native
}
