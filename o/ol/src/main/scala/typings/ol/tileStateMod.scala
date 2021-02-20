package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tileStateMod {
  
  @JSImport("ol/TileState", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[TileState with Double] = js.native
    
    /* 4 */ val EMPTY: typings.ol.tileStateMod.TileState.EMPTY with Double = js.native
    
    /* 3 */ val ERROR: typings.ol.tileStateMod.TileState.ERROR with Double = js.native
    
    /* 0 */ val IDLE: typings.ol.tileStateMod.TileState.IDLE with Double = js.native
    
    /* 2 */ val LOADED: typings.ol.tileStateMod.TileState.LOADED with Double = js.native
    
    /* 1 */ val LOADING: typings.ol.tileStateMod.TileState.LOADING with Double = js.native
  }
  
  @js.native
  sealed trait TileState extends StObject
  @JSImport("ol/TileState", "TileState")
  @js.native
  object TileState extends StObject {
    
    @js.native
    sealed trait EMPTY extends TileState
    
    @js.native
    sealed trait ERROR extends TileState
    
    @js.native
    sealed trait IDLE extends TileState
    
    @js.native
    sealed trait LOADED extends TileState
    
    @js.native
    sealed trait LOADING extends TileState
  }
}
