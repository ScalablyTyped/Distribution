package typings.playable

import org.scalablytyped.runtime.Instantiable0
import typings.playable.anon.RootContainer
import typings.playable.distSrcModulesUiInteractionIndicatorTypesMod.IInteractionIndicator
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesUiInteractionIndicatorInteractionIndicatorMod {
  
  @JSImport("playable/dist/src/modules/ui/interaction-indicator/interaction-indicator", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with InteractionIndicator {
    def this(param0: RootContainer) = this()
    
    /* private */ /* CompleteClass */
    var _bindEvents: Any = js.native
    
    /* private */ /* CompleteClass */
    var _engine: Any = js.native
    
    /* private */ /* CompleteClass */
    var _eventEmitter: Any = js.native
    
    /* private */ /* CompleteClass */
    var _initUI: Any = js.native
    
    /* private */ /* CompleteClass */
    var _showPlaybackChangeIndicator: Any = js.native
    
    /* private */ /* CompleteClass */
    var _unbindEvents: Any = js.native
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def getElement(): HTMLElement = js.native
    
    /* CompleteClass */
    override def hide(): Unit = js.native
    
    /* CompleteClass */
    override def hideIcons(): Unit = js.native
    
    /* CompleteClass */
    override def show(): Unit = js.native
    
    /* CompleteClass */
    override def showDecreaseVolume(): Unit = js.native
    
    /* CompleteClass */
    override def showForward(): Unit = js.native
    
    /* CompleteClass */
    override def showIncreaseVolume(): Unit = js.native
    
    /* CompleteClass */
    override def showMute(): Unit = js.native
    
    /* CompleteClass */
    override def showPause(): Unit = js.native
    
    /* CompleteClass */
    override def showPlay(): Unit = js.native
    
    /* CompleteClass */
    override def showRewind(): Unit = js.native
    
    /* CompleteClass */
    var view: typings.playable.distSrcModulesUiInteractionIndicatorInteractionIndicatorDotviewMod.default = js.native
  }
  /* static members */
  object default {
    
    @JSImport("playable/dist/src/modules/ui/interaction-indicator/interaction-indicator", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("playable/dist/src/modules/ui/interaction-indicator/interaction-indicator", "default.View")
    @js.native
    def View: Instantiable0[
        typings.playable.distSrcModulesUiInteractionIndicatorInteractionIndicatorDotviewMod.default
      ] = js.native
    inline def View_=(
      x: Instantiable0[
          typings.playable.distSrcModulesUiInteractionIndicatorInteractionIndicatorDotviewMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("View")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/modules/ui/interaction-indicator/interaction-indicator", "default.dependencies")
    @js.native
    def dependencies: js.Array[String] = js.native
    inline def dependencies_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/modules/ui/interaction-indicator/interaction-indicator", "default.moduleName")
    @js.native
    def moduleName: String = js.native
    inline def moduleName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(x.asInstanceOf[js.Any])
  }
  
  trait InteractionIndicator
    extends StObject
       with IInteractionIndicator {
    
    /* private */ var _bindEvents: Any
    
    /* private */ var _engine: Any
    
    /* private */ var _eventEmitter: Any
    
    /* private */ var _initUI: Any
    
    /* private */ var _showPlaybackChangeIndicator: Any
    
    /* private */ var _unbindEvents: Any
    
    var view: typings.playable.distSrcModulesUiInteractionIndicatorInteractionIndicatorDotviewMod.default
  }
  object InteractionIndicator {
    
    inline def apply(
      _bindEvents: Any,
      _engine: Any,
      _eventEmitter: Any,
      _initUI: Any,
      _showPlaybackChangeIndicator: Any,
      _unbindEvents: Any,
      destroy: () => Unit,
      getElement: () => HTMLElement,
      hide: () => Unit,
      hideIcons: () => Unit,
      show: () => Unit,
      showDecreaseVolume: () => Unit,
      showForward: () => Unit,
      showIncreaseVolume: () => Unit,
      showMute: () => Unit,
      showPause: () => Unit,
      showPlay: () => Unit,
      showRewind: () => Unit,
      view: typings.playable.distSrcModulesUiInteractionIndicatorInteractionIndicatorDotviewMod.default
    ): InteractionIndicator = {
      val __obj = js.Dynamic.literal(_bindEvents = _bindEvents.asInstanceOf[js.Any], _engine = _engine.asInstanceOf[js.Any], _eventEmitter = _eventEmitter.asInstanceOf[js.Any], _initUI = _initUI.asInstanceOf[js.Any], _showPlaybackChangeIndicator = _showPlaybackChangeIndicator.asInstanceOf[js.Any], _unbindEvents = _unbindEvents.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), getElement = js.Any.fromFunction0(getElement), hide = js.Any.fromFunction0(hide), hideIcons = js.Any.fromFunction0(hideIcons), show = js.Any.fromFunction0(show), showDecreaseVolume = js.Any.fromFunction0(showDecreaseVolume), showForward = js.Any.fromFunction0(showForward), showIncreaseVolume = js.Any.fromFunction0(showIncreaseVolume), showMute = js.Any.fromFunction0(showMute), showPause = js.Any.fromFunction0(showPause), showPlay = js.Any.fromFunction0(showPlay), showRewind = js.Any.fromFunction0(showRewind), view = view.asInstanceOf[js.Any])
      __obj.asInstanceOf[InteractionIndicator]
    }
    
    extension [Self <: InteractionIndicator](x: Self) {
      
      inline def setView(value: typings.playable.distSrcModulesUiInteractionIndicatorInteractionIndicatorDotviewMod.default): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      inline def set_bindEvents(value: Any): Self = StObject.set(x, "_bindEvents", value.asInstanceOf[js.Any])
      
      inline def set_engine(value: Any): Self = StObject.set(x, "_engine", value.asInstanceOf[js.Any])
      
      inline def set_eventEmitter(value: Any): Self = StObject.set(x, "_eventEmitter", value.asInstanceOf[js.Any])
      
      inline def set_initUI(value: Any): Self = StObject.set(x, "_initUI", value.asInstanceOf[js.Any])
      
      inline def set_showPlaybackChangeIndicator(value: Any): Self = StObject.set(x, "_showPlaybackChangeIndicator", value.asInstanceOf[js.Any])
      
      inline def set_unbindEvents(value: Any): Self = StObject.set(x, "_unbindEvents", value.asInstanceOf[js.Any])
    }
  }
}
