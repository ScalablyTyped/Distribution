package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vectorTileRenderTypeMod {
  
  @JSImport("ol/layer/VectorTileRenderType", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[VectorTileRenderType & String] = js.native
    
    /* "hybrid" */ val HYBRID: typings.ol.vectorTileRenderTypeMod.VectorTileRenderType.HYBRID & String = js.native
    
    /* "image" */ val IMAGE: typings.ol.vectorTileRenderTypeMod.VectorTileRenderType.IMAGE & String = js.native
    
    /* "vector" */ val VECTOR: typings.ol.vectorTileRenderTypeMod.VectorTileRenderType.VECTOR & String = js.native
  }
  
  @js.native
  sealed trait VectorTileRenderType extends StObject
  @JSImport("ol/layer/VectorTileRenderType", "VectorTileRenderType")
  @js.native
  object VectorTileRenderType extends StObject {
    
    @js.native
    sealed trait HYBRID
      extends StObject
         with VectorTileRenderType
    
    @js.native
    sealed trait IMAGE
      extends StObject
         with VectorTileRenderType
    
    @js.native
    sealed trait VECTOR
      extends StObject
         with VectorTileRenderType
  }
}
