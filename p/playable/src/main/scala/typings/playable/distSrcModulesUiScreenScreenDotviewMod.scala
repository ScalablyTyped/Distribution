package typings.playable

import typings.playable.distSrcModulesUiScreenTypesMod.IScreenViewConfig
import typings.playable.distSrcModulesUiScreenTypesMod.IScreenViewStyles
import typings.playable.distSrcModulesUiScreenTypesMod.VideoViewMode
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesUiScreenScreenDotviewMod {
  
  @JSImport("playable/dist/src/modules/ui/screen/screen.view", JSImport.Default)
  @js.native
  open class default protected () extends ScreenView {
    def this(config: IScreenViewConfig) = this()
  }
  
  @js.native
  trait ScreenView
    extends typings.playable.distSrcModulesUiCoreViewMod.default[IScreenViewStyles] {
    
    /* private */ @JSName("_$canvas")
    var _$canvas: Any = js.native
    
    /* private */ @JSName("_$playbackElement")
    var _$playbackElement: Any = js.native
    
    /* private */ @JSName("_$rootElement")
    var _$rootElement: Any = js.native
    
    /* private */ var _bindCallbacks: Any = js.native
    
    /* private */ var _bindEvents: Any = js.native
    
    /* private */ var _callbacks: Any = js.native
    
    /* private */ var _clearBackground: Any = js.native
    
    /* private */ var _currentMode: Any = js.native
    
    /* private */ var _drawAreaFromSource: Any = js.native
    
    /* private */ var _drawBackground: Any = js.native
    
    /* private */ var _getCanvasAreas: Any = js.native
    
    /* private */ var _getSourceAreas: Any = js.native
    
    /* private */ var _initDOM: Any = js.native
    
    /* private */ var _isHorizontalStripes: Any = js.native
    
    /* private */ var _requestAnimationFrameID: Any = js.native
    
    /* private */ var _startUpdatingBackground: Any = js.native
    
    /* private */ var _stopUpdatingBackground: Any = js.native
    
    /* private */ var _styleNamesByViewMode: Any = js.native
    
    /* private */ var _unbindEvents: Any = js.native
    
    /* private */ var _updateBackground: Any = js.native
    
    def destroy(): Unit = js.native
    
    def focusOnNode(): Unit = js.native
    
    def getElement(): HTMLElement = js.native
    
    def hide(): Unit = js.native
    
    def hideCursor(): Unit = js.native
    
    def resetAspectRatio(): Unit = js.native
    
    def resetBackground(): Unit = js.native
    
    def setBackgroundHeight(height: Double): Unit = js.native
    
    def setBackgroundSize(width: Double, height: Double): Unit = js.native
    
    def setBackgroundWidth(width: Double): Unit = js.native
    
    def setViewMode(viewMode: VideoViewMode): Unit = js.native
    
    def show(): Unit = js.native
    
    def showCursor(): Unit = js.native
  }
}
