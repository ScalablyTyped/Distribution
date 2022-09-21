package typings.playable

import org.scalablytyped.runtime.Instantiable1
import typings.playable.anon.CurrentBitrate
import typings.playable.anon.KeyboardControl
import typings.playable.debugPanelTypesMod.IDebugPanelViewConfig
import typings.playable.playbackEngineTypesMod.IEngineDebugInfo
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object debugPanelMod {
  
  @JSImport("playable/dist/src/modules/ui/debug-panel/debug-panel", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with DebugPanel {
    def this(hasEngineRootContainerKeyboardControl: KeyboardControl) = this()
    
    /* private */ /* CompleteClass */
    var _bindCallbacks: Any = js.native
    
    /* private */ /* CompleteClass */
    var _engine: Any = js.native
    
    /* private */ /* CompleteClass */
    var _initUI: Any = js.native
    
    /* private */ /* CompleteClass */
    var _interval: Any = js.native
    
    /* private */ /* CompleteClass */
    var _keyControlCallback: Any = js.native
    
    /* CompleteClass */
    override def clearUpdateInterval(): Unit = js.native
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def getDebugInfo(): IEngineDebugInfo | CurrentBitrate = js.native
    
    /* CompleteClass */
    override def getElement(): HTMLElement = js.native
    
    /* CompleteClass */
    override def hide(): Unit = js.native
    
    /* CompleteClass */
    var isHidden: Boolean = js.native
    
    /* CompleteClass */
    override def setUpdateInterval(): Unit = js.native
    
    /* CompleteClass */
    override def show(): Unit = js.native
    
    /* CompleteClass */
    override def updateInfo(): Unit = js.native
    
    /* CompleteClass */
    var view: typings.playable.debugPanelViewMod.default = js.native
  }
  /* static members */
  object default {
    
    @JSImport("playable/dist/src/modules/ui/debug-panel/debug-panel", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("playable/dist/src/modules/ui/debug-panel/debug-panel", "default.View")
    @js.native
    def View: Instantiable1[/* config */ IDebugPanelViewConfig, typings.playable.debugPanelViewMod.default] = js.native
    inline def View_=(x: Instantiable1[/* config */ IDebugPanelViewConfig, typings.playable.debugPanelViewMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("View")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/modules/ui/debug-panel/debug-panel", "default.dependencies")
    @js.native
    def dependencies: js.Array[String] = js.native
    inline def dependencies_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/modules/ui/debug-panel/debug-panel", "default.moduleName")
    @js.native
    def moduleName: String = js.native
    inline def moduleName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(x.asInstanceOf[js.Any])
  }
  
  trait DebugPanel extends StObject {
    
    /* private */ var _bindCallbacks: Any
    
    /* private */ var _engine: Any
    
    /* private */ var _initUI: Any
    
    /* private */ var _interval: Any
    
    /* private */ var _keyControlCallback: Any
    
    def clearUpdateInterval(): Unit
    
    def destroy(): Unit
    
    def getDebugInfo(): IEngineDebugInfo | CurrentBitrate
    
    def getElement(): HTMLElement
    
    def hide(): Unit
    
    var isHidden: Boolean
    
    def setUpdateInterval(): Unit
    
    def show(): Unit
    
    def updateInfo(): Unit
    
    var view: typings.playable.debugPanelViewMod.default
  }
  object DebugPanel {
    
    inline def apply(
      _bindCallbacks: Any,
      _engine: Any,
      _initUI: Any,
      _interval: Any,
      _keyControlCallback: Any,
      clearUpdateInterval: () => Unit,
      destroy: () => Unit,
      getDebugInfo: () => IEngineDebugInfo | CurrentBitrate,
      getElement: () => HTMLElement,
      hide: () => Unit,
      isHidden: Boolean,
      setUpdateInterval: () => Unit,
      show: () => Unit,
      updateInfo: () => Unit,
      view: typings.playable.debugPanelViewMod.default
    ): DebugPanel = {
      val __obj = js.Dynamic.literal(_bindCallbacks = _bindCallbacks.asInstanceOf[js.Any], _engine = _engine.asInstanceOf[js.Any], _initUI = _initUI.asInstanceOf[js.Any], _interval = _interval.asInstanceOf[js.Any], _keyControlCallback = _keyControlCallback.asInstanceOf[js.Any], clearUpdateInterval = js.Any.fromFunction0(clearUpdateInterval), destroy = js.Any.fromFunction0(destroy), getDebugInfo = js.Any.fromFunction0(getDebugInfo), getElement = js.Any.fromFunction0(getElement), hide = js.Any.fromFunction0(hide), isHidden = isHidden.asInstanceOf[js.Any], setUpdateInterval = js.Any.fromFunction0(setUpdateInterval), show = js.Any.fromFunction0(show), updateInfo = js.Any.fromFunction0(updateInfo), view = view.asInstanceOf[js.Any])
      __obj.asInstanceOf[DebugPanel]
    }
    
    extension [Self <: DebugPanel](x: Self) {
      
      inline def setClearUpdateInterval(value: () => Unit): Self = StObject.set(x, "clearUpdateInterval", js.Any.fromFunction0(value))
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setGetDebugInfo(value: () => IEngineDebugInfo | CurrentBitrate): Self = StObject.set(x, "getDebugInfo", js.Any.fromFunction0(value))
      
      inline def setGetElement(value: () => HTMLElement): Self = StObject.set(x, "getElement", js.Any.fromFunction0(value))
      
      inline def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      inline def setIsHidden(value: Boolean): Self = StObject.set(x, "isHidden", value.asInstanceOf[js.Any])
      
      inline def setSetUpdateInterval(value: () => Unit): Self = StObject.set(x, "setUpdateInterval", js.Any.fromFunction0(value))
      
      inline def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
      
      inline def setUpdateInfo(value: () => Unit): Self = StObject.set(x, "updateInfo", js.Any.fromFunction0(value))
      
      inline def setView(value: typings.playable.debugPanelViewMod.default): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      inline def set_bindCallbacks(value: Any): Self = StObject.set(x, "_bindCallbacks", value.asInstanceOf[js.Any])
      
      inline def set_engine(value: Any): Self = StObject.set(x, "_engine", value.asInstanceOf[js.Any])
      
      inline def set_initUI(value: Any): Self = StObject.set(x, "_initUI", value.asInstanceOf[js.Any])
      
      inline def set_interval(value: Any): Self = StObject.set(x, "_interval", value.asInstanceOf[js.Any])
      
      inline def set_keyControlCallback(value: Any): Self = StObject.set(x, "_keyControlCallback", value.asInstanceOf[js.Any])
    }
  }
}
