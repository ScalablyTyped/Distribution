package typings.openlayers.openlayersMod.format.filter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Represents a logical <And> operator between two or more filter conditions.
  *
  * @param conditions Conditions
  * @api
  */
@JSImport("openlayers", "format.filter.And")
@js.native
class And protected () extends Filter {
  /**
    * @classdesc
    * Represents a logical <And> operator between two or more filter conditions.
    *
    * @param conditions Conditions
    * @api
    */
  def this(conditions: Filter*) = this()
}

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
  def apply(conditions: Filter*): And = js.native
}

