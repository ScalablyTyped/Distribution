package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tilePropertyMod {
  
  @JSImport("ol/layer/TileProperty", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TileProperty with String] = js.native
    
    /* "preload" */ val PRELOAD: typings.ol.tilePropertyMod.TileProperty.PRELOAD with String = js.native
    
    /* "useInterimTilesOnError" */ val USE_INTERIM_TILES_ON_ERROR: typings.ol.tilePropertyMod.TileProperty.USE_INTERIM_TILES_ON_ERROR with String = js.native
  }
  
  @js.native
  sealed trait TileProperty extends StObject
  @JSImport("ol/layer/TileProperty", "TileProperty")
  @js.native
  object TileProperty extends StObject {
    
    @js.native
    sealed trait PRELOAD extends TileProperty
    
    @js.native
    sealed trait USE_INTERIM_TILES_ON_ERROR extends TileProperty
  }
}
