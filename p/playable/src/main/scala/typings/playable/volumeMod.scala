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
  open class default protected ()
    extends StObject
       with VolumeControl {
    def this(hasEngineEventEmitterTextMapTooltipServiceTheme: TooltipService) = this()
    
    /* private */ /* CompleteClass */
    var _bindCallbacks: Any = js.native
    
    /* private */ /* CompleteClass */
    var _bindEvents: Any = js.native
    
    /* private */ /* CompleteClass */
    var _broadcastDragEnd: Any = js.native
    
    /* private */ /* CompleteClass */
    var _broadcastDragStart: Any = js.native
    
    /* private */ /* CompleteClass */
    var _buttonInterceptor: Any = js.native
    
    /* private */ /* CompleteClass */
    var _changeVolumeLevel: Any = js.native
    
    /* private */ /* CompleteClass */
    var _destroyInterceptor: Any = js.native
    
    /* private */ /* CompleteClass */
    var _engine: Any = js.native
    
    /* private */ /* CompleteClass */
    var _eventEmitter: Any = js.native
    
    /* private */ /* CompleteClass */
    var _getVolumeLevelFromInput: Any = js.native
    
    /* private */ /* CompleteClass */
    var _getVolumeLevelFromWheel: Any = js.native
    
    /* private */ /* CompleteClass */
    var _initInterceptor: Any = js.native
    
    /* private */ /* CompleteClass */
    var _initUI: Any = js.native
    
    /* private */ /* CompleteClass */
    var _inputInterceptor: Any = js.native
    
    /* private */ /* CompleteClass */
    var _setMuteState: Any = js.native
    
    /* private */ /* CompleteClass */
    var _setVolumeLevel: Any = js.native
    
    /* private */ /* CompleteClass */
    var _textMap: Any = js.native
    
    /* private */ /* CompleteClass */
    var _theme: Any = js.native
    
    /* private */ /* CompleteClass */
    var _toggleMuteState: Any = js.native
    
    /* private */ /* CompleteClass */
    var _tooltipService: Any = js.native
    
    /* private */ /* CompleteClass */
    var _unbindEvents: Any = js.native
    
    /* private */ /* CompleteClass */
    var _updateSoundState: Any = js.native
    
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
    
    /* private */ var _bindCallbacks: Any
    
    /* private */ var _bindEvents: Any
    
    /* private */ var _broadcastDragEnd: Any
    
    /* private */ var _broadcastDragStart: Any
    
    /* private */ var _buttonInterceptor: Any
    
    /* private */ var _changeVolumeLevel: Any
    
    /* private */ var _destroyInterceptor: Any
    
    /* private */ var _engine: Any
    
    /* private */ var _eventEmitter: Any
    
    /* private */ var _getVolumeLevelFromInput: Any
    
    /* private */ var _getVolumeLevelFromWheel: Any
    
    /* private */ var _initInterceptor: Any
    
    /* private */ var _initUI: Any
    
    /* private */ var _inputInterceptor: Any
    
    /* private */ var _setMuteState: Any
    
    /* private */ var _setVolumeLevel: Any
    
    /* private */ var _textMap: Any
    
    /* private */ var _theme: Any
    
    /* private */ var _toggleMuteState: Any
    
    /* private */ var _tooltipService: Any
    
    /* private */ var _unbindEvents: Any
    
    /* private */ var _updateSoundState: Any
    
    var isHidden: Boolean
    
    var view: typings.playable.volumeViewMod.default
  }
  object VolumeControl {
    
    inline def apply(
      _bindCallbacks: Any,
      _bindEvents: Any,
      _broadcastDragEnd: Any,
      _broadcastDragStart: Any,
      _buttonInterceptor: Any,
      _changeVolumeLevel: Any,
      _destroyInterceptor: Any,
      _engine: Any,
      _eventEmitter: Any,
      _getVolumeLevelFromInput: Any,
      _getVolumeLevelFromWheel: Any,
      _initInterceptor: Any,
      _initUI: Any,
      _inputInterceptor: Any,
      _setMuteState: Any,
      _setVolumeLevel: Any,
      _textMap: Any,
      _theme: Any,
      _toggleMuteState: Any,
      _tooltipService: Any,
      _unbindEvents: Any,
      _updateSoundState: Any,
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
      
      inline def set_bindCallbacks(value: Any): Self = StObject.set(x, "_bindCallbacks", value.asInstanceOf[js.Any])
      
      inline def set_bindEvents(value: Any): Self = StObject.set(x, "_bindEvents", value.asInstanceOf[js.Any])
      
      inline def set_broadcastDragEnd(value: Any): Self = StObject.set(x, "_broadcastDragEnd", value.asInstanceOf[js.Any])
      
      inline def set_broadcastDragStart(value: Any): Self = StObject.set(x, "_broadcastDragStart", value.asInstanceOf[js.Any])
      
      inline def set_buttonInterceptor(value: Any): Self = StObject.set(x, "_buttonInterceptor", value.asInstanceOf[js.Any])
      
      inline def set_changeVolumeLevel(value: Any): Self = StObject.set(x, "_changeVolumeLevel", value.asInstanceOf[js.Any])
      
      inline def set_destroyInterceptor(value: Any): Self = StObject.set(x, "_destroyInterceptor", value.asInstanceOf[js.Any])
      
      inline def set_engine(value: Any): Self = StObject.set(x, "_engine", value.asInstanceOf[js.Any])
      
      inline def set_eventEmitter(value: Any): Self = StObject.set(x, "_eventEmitter", value.asInstanceOf[js.Any])
      
      inline def set_getVolumeLevelFromInput(value: Any): Self = StObject.set(x, "_getVolumeLevelFromInput", value.asInstanceOf[js.Any])
      
      inline def set_getVolumeLevelFromWheel(value: Any): Self = StObject.set(x, "_getVolumeLevelFromWheel", value.asInstanceOf[js.Any])
      
      inline def set_initInterceptor(value: Any): Self = StObject.set(x, "_initInterceptor", value.asInstanceOf[js.Any])
      
      inline def set_initUI(value: Any): Self = StObject.set(x, "_initUI", value.asInstanceOf[js.Any])
      
      inline def set_inputInterceptor(value: Any): Self = StObject.set(x, "_inputInterceptor", value.asInstanceOf[js.Any])
      
      inline def set_setMuteState(value: Any): Self = StObject.set(x, "_setMuteState", value.asInstanceOf[js.Any])
      
      inline def set_setVolumeLevel(value: Any): Self = StObject.set(x, "_setVolumeLevel", value.asInstanceOf[js.Any])
      
      inline def set_textMap(value: Any): Self = StObject.set(x, "_textMap", value.asInstanceOf[js.Any])
      
      inline def set_theme(value: Any): Self = StObject.set(x, "_theme", value.asInstanceOf[js.Any])
      
      inline def set_toggleMuteState(value: Any): Self = StObject.set(x, "_toggleMuteState", value.asInstanceOf[js.Any])
      
      inline def set_tooltipService(value: Any): Self = StObject.set(x, "_tooltipService", value.asInstanceOf[js.Any])
      
      inline def set_unbindEvents(value: Any): Self = StObject.set(x, "_unbindEvents", value.asInstanceOf[js.Any])
      
      inline def set_updateSoundState(value: Any): Self = StObject.set(x, "_updateSoundState", value.asInstanceOf[js.Any])
    }
  }
}
