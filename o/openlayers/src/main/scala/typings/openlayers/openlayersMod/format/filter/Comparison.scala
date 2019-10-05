package typings.openlayers.openlayersMod.format.filter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Abstract class; normally only used for creating subclasses and not instantiated in apps.
  * Base class for WFS GetFeature property comparison filters.
  *
  * deprecated: This class will no longer be exported starting from the next major version.
  *
  * @param tagName The XML tag name for this filter.
  * @param propertyName Name of the context property to compare.
  * @api
  */
@JSImport("openlayers", "format.filter.Comparison")
@js.native
class Comparison protected () extends Filter {
  /**
    * @classdesc
    * Abstract class; normally only used for creating subclasses and not instantiated in apps.
    * Base class for WFS GetFeature property comparison filters.
    *
    * deprecated: This class will no longer be exported starting from the next major version.
    *
    * @param tagName The XML tag name for this filter.
    * @param propertyName Name of the context property to compare.
    * @api
    */
  def this(tagName: String, propertyName: String) = this()
}

