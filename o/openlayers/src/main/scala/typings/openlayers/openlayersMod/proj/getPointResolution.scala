package typings.openlayers.openlayersMod.proj

import typings.openlayers.openlayersMod.Coordinate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openlayers", "proj.getPointResolution")
@js.native
object getPointResolution extends js.Object {
  /**
    * Get the resolution of the point in degrees or distance units. For
    * projections with degrees as the unit this will simply return the
    * provided resolution. For other projections the point resolution is
    * estimated by transforming the 'point' pixel to EPSG:4326, measuring
    * its width and height on the normal sphere, and taking the average of
    * the width and height.
    * @param projection The projection.
    * @param resolution Nominal resolution in projection units.
    * @param point Point to find adjusted resolution at.
    * @return Point to find adjusted resolution at.
    */
  def apply(projection: Projection, resolution: Double, point: Coordinate): Double = js.native
}

