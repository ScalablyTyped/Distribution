package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceTileEventTypeMod {
  
  @JSImport("ol/source/TileEventType", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TileEventType & String] = js.native
    
    /* "tileloadend" */ val TILELOADEND: typings.ol.sourceTileEventTypeMod.TileEventType.TILELOADEND & String = js.native
    
    /* "tileloaderror" */ val TILELOADERROR: typings.ol.sourceTileEventTypeMod.TileEventType.TILELOADERROR & String = js.native
    
    /* "tileloadstart" */ val TILELOADSTART: typings.ol.sourceTileEventTypeMod.TileEventType.TILELOADSTART & String = js.native
  }
  
  @js.native
  sealed trait TileEventType extends StObject
  @JSImport("ol/source/TileEventType", "TileEventType")
  @js.native
  object TileEventType extends StObject {
    
    @js.native
    sealed trait TILELOADEND
      extends StObject
         with TileEventType
    
    @js.native
    sealed trait TILELOADERROR
      extends StObject
         with TileEventType
    
    @js.native
    sealed trait TILELOADSTART
      extends StObject
         with TileEventType
  }
}
