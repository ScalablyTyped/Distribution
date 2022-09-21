package typings.playable

import typings.playable.volumeTypesMod.IVolumeViewConfig
import typings.playable.volumeTypesMod.IVolumeViewStyles
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object volumeViewMod {
  
  @JSImport("playable/dist/src/modules/ui/controls/volume/volume.view", JSImport.Default)
  @js.native
  open class default protected () extends VolumeView {
    def this(config: IVolumeViewConfig) = this()
  }
  
  @js.native
  trait VolumeView
    extends typings.playable.viewMod.default[IVolumeViewStyles] {
    
    /* private */ @JSName("_$hitbox")
    var _$hitbox: Any = js.native
    
    /* private */ @JSName("_$muteToggle")
    var _$muteToggle: Any = js.native
    
    /* private */ @JSName("_$rootElement")
    var _$rootElement: Any = js.native
    
    /* private */ @JSName("_$volume")
    var _$volume: Any = js.native
    
    /* private */ @JSName("_$volumeContainer")
    var _$volumeContainer: Any = js.native
    
    /* private */ var _bindCallbacks: Any = js.native
    
    /* private */ var _bindEvents: Any = js.native
    
    /* private */ var _callbacks: Any = js.native
    
    /* private */ var _initDOM: Any = js.native
    
    /* private */ var _isDragging: Any = js.native
    
    /* private */ var _muteToggleTooltipReference: Any = js.native
    
    /* private */ var _onButtonClick: Any = js.native
    
    /* private */ var _setMuteDOMAttributes: Any = js.native
    
    /* private */ var _setVolumeByClick: Any = js.native
    
    /* private */ var _setVolumeByDrag: Any = js.native
    
    /* private */ var _setVolumeByWheel: Any = js.native
    
    /* private */ var _setVolumeDOMAttributes: Any = js.native
    
    /* private */ var _startDrag: Any = js.native
    
    /* private */ var _startDragOnMouseDown: Any = js.native
    
    /* private */ var _stopDrag: Any = js.native
    
    /* private */ var _stopDragOnMouseUp: Any = js.native
    
    /* private */ var _textMap: Any = js.native
    
    /* private */ var _tooltipService: Any = js.native
    
    /* private */ var _unbindEvents: Any = js.native
    
    def destroy(): Unit = js.native
    
    def getButtonElement(): HTMLElement = js.native
    
    def getElement(): HTMLElement = js.native
    
    def getInputElement(): HTMLElement = js.native
    
    def hide(): Unit = js.native
    
    def setMute(isMuted: Boolean): Unit = js.native
    
    def setVolume(volume: Double): Unit = js.native
    
    def show(): Unit = js.native
  }
}
