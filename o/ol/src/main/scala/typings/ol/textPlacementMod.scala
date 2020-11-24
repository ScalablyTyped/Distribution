package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/style/TextPlacement", JSImport.Namespace)
@js.native
object textPlacementMod extends js.Object {
  
  @js.native
  sealed trait TextPlacement extends js.Object
  @js.native
  object TextPlacement extends js.Object {
    
    @js.native
    sealed trait LINE extends TextPlacement
    
    @js.native
    sealed trait POINT extends TextPlacement
  }
  
  @js.native
  object default extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TextPlacement with String] = js.native
    
    /* "line" */ val LINE: typings.ol.textPlacementMod.TextPlacement.LINE with String = js.native
    
    /* "point" */ val POINT: typings.ol.textPlacementMod.TextPlacement.POINT with String = js.native
  }
}
