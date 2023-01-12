package typings.playable

import org.scalablytyped.runtime.Instantiable1
import typings.playable.anon.Theme
import typings.playable.distSrcModulesUiControlsPlayTypesMod.IPlayControl
import typings.playable.distSrcModulesUiControlsPlayTypesMod.IPlayViewConfig
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesUiControlsPlayPlayMod {
  
  @JSImport("playable/dist/src/modules/ui/controls/play/play", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with PlayControl {
    def this(param0: Theme) = this()
    
    /* private */ /* CompleteClass */
    var _bindCallbacks: Any = js.native
    
    /* private */ /* CompleteClass */
    var _bindEvents: Any = js.native
    
    /* private */ /* CompleteClass */
    var _destroyInterceptor: Any = js.native
    
    /* private */ /* CompleteClass */
    var _engine: Any = js.native
    
    /* private */ /* CompleteClass */
    var _eventEmitter: Any = js.native
    
    /* private */ /* CompleteClass */
    var _initInterceptor: Any = js.native
    
    /* private */ /* CompleteClass */
    var _initUI: Any = js.native
    
    /* private */ /* CompleteClass */
    var _interceptor: Any = js.native
    
    /* private */ /* CompleteClass */
    var _pauseVideo: Any = js.native
    
    /* private */ /* CompleteClass */
    var _playVideo: Any = js.native
    
    /* private */ /* CompleteClass */
    var _textMap: Any = js.native
    
    /* private */ /* CompleteClass */
    var _theme: Any = js.native
    
    /* private */ /* CompleteClass */
    var _togglePlayback: Any = js.native
    
    /* private */ /* CompleteClass */
    var _unbindEvents: Any = js.native
    
    /* private */ /* CompleteClass */
    var _updatePlayingState: Any = js.native
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def getElement(): HTMLElement = js.native
    
    /* CompleteClass */
    var view: typings.playable.distSrcModulesUiControlsPlayPlayDotviewMod.default = js.native
  }
  /* static members */
  object default {
    
    @JSImport("playable/dist/src/modules/ui/controls/play/play", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("playable/dist/src/modules/ui/controls/play/play", "default.View")
    @js.native
    def View: Instantiable1[
        /* config */ IPlayViewConfig, 
        typings.playable.distSrcModulesUiControlsPlayPlayDotviewMod.default
      ] = js.native
    inline def View_=(
      x: Instantiable1[
          /* config */ IPlayViewConfig, 
          typings.playable.distSrcModulesUiControlsPlayPlayDotviewMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("View")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/modules/ui/controls/play/play", "default.dependencies")
    @js.native
    def dependencies: js.Array[String] = js.native
    inline def dependencies_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/modules/ui/controls/play/play", "default.moduleName")
    @js.native
    def moduleName: String = js.native
    inline def moduleName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(x.asInstanceOf[js.Any])
  }
  
  trait PlayControl
    extends StObject
       with IPlayControl {
    
    /* private */ var _bindCallbacks: Any
    
    /* private */ var _bindEvents: Any
    
    /* private */ var _destroyInterceptor: Any
    
    /* private */ var _engine: Any
    
    /* private */ var _eventEmitter: Any
    
    /* private */ var _initInterceptor: Any
    
    /* private */ var _initUI: Any
    
    /* private */ var _interceptor: Any
    
    /* private */ var _pauseVideo: Any
    
    /* private */ var _playVideo: Any
    
    /* private */ var _textMap: Any
    
    /* private */ var _theme: Any
    
    /* private */ var _togglePlayback: Any
    
    /* private */ var _unbindEvents: Any
    
    /* private */ var _updatePlayingState: Any
    
    var view: typings.playable.distSrcModulesUiControlsPlayPlayDotviewMod.default
  }
  object PlayControl {
    
    inline def apply(
      _bindCallbacks: Any,
      _bindEvents: Any,
      _destroyInterceptor: Any,
      _engine: Any,
      _eventEmitter: Any,
      _initInterceptor: Any,
      _initUI: Any,
      _interceptor: Any,
      _pauseVideo: Any,
      _playVideo: Any,
      _textMap: Any,
      _theme: Any,
      _togglePlayback: Any,
      _unbindEvents: Any,
      _updatePlayingState: Any,
      destroy: () => Unit,
      getElement: () => HTMLElement,
      view: typings.playable.distSrcModulesUiControlsPlayPlayDotviewMod.default
    ): PlayControl = {
      val __obj = js.Dynamic.literal(_bindCallbacks = _bindCallbacks.asInstanceOf[js.Any], _bindEvents = _bindEvents.asInstanceOf[js.Any], _destroyInterceptor = _destroyInterceptor.asInstanceOf[js.Any], _engine = _engine.asInstanceOf[js.Any], _eventEmitter = _eventEmitter.asInstanceOf[js.Any], _initInterceptor = _initInterceptor.asInstanceOf[js.Any], _initUI = _initUI.asInstanceOf[js.Any], _interceptor = _interceptor.asInstanceOf[js.Any], _pauseVideo = _pauseVideo.asInstanceOf[js.Any], _playVideo = _playVideo.asInstanceOf[js.Any], _textMap = _textMap.asInstanceOf[js.Any], _theme = _theme.asInstanceOf[js.Any], _togglePlayback = _togglePlayback.asInstanceOf[js.Any], _unbindEvents = _unbindEvents.asInstanceOf[js.Any], _updatePlayingState = _updatePlayingState.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), getElement = js.Any.fromFunction0(getElement), view = view.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlayControl]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PlayControl] (val x: Self) extends AnyVal {
      
      inline def setView(value: typings.playable.distSrcModulesUiControlsPlayPlayDotviewMod.default): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      inline def set_bindCallbacks(value: Any): Self = StObject.set(x, "_bindCallbacks", value.asInstanceOf[js.Any])
      
      inline def set_bindEvents(value: Any): Self = StObject.set(x, "_bindEvents", value.asInstanceOf[js.Any])
      
      inline def set_destroyInterceptor(value: Any): Self = StObject.set(x, "_destroyInterceptor", value.asInstanceOf[js.Any])
      
      inline def set_engine(value: Any): Self = StObject.set(x, "_engine", value.asInstanceOf[js.Any])
      
      inline def set_eventEmitter(value: Any): Self = StObject.set(x, "_eventEmitter", value.asInstanceOf[js.Any])
      
      inline def set_initInterceptor(value: Any): Self = StObject.set(x, "_initInterceptor", value.asInstanceOf[js.Any])
      
      inline def set_initUI(value: Any): Self = StObject.set(x, "_initUI", value.asInstanceOf[js.Any])
      
      inline def set_interceptor(value: Any): Self = StObject.set(x, "_interceptor", value.asInstanceOf[js.Any])
      
      inline def set_pauseVideo(value: Any): Self = StObject.set(x, "_pauseVideo", value.asInstanceOf[js.Any])
      
      inline def set_playVideo(value: Any): Self = StObject.set(x, "_playVideo", value.asInstanceOf[js.Any])
      
      inline def set_textMap(value: Any): Self = StObject.set(x, "_textMap", value.asInstanceOf[js.Any])
      
      inline def set_theme(value: Any): Self = StObject.set(x, "_theme", value.asInstanceOf[js.Any])
      
      inline def set_togglePlayback(value: Any): Self = StObject.set(x, "_togglePlayback", value.asInstanceOf[js.Any])
      
      inline def set_unbindEvents(value: Any): Self = StObject.set(x, "_unbindEvents", value.asInstanceOf[js.Any])
      
      inline def set_updatePlayingState(value: Any): Self = StObject.set(x, "_updatePlayingState", value.asInstanceOf[js.Any])
    }
  }
}
