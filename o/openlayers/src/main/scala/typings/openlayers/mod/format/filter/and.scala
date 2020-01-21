package typings.openlayers.mod.format.filter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openlayers", "format.filter.and")
@js.native
object and extends js.Object {
  /**
    * Create a logical `<And>` operator between two or more filter conditions.
    *
    * @param conditions Filter conditions.
    * @returns `<And>` operator.
    * @api
    */
  def apply(conditions: Filter*): And_ = js.native
}

