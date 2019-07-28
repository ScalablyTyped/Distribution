package typings.ol.layerTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LayerType extends js.Object

@JSImport("ol/LayerType", "LayerType")
@js.native
object LayerType extends js.Object {
  @js.native
  sealed trait IMAGE extends LayerType
  
  @js.native
  sealed trait TILE extends LayerType
  
  @js.native
  sealed trait VECTOR extends LayerType
  
  @js.native
  sealed trait VECTOR_TILE extends LayerType
  
}

