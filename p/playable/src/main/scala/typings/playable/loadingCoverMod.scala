package typings.playable

import org.scalablytyped.runtime.Instantiable0
import typings.playable.anon.BottomBlockEngine
import typings.playable.loadingCoverTypesMod.ILoadingCover
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loadingCoverMod {
  
  @JSImport("playable/dist/src/modules/ui/loading-cover/loading-cover", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with LoadingCover {
    def this(hasEventEmitterEngineBottomBlockRootContainer: BottomBlockEngine) = this()
    
    /* private */ /* CompleteClass */
    var _bindEvents: Any = js.native
    
    /* private */ /* CompleteClass */
    var _bottomBlock: Any = js.native
    
    /* private */ /* CompleteClass */
    var _checkForWaitingState: Any = js.native
    
    /* private */ /* CompleteClass */
    var _engine: Any = js.native
    
    /* private */ /* CompleteClass */
    var _eventEmitter: Any = js.native
    
    /* private */ /* CompleteClass */
    var _initUI: Any = js.native
    
    /* private */ /* CompleteClass */
    var _unbindEvents: Any = js.native
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def getElement(): HTMLElement = js.native
    
    /* CompleteClass */
    override def hide(): Unit = js.native
    
    /* CompleteClass */
    var isHidden: Boolean = js.native
    
    /* CompleteClass */
    override def setLoadingCover(src: String): Unit = js.native
    
    /* CompleteClass */
    override def show(): Unit = js.native
    
    /* CompleteClass */
    var view: typings.playable.loadingCoverViewMod.default = js.native
  }
  /* static members */
  object default {
    
    @JSImport("playable/dist/src/modules/ui/loading-cover/loading-cover", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("playable/dist/src/modules/ui/loading-cover/loading-cover", "default.View")
    @js.native
    def View: Instantiable0[typings.playable.loadingCoverViewMod.default] = js.native
    inline def View_=(x: Instantiable0[typings.playable.loadingCoverViewMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("View")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/modules/ui/loading-cover/loading-cover", "default.dependencies")
    @js.native
    def dependencies: js.Array[String] = js.native
    inline def dependencies_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/modules/ui/loading-cover/loading-cover", "default.moduleName")
    @js.native
    def moduleName: String = js.native
    inline def moduleName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(x.asInstanceOf[js.Any])
  }
  
  trait LoadingCover
    extends StObject
       with ILoadingCover {
    
    /* private */ var _bindEvents: Any
    
    /* private */ var _bottomBlock: Any
    
    /* private */ var _checkForWaitingState: Any
    
    /* private */ var _engine: Any
    
    /* private */ var _eventEmitter: Any
    
    /* private */ var _initUI: Any
    
    /* private */ var _unbindEvents: Any
    
    var isHidden: Boolean
    
    var view: typings.playable.loadingCoverViewMod.default
  }
  object LoadingCover {
    
    inline def apply(
      _bindEvents: Any,
      _bottomBlock: Any,
      _checkForWaitingState: Any,
      _engine: Any,
      _eventEmitter: Any,
      _initUI: Any,
      _unbindEvents: Any,
      destroy: () => Unit,
      getElement: () => HTMLElement,
      hide: () => Unit,
      isHidden: Boolean,
      setLoadingCover: String => Unit,
      show: () => Unit,
      view: typings.playable.loadingCoverViewMod.default
    ): LoadingCover = {
      val __obj = js.Dynamic.literal(_bindEvents = _bindEvents.asInstanceOf[js.Any], _bottomBlock = _bottomBlock.asInstanceOf[js.Any], _checkForWaitingState = _checkForWaitingState.asInstanceOf[js.Any], _engine = _engine.asInstanceOf[js.Any], _eventEmitter = _eventEmitter.asInstanceOf[js.Any], _initUI = _initUI.asInstanceOf[js.Any], _unbindEvents = _unbindEvents.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), getElement = js.Any.fromFunction0(getElement), hide = js.Any.fromFunction0(hide), isHidden = isHidden.asInstanceOf[js.Any], setLoadingCover = js.Any.fromFunction1(setLoadingCover), show = js.Any.fromFunction0(show), view = view.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoadingCover]
    }
    
    extension [Self <: LoadingCover](x: Self) {
      
      inline def setIsHidden(value: Boolean): Self = StObject.set(x, "isHidden", value.asInstanceOf[js.Any])
      
      inline def setView(value: typings.playable.loadingCoverViewMod.default): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      inline def set_bindEvents(value: Any): Self = StObject.set(x, "_bindEvents", value.asInstanceOf[js.Any])
      
      inline def set_bottomBlock(value: Any): Self = StObject.set(x, "_bottomBlock", value.asInstanceOf[js.Any])
      
      inline def set_checkForWaitingState(value: Any): Self = StObject.set(x, "_checkForWaitingState", value.asInstanceOf[js.Any])
      
      inline def set_engine(value: Any): Self = StObject.set(x, "_engine", value.asInstanceOf[js.Any])
      
      inline def set_eventEmitter(value: Any): Self = StObject.set(x, "_eventEmitter", value.asInstanceOf[js.Any])
      
      inline def set_initUI(value: Any): Self = StObject.set(x, "_initUI", value.asInstanceOf[js.Any])
      
      inline def set_unbindEvents(value: Any): Self = StObject.set(x, "_unbindEvents", value.asInstanceOf[js.Any])
    }
  }
}
