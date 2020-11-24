package typings.openlayers.mod.format.filter

import typings.openlayers.mod.Extent_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @classdesc
  * Represents a `<BBOX>` operator to test whether a geometry-valued property
  * intersects a fixed bounding box
  *
  * @param geometryName Geometry name to use.
  * @param extent Extent.
  * @param opt_srsName SRS name. No srsName attribute will be
  *    set on geometries when this is not provided.
  * @api
  */
@JSImport("openlayers", "format.filter.Bbox")
@js.native
class Bbox_ protected () extends Filter {
  /**
    * @classdesc
    * Represents a `<BBOX>` operator to test whether a geometry-valued property
    * intersects a fixed bounding box
    *
    * @param geometryName Geometry name to use.
    * @param extent Extent.
    * @param opt_srsName SRS name. No srsName attribute will be
    *    set on geometries when this is not provided.
    * @api
    */
  def this(geometryName: String, extent: Extent_) = this()
  def this(geometryName: String, extent: Extent_, opt_srsName: String) = this()
}
