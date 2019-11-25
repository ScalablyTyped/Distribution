package typings.openlayers.openlayersMod.proj

import typings.openlayers.openlayersMod.Extent
import typings.openlayers.openlayersMod.ProjectionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openlayers", "proj.transformExtent")
@js.native
object transformExtent extends js.Object {
  /**
    * Transforms an extent from source projection to destination projection.  This
    * returns a new extent (and does not modify the original).
    *
    * @param extent The extent to transform.
    * @param source Source projection-like.
    * @param destination Destination projection-like.
    * @return The transformed extent.
    * @api stable
    */
  def apply(extent: Extent, source: ProjectionLike, destination: ProjectionLike): Extent = js.native
}

