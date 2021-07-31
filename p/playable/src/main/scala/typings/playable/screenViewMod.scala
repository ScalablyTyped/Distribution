package typings.playable

import typings.playable.screenTypesMod.IScreenViewConfig
import typings.playable.screenTypesMod.IScreenViewStyles
import typings.playable.screenTypesMod.VideoViewMode
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object screenViewMod {
  
  @JSImport("playable/dist/src/modules/ui/screen/screen.view", JSImport.Default)
  @js.native
  class default protected () extends ScreenView {
    def this(config: IScreenViewConfig) = this()
  }
  
  @js.native
  trait ScreenView
    extends typings.playable.viewMod.default[IScreenViewStyles] {
    
    @JSName("_$canvas")
    var _$canvas: js.Any = js.native
    
    @JSName("_$playbackElement")
    var _$playbackElement: js.Any = js.native
    
    @JSName("_$rootElement")
    var _$rootElement: js.Any = js.native
    
    var _bindCallbacks: js.Any = js.native
    
    var _bindEvents: js.Any = js.native
    
    var _callbacks: js.Any = js.native
    
    var _clearBackground: js.Any = js.native
    
    var _currentMode: js.Any = js.native
    
    var _drawAreaFromSource: js.Any = js.native
    
    var _drawBackground: js.Any = js.native
    
    var _getCanvasAreas: js.Any = js.native
    
    var _getSourceAreas: js.Any = js.native
    
    var _initDOM: js.Any = js.native
    
    var _isHorizontalStripes: js.Any = js.native
    
    var _requestAnimationFrameID: js.Any = js.native
    
    var _startUpdatingBackground: js.Any = js.native
    
    var _stopUpdatingBackground: js.Any = js.native
    
    var _styleNamesByViewMode: js.Any = js.native
    
    var _unbindEvents: js.Any = js.native
    
    var _updateBackground: js.Any = js.native
    
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
