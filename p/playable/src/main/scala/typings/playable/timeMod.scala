package typings.playable

import org.scalablytyped.runtime.Instantiable1
import typings.playable.anon.EngineEventEmitter
import typings.playable.timeTypesMod.ITimeControl
import typings.playable.timeTypesMod.ITimeViewConfig
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timeMod {
  
  @JSImport("playable/dist/src/modules/ui/controls/time/time", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with TimeControl {
    def this(hasEventEmitterEngineTheme: EngineEventEmitter) = this()
    
    /* private */ /* CompleteClass */
    var _bindCallbacks: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _bindEvents: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _engine: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _eventEmitter: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _initUI: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _processLiveStateChange: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _setCurrentTime: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _setDurationTime: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _startIntervalUpdates: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _stopIntervalUpdates: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _theme: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _toggleIntervalUpdates: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _unbindEvents: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _updateControlInterval: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _updateCurrentTime: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _updateDurationTime: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _updateTimeFromPreview: js.Any = js.native
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def getElement(): HTMLElement = js.native
    
    /* CompleteClass */
    override def hide(): Unit = js.native
    
    /* CompleteClass */
    var isHidden: Boolean = js.native
    
    /* CompleteClass */
    override def reset(): Unit = js.native
    
    /* CompleteClass */
    override def show(): Unit = js.native
    
    /* CompleteClass */
    var view: typings.playable.timeViewMod.default = js.native
  }
  /* static members */
  object default {
    
    @JSImport("playable/dist/src/modules/ui/controls/time/time", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("playable/dist/src/modules/ui/controls/time/time", "default.View")
    @js.native
    def View: Instantiable1[/* config */ ITimeViewConfig, typings.playable.timeViewMod.default] = js.native
    inline def View_=(x: Instantiable1[/* config */ ITimeViewConfig, typings.playable.timeViewMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("View")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/modules/ui/controls/time/time", "default.dependencies")
    @js.native
    def dependencies: js.Array[String] = js.native
    inline def dependencies_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/modules/ui/controls/time/time", "default.moduleName")
    @js.native
    def moduleName: String = js.native
    inline def moduleName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("playable/dist/src/modules/ui/controls/time/time", "UPDATE_TIME_INTERVAL_DELAY")
  @js.native
  val UPDATE_TIME_INTERVAL_DELAY: Double = js.native
  
  trait TimeControl
    extends StObject
       with ITimeControl {
    
    /* private */ var _bindCallbacks: js.Any
    
    /* private */ var _bindEvents: js.Any
    
    /* private */ var _engine: js.Any
    
    /* private */ var _eventEmitter: js.Any
    
    /* private */ var _initUI: js.Any
    
    /* private */ var _processLiveStateChange: js.Any
    
    /* private */ var _setCurrentTime: js.Any
    
    /* private */ var _setDurationTime: js.Any
    
    /* private */ var _startIntervalUpdates: js.Any
    
    /* private */ var _stopIntervalUpdates: js.Any
    
    /* private */ var _theme: js.Any
    
    /* private */ var _toggleIntervalUpdates: js.Any
    
    /* private */ var _unbindEvents: js.Any
    
    /* private */ var _updateControlInterval: js.Any
    
    /* private */ var _updateCurrentTime: js.Any
    
    /* private */ var _updateDurationTime: js.Any
    
    /* private */ var _updateTimeFromPreview: js.Any
    
    var isHidden: Boolean
    
    var view: typings.playable.timeViewMod.default
  }
  object TimeControl {
    
    inline def apply(
      _bindCallbacks: js.Any,
      _bindEvents: js.Any,
      _engine: js.Any,
      _eventEmitter: js.Any,
      _initUI: js.Any,
      _processLiveStateChange: js.Any,
      _setCurrentTime: js.Any,
      _setDurationTime: js.Any,
      _startIntervalUpdates: js.Any,
      _stopIntervalUpdates: js.Any,
      _theme: js.Any,
      _toggleIntervalUpdates: js.Any,
      _unbindEvents: js.Any,
      _updateControlInterval: js.Any,
      _updateCurrentTime: js.Any,
      _updateDurationTime: js.Any,
      _updateTimeFromPreview: js.Any,
      destroy: () => Unit,
      getElement: () => HTMLElement,
      hide: () => Unit,
      isHidden: Boolean,
      reset: () => Unit,
      show: () => Unit,
      view: typings.playable.timeViewMod.default
    ): TimeControl = {
      val __obj = js.Dynamic.literal(_bindCallbacks = _bindCallbacks.asInstanceOf[js.Any], _bindEvents = _bindEvents.asInstanceOf[js.Any], _engine = _engine.asInstanceOf[js.Any], _eventEmitter = _eventEmitter.asInstanceOf[js.Any], _initUI = _initUI.asInstanceOf[js.Any], _processLiveStateChange = _processLiveStateChange.asInstanceOf[js.Any], _setCurrentTime = _setCurrentTime.asInstanceOf[js.Any], _setDurationTime = _setDurationTime.asInstanceOf[js.Any], _startIntervalUpdates = _startIntervalUpdates.asInstanceOf[js.Any], _stopIntervalUpdates = _stopIntervalUpdates.asInstanceOf[js.Any], _theme = _theme.asInstanceOf[js.Any], _toggleIntervalUpdates = _toggleIntervalUpdates.asInstanceOf[js.Any], _unbindEvents = _unbindEvents.asInstanceOf[js.Any], _updateControlInterval = _updateControlInterval.asInstanceOf[js.Any], _updateCurrentTime = _updateCurrentTime.asInstanceOf[js.Any], _updateDurationTime = _updateDurationTime.asInstanceOf[js.Any], _updateTimeFromPreview = _updateTimeFromPreview.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), getElement = js.Any.fromFunction0(getElement), hide = js.Any.fromFunction0(hide), isHidden = isHidden.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), show = js.Any.fromFunction0(show), view = view.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimeControl]
    }
    
    extension [Self <: TimeControl](x: Self) {
      
      inline def setIsHidden(value: Boolean): Self = StObject.set(x, "isHidden", value.asInstanceOf[js.Any])
      
      inline def setView(value: typings.playable.timeViewMod.default): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      inline def set_bindCallbacks(value: js.Any): Self = StObject.set(x, "_bindCallbacks", value.asInstanceOf[js.Any])
      
      inline def set_bindEvents(value: js.Any): Self = StObject.set(x, "_bindEvents", value.asInstanceOf[js.Any])
      
      inline def set_engine(value: js.Any): Self = StObject.set(x, "_engine", value.asInstanceOf[js.Any])
      
      inline def set_eventEmitter(value: js.Any): Self = StObject.set(x, "_eventEmitter", value.asInstanceOf[js.Any])
      
      inline def set_initUI(value: js.Any): Self = StObject.set(x, "_initUI", value.asInstanceOf[js.Any])
      
      inline def set_processLiveStateChange(value: js.Any): Self = StObject.set(x, "_processLiveStateChange", value.asInstanceOf[js.Any])
      
      inline def set_setCurrentTime(value: js.Any): Self = StObject.set(x, "_setCurrentTime", value.asInstanceOf[js.Any])
      
      inline def set_setDurationTime(value: js.Any): Self = StObject.set(x, "_setDurationTime", value.asInstanceOf[js.Any])
      
      inline def set_startIntervalUpdates(value: js.Any): Self = StObject.set(x, "_startIntervalUpdates", value.asInstanceOf[js.Any])
      
      inline def set_stopIntervalUpdates(value: js.Any): Self = StObject.set(x, "_stopIntervalUpdates", value.asInstanceOf[js.Any])
      
      inline def set_theme(value: js.Any): Self = StObject.set(x, "_theme", value.asInstanceOf[js.Any])
      
      inline def set_toggleIntervalUpdates(value: js.Any): Self = StObject.set(x, "_toggleIntervalUpdates", value.asInstanceOf[js.Any])
      
      inline def set_unbindEvents(value: js.Any): Self = StObject.set(x, "_unbindEvents", value.asInstanceOf[js.Any])
      
      inline def set_updateControlInterval(value: js.Any): Self = StObject.set(x, "_updateControlInterval", value.asInstanceOf[js.Any])
      
      inline def set_updateCurrentTime(value: js.Any): Self = StObject.set(x, "_updateCurrentTime", value.asInstanceOf[js.Any])
      
      inline def set_updateDurationTime(value: js.Any): Self = StObject.set(x, "_updateDurationTime", value.asInstanceOf[js.Any])
      
      inline def set_updateTimeFromPreview(value: js.Any): Self = StObject.set(x, "_updateTimeFromPreview", value.asInstanceOf[js.Any])
    }
  }
}
