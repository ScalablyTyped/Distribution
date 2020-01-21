package typings.openlayers.mod.format.filter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Represents a `<During>` comparison operator.
  *
  * @param propertyName Name of the context property to compare.
  * @param begin The begin date in ISO-8601 format.
  * @param end The end date in ISO-8601 format.
  * @api
  */
@JSImport("openlayers", "format.filter.During")
@js.native
class During_ protected () extends Comparison {
  /**
    * @classdesc
    * Represents a `<During>` comparison operator.
    *
    * @param propertyName Name of the context property to compare.
    * @param begin The begin date in ISO-8601 format.
    * @param end The end date in ISO-8601 format.
    * @api
    */
  def this(propertyName: String, begin: String, end: String) = this()
}

