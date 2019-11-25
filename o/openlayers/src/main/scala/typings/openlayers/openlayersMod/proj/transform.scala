package typings.openlayers.openlayersMod.proj

import typings.openlayers.openlayersMod.Coordinate
import typings.openlayers.openlayersMod.ProjectionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openlayers", "proj.transform")
@js.native
object transform extends js.Object {
  /**
    * Transforms a coordinate from source projection to destination projection.
    * This returns a new coordinate (and does not modify the original).
    *
    * See {@link ol.proj.transformExtent} for extent transformation.
    * See the transform method of {@link ol.geom.Geometry} and its subclasses for
    * geometry transforms.
    *
    * @param coordinate Coordinate.
    * @param source Source projection-like.
    * @param destination Destination projection-like.
    */
  def apply(coordinate: Coordinate, source: ProjectionLike, destination: ProjectionLike): Coordinate = js.native
}

