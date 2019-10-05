package typings.openlayers.openlayersMod.format.filter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Represents a logical `<Not>` operator for a filter condition.
  *
  * @param condition Filter condition.
  * @api
  */
@JSImport("openlayers", "format.filter.Not")
@js.native
class Not protected () extends Filter {
  /**
    * @classdesc
    * Represents a logical `<Not>` operator for a filter condition.
    *
    * @param condition Filter condition.
    * @api
    */
  def this(condition: Filter) = this()
}

@JSImport("openlayers", "format.filter.not")
@js.native
object not extends js.Object {
  /**
    * Represents a logical `<Not>` operator for a filter condition.
    *
    * @param condition Filter condition.
    * @returns `<Not>` operator.
    * @api
    */
  def apply(condition: Filter): Not = js.native
}

