package typings.playable

import org.scalablytyped.runtime.Instantiable1
import typings.playable.anon.TextMap
import typings.playable.distSrcModulesUiControlsDownloadTypesMod.IDownloadButton
import typings.playable.distSrcModulesUiControlsDownloadTypesMod.IDownloadViewConfig
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesUiControlsDownloadDownloadMod {
  
  @JSImport("playable/dist/src/modules/ui/controls/download/download", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with DownloadButton {
    def this(param0: TextMap) = this()
    
    /* private */ /* CompleteClass */
    var _bindCallbacks: Any = js.native
    
    /* private */ /* CompleteClass */
    var _callback: Any = js.native
    
    /* private */ /* CompleteClass */
    var _destroyInterceptor: Any = js.native
    
    /* private */ /* CompleteClass */
    var _eventEmitter: Any = js.native
    
    /* private */ /* CompleteClass */
    var _initInterceptor: Any = js.native
    
    /* private */ /* CompleteClass */
    var _initUI: Any = js.native
    
    /* private */ /* CompleteClass */
    var _interceptor: Any = js.native
    
    /* private */ /* CompleteClass */
    var _textMap: Any = js.native
    
    /* private */ /* CompleteClass */
    var _theme: Any = js.native
    
    /* private */ /* CompleteClass */
    var _tooltipService: Any = js.native
    
    /* private */ /* CompleteClass */
    var _triggerCallback: Any = js.native
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def getElement(): HTMLElement = js.native
    
    /* CompleteClass */
    override def hide(): Unit = js.native
    
    /* CompleteClass */
    var isHidden: Boolean = js.native
    
    /* CompleteClass */
    override def setDownloadClickCallback(callback: js.Function0[Unit]): Unit = js.native
    
    /* CompleteClass */
    override def show(): Unit = js.native
    
    /* CompleteClass */
    var view: typings.playable.distSrcModulesUiControlsDownloadDownloadDotviewMod.default = js.native
  }
  object default {
    
    @JSImport("playable/dist/src/modules/ui/controls/download/download", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("playable/dist/src/modules/ui/controls/download/download", "default.View")
    @js.native
    open class View protected ()
      extends typings.playable.distSrcModulesUiControlsDownloadDownloadDotviewMod.default {
      def this(config: IDownloadViewConfig) = this()
    }
    /* static member */
    /* was `typeof View` */
    @JSImport("playable/dist/src/modules/ui/controls/download/download", "default.View")
    @js.native
    def View: Instantiable1[
        /* config */ IDownloadViewConfig, 
        typings.playable.distSrcModulesUiControlsDownloadDownloadDotviewMod.default
      ] = js.native
    inline def View_=(
      x: Instantiable1[
          /* config */ IDownloadViewConfig, 
          typings.playable.distSrcModulesUiControlsDownloadDownloadDotviewMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("View")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("playable/dist/src/modules/ui/controls/download/download", "default.dependencies")
    @js.native
    def dependencies: js.Array[String] = js.native
    inline def dependencies_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("playable/dist/src/modules/ui/controls/download/download", "default.moduleName")
    @js.native
    def moduleName: String = js.native
    inline def moduleName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(x.asInstanceOf[js.Any])
  }
  
  trait DownloadButton
    extends StObject
       with IDownloadButton {
    
    /* private */ var _bindCallbacks: Any
    
    /* private */ var _callback: Any
    
    /* private */ var _destroyInterceptor: Any
    
    /* private */ var _eventEmitter: Any
    
    /* private */ var _initInterceptor: Any
    
    /* private */ var _initUI: Any
    
    /* private */ var _interceptor: Any
    
    /* private */ var _textMap: Any
    
    /* private */ var _theme: Any
    
    /* private */ var _tooltipService: Any
    
    /* private */ var _triggerCallback: Any
    
    var isHidden: Boolean
    
    var view: typings.playable.distSrcModulesUiControlsDownloadDownloadDotviewMod.default
  }
  object DownloadButton {
    
    inline def apply(
      _bindCallbacks: Any,
      _callback: Any,
      _destroyInterceptor: Any,
      _eventEmitter: Any,
      _initInterceptor: Any,
      _initUI: Any,
      _interceptor: Any,
      _textMap: Any,
      _theme: Any,
      _tooltipService: Any,
      _triggerCallback: Any,
      destroy: () => Unit,
      getElement: () => HTMLElement,
      hide: () => Unit,
      isHidden: Boolean,
      setDownloadClickCallback: js.Function0[Unit] => Unit,
      show: () => Unit,
      view: typings.playable.distSrcModulesUiControlsDownloadDownloadDotviewMod.default
    ): DownloadButton = {
      val __obj = js.Dynamic.literal(_bindCallbacks = _bindCallbacks.asInstanceOf[js.Any], _callback = _callback.asInstanceOf[js.Any], _destroyInterceptor = _destroyInterceptor.asInstanceOf[js.Any], _eventEmitter = _eventEmitter.asInstanceOf[js.Any], _initInterceptor = _initInterceptor.asInstanceOf[js.Any], _initUI = _initUI.asInstanceOf[js.Any], _interceptor = _interceptor.asInstanceOf[js.Any], _textMap = _textMap.asInstanceOf[js.Any], _theme = _theme.asInstanceOf[js.Any], _tooltipService = _tooltipService.asInstanceOf[js.Any], _triggerCallback = _triggerCallback.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), getElement = js.Any.fromFunction0(getElement), hide = js.Any.fromFunction0(hide), isHidden = isHidden.asInstanceOf[js.Any], setDownloadClickCallback = js.Any.fromFunction1(setDownloadClickCallback), show = js.Any.fromFunction0(show), view = view.asInstanceOf[js.Any])
      __obj.asInstanceOf[DownloadButton]
    }
    
    extension [Self <: DownloadButton](x: Self) {
      
      inline def setIsHidden(value: Boolean): Self = StObject.set(x, "isHidden", value.asInstanceOf[js.Any])
      
      inline def setView(value: typings.playable.distSrcModulesUiControlsDownloadDownloadDotviewMod.default): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      inline def set_bindCallbacks(value: Any): Self = StObject.set(x, "_bindCallbacks", value.asInstanceOf[js.Any])
      
      inline def set_callback(value: Any): Self = StObject.set(x, "_callback", value.asInstanceOf[js.Any])
      
      inline def set_destroyInterceptor(value: Any): Self = StObject.set(x, "_destroyInterceptor", value.asInstanceOf[js.Any])
      
      inline def set_eventEmitter(value: Any): Self = StObject.set(x, "_eventEmitter", value.asInstanceOf[js.Any])
      
      inline def set_initInterceptor(value: Any): Self = StObject.set(x, "_initInterceptor", value.asInstanceOf[js.Any])
      
      inline def set_initUI(value: Any): Self = StObject.set(x, "_initUI", value.asInstanceOf[js.Any])
      
      inline def set_interceptor(value: Any): Self = StObject.set(x, "_interceptor", value.asInstanceOf[js.Any])
      
      inline def set_textMap(value: Any): Self = StObject.set(x, "_textMap", value.asInstanceOf[js.Any])
      
      inline def set_theme(value: Any): Self = StObject.set(x, "_theme", value.asInstanceOf[js.Any])
      
      inline def set_tooltipService(value: Any): Self = StObject.set(x, "_tooltipService", value.asInstanceOf[js.Any])
      
      inline def set_triggerCallback(value: Any): Self = StObject.set(x, "_triggerCallback", value.asInstanceOf[js.Any])
    }
  }
}
