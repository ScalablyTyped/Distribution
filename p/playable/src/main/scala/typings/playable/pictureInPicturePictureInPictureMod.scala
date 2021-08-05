package typings.playable

import org.scalablytyped.runtime.Instantiable1
import typings.playable.anon.PictureInPicture
import typings.playable.controlsPictureInPictureTypesMod.IPictureInPictureControl
import typings.playable.controlsPictureInPictureTypesMod.IPictureInPictureViewConfig
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pictureInPicturePictureInPictureMod {
  
  @JSImport("playable/dist/src/modules/ui/controls/picture-in-picture/picture-in-picture", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with PictureInPictureControl {
    def this(hasEventEmitterPictureInPictureTextMapTooltipServiceTheme: PictureInPicture) = this()
    
    /* private */ /* CompleteClass */
    var _bindCallbacks: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _bindEvents: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _destroyInterceptor: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _eventEmitter: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _initInterceptor: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _initUI: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _interceptor: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _pictureInPictureManager: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _textMap: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _theme: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _togglePictureInPicture: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _tooltipService: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _unbindEvents: js.Any = js.native
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def getElement(): HTMLElement = js.native
    
    /* CompleteClass */
    override def hide(): Unit = js.native
    
    /* CompleteClass */
    var isHidden: Boolean = js.native
    
    /* CompleteClass */
    override def show(): Unit = js.native
    
    /* CompleteClass */
    var view: typings.playable.pictureInPictureViewMod.default = js.native
  }
  /* static members */
  object default {
    
    @JSImport("playable/dist/src/modules/ui/controls/picture-in-picture/picture-in-picture", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("playable/dist/src/modules/ui/controls/picture-in-picture/picture-in-picture", "default.View")
    @js.native
    def View: Instantiable1[
        /* config */ IPictureInPictureViewConfig, 
        typings.playable.pictureInPictureViewMod.default
      ] = js.native
    inline def View_=(
      x: Instantiable1[
          /* config */ IPictureInPictureViewConfig, 
          typings.playable.pictureInPictureViewMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("View")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/modules/ui/controls/picture-in-picture/picture-in-picture", "default.dependencies")
    @js.native
    def dependencies: js.Array[String] = js.native
    inline def dependencies_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/modules/ui/controls/picture-in-picture/picture-in-picture", "default.moduleName")
    @js.native
    def moduleName: String = js.native
    inline def moduleName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(x.asInstanceOf[js.Any])
  }
  
  trait PictureInPictureControl
    extends StObject
       with IPictureInPictureControl {
    
    /* private */ var _bindCallbacks: js.Any
    
    /* private */ var _bindEvents: js.Any
    
    /* private */ var _destroyInterceptor: js.Any
    
    /* private */ var _eventEmitter: js.Any
    
    /* private */ var _initInterceptor: js.Any
    
    /* private */ var _initUI: js.Any
    
    /* private */ var _interceptor: js.Any
    
    /* private */ var _pictureInPictureManager: js.Any
    
    /* private */ var _textMap: js.Any
    
    /* private */ var _theme: js.Any
    
    /* private */ var _togglePictureInPicture: js.Any
    
    /* private */ var _tooltipService: js.Any
    
    /* private */ var _unbindEvents: js.Any
    
    var isHidden: Boolean
    
    var view: typings.playable.pictureInPictureViewMod.default
  }
  object PictureInPictureControl {
    
    inline def apply(
      _bindCallbacks: js.Any,
      _bindEvents: js.Any,
      _destroyInterceptor: js.Any,
      _eventEmitter: js.Any,
      _initInterceptor: js.Any,
      _initUI: js.Any,
      _interceptor: js.Any,
      _pictureInPictureManager: js.Any,
      _textMap: js.Any,
      _theme: js.Any,
      _togglePictureInPicture: js.Any,
      _tooltipService: js.Any,
      _unbindEvents: js.Any,
      destroy: () => Unit,
      getElement: () => HTMLElement,
      hide: () => Unit,
      isHidden: Boolean,
      show: () => Unit,
      view: typings.playable.pictureInPictureViewMod.default
    ): PictureInPictureControl = {
      val __obj = js.Dynamic.literal(_bindCallbacks = _bindCallbacks.asInstanceOf[js.Any], _bindEvents = _bindEvents.asInstanceOf[js.Any], _destroyInterceptor = _destroyInterceptor.asInstanceOf[js.Any], _eventEmitter = _eventEmitter.asInstanceOf[js.Any], _initInterceptor = _initInterceptor.asInstanceOf[js.Any], _initUI = _initUI.asInstanceOf[js.Any], _interceptor = _interceptor.asInstanceOf[js.Any], _pictureInPictureManager = _pictureInPictureManager.asInstanceOf[js.Any], _textMap = _textMap.asInstanceOf[js.Any], _theme = _theme.asInstanceOf[js.Any], _togglePictureInPicture = _togglePictureInPicture.asInstanceOf[js.Any], _tooltipService = _tooltipService.asInstanceOf[js.Any], _unbindEvents = _unbindEvents.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), getElement = js.Any.fromFunction0(getElement), hide = js.Any.fromFunction0(hide), isHidden = isHidden.asInstanceOf[js.Any], show = js.Any.fromFunction0(show), view = view.asInstanceOf[js.Any])
      __obj.asInstanceOf[PictureInPictureControl]
    }
    
    extension [Self <: PictureInPictureControl](x: Self) {
      
      inline def setIsHidden(value: Boolean): Self = StObject.set(x, "isHidden", value.asInstanceOf[js.Any])
      
      inline def setView(value: typings.playable.pictureInPictureViewMod.default): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      inline def set_bindCallbacks(value: js.Any): Self = StObject.set(x, "_bindCallbacks", value.asInstanceOf[js.Any])
      
      inline def set_bindEvents(value: js.Any): Self = StObject.set(x, "_bindEvents", value.asInstanceOf[js.Any])
      
      inline def set_destroyInterceptor(value: js.Any): Self = StObject.set(x, "_destroyInterceptor", value.asInstanceOf[js.Any])
      
      inline def set_eventEmitter(value: js.Any): Self = StObject.set(x, "_eventEmitter", value.asInstanceOf[js.Any])
      
      inline def set_initInterceptor(value: js.Any): Self = StObject.set(x, "_initInterceptor", value.asInstanceOf[js.Any])
      
      inline def set_initUI(value: js.Any): Self = StObject.set(x, "_initUI", value.asInstanceOf[js.Any])
      
      inline def set_interceptor(value: js.Any): Self = StObject.set(x, "_interceptor", value.asInstanceOf[js.Any])
      
      inline def set_pictureInPictureManager(value: js.Any): Self = StObject.set(x, "_pictureInPictureManager", value.asInstanceOf[js.Any])
      
      inline def set_textMap(value: js.Any): Self = StObject.set(x, "_textMap", value.asInstanceOf[js.Any])
      
      inline def set_theme(value: js.Any): Self = StObject.set(x, "_theme", value.asInstanceOf[js.Any])
      
      inline def set_togglePictureInPicture(value: js.Any): Self = StObject.set(x, "_togglePictureInPicture", value.asInstanceOf[js.Any])
      
      inline def set_tooltipService(value: js.Any): Self = StObject.set(x, "_tooltipService", value.asInstanceOf[js.Any])
      
      inline def set_unbindEvents(value: js.Any): Self = StObject.set(x, "_unbindEvents", value.asInstanceOf[js.Any])
    }
  }
}
