package typings.playable

import org.scalablytyped.runtime.Instantiable1
import typings.playable.anon.Loader
import typings.playable.distSrcModulesUiOverlayTypesMod.IOverlay
import typings.playable.distSrcModulesUiOverlayTypesMod.IOverlayViewConfig
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesUiOverlayOverlayMod {
  
  @JSImport("playable/dist/src/modules/ui/overlay/overlay", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Overlay {
    def this(param0: Loader) = this()
    
    /* private */ /* CompleteClass */
    var _bindEvents: Any = js.native
    
    /* private */ /* CompleteClass */
    var _engine: Any = js.native
    
    /* private */ /* CompleteClass */
    var _eventEmitter: Any = js.native
    
    /* private */ /* CompleteClass */
    var _hideContent: Any = js.native
    
    /* private */ /* CompleteClass */
    var _initUI: Any = js.native
    
    /* private */ /* CompleteClass */
    var _loader: Any = js.native
    
    /* private */ /* CompleteClass */
    var _mainUIBlock: Any = js.native
    
    /* private */ /* CompleteClass */
    var _playVideo: Any = js.native
    
    /* private */ /* CompleteClass */
    var _showContent: Any = js.native
    
    /* private */ /* CompleteClass */
    var _theme: Any = js.native
    
    /* private */ /* CompleteClass */
    var _tryHideContent: Any = js.native
    
    /* private */ /* CompleteClass */
    var _tryShowContent: Any = js.native
    
    /* private */ /* CompleteClass */
    var _unbindEvents: Any = js.native
    
    /* private */ /* CompleteClass */
    var _updatePlayingState: Any = js.native
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def getElement(): HTMLElement = js.native
    
    /* CompleteClass */
    override def hide(): Unit = js.native
    
    /* CompleteClass */
    var isHidden: Boolean = js.native
    
    /* CompleteClass */
    override def setPoster(src: String): Unit = js.native
    
    /* CompleteClass */
    override def show(): Unit = js.native
    
    /**
      * The `.turnOffOverlayTransparency()` method returns player's overlay to default settings.
      * It becomes black again.
      *
      * @example
      * player.turnOffOverlayTransparency();
      *
      */
    /* CompleteClass */
    override def turnOffOverlayTransparency(): Unit = js.native
    
    /**
      * After initialisation player has by default an overlay that is black;
      *
      * The `.turnOnOverlayTransparency()` method makes this overlay transparent.
      * @example
      * player.turnOnOverlayTransparency();
      *
      */
    /* CompleteClass */
    override def turnOnOverlayTransparency(): Unit = js.native
    
    /* CompleteClass */
    var view: typings.playable.distSrcModulesUiOverlayOverlayDotviewMod.default = js.native
  }
  object default {
    
    @JSImport("playable/dist/src/modules/ui/overlay/overlay", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("playable/dist/src/modules/ui/overlay/overlay", "default.View")
    @js.native
    open class View protected ()
      extends typings.playable.distSrcModulesUiOverlayOverlayDotviewMod.default {
      def this(config: IOverlayViewConfig) = this()
    }
    /* static member */
    /* was `typeof View` */
    @JSImport("playable/dist/src/modules/ui/overlay/overlay", "default.View")
    @js.native
    def View: Instantiable1[
        /* config */ IOverlayViewConfig, 
        typings.playable.distSrcModulesUiOverlayOverlayDotviewMod.default
      ] = js.native
    inline def View_=(
      x: Instantiable1[
          /* config */ IOverlayViewConfig, 
          typings.playable.distSrcModulesUiOverlayOverlayDotviewMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("View")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("playable/dist/src/modules/ui/overlay/overlay", "default.dependencies")
    @js.native
    def dependencies: js.Array[String] = js.native
    inline def dependencies_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("playable/dist/src/modules/ui/overlay/overlay", "default.moduleName")
    @js.native
    def moduleName: String = js.native
    inline def moduleName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(x.asInstanceOf[js.Any])
  }
  
  trait Overlay
    extends StObject
       with IOverlay {
    
    /* private */ var _bindEvents: Any
    
    /* private */ var _engine: Any
    
    /* private */ var _eventEmitter: Any
    
    /* private */ var _hideContent: Any
    
    /* private */ var _initUI: Any
    
    /* private */ var _loader: Any
    
    /* private */ var _mainUIBlock: Any
    
    /* private */ var _playVideo: Any
    
    /* private */ var _showContent: Any
    
    /* private */ var _theme: Any
    
    /* private */ var _tryHideContent: Any
    
    /* private */ var _tryShowContent: Any
    
    /* private */ var _unbindEvents: Any
    
    /* private */ var _updatePlayingState: Any
    
    var isHidden: Boolean
    
    /**
      * The `.turnOffOverlayTransparency()` method returns player's overlay to default settings.
      * It becomes black again.
      *
      * @example
      * player.turnOffOverlayTransparency();
      *
      */
    def turnOffOverlayTransparency(): Unit
    
    /**
      * After initialisation player has by default an overlay that is black;
      *
      * The `.turnOnOverlayTransparency()` method makes this overlay transparent.
      * @example
      * player.turnOnOverlayTransparency();
      *
      */
    def turnOnOverlayTransparency(): Unit
    
    var view: typings.playable.distSrcModulesUiOverlayOverlayDotviewMod.default
  }
  object Overlay {
    
    inline def apply(
      _bindEvents: Any,
      _engine: Any,
      _eventEmitter: Any,
      _hideContent: Any,
      _initUI: Any,
      _loader: Any,
      _mainUIBlock: Any,
      _playVideo: Any,
      _showContent: Any,
      _theme: Any,
      _tryHideContent: Any,
      _tryShowContent: Any,
      _unbindEvents: Any,
      _updatePlayingState: Any,
      destroy: () => Unit,
      getElement: () => HTMLElement,
      hide: () => Unit,
      isHidden: Boolean,
      setPoster: String => Unit,
      show: () => Unit,
      turnOffOverlayTransparency: () => Unit,
      turnOnOverlayTransparency: () => Unit,
      view: typings.playable.distSrcModulesUiOverlayOverlayDotviewMod.default
    ): Overlay = {
      val __obj = js.Dynamic.literal(_bindEvents = _bindEvents.asInstanceOf[js.Any], _engine = _engine.asInstanceOf[js.Any], _eventEmitter = _eventEmitter.asInstanceOf[js.Any], _hideContent = _hideContent.asInstanceOf[js.Any], _initUI = _initUI.asInstanceOf[js.Any], _loader = _loader.asInstanceOf[js.Any], _mainUIBlock = _mainUIBlock.asInstanceOf[js.Any], _playVideo = _playVideo.asInstanceOf[js.Any], _showContent = _showContent.asInstanceOf[js.Any], _theme = _theme.asInstanceOf[js.Any], _tryHideContent = _tryHideContent.asInstanceOf[js.Any], _tryShowContent = _tryShowContent.asInstanceOf[js.Any], _unbindEvents = _unbindEvents.asInstanceOf[js.Any], _updatePlayingState = _updatePlayingState.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), getElement = js.Any.fromFunction0(getElement), hide = js.Any.fromFunction0(hide), isHidden = isHidden.asInstanceOf[js.Any], setPoster = js.Any.fromFunction1(setPoster), show = js.Any.fromFunction0(show), turnOffOverlayTransparency = js.Any.fromFunction0(turnOffOverlayTransparency), turnOnOverlayTransparency = js.Any.fromFunction0(turnOnOverlayTransparency), view = view.asInstanceOf[js.Any])
      __obj.asInstanceOf[Overlay]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Overlay] (val x: Self) extends AnyVal {
      
      inline def setIsHidden(value: Boolean): Self = StObject.set(x, "isHidden", value.asInstanceOf[js.Any])
      
      inline def setTurnOffOverlayTransparency(value: () => Unit): Self = StObject.set(x, "turnOffOverlayTransparency", js.Any.fromFunction0(value))
      
      inline def setTurnOnOverlayTransparency(value: () => Unit): Self = StObject.set(x, "turnOnOverlayTransparency", js.Any.fromFunction0(value))
      
      inline def setView(value: typings.playable.distSrcModulesUiOverlayOverlayDotviewMod.default): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      inline def set_bindEvents(value: Any): Self = StObject.set(x, "_bindEvents", value.asInstanceOf[js.Any])
      
      inline def set_engine(value: Any): Self = StObject.set(x, "_engine", value.asInstanceOf[js.Any])
      
      inline def set_eventEmitter(value: Any): Self = StObject.set(x, "_eventEmitter", value.asInstanceOf[js.Any])
      
      inline def set_hideContent(value: Any): Self = StObject.set(x, "_hideContent", value.asInstanceOf[js.Any])
      
      inline def set_initUI(value: Any): Self = StObject.set(x, "_initUI", value.asInstanceOf[js.Any])
      
      inline def set_loader(value: Any): Self = StObject.set(x, "_loader", value.asInstanceOf[js.Any])
      
      inline def set_mainUIBlock(value: Any): Self = StObject.set(x, "_mainUIBlock", value.asInstanceOf[js.Any])
      
      inline def set_playVideo(value: Any): Self = StObject.set(x, "_playVideo", value.asInstanceOf[js.Any])
      
      inline def set_showContent(value: Any): Self = StObject.set(x, "_showContent", value.asInstanceOf[js.Any])
      
      inline def set_theme(value: Any): Self = StObject.set(x, "_theme", value.asInstanceOf[js.Any])
      
      inline def set_tryHideContent(value: Any): Self = StObject.set(x, "_tryHideContent", value.asInstanceOf[js.Any])
      
      inline def set_tryShowContent(value: Any): Self = StObject.set(x, "_tryShowContent", value.asInstanceOf[js.Any])
      
      inline def set_unbindEvents(value: Any): Self = StObject.set(x, "_unbindEvents", value.asInstanceOf[js.Any])
      
      inline def set_updatePlayingState(value: Any): Self = StObject.set(x, "_updatePlayingState", value.asInstanceOf[js.Any])
    }
  }
}
