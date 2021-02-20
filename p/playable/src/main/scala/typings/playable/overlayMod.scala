package typings.playable

import org.scalablytyped.runtime.Instantiable1
import typings.playable.anon.Loader
import typings.playable.overlayTypesMod.IOverlay
import typings.playable.overlayTypesMod.IOverlayViewConfig
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object overlayMod {
  
  @JSImport("playable/dist/src/modules/ui/overlay/overlay", JSImport.Default)
  @js.native
  class default protected () extends Overlay {
    def this(hasEventEmitterEngineRootContainerThemeConfigMainUIBlockLoader: Loader) = this()
  }
  object default {
    
    @JSImport("playable/dist/src/modules/ui/overlay/overlay", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("playable/dist/src/modules/ui/overlay/overlay", "default.View")
    @js.native
    class View protected ()
      extends typings.playable.overlayViewMod.default {
      def this(config: IOverlayViewConfig) = this()
    }
    /* static member */
    /* was `typeof View` */
    @JSImport("playable/dist/src/modules/ui/overlay/overlay", "default.View")
    @js.native
    def View: Instantiable1[/* config */ IOverlayViewConfig, typings.playable.overlayViewMod.default] = js.native
    @scala.inline
    def View_=(x: Instantiable1[/* config */ IOverlayViewConfig, typings.playable.overlayViewMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("View")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("playable/dist/src/modules/ui/overlay/overlay", "default.dependencies")
    @js.native
    def dependencies: js.Array[String] = js.native
    @scala.inline
    def dependencies_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("playable/dist/src/modules/ui/overlay/overlay", "default.moduleName")
    @js.native
    def moduleName: String = js.native
    @scala.inline
    def moduleName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Overlay extends IOverlay {
    
    var _bindEvents: js.Any = js.native
    
    var _engine: js.Any = js.native
    
    var _eventEmitter: js.Any = js.native
    
    var _hideContent: js.Any = js.native
    
    var _initUI: js.Any = js.native
    
    var _loader: js.Any = js.native
    
    var _mainUIBlock: js.Any = js.native
    
    var _playVideo: js.Any = js.native
    
    var _showContent: js.Any = js.native
    
    var _theme: js.Any = js.native
    
    var _tryHideContent: js.Any = js.native
    
    var _tryShowContent: js.Any = js.native
    
    var _unbindEvents: js.Any = js.native
    
    var _updatePlayingState: js.Any = js.native
    
    var isHidden: Boolean = js.native
    
    /**
      * The `.turnOffOverlayTransparency()` method returns player's overlay to default settings.
      * It becomes black again.
      *
      * @example
      * player.turnOffOverlayTransparency();
      *
      */
    def turnOffOverlayTransparency(): Unit = js.native
    
    /**
      * After initialisation player has by default an overlay that is black;
      *
      * The `.turnOnOverlayTransparency()` method makes this overlay transparent.
      * @example
      * player.turnOnOverlayTransparency();
      *
      */
    def turnOnOverlayTransparency(): Unit = js.native
    
    var view: typings.playable.overlayViewMod.default = js.native
  }
  object Overlay {
    
    @scala.inline
    def apply(
      _bindEvents: js.Any,
      _engine: js.Any,
      _eventEmitter: js.Any,
      _hideContent: js.Any,
      _initUI: js.Any,
      _loader: js.Any,
      _mainUIBlock: js.Any,
      _playVideo: js.Any,
      _showContent: js.Any,
      _theme: js.Any,
      _tryHideContent: js.Any,
      _tryShowContent: js.Any,
      _unbindEvents: js.Any,
      _updatePlayingState: js.Any,
      destroy: () => Unit,
      getElement: () => HTMLElement,
      hide: () => Unit,
      isHidden: Boolean,
      setPoster: String => Unit,
      show: () => Unit,
      turnOffOverlayTransparency: () => Unit,
      turnOnOverlayTransparency: () => Unit,
      view: typings.playable.overlayViewMod.default
    ): Overlay = {
      val __obj = js.Dynamic.literal(_bindEvents = _bindEvents.asInstanceOf[js.Any], _engine = _engine.asInstanceOf[js.Any], _eventEmitter = _eventEmitter.asInstanceOf[js.Any], _hideContent = _hideContent.asInstanceOf[js.Any], _initUI = _initUI.asInstanceOf[js.Any], _loader = _loader.asInstanceOf[js.Any], _mainUIBlock = _mainUIBlock.asInstanceOf[js.Any], _playVideo = _playVideo.asInstanceOf[js.Any], _showContent = _showContent.asInstanceOf[js.Any], _theme = _theme.asInstanceOf[js.Any], _tryHideContent = _tryHideContent.asInstanceOf[js.Any], _tryShowContent = _tryShowContent.asInstanceOf[js.Any], _unbindEvents = _unbindEvents.asInstanceOf[js.Any], _updatePlayingState = _updatePlayingState.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), getElement = js.Any.fromFunction0(getElement), hide = js.Any.fromFunction0(hide), isHidden = isHidden.asInstanceOf[js.Any], setPoster = js.Any.fromFunction1(setPoster), show = js.Any.fromFunction0(show), turnOffOverlayTransparency = js.Any.fromFunction0(turnOffOverlayTransparency), turnOnOverlayTransparency = js.Any.fromFunction0(turnOnOverlayTransparency), view = view.asInstanceOf[js.Any])
      __obj.asInstanceOf[Overlay]
    }
    
    @scala.inline
    implicit class OverlayMutableBuilder[Self <: Overlay] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsHidden(value: Boolean): Self = StObject.set(x, "isHidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTurnOffOverlayTransparency(value: () => Unit): Self = StObject.set(x, "turnOffOverlayTransparency", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTurnOnOverlayTransparency(value: () => Unit): Self = StObject.set(x, "turnOnOverlayTransparency", js.Any.fromFunction0(value))
      
      @scala.inline
      def setView(value: typings.playable.overlayViewMod.default): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_bindEvents(value: js.Any): Self = StObject.set(x, "_bindEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_engine(value: js.Any): Self = StObject.set(x, "_engine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_eventEmitter(value: js.Any): Self = StObject.set(x, "_eventEmitter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_hideContent(value: js.Any): Self = StObject.set(x, "_hideContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_initUI(value: js.Any): Self = StObject.set(x, "_initUI", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_loader(value: js.Any): Self = StObject.set(x, "_loader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_mainUIBlock(value: js.Any): Self = StObject.set(x, "_mainUIBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_playVideo(value: js.Any): Self = StObject.set(x, "_playVideo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_showContent(value: js.Any): Self = StObject.set(x, "_showContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_theme(value: js.Any): Self = StObject.set(x, "_theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_tryHideContent(value: js.Any): Self = StObject.set(x, "_tryHideContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_tryShowContent(value: js.Any): Self = StObject.set(x, "_tryShowContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_unbindEvents(value: js.Any): Self = StObject.set(x, "_unbindEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_updatePlayingState(value: js.Any): Self = StObject.set(x, "_updatePlayingState", value.asInstanceOf[js.Any])
    }
  }
}
