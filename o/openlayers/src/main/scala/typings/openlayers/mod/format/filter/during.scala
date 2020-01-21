package typings.openlayers.mod.format.filter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openlayers", "format.filter.during")
@js.native
object during extends js.Object {
  /**
    * Create a `<During>` temporal operator.
    *
    * @param propertyName Name of the context property to compare.
    * @param begin The begin date in ISO-8601 format.
    * @param end The end date in ISO-8601 format.
    * @returns `<During>` operator.
    * @api
    */
  def apply(propertyName: String, begin: String, end: String): During_ = js.native
}

