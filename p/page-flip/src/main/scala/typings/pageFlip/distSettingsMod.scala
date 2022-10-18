package typings.pageFlip

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSettingsMod {
  
  @JSImport("page-flip/dist/Settings", "Settings")
  @js.native
  open class Settings () extends StObject {
    
    /* private */ var _default: Any = js.native
    
    /**
      * Processing parameters received from the user. Substitution default values
      */
    def getSettings(userSetting: Record[String, Double | String | Boolean]): FlipSetting = js.native
  }
  
  @js.native
  sealed trait SizeType extends StObject
  @JSImport("page-flip/dist/Settings", "SizeType")
  @js.native
  object SizeType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[SizeType & String] = js.native
    
    /** Dimensions are fixed */
    @js.native
    sealed trait FIXED
      extends StObject
         with SizeType
    /* "fixed" */ val FIXED: typings.pageFlip.distSettingsMod.SizeType.FIXED & String = js.native
    
    /** Dimensions are calculated based on the parent element */
    @js.native
    sealed trait STRETCH
      extends StObject
         with SizeType
    /* "stretch" */ val STRETCH: typings.pageFlip.distSettingsMod.SizeType.STRETCH & String = js.native
  }
  
  trait FlipSetting extends StObject {
    
    /** If this value is true, the parent element will be equal to the size of the book */
    var autoSize: Boolean
    
    /** Set the forward event of clicking on child elements (buttons, links) */
    var clickEventForward: Boolean
    
    /** if this value is true, flipping by clicking on the whole book will be locked. Only on corners */
    var disableFlipByClick: Boolean
    
    /** Draw shadows or not when page flipping */
    var drawShadow: Boolean
    
    /** Flipping animation time */
    var flippingTime: Double
    
    var height: Double
    
    var maxHeight: Double
    
    /** Shadow intensity (1: max intensity, 0: hidden shadows) */
    var maxShadowOpacity: Double
    
    var maxWidth: Double
    
    var minHeight: Double
    
    var minWidth: Double
    
    /** Disable content scrolling when touching a book on mobile devices */
    var mobileScrollSupport: Boolean
    
    /** If this value is true, the first and the last pages will be marked as hard and will be shown in single page mode */
    var showCover: Boolean
    
    /** if this value is true, fold the corners of the book when the mouse pointer is over them. */
    var showPageCorners: Boolean
    
    /** Whether the book will be stretched under the parent element or not */
    var size: SizeType
    
    /** Page number from which to start viewing */
    var startPage: Double
    
    /** Initial value to z-index */
    var startZIndex: Double
    
    var swipeDistance: Double
    
    /** Using mouse and touch events to page flipping */
    var useMouseEvents: Boolean
    
    /** Enable switching to portrait mode */
    var usePortrait: Boolean
    
    var width: Double
  }
  object FlipSetting {
    
    inline def apply(
      autoSize: Boolean,
      clickEventForward: Boolean,
      disableFlipByClick: Boolean,
      drawShadow: Boolean,
      flippingTime: Double,
      height: Double,
      maxHeight: Double,
      maxShadowOpacity: Double,
      maxWidth: Double,
      minHeight: Double,
      minWidth: Double,
      mobileScrollSupport: Boolean,
      showCover: Boolean,
      showPageCorners: Boolean,
      size: SizeType,
      startPage: Double,
      startZIndex: Double,
      swipeDistance: Double,
      useMouseEvents: Boolean,
      usePortrait: Boolean,
      width: Double
    ): FlipSetting = {
      val __obj = js.Dynamic.literal(autoSize = autoSize.asInstanceOf[js.Any], clickEventForward = clickEventForward.asInstanceOf[js.Any], disableFlipByClick = disableFlipByClick.asInstanceOf[js.Any], drawShadow = drawShadow.asInstanceOf[js.Any], flippingTime = flippingTime.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], maxHeight = maxHeight.asInstanceOf[js.Any], maxShadowOpacity = maxShadowOpacity.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], minHeight = minHeight.asInstanceOf[js.Any], minWidth = minWidth.asInstanceOf[js.Any], mobileScrollSupport = mobileScrollSupport.asInstanceOf[js.Any], showCover = showCover.asInstanceOf[js.Any], showPageCorners = showPageCorners.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], startPage = startPage.asInstanceOf[js.Any], startZIndex = startZIndex.asInstanceOf[js.Any], swipeDistance = swipeDistance.asInstanceOf[js.Any], useMouseEvents = useMouseEvents.asInstanceOf[js.Any], usePortrait = usePortrait.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[FlipSetting]
    }
    
    extension [Self <: FlipSetting](x: Self) {
      
      inline def setAutoSize(value: Boolean): Self = StObject.set(x, "autoSize", value.asInstanceOf[js.Any])
      
      inline def setClickEventForward(value: Boolean): Self = StObject.set(x, "clickEventForward", value.asInstanceOf[js.Any])
      
      inline def setDisableFlipByClick(value: Boolean): Self = StObject.set(x, "disableFlipByClick", value.asInstanceOf[js.Any])
      
      inline def setDrawShadow(value: Boolean): Self = StObject.set(x, "drawShadow", value.asInstanceOf[js.Any])
      
      inline def setFlippingTime(value: Double): Self = StObject.set(x, "flippingTime", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxShadowOpacity(value: Double): Self = StObject.set(x, "maxShadowOpacity", value.asInstanceOf[js.Any])
      
      inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMobileScrollSupport(value: Boolean): Self = StObject.set(x, "mobileScrollSupport", value.asInstanceOf[js.Any])
      
      inline def setShowCover(value: Boolean): Self = StObject.set(x, "showCover", value.asInstanceOf[js.Any])
      
      inline def setShowPageCorners(value: Boolean): Self = StObject.set(x, "showPageCorners", value.asInstanceOf[js.Any])
      
      inline def setSize(value: SizeType): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setStartPage(value: Double): Self = StObject.set(x, "startPage", value.asInstanceOf[js.Any])
      
      inline def setStartZIndex(value: Double): Self = StObject.set(x, "startZIndex", value.asInstanceOf[js.Any])
      
      inline def setSwipeDistance(value: Double): Self = StObject.set(x, "swipeDistance", value.asInstanceOf[js.Any])
      
      inline def setUseMouseEvents(value: Boolean): Self = StObject.set(x, "useMouseEvents", value.asInstanceOf[js.Any])
      
      inline def setUsePortrait(value: Boolean): Self = StObject.set(x, "usePortrait", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
