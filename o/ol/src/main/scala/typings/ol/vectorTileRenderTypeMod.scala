package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vectorTileRenderTypeMod {
  
  @JSImport("ol/layer/VectorTileRenderType", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[VectorTileRenderType with String] = js.native
    
    /* "hybrid" */ val HYBRID: typings.ol.vectorTileRenderTypeMod.VectorTileRenderType.HYBRID with String = js.native
    
    /* "image" */ val IMAGE: typings.ol.vectorTileRenderTypeMod.VectorTileRenderType.IMAGE with String = js.native
    
    /* "vector" */ val VECTOR: typings.ol.vectorTileRenderTypeMod.VectorTileRenderType.VECTOR with String = js.native
  }
  
  @js.native
  sealed trait VectorTileRenderType extends StObject
  @JSImport("ol/layer/VectorTileRenderType", "VectorTileRenderType")
  @js.native
  object VectorTileRenderType extends StObject {
    
    @js.native
    sealed trait HYBRID extends VectorTileRenderType
    
    @js.native
    sealed trait IMAGE extends VectorTileRenderType
    
    @js.native
    sealed trait VECTOR extends VectorTileRenderType
  }
}
