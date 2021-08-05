package typings.playable

import typings.playable.progressTypesMod.IProgressViewConfig
import typings.playable.progressTypesMod.IProgressViewStyles
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object progressViewMod {
  
  @JSImport("playable/dist/src/modules/ui/controls/progress/progress.view", JSImport.Default)
  @js.native
  class default protected () extends ProgressView {
    def this(config: IProgressViewConfig) = this()
  }
  
  @js.native
  trait ProgressView
    extends typings.playable.viewMod.default[IProgressViewStyles] {
    
    /* private */ @JSName("_$buffered")
    var _$buffered: js.Any = js.native
    
    /* private */ @JSName("_$hitbox")
    var _$hitbox: js.Any = js.native
    
    /* private */ @JSName("_$played")
    var _$played: js.Any = js.native
    
    /* private */ @JSName("_$rootElement")
    var _$rootElement: js.Any = js.native
    
    /* private */ @JSName("_$seekButton")
    var _$seekButton: js.Any = js.native
    
    /* private */ @JSName("_$seekTo")
    var _$seekTo: js.Any = js.native
    
    /* private */ @JSName("_$syncButton")
    var _$syncButton: js.Any = js.native
    
    /* private */ @JSName("_$timeIndicators")
    var _$timeIndicators: js.Any = js.native
    
    /* private */ var _bindCallbacks: js.Any = js.native
    
    /* private */ var _bindEvents: js.Any = js.native
    
    /* private */ var _callbacks: js.Any = js.native
    
    /* private */ var _currentPlayedPercent: js.Any = js.native
    
    /* private */ var _initDOM: js.Any = js.native
    
    /* private */ var _isDragging: js.Any = js.native
    
    /* private */ var _setBufferedDOMAttributes: js.Any = js.native
    
    /* private */ var _setPlayedByDrag: js.Any = js.native
    
    /* private */ var _setPlayedDOMAttributes: js.Any = js.native
    
    /* private */ var _setPlayedDOMPosition: js.Any = js.native
    
    /* private */ var _setSeekToDOMAttributes: js.Any = js.native
    
    /* private */ var _startDrag: js.Any = js.native
    
    /* private */ var _startDragOnMouseDown: js.Any = js.native
    
    /* private */ var _startSeekToByMouse: js.Any = js.native
    
    /* private */ var _stopDrag: js.Any = js.native
    
    /* private */ var _stopDragOnMouseUp: js.Any = js.native
    
    /* private */ var _stopSeekToByMouse: js.Any = js.native
    
    /* private */ var _syncButtonTooltipReference: js.Any = js.native
    
    /* private */ var _syncWithLive: js.Any = js.native
    
    /* private */ var _textMap: js.Any = js.native
    
    /* private */ var _tooltipService: js.Any = js.native
    
    /* private */ var _unbindEvents: js.Any = js.native
    
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
