package typings.openlayers.openlayersMod.proj

import typings.openlayers.openlayersMod.Coordinate
import typings.openlayers.openlayersMod.ProjectionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(coordinate: Coordinate): Coordinate = js.native
  def apply(coordinate: Coordinate, opt_projection: ProjectionLike): Coordinate = js.native
}

