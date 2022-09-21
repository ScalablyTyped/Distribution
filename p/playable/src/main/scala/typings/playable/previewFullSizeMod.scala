package typings.playable

import org.scalablytyped.runtime.Instantiable0
import typings.playable.anon.PreviewService
import typings.playable.previewFullSizeTypesMod.IPreviewFullSize
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object previewFullSizeMod {
  
  @JSImport("playable/dist/src/modules/ui/preview-full-size/preview-full-size", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with PreviewFullsize {
    def this(hasPreviewServiceRootContainer: PreviewService) = this()
    
    /* private */ /* CompleteClass */
    var _currentFrame: Any = js.native
    
    /* private */ /* CompleteClass */
    var _initUI: Any = js.native
    
    /* private */ /* CompleteClass */
    var _previewService: Any = js.native
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def getElement(): HTMLElement = js.native
    
    /* CompleteClass */
    override def hide(): Unit = js.native
    
    /* CompleteClass */
    override def showAt(second: Double): Unit = js.native
    
    /* CompleteClass */
    var view: typings.playable.previewFullSizeViewMod.default = js.native
  }
  /* static members */
  object default {
    
    @JSImport("playable/dist/src/modules/ui/preview-full-size/preview-full-size", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("playable/dist/src/modules/ui/preview-full-size/preview-full-size", "default.View")
    @js.native
    def View: Instantiable0[typings.playable.previewFullSizeViewMod.default] = js.native
    inline def View_=(x: Instantiable0[typings.playable.previewFullSizeViewMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("View")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/modules/ui/preview-full-size/preview-full-size", "default.dependencies")
    @js.native
    def dependencies: js.Array[String] = js.native
    inline def dependencies_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/modules/ui/preview-full-size/preview-full-size", "default.moduleName")
    @js.native
    def moduleName: String = js.native
    inline def moduleName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(x.asInstanceOf[js.Any])
  }
  
  trait PreviewFullsize
    extends StObject
       with IPreviewFullSize {
    
    /* private */ var _currentFrame: Any
    
    /* private */ var _initUI: Any
    
    /* private */ var _previewService: Any
    
    var view: typings.playable.previewFullSizeViewMod.default
  }
  object PreviewFullsize {
    
    inline def apply(
      _currentFrame: Any,
      _initUI: Any,
      _previewService: Any,
      destroy: () => Unit,
      getElement: () => HTMLElement,
      hide: () => Unit,
      showAt: Double => Unit,
      view: typings.playable.previewFullSizeViewMod.default
    ): PreviewFullsize = {
      val __obj = js.Dynamic.literal(_currentFrame = _currentFrame.asInstanceOf[js.Any], _initUI = _initUI.asInstanceOf[js.Any], _previewService = _previewService.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), getElement = js.Any.fromFunction0(getElement), hide = js.Any.fromFunction0(hide), showAt = js.Any.fromFunction1(showAt), view = view.asInstanceOf[js.Any])
      __obj.asInstanceOf[PreviewFullsize]
    }
    
    extension [Self <: PreviewFullsize](x: Self) {
      
      inline def setView(value: typings.playable.previewFullSizeViewMod.default): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      inline def set_currentFrame(value: Any): Self = StObject.set(x, "_currentFrame", value.asInstanceOf[js.Any])
      
      inline def set_initUI(value: Any): Self = StObject.set(x, "_initUI", value.asInstanceOf[js.Any])
      
      inline def set_previewService(value: Any): Self = StObject.set(x, "_previewService", value.asInstanceOf[js.Any])
    }
  }
}
