package typings.openlayers.mod.proj

import typings.openlayers.mod.Extent_
import typings.openlayers.mod.ProjectionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(extent: Extent_, source: ProjectionLike, destination: ProjectionLike): Extent_ = js.native
}
