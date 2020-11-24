package typings.openlayers.mod.format.filter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openlayers", "format.filter.isNull")
@js.native
object isNull extends js.Object {
  
  /**
    * Creates a `<PropertyIsNull>` comparison operator to test whether a property value
    * is null.
    *
    * @param propertyName Name of the context property to compare.
    * @returns `<PropertyIsNull>` operator.
    * @api
    */
  def apply(propertyName: String): IsNull_ = js.native
}
