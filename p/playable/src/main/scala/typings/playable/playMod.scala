package typings.playable

import org.scalablytyped.runtime.Instantiable1
import typings.playable.anon.Theme
import typings.playable.playTypesMod.IPlayControl
import typings.playable.playTypesMod.IPlayViewConfig
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object playMod {
  
  @JSImport("playable/dist/src/modules/ui/controls/play/play", JSImport.Default)
  @js.native
  class default protected () extends PlayControl {
    def this(hasEngineEventEmitterTextMapTheme: Theme) = this()
  }
  /* static members */
  object default {
    
    @JSImport("playable/dist/src/modules/ui/controls/play/play", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("playable/dist/src/modules/ui/controls/play/play", "default.View")
    @js.native
    def View: Instantiable1[/* config */ IPlayViewConfig, typings.playable.playViewMod.default] = js.native
    @scala.inline
    def View_=(x: Instantiable1[/* config */ IPlayViewConfig, typings.playable.playViewMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("View")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/modules/ui/controls/play/play", "default.dependencies")
    @js.native
    def dependencies: js.Array[String] = js.native
    @scala.inline
    def dependencies_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/modules/ui/controls/play/play", "default.moduleName")
    @js.native
    def moduleName: String = js.native
    @scala.inline
    def moduleName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait PlayControl extends IPlayControl {
    
    var _bindCallbacks: js.Any = js.native
    
    var _bindEvents: js.Any = js.native
    
    var _destroyInterceptor: js.Any = js.native
    
    var _engine: js.Any = js.native
    
    var _eventEmitter: js.Any = js.native
    
    var _initInterceptor: js.Any = js.native
    
    var _initUI: js.Any = js.native
    
    var _interceptor: js.Any = js.native
    
    var _pauseVideo: js.Any = js.native
    
    var _playVideo: js.Any = js.native
    
    var _textMap: js.Any = js.native
    
    var _theme: js.Any = js.native
    
    var _togglePlayback: js.Any = js.native
    
    var _unbindEvents: js.Any = js.native
    
    var _updatePlayingState: js.Any = js.native
    
    var view: typings.playable.playViewMod.default = js.native
  }
  object PlayControl {
    
    @scala.inline
    def apply(
      _bindCallbacks: js.Any,
      _bindEvents: js.Any,
      _destroyInterceptor: js.Any,
      _engine: js.Any,
      _eventEmitter: js.Any,
      _initInterceptor: js.Any,
      _initUI: js.Any,
      _interceptor: js.Any,
      _pauseVideo: js.Any,
      _playVideo: js.Any,
      _textMap: js.Any,
      _theme: js.Any,
      _togglePlayback: js.Any,
      _unbindEvents: js.Any,
      _updatePlayingState: js.Any,
      destroy: () => Unit,
      getElement: () => HTMLElement,
      view: typings.playable.playViewMod.default
    ): PlayControl = {
      val __obj = js.Dynamic.literal(_bindCallbacks = _bindCallbacks.asInstanceOf[js.Any], _bindEvents = _bindEvents.asInstanceOf[js.Any], _destroyInterceptor = _destroyInterceptor.asInstanceOf[js.Any], _engine = _engine.asInstanceOf[js.Any], _eventEmitter = _eventEmitter.asInstanceOf[js.Any], _initInterceptor = _initInterceptor.asInstanceOf[js.Any], _initUI = _initUI.asInstanceOf[js.Any], _interceptor = _interceptor.asInstanceOf[js.Any], _pauseVideo = _pauseVideo.asInstanceOf[js.Any], _playVideo = _playVideo.asInstanceOf[js.Any], _textMap = _textMap.asInstanceOf[js.Any], _theme = _theme.asInstanceOf[js.Any], _togglePlayback = _togglePlayback.asInstanceOf[js.Any], _unbindEvents = _unbindEvents.asInstanceOf[js.Any], _updatePlayingState = _updatePlayingState.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), getElement = js.Any.fromFunction0(getElement), view = view.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlayControl]
    }
    
    @scala.inline
    implicit class PlayControlMutableBuilder[Self <: PlayControl] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setView(value: typings.playable.playViewMod.default): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_bindCallbacks(value: js.Any): Self = StObject.set(x, "_bindCallbacks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_bindEvents(value: js.Any): Self = StObject.set(x, "_bindEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_destroyInterceptor(value: js.Any): Self = StObject.set(x, "_destroyInterceptor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_engine(value: js.Any): Self = StObject.set(x, "_engine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_eventEmitter(value: js.Any): Self = StObject.set(x, "_eventEmitter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_initInterceptor(value: js.Any): Self = StObject.set(x, "_initInterceptor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_initUI(value: js.Any): Self = StObject.set(x, "_initUI", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_interceptor(value: js.Any): Self = StObject.set(x, "_interceptor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_pauseVideo(value: js.Any): Self = StObject.set(x, "_pauseVideo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_playVideo(value: js.Any): Self = StObject.set(x, "_playVideo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_textMap(value: js.Any): Self = StObject.set(x, "_textMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_theme(value: js.Any): Self = StObject.set(x, "_theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_togglePlayback(value: js.Any): Self = StObject.set(x, "_togglePlayback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_unbindEvents(value: js.Any): Self = StObject.set(x, "_unbindEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_updatePlayingState(value: js.Any): Self = StObject.set(x, "_updatePlayingState", value.asInstanceOf[js.Any])
    }
  }
}
