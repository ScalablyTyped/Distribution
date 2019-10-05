package typings.openlayers.openlayersMod.format.filter

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
class During protected () extends Comparison {
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
  def apply(propertyName: String, begin: String, end: String): During = js.native
}

