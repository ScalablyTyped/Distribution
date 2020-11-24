package typings.openlayers.mod.format.filter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @classdesc
  * Abstract class; normally only used for creating subclasses and not instantiated in apps.
  * Base class for WFS GetFeature property binary comparison filters.
  *
  * deprecated: This class will no longer be exported starting from the next major version.
  *
  * @param tagName The XML tag name for this filter.
  * @param propertyName Name of the context property to compare.
  * @param expression The value to compare.
  * @param opt_matchCase Case-sensitive?
  * @api
  */
@JSImport("openlayers", "format.filter.ComparisonBinary")
@js.native
class ComparisonBinary protected () extends Comparison {
  /**
    * @classdesc
    * Abstract class; normally only used for creating subclasses and not instantiated in apps.
    * Base class for WFS GetFeature property binary comparison filters.
    *
    * deprecated: This class will no longer be exported starting from the next major version.
    *
    * @param tagName The XML tag name for this filter.
    * @param propertyName Name of the context property to compare.
    * @param expression The value to compare.
    * @param opt_matchCase Case-sensitive?
    * @api
    */
  def this(tagName: String, propertyName: String, expression: String) = this()
  def this(tagName: String, propertyName: String, expression: Double) = this()
  def this(tagName: String, propertyName: String, expression: String, opt_matchCase: Boolean) = this()
  def this(tagName: String, propertyName: String, expression: Double, opt_matchCase: Boolean) = this()
}
