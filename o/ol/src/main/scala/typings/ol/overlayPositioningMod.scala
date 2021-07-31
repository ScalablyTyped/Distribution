package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object overlayPositioningMod {
  
  @JSImport("ol/OverlayPositioning", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[OverlayPositioning & String] = js.native
    
    /* "bottom-center" */ val BOTTOM_CENTER: typings.ol.overlayPositioningMod.OverlayPositioning.BOTTOM_CENTER & String = js.native
    
    /* "bottom-left" */ val BOTTOM_LEFT: typings.ol.overlayPositioningMod.OverlayPositioning.BOTTOM_LEFT & String = js.native
    
    /* "bottom-right" */ val BOTTOM_RIGHT: typings.ol.overlayPositioningMod.OverlayPositioning.BOTTOM_RIGHT & String = js.native
    
    /* "center-center" */ val CENTER_CENTER: typings.ol.overlayPositioningMod.OverlayPositioning.CENTER_CENTER & String = js.native
    
    /* "center-left" */ val CENTER_LEFT: typings.ol.overlayPositioningMod.OverlayPositioning.CENTER_LEFT & String = js.native
    
    /* "center-right" */ val CENTER_RIGHT: typings.ol.overlayPositioningMod.OverlayPositioning.CENTER_RIGHT & String = js.native
    
    /* "top-center" */ val TOP_CENTER: typings.ol.overlayPositioningMod.OverlayPositioning.TOP_CENTER & String = js.native
    
    /* "top-left" */ val TOP_LEFT: typings.ol.overlayPositioningMod.OverlayPositioning.TOP_LEFT & String = js.native
    
    /* "top-right" */ val TOP_RIGHT: typings.ol.overlayPositioningMod.OverlayPositioning.TOP_RIGHT & String = js.native
  }
  
  @js.native
  sealed trait OverlayPositioning extends StObject
  @JSImport("ol/OverlayPositioning", "OverlayPositioning")
  @js.native
  object OverlayPositioning extends StObject {
    
    @js.native
    sealed trait BOTTOM_CENTER
      extends StObject
         with OverlayPositioning
    
    @js.native
    sealed trait BOTTOM_LEFT
      extends StObject
         with OverlayPositioning
    
    @js.native
    sealed trait BOTTOM_RIGHT
      extends StObject
         with OverlayPositioning
    
    @js.native
    sealed trait CENTER_CENTER
      extends StObject
         with OverlayPositioning
    
    @js.native
    sealed trait CENTER_LEFT
      extends StObject
         with OverlayPositioning
    
    @js.native
    sealed trait CENTER_RIGHT
      extends StObject
         with OverlayPositioning
    
    @js.native
    sealed trait TOP_CENTER
      extends StObject
         with OverlayPositioning
    
    @js.native
    sealed trait TOP_LEFT
      extends StObject
         with OverlayPositioning
    
    @js.native
    sealed trait TOP_RIGHT
      extends StObject
         with OverlayPositioning
  }
}
