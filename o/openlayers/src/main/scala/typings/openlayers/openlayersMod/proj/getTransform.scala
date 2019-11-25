package typings.openlayers.openlayersMod.proj

import typings.openlayers.openlayersMod.ProjectionLike
import typings.openlayers.openlayersMod.TransformFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openlayers", "proj.getTransform")
@js.native
object getTransform extends js.Object {
  /**
    * Given the projection-like objects, searches for a transformation
    * function to convert a coordinates array from the source projection to the
    * destination projection.
    *
    * @param source Source.
    * @param destination Destination.
    * @return Transform function.
    * @api stable
    */
  def apply(source: ProjectionLike, destination: ProjectionLike): TransformFunction = js.native
}

