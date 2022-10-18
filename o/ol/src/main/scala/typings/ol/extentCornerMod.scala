package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extentCornerMod {
  
  @JSImport("ol/extent/Corner", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Corner & String] = js.native
    
    /* "bottom-left" */ val BOTTOM_LEFT: typings.ol.extentCornerMod.Corner.BOTTOM_LEFT & String = js.native
    
    /* "bottom-right" */ val BOTTOM_RIGHT: typings.ol.extentCornerMod.Corner.BOTTOM_RIGHT & String = js.native
    
    /* "top-left" */ val TOP_LEFT: typings.ol.extentCornerMod.Corner.TOP_LEFT & String = js.native
    
    /* "top-right" */ val TOP_RIGHT: typings.ol.extentCornerMod.Corner.TOP_RIGHT & String = js.native
  }
  
  @js.native
  sealed trait Corner extends StObject
  @JSImport("ol/extent/Corner", "Corner")
  @js.native
  object Corner extends StObject {
    
    @js.native
    sealed trait BOTTOM_LEFT
      extends StObject
         with Corner
    
    @js.native
    sealed trait BOTTOM_RIGHT
      extends StObject
         with Corner
    
    @js.native
    sealed trait TOP_LEFT
      extends StObject
         with Corner
    
    @js.native
    sealed trait TOP_RIGHT
      extends StObject
         with Corner
  }
}
