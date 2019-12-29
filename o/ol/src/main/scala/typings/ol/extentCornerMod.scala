package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/extent/Corner", JSImport.Namespace)
@js.native
object extentCornerMod extends js.Object {
  @js.native
  sealed trait Corner extends js.Object
  
  @js.native
  object Corner extends js.Object {
    @js.native
    sealed trait BOTTOM_LEFT extends Corner
    
    @js.native
    sealed trait BOTTOM_RIGHT extends Corner
    
    @js.native
    sealed trait TOP_LEFT extends Corner
    
    @js.native
    sealed trait TOP_RIGHT extends Corner
    
  }
  
  @js.native
  object default extends js.Object {
    /* "bottom-left" */ val BOTTOM_LEFT: typings.ol.extentCornerMod.Corner.BOTTOM_LEFT with String = js.native
    /* "bottom-right" */ val BOTTOM_RIGHT: typings.ol.extentCornerMod.Corner.BOTTOM_RIGHT with String = js.native
    /* "top-left" */ val TOP_LEFT: typings.ol.extentCornerMod.Corner.TOP_LEFT with String = js.native
    /* "top-right" */ val TOP_RIGHT: typings.ol.extentCornerMod.Corner.TOP_RIGHT with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Corner with String] = js.native
  }
  
}

