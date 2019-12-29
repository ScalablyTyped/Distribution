package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/layer/VectorRenderType", JSImport.Namespace)
@js.native
object layerVectorRenderTypeMod extends js.Object {
  @js.native
  sealed trait VectorRenderType extends js.Object
  
  @js.native
  object VectorRenderType extends js.Object {
    @js.native
    sealed trait IMAGE extends VectorRenderType
    
    @js.native
    sealed trait VECTOR extends VectorRenderType
    
  }
  
  @js.native
  object default extends js.Object {
    /* "image" */ val IMAGE: typings.ol.layerVectorRenderTypeMod.VectorRenderType.IMAGE with String = js.native
    /* "vector" */ val VECTOR: typings.ol.layerVectorRenderTypeMod.VectorRenderType.VECTOR with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[VectorRenderType with String] = js.native
  }
  
}

