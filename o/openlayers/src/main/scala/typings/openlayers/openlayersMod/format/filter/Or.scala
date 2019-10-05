package typings.openlayers.openlayersMod.format.filter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Represents a logical <Or> operator between two or more filter conditions.
  *
  * @param conditions Conditions
  * @api
  */
@JSImport("openlayers", "format.filter.Or")
@js.native
class Or protected () extends LogicalNary {
  /**
    * @classdesc
    * Represents a logical <Or> operator between two or more filter conditions.
    *
    * @param conditions Conditions
    * @api
    */
  def this(conditions: Filter*) = this()
}

@JSImport("openlayers", "format.filter.or")
@js.native
object or extends js.Object {
  /**
    * Create a logical `<Or>` operator between two or more filter conditions.
    *
    * @param conditions Filter conditions.
    * @returns `<Or>` operator.
    * @api
    */
  def apply(conditions: Filter*): Or = js.native
}

