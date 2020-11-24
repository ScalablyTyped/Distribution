package typings.openlayers.mod.format.filter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @classdesc
  * Abstract class; normally only used for creating subclasses and not instantiated in apps.
  * Base class for WFS GetFeature filters.
  *
  * @param tagName The XML tag name for this filter.
  * @struct
  * @api
  */
@JSImport("openlayers", "format.filter.Filter")
@js.native
class Filter protected () extends js.Object {
  /**
    * @classdesc
    * Abstract class; normally only used for creating subclasses and not instantiated in apps.
    * Base class for WFS GetFeature filters.
    *
    * @param tagName The XML tag name for this filter.
    * @struct
    * @api
    */
  def this(tagName: String) = this()
  
  /**
    * The XML tag name for a filter.
    * @returns Name.
    */
  def getTagName(): String = js.native
}
