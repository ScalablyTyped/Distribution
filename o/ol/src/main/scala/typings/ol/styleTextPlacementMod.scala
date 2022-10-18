package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object styleTextPlacementMod {
  
  @JSImport("ol/style/TextPlacement", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TextPlacement & String] = js.native
    
    /* "line" */ val LINE: typings.ol.styleTextPlacementMod.TextPlacement.LINE & String = js.native
    
    /* "point" */ val POINT: typings.ol.styleTextPlacementMod.TextPlacement.POINT & String = js.native
  }
  
  @js.native
  sealed trait TextPlacement extends StObject
  @JSImport("ol/style/TextPlacement", "TextPlacement")
  @js.native
  object TextPlacement extends StObject {
    
    @js.native
    sealed trait LINE
      extends StObject
         with TextPlacement
    
    @js.native
    sealed trait POINT
      extends StObject
         with TextPlacement
  }
}
