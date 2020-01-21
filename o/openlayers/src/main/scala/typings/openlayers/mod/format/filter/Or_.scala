package typings.openlayers.mod.format.filter

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
class Or_ protected () extends Filter {
  /**
    * @classdesc
    * Represents a logical <Or> operator between two or more filter conditions.
    *
    * @param conditions Conditions
    * @api
    */
  def this(conditions: Filter*) = this()
}

