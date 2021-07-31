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
    
    @JSName("_$buffered")
    var _$buffered: js.Any = js.native
    
    @JSName("_$hitbox")
    var _$hitbox: js.Any = js.native
    
    @JSName("_$played")
    var _$played: js.Any = js.native
    
    @JSName("_$rootElement")
    var _$rootElement: js.Any = js.native
    
    @JSName("_$seekButton")
    var _$seekButton: js.Any = js.native
    
    @JSName("_$seekTo")
    var _$seekTo: js.Any = js.native
    
    @JSName("_$syncButton")
    var _$syncButton: js.Any = js.native
    
    @JSName("_$timeIndicators")
    var _$timeIndicators: js.Any = js.native
    
    var _bindCallbacks: js.Any = js.native
    
    var _bindEvents: js.Any = js.native
    
    var _callbacks: js.Any = js.native
    
    var _currentPlayedPercent: js.Any = js.native
    
    var _initDOM: js.Any = js.native
    
    var _isDragging: js.Any = js.native
    
    var _setBufferedDOMAttributes: js.Any = js.native
    
    var _setPlayedByDrag: js.Any = js.native
    
    var _setPlayedDOMAttributes: js.Any = js.native
    
    var _setPlayedDOMPosition: js.Any = js.native
    
    var _setSeekToDOMAttributes: js.Any = js.native
    
    var _startDrag: js.Any = js.native
    
    var _startDragOnMouseDown: js.Any = js.native
    
    var _startSeekToByMouse: js.Any = js.native
    
    var _stopDrag: js.Any = js.native
    
    var _stopDragOnMouseUp: js.Any = js.native
    
    var _stopSeekToByMouse: js.Any = js.native
    
    var _syncButtonTooltipReference: js.Any = js.native
    
    var _syncWithLive: js.Any = js.native
    
    var _textMap: js.Any = js.native
    
    var _tooltipService: js.Any = js.native
    
    var _unbindEvents: js.Any = js.native
    
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
