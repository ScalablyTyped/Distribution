package typings.openlayers.openlayersMod.format.filter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Represents a `<PropertyIsNull>` comparison operator.
  *
  * @param propertyName Name of the context property to compare.
  * @api
  */
@JSImport("openlayers", "format.filter.IsNull")
@js.native
class IsNull protected () extends Comparison {
  /**
    * @classdesc
    * Represents a `<PropertyIsNull>` comparison operator.
    *
    * @param propertyName Name of the context property to compare.
    * @api
    */
  def this(propertyName: String) = this()
}

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
  def apply(propertyName: String): IsNull = js.native
}

