package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textPlacementMod {
  
  @JSImport("ol/style/TextPlacement", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TextPlacement with String] = js.native
    
    /* "line" */ val LINE: typings.ol.textPlacementMod.TextPlacement.LINE with String = js.native
    
    /* "point" */ val POINT: typings.ol.textPlacementMod.TextPlacement.POINT with String = js.native
  }
  
  @js.native
  sealed trait TextPlacement extends StObject
  @JSImport("ol/style/TextPlacement", "TextPlacement")
  @js.native
  object TextPlacement extends StObject {
    
    @js.native
    sealed trait LINE extends TextPlacement
    
    @js.native
    sealed trait POINT extends TextPlacement
  }
}
