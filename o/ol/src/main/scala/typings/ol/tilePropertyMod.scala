package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/layer/TileProperty", JSImport.Namespace)
@js.native
object tilePropertyMod extends js.Object {
  @js.native
  sealed trait TileProperty extends js.Object
  
  @js.native
  object TileProperty extends js.Object {
    @js.native
    sealed trait PRELOAD extends TileProperty
    
    @js.native
    sealed trait USE_INTERIM_TILES_ON_ERROR extends TileProperty
    
  }
  
  @js.native
  object default extends js.Object {
    /* "preload" */ val PRELOAD: typings.ol.tilePropertyMod.TileProperty.PRELOAD with String = js.native
    /* "useInterimTilesOnError" */ val USE_INTERIM_TILES_ON_ERROR: typings.ol.tilePropertyMod.TileProperty.USE_INTERIM_TILES_ON_ERROR with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TileProperty with String] = js.native
  }
  
}

