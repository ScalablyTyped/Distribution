package typings
package olLib.layerTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LayerType extends js.Object

@JSImport("ol/LayerType", "LayerType")
@js.native
object LayerType extends js.Object {
  @js.native
  sealed trait IMAGE
    extends olLib.layerTypeMod.LayerType
  
  @js.native
  sealed trait TILE
    extends olLib.layerTypeMod.LayerType
  
  @js.native
  sealed trait VECTOR
    extends olLib.layerTypeMod.LayerType
  
  @js.native
  sealed trait VECTOR_TILE
    extends olLib.layerTypeMod.LayerType
  
}

