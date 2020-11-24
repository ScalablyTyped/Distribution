package typings.openlayers.mod.proj

import typings.openlayers.mod.Coordinate_
import typings.openlayers.mod.ProjectionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openlayers", "proj.addCoordinateTransforms")
@js.native
object addCoordinateTransforms extends js.Object {
  
  /**
    * Registers coordinate transform functions to convert coordinates between the
    * source projection and the destination projection.
    * The forward and inverse functions convert coordinate pairs; this function
    * converts these into the functions used internally which also handle
    * extents and coordinate arrays.
    *
    * @param source Source projection.
    * @param destination Destination projection.
    * @param forward The forward transform
    *     function (that is, from the source projection to the destination
    *     projection) that takes a {@link ol.Coordinate} as argument and returns
    *     the transformed {@link ol.Coordinate}.
    * @param inverse The inverse transform
    *     function (that is, from the destination projection to the source
    *     projection) that takes a {@link ol.Coordinate} as argument and returns
    *     the transformed {@link ol.Coordinate}.
    * @api stable
    */
  def apply(
    source: ProjectionLike,
    destination: ProjectionLike,
    forward: js.Function1[/* coords */ Coordinate_, Coordinate_],
    inverse: js.Function1[/* coords */ Coordinate_, Coordinate_]
  ): Unit = js.native
}
