package typings.openlayers.mod.format.filter

import typings.openlayers.mod.Extent_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(geometryName: String, extent: Extent_): Bbox_ = js.native
  def apply(geometryName: String, extent: Extent_, opt_srsName: String): Bbox_ = js.native
}
