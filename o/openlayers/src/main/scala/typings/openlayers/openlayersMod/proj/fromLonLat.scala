package typings.openlayers.openlayersMod.proj

import typings.openlayers.openlayersMod.Coordinate
import typings.openlayers.openlayersMod.ProjectionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openlayers", "proj.fromLonLat")
@js.native
object fromLonLat extends js.Object {
  /**
    * Transforms a coordinate from longitude/latitude to a different projection.
    * @param coordinate Coordinate as longitude and latitude, i.e.
    *     an array with longitude as 1st and latitude as 2nd element.
    * @param opt_projection Target projection. The
    *     default is Web Mercator, i.e. 'EPSG:3857'.
    * @return Coordinate projected to the target projection.
    * @api stable
    */
  def apply(coordinate: Coordinate): Coordinate = js.native
  def apply(coordinate: Coordinate, opt_projection: ProjectionLike): Coordinate = js.native
}

