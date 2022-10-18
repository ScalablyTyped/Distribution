package typings.playable

import typings.playable.distSrcModulesUiControlsProgressTypesMod.IProgressViewConfig
import typings.playable.distSrcModulesUiControlsProgressTypesMod.IProgressViewStyles
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesUiControlsProgressProgressDotviewMod {
  
  @JSImport("playable/dist/src/modules/ui/controls/progress/progress.view", JSImport.Default)
  @js.native
  open class default protected () extends ProgressView {
    def this(config: IProgressViewConfig) = this()
  }
  
  @js.native
  trait ProgressView
    extends typings.playable.distSrcModulesUiCoreViewMod.default[IProgressViewStyles] {
    
    /* private */ @JSName("_$buffered")
    var _$buffered: Any = js.native
    
    /* private */ @JSName("_$hitbox")
    var _$hitbox: Any = js.native
    
    /* private */ @JSName("_$played")
    var _$played: Any = js.native
    
    /* private */ @JSName("_$rootElement")
    var _$rootElement: Any = js.native
    
    /* private */ @JSName("_$seekButton")
    var _$seekButton: Any = js.native
    
    /* private */ @JSName("_$seekTo")
    var _$seekTo: Any = js.native
    
    /* private */ @JSName("_$syncButton")
    var _$syncButton: Any = js.native
    
    /* private */ @JSName("_$timeIndicators")
    var _$timeIndicators: Any = js.native
    
    /* private */ var _bindCallbacks: Any = js.native
    
    /* private */ var _bindEvents: Any = js.native
    
    /* private */ var _callbacks: Any = js.native
    
    /* private */ var _currentPlayedPercent: Any = js.native
    
    /* private */ var _initDOM: Any = js.native
    
    /* private */ var _isDragging: Any = js.native
    
    /* private */ var _setBufferedDOMAttributes: Any = js.native
    
    /* private */ var _setPlayedByDrag: Any = js.native
    
    /* private */ var _setPlayedDOMAttributes: Any = js.native
    
    /* private */ var _setPlayedDOMPosition: Any = js.native
    
    /* private */ var _setSeekToDOMAttributes: Any = js.native
    
    /* private */ var _startDrag: Any = js.native
    
    /* private */ var _startDragOnMouseDown: Any = js.native
    
    /* private */ var _startSeekToByMouse: Any = js.native
    
    /* private */ var _stopDrag: Any = js.native
    
    /* private */ var _stopDragOnMouseUp: Any = js.native
    
    /* private */ var _stopSeekToByMouse: Any = js.native
    
    /* private */ var _syncButtonTooltipReference: Any = js.native
    
    /* private */ var _syncWithLive: Any = js.native
    
    /* private */ var _textMap: Any = js.native
    
    /* private */ var _tooltipService: Any = js.native
    
    /* private */ var _unbindEvents: Any = js.native
    
    def addTimeIndicator(percent: Double): Unit = js.native
    
    def clearTimeIndicators(): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def getElement(): HTMLElement = js.native
    
    def hide(): Unit = js.native
    
    def hideProgressTimeTooltip(): Unit = js.native
    
    def hideSyncWithLive(): Unit = js.native
    
    def setBuffered(percent: Double): Unit = js.native
    
    def setLiveMode(): Unit = js.native
    
    def setLiveSyncState(isSync: Boolean): Unit = js.native
    
    def setPlayed(percent: Double): Unit = js.native
    
    def setUsualMode(): Unit = js.native
    
    def show(): Unit = js.native
    
    def showProgressTimeTooltip(element: HTMLElement, percent: Double): Unit = js.native
    
    def showSyncWithLive(): Unit = js.native
    
    def updateOnResize(): Unit = js.native
  }
}
