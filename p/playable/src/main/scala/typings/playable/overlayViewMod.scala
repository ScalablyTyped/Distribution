package typings.playable

import typings.playable.overlayTypesMod.IOverlayViewConfig
import typings.playable.overlayTypesMod.IOverlayViewStyles
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object overlayViewMod {
  
  @JSImport("playable/dist/src/modules/ui/overlay/overlay.view", JSImport.Default)
  @js.native
  open class default protected () extends OverlayView {
    def this(config: IOverlayViewConfig) = this()
  }
  
  @js.native
  trait OverlayView
    extends typings.playable.viewMod.default[IOverlayViewStyles] {
    
    /* private */ @JSName("_$content")
    var _$content: Any = js.native
    
    /* private */ @JSName("_$playButton")
    var _$playButton: Any = js.native
    
    /* private */ @JSName("_$rootElement")
    var _$rootElement: Any = js.native
    
    /* private */ var _bindEvents: Any = js.native
    
    /* private */ var _callbacks: Any = js.native
    
    /* private */ var _initDOM: Any = js.native
    
    /* private */ var _unbindEvents: Any = js.native
    
    def destroy(): Unit = js.native
    
    def getElement(): HTMLElement = js.native
    
    def hide(): Unit = js.native
    
    def hideContent(): Unit = js.native
    
    def setPoster(src: String): Unit = js.native
    
    def show(): Unit = js.native
    
    def showContent(): Unit = js.native
    
    def turnOffOverlayTransparency(): Unit = js.native
    
    def turnOnOverlayTransparency(): Unit = js.native
  }
}
