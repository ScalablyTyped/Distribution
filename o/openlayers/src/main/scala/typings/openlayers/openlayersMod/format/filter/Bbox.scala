package typings.openlayers.openlayersMod.format.filter

import typings.openlayers.openlayersMod.Extent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
class Bbox protected () extends Filter {
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
  def this(geometryName: String, extent: Extent) = this()
  def this(geometryName: String, extent: Extent, opt_srsName: String) = this()
}

@JSImport("openlayers", "format.filter.bbox")
@js.native
object bbox extends js.Object {
  /**
    * Create a `<BBOX>` operator to test whether a geometry-valued property
    * intersects a fixed bounding box
    *
    * @param geometryName Geometry name to use.
    * @param extent Extent.
    * @param opt_srsName SRS name. No srsName attribute will be
    *    set on geometries when this is not provided.
    * @returns `<BBOX>` operator.
    * @api
    */
  def apply(geometryName: String, extent: Extent): Bbox = js.native
  def apply(geometryName: String, extent: Extent, opt_srsName: String): Bbox = js.native
}

