package typings.playable

import org.scalablytyped.runtime.Instantiable0
import typings.playable.anon.RootContainer
import typings.playable.interactionIndicatorTypesMod.IInteractionIndicator
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interactionIndicatorMod {
  
  @JSImport("playable/dist/src/modules/ui/interaction-indicator/interaction-indicator", JSImport.Default)
  @js.native
  class default protected () extends InteractionIndicator {
    def this(hasEventEmitterEngineConfigRootContainer: RootContainer) = this()
  }
  /* static members */
  object default {
    
    @JSImport("playable/dist/src/modules/ui/interaction-indicator/interaction-indicator", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("playable/dist/src/modules/ui/interaction-indicator/interaction-indicator", "default.View")
    @js.native
    def View: Instantiable0[typings.playable.interactionIndicatorViewMod.default] = js.native
    @scala.inline
    def View_=(x: Instantiable0[typings.playable.interactionIndicatorViewMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("View")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/modules/ui/interaction-indicator/interaction-indicator", "default.dependencies")
    @js.native
    def dependencies: js.Array[String] = js.native
    @scala.inline
    def dependencies_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/modules/ui/interaction-indicator/interaction-indicator", "default.moduleName")
    @js.native
    def moduleName: String = js.native
    @scala.inline
    def moduleName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait InteractionIndicator extends IInteractionIndicator {
    
    var _bindEvents: js.Any = js.native
    
    var _engine: js.Any = js.native
    
    var _eventEmitter: js.Any = js.native
    
    var _initUI: js.Any = js.native
    
    var _showPlaybackChangeIndicator: js.Any = js.native
    
    var _unbindEvents: js.Any = js.native
    
    var view: typings.playable.interactionIndicatorViewMod.default = js.native
  }
  object InteractionIndicator {
    
    @scala.inline
    def apply(
      _bindEvents: js.Any,
      _engine: js.Any,
      _eventEmitter: js.Any,
      _initUI: js.Any,
      _showPlaybackChangeIndicator: js.Any,
      _unbindEvents: js.Any,
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
      view: typings.playable.interactionIndicatorViewMod.default
    ): InteractionIndicator = {
      val __obj = js.Dynamic.literal(_bindEvents = _bindEvents.asInstanceOf[js.Any], _engine = _engine.asInstanceOf[js.Any], _eventEmitter = _eventEmitter.asInstanceOf[js.Any], _initUI = _initUI.asInstanceOf[js.Any], _showPlaybackChangeIndicator = _showPlaybackChangeIndicator.asInstanceOf[js.Any], _unbindEvents = _unbindEvents.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), getElement = js.Any.fromFunction0(getElement), hide = js.Any.fromFunction0(hide), hideIcons = js.Any.fromFunction0(hideIcons), show = js.Any.fromFunction0(show), showDecreaseVolume = js.Any.fromFunction0(showDecreaseVolume), showForward = js.Any.fromFunction0(showForward), showIncreaseVolume = js.Any.fromFunction0(showIncreaseVolume), showMute = js.Any.fromFunction0(showMute), showPause = js.Any.fromFunction0(showPause), showPlay = js.Any.fromFunction0(showPlay), showRewind = js.Any.fromFunction0(showRewind), view = view.asInstanceOf[js.Any])
      __obj.asInstanceOf[InteractionIndicator]
    }
    
    @scala.inline
    implicit class InteractionIndicatorMutableBuilder[Self <: InteractionIndicator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setView(value: typings.playable.interactionIndicatorViewMod.default): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_bindEvents(value: js.Any): Self = StObject.set(x, "_bindEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_engine(value: js.Any): Self = StObject.set(x, "_engine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_eventEmitter(value: js.Any): Self = StObject.set(x, "_eventEmitter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_initUI(value: js.Any): Self = StObject.set(x, "_initUI", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_showPlaybackChangeIndicator(value: js.Any): Self = StObject.set(x, "_showPlaybackChangeIndicator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_unbindEvents(value: js.Any): Self = StObject.set(x, "_unbindEvents", value.asInstanceOf[js.Any])
    }
  }
}
