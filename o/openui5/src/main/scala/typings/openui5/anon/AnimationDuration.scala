package typings.openui5.anon

import typings.openui5.int
import typings.openui5.jQuery
import typings.openui5.sapUiCoreControlMod.default
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCorePopupMod.Dock
import typings.std.HTMLElement
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationDuration extends StObject {
  
  /**
    * Time in milliseconds that the close animation takes to complete. Needs to be a finite positive integer.
    * For not animation set to 0.
    */
  var animationDuration: js.UndefOr[int] = js.undefined
  
  /**
    * Describes how the close animation will progress. Possible values "ease", "linear", "ease-in", "ease-out",
    * "ease-in-out".
    */
  var animationTimingFunction: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the point of the reference element to which the message toast should be aligned (e.g. `Dock.RightBottom`
    * To position the message toast according to the bottom right corner of the reference element).
    */
  var at: js.UndefOr[Dock] = js.undefined
  
  /**
    * Specify whether the message toast should close as soon as the end user touches the screen.
    */
  var autoClose: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies if the message toast closes on browser navigation.
    */
  var closeOnBrowserNavigation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies how the position of the message toast should be adjusted in case it overflows the screen in
    * some direction. Possible values “fit”, “flip”, “none”, or a pair for horizontal and vertical e.g. "fit
    * flip”, "fit none".
    */
  var collision: js.UndefOr[String] = js.undefined
  
  /**
    * Time in milliseconds before the close animation starts. Needs to be a finite positive nonzero integer.
    */
  var duration: js.UndefOr[int] = js.undefined
  
  /**
    * Specifies which point of the message toast should be aligned (e.g. `Dock.LeftTop` To use as align point
    * the left top corner of the message toast).
    */
  var my: js.UndefOr[Dock] = js.undefined
  
  /**
    * Specifies the reference element to which the message toast should be aligned, by default it is aligned
    * to the browser visual viewport.
    */
  var of: js.UndefOr[default | typings.std.Element | jQuery[HTMLElement] | Window] = js.undefined
  
  /**
    * The offset relative to the docking point, specified as a string with space-separated pixel values (e.g.
    * "10 5" to move the message toast 10 pixels to the right and 5 pixels to the bottom).
    */
  var offset: js.UndefOr[String] = js.undefined
  
  /**
    * Function to be called when the message toast closes.
    */
  var onClose: js.UndefOr[js.Function] = js.undefined
  
  /**
    * The width of the message toast, this value can be provided in %, em, px and all possible CSS measures.
    */
  var width: js.UndefOr[CSSSize] = js.undefined
}
object AnimationDuration {
  
  inline def apply(): AnimationDuration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimationDuration]
  }
  
  extension [Self <: AnimationDuration](x: Self) {
    
    inline def setAnimationDuration(value: int): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
    
    inline def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
    
    inline def setAnimationTimingFunction(value: String): Self = StObject.set(x, "animationTimingFunction", value.asInstanceOf[js.Any])
    
    inline def setAnimationTimingFunctionUndefined: Self = StObject.set(x, "animationTimingFunction", js.undefined)
    
    inline def setAt(value: Dock): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
    
    inline def setAtUndefined: Self = StObject.set(x, "at", js.undefined)
    
    inline def setAutoClose(value: Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
    
    inline def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
    
    inline def setCloseOnBrowserNavigation(value: Boolean): Self = StObject.set(x, "closeOnBrowserNavigation", value.asInstanceOf[js.Any])
    
    inline def setCloseOnBrowserNavigationUndefined: Self = StObject.set(x, "closeOnBrowserNavigation", js.undefined)
    
    inline def setCollision(value: String): Self = StObject.set(x, "collision", value.asInstanceOf[js.Any])
    
    inline def setCollisionUndefined: Self = StObject.set(x, "collision", js.undefined)
    
    inline def setDuration(value: int): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setMy(value: Dock): Self = StObject.set(x, "my", value.asInstanceOf[js.Any])
    
    inline def setMyUndefined: Self = StObject.set(x, "my", js.undefined)
    
    inline def setOf(value: default | typings.std.Element | jQuery[HTMLElement] | Window): Self = StObject.set(x, "of", value.asInstanceOf[js.Any])
    
    inline def setOfUndefined: Self = StObject.set(x, "of", js.undefined)
    
    inline def setOffset(value: String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOnClose(value: js.Function): Self = StObject.set(x, "onClose", value.asInstanceOf[js.Any])
    
    inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    inline def setWidth(value: CSSSize): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
