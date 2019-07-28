package typings.ol.layerTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/LayerType", JSImport.Default)
@js.native
object default extends js.Object {
  /* "IMAGE" */ val IMAGE: typings.ol.layerTypeMod.LayerType.IMAGE with String = js.native
  /* "TILE" */ val TILE: typings.ol.layerTypeMod.LayerType.TILE with String = js.native
  /* "VECTOR" */ val VECTOR: typings.ol.layerTypeMod.LayerType.VECTOR with String = js.native
  /* "VECTOR_TILE" */ val VECTOR_TILE: typings.ol.layerTypeMod.LayerType.VECTOR_TILE with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[LayerType with String] = js.native
}

