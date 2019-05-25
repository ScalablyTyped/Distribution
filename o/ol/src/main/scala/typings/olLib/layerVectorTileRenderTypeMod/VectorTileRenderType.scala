package typings
package olLib.layerVectorTileRenderTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VectorTileRenderType extends js.Object

@JSImport("ol/layer/VectorTileRenderType", "VectorTileRenderType")
@js.native
object VectorTileRenderType extends js.Object {
  @js.native
  sealed trait HYBRID
    extends olLib.layerVectorTileRenderTypeMod.VectorTileRenderType
  
  @js.native
  sealed trait IMAGE
    extends olLib.layerVectorTileRenderTypeMod.VectorTileRenderType
  
  @js.native
  sealed trait VECTOR
    extends olLib.layerVectorTileRenderTypeMod.VectorTileRenderType
  
}

