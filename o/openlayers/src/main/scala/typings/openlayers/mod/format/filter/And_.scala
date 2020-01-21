package typings.openlayers.mod.format.filter

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
class And_ protected () extends Filter {
  /**
    * @classdesc
    * Represents a logical <And> operator between two or more filter conditions.
    *
    * @param conditions Conditions
    * @api
    */
  def this(conditions: Filter*) = this()
}

