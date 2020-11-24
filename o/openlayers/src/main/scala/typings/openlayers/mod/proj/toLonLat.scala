package typings.openlayers.mod.proj

import typings.openlayers.mod.Coordinate_
import typings.openlayers.mod.ProjectionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openlayers", "proj.toLonLat")
@js.native
object toLonLat extends js.Object {
  
  /**
    * Transforms a coordinate to longitude/latitude.
    * @param coordinate Projected coordinate.
    * @param opt_projection Projection of the coordinate.
    *     The default is Web Mercator, i.e. 'EPSG:3857'.
    * @return Coordinate as longitude and latitude, i.e. an array
    *     with longitude as 1st and latitude as 2nd element.
    * @api stable
    */
  def apply(coordinate: Coordinate_): Coordinate_ = js.native
  def apply(coordinate: Coordinate_, opt_projection: ProjectionLike): Coordinate_ = js.native
}
