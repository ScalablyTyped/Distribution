package typings.playable

import org.scalablytyped.runtime.Instantiable1
import typings.playable.anon.TooltipService
import typings.playable.volumeTypesMod.IVolumeControl
import typings.playable.volumeTypesMod.IVolumeViewConfig
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object volumeMod {
  
  @JSImport("playable/dist/src/modules/ui/controls/volume/volume", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with VolumeControl {
    def this(hasEngineEventEmitterTextMapTooltipServiceTheme: TooltipService) = this()
    
    /* private */ /* CompleteClass */
    var _bindCallbacks: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _bindEvents: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _broadcastDragEnd: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _broadcastDragStart: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _buttonInterceptor: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _changeVolumeLevel: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _destroyInterceptor: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _engine: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _eventEmitter: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _getVolumeLevelFromInput: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _getVolumeLevelFromWheel: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _initInterceptor: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _initUI: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _inputInterceptor: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _setMuteState: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _setVolumeLevel: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _textMap: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _theme: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _toggleMuteState: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _tooltipService: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _unbindEvents: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _updateSoundState: js.Any = js.native
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def getElement(): HTMLElement = js.native
    
    /* CompleteClass */
    override def hide(): Unit = js.native
    
    /* CompleteClass */
    var isHidden: Boolean = js.native
    
    /* CompleteClass */
    override def show(): Unit = js.native
    
    /* CompleteClass */
    var view: typings.playable.volumeViewMod.default = js.native
  }
  /* static members */
  object default {
    
    @JSImport("playable/dist/src/modules/ui/controls/volume/volume", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("playable/dist/src/modules/ui/controls/volume/volume", "default.View")
    @js.native
    def View: Instantiable1[/* config */ IVolumeViewConfig, typings.playable.volumeViewMod.default] = js.native
    inline def View_=(x: Instantiable1[/* config */ IVolumeViewConfig, typings.playable.volumeViewMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("View")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/modules/ui/controls/volume/volume", "default.dependencies")
    @js.native
    def dependencies: js.Array[String] = js.native
    inline def dependencies_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/modules/ui/controls/volume/volume", "default.moduleName")
    @js.native
    def moduleName: String = js.native
    inline def moduleName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(x.asInstanceOf[js.Any])
  }
  
  trait VolumeControl
    extends StObject
       with IVolumeControl {
    
    /* private */ var _bindCallbacks: js.Any
    
    /* private */ var _bindEvents: js.Any
    
    /* private */ var _broadcastDragEnd: js.Any
    
    /* private */ var _broadcastDragStart: js.Any
    
    /* private */ var _buttonInterceptor: js.Any
    
    /* private */ var _changeVolumeLevel: js.Any
    
    /* private */ var _destroyInterceptor: js.Any
    
    /* private */ var _engine: js.Any
    
    /* private */ var _eventEmitter: js.Any
    
    /* private */ var _getVolumeLevelFromInput: js.Any
    
    /* private */ var _getVolumeLevelFromWheel: js.Any
    
    /* private */ var _initInterceptor: js.Any
    
    /* private */ var _initUI: js.Any
    
    /* private */ var _inputInterceptor: js.Any
    
    /* private */ var _setMuteState: js.Any
    
    /* private */ var _setVolumeLevel: js.Any
    
    /* private */ var _textMap: js.Any
    
    /* private */ var _theme: js.Any
    
    /* private */ var _toggleMuteState: js.Any
    
    /* private */ var _tooltipService: js.Any
    
    /* private */ var _unbindEvents: js.Any
    
    /* private */ var _updateSoundState: js.Any
    
    var isHidden: Boolean
    
    var view: typings.playable.volumeViewMod.default
  }
  object VolumeControl {
    
    inline def apply(
      _bindCallbacks: js.Any,
      _bindEvents: js.Any,
      _broadcastDragEnd: js.Any,
      _broadcastDragStart: js.Any,
      _buttonInterceptor: js.Any,
      _changeVolumeLevel: js.Any,
      _destroyInterceptor: js.Any,
      _engine: js.Any,
      _eventEmitter: js.Any,
      _getVolumeLevelFromInput: js.Any,
      _getVolumeLevelFromWheel: js.Any,
      _initInterceptor: js.Any,
      _initUI: js.Any,
      _inputInterceptor: js.Any,
      _setMuteState: js.Any,
      _setVolumeLevel: js.Any,
      _textMap: js.Any,
      _theme: js.Any,
      _toggleMuteState: js.Any,
      _tooltipService: js.Any,
      _unbindEvents: js.Any,
      _updateSoundState: js.Any,
      destroy: () => Unit,
      getElement: () => HTMLElement,
      hide: () => Unit,
      isHidden: Boolean,
      show: () => Unit,
      view: typings.playable.volumeViewMod.default
    ): VolumeControl = {
      val __obj = js.Dynamic.literal(_bindCallbacks = _bindCallbacks.asInstanceOf[js.Any], _bindEvents = _bindEvents.asInstanceOf[js.Any], _broadcastDragEnd = _broadcastDragEnd.asInstanceOf[js.Any], _broadcastDragStart = _broadcastDragStart.asInstanceOf[js.Any], _buttonInterceptor = _buttonInterceptor.asInstanceOf[js.Any], _changeVolumeLevel = _changeVolumeLevel.asInstanceOf[js.Any], _destroyInterceptor = _destroyInterceptor.asInstanceOf[js.Any], _engine = _engine.asInstanceOf[js.Any], _eventEmitter = _eventEmitter.asInstanceOf[js.Any], _getVolumeLevelFromInput = _getVolumeLevelFromInput.asInstanceOf[js.Any], _getVolumeLevelFromWheel = _getVolumeLevelFromWheel.asInstanceOf[js.Any], _initInterceptor = _initInterceptor.asInstanceOf[js.Any], _initUI = _initUI.asInstanceOf[js.Any], _inputInterceptor = _inputInterceptor.asInstanceOf[js.Any], _setMuteState = _setMuteState.asInstanceOf[js.Any], _setVolumeLevel = _setVolumeLevel.asInstanceOf[js.Any], _textMap = _textMap.asInstanceOf[js.Any], _theme = _theme.asInstanceOf[js.Any], _toggleMuteState = _toggleMuteState.asInstanceOf[js.Any], _tooltipService = _tooltipService.asInstanceOf[js.Any], _unbindEvents = _unbindEvents.asInstanceOf[js.Any], _updateSoundState = _updateSoundState.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), getElement = js.Any.fromFunction0(getElement), hide = js.Any.fromFunction0(hide), isHidden = isHidden.asInstanceOf[js.Any], show = js.Any.fromFunction0(show), view = view.asInstanceOf[js.Any])
      __obj.asInstanceOf[VolumeControl]
    }
    
    extension [Self <: VolumeControl](x: Self) {
      
      inline def setIsHidden(value: Boolean): Self = StObject.set(x, "isHidden", value.asInstanceOf[js.Any])
      
      inline def setView(value: typings.playable.volumeViewMod.default): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      inline def set_bindCallbacks(value: js.Any): Self = StObject.set(x, "_bindCallbacks", value.asInstanceOf[js.Any])
      
      inline def set_bindEvents(value: js.Any): Self = StObject.set(x, "_bindEvents", value.asInstanceOf[js.Any])
      
      inline def set_broadcastDragEnd(value: js.Any): Self = StObject.set(x, "_broadcastDragEnd", value.asInstanceOf[js.Any])
      
      inline def set_broadcastDragStart(value: js.Any): Self = StObject.set(x, "_broadcastDragStart", value.asInstanceOf[js.Any])
      
      inline def set_buttonInterceptor(value: js.Any): Self = StObject.set(x, "_buttonInterceptor", value.asInstanceOf[js.Any])
      
      inline def set_changeVolumeLevel(value: js.Any): Self = StObject.set(x, "_changeVolumeLevel", value.asInstanceOf[js.Any])
      
      inline def set_destroyInterceptor(value: js.Any): Self = StObject.set(x, "_destroyInterceptor", value.asInstanceOf[js.Any])
      
      inline def set_engine(value: js.Any): Self = StObject.set(x, "_engine", value.asInstanceOf[js.Any])
      
      inline def set_eventEmitter(value: js.Any): Self = StObject.set(x, "_eventEmitter", value.asInstanceOf[js.Any])
      
      inline def set_getVolumeLevelFromInput(value: js.Any): Self = StObject.set(x, "_getVolumeLevelFromInput", value.asInstanceOf[js.Any])
      
      inline def set_getVolumeLevelFromWheel(value: js.Any): Self = StObject.set(x, "_getVolumeLevelFromWheel", value.asInstanceOf[js.Any])
      
      inline def set_initInterceptor(value: js.Any): Self = StObject.set(x, "_initInterceptor", value.asInstanceOf[js.Any])
      
      inline def set_initUI(value: js.Any): Self = StObject.set(x, "_initUI", value.asInstanceOf[js.Any])
      
      inline def set_inputInterceptor(value: js.Any): Self = StObject.set(x, "_inputInterceptor", value.asInstanceOf[js.Any])
      
      inline def set_setMuteState(value: js.Any): Self = StObject.set(x, "_setMuteState", value.asInstanceOf[js.Any])
      
      inline def set_setVolumeLevel(value: js.Any): Self = StObject.set(x, "_setVolumeLevel", value.asInstanceOf[js.Any])
      
      inline def set_textMap(value: js.Any): Self = StObject.set(x, "_textMap", value.asInstanceOf[js.Any])
      
      inline def set_theme(value: js.Any): Self = StObject.set(x, "_theme", value.asInstanceOf[js.Any])
      
      inline def set_toggleMuteState(value: js.Any): Self = StObject.set(x, "_toggleMuteState", value.asInstanceOf[js.Any])
      
      inline def set_tooltipService(value: js.Any): Self = StObject.set(x, "_tooltipService", value.asInstanceOf[js.Any])
      
      inline def set_unbindEvents(value: js.Any): Self = StObject.set(x, "_unbindEvents", value.asInstanceOf[js.Any])
      
      inline def set_updateSoundState(value: js.Any): Self = StObject.set(x, "_updateSoundState", value.asInstanceOf[js.Any])
    }
  }
}
