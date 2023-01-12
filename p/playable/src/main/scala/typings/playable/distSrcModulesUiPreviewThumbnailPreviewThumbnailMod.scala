package typings.playable

import org.scalablytyped.runtime.Instantiable0
import typings.playable.anon.PreviewServiceIPreviewService
import typings.playable.distSrcModulesUiPreviewThumbnailTypesMod.IPreviewThumbnail
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesUiPreviewThumbnailPreviewThumbnailMod {
  
  @JSImport("playable/dist/src/modules/ui/preview-thumbnail/preview-thumbnail", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with PreviewThumbnail {
    def this(param0: PreviewServiceIPreviewService) = this()
    
    /* private */ /* CompleteClass */
    var _currentFrames: Any = js.native
    
    /* private */ /* CompleteClass */
    var _initUI: Any = js.native
    
    /* private */ /* CompleteClass */
    var _previewService: Any = js.native
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def getElement(): HTMLElement = js.native
    
    /* CompleteClass */
    override def setTime(time: String): Unit = js.native
    
    /* CompleteClass */
    override def showAt(second: Double): Unit = js.native
    
    /* CompleteClass */
    var view: typings.playable.distSrcModulesUiPreviewThumbnailPreviewThumbnailDotviewMod.default = js.native
  }
  /* static members */
  object default {
    
    @JSImport("playable/dist/src/modules/ui/preview-thumbnail/preview-thumbnail", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("playable/dist/src/modules/ui/preview-thumbnail/preview-thumbnail", "default.View")
    @js.native
    def View: Instantiable0[
        typings.playable.distSrcModulesUiPreviewThumbnailPreviewThumbnailDotviewMod.default
      ] = js.native
    inline def View_=(
      x: Instantiable0[
          typings.playable.distSrcModulesUiPreviewThumbnailPreviewThumbnailDotviewMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("View")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/modules/ui/preview-thumbnail/preview-thumbnail", "default.dependencies")
    @js.native
    def dependencies: js.Array[String] = js.native
    inline def dependencies_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/modules/ui/preview-thumbnail/preview-thumbnail", "default.moduleName")
    @js.native
    def moduleName: String = js.native
    inline def moduleName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(x.asInstanceOf[js.Any])
  }
  
  trait PreviewThumbnail
    extends StObject
       with IPreviewThumbnail {
    
    /* private */ var _currentFrames: Any
    
    /* private */ var _initUI: Any
    
    /* private */ var _previewService: Any
    
    var view: typings.playable.distSrcModulesUiPreviewThumbnailPreviewThumbnailDotviewMod.default
  }
  object PreviewThumbnail {
    
    inline def apply(
      _currentFrames: Any,
      _initUI: Any,
      _previewService: Any,
      destroy: () => Unit,
      getElement: () => HTMLElement,
      setTime: String => Unit,
      showAt: Double => Unit,
      view: typings.playable.distSrcModulesUiPreviewThumbnailPreviewThumbnailDotviewMod.default
    ): PreviewThumbnail = {
      val __obj = js.Dynamic.literal(_currentFrames = _currentFrames.asInstanceOf[js.Any], _initUI = _initUI.asInstanceOf[js.Any], _previewService = _previewService.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), getElement = js.Any.fromFunction0(getElement), setTime = js.Any.fromFunction1(setTime), showAt = js.Any.fromFunction1(showAt), view = view.asInstanceOf[js.Any])
      __obj.asInstanceOf[PreviewThumbnail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PreviewThumbnail] (val x: Self) extends AnyVal {
      
      inline def setView(value: typings.playable.distSrcModulesUiPreviewThumbnailPreviewThumbnailDotviewMod.default): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      inline def set_currentFrames(value: Any): Self = StObject.set(x, "_currentFrames", value.asInstanceOf[js.Any])
      
      inline def set_initUI(value: Any): Self = StObject.set(x, "_initUI", value.asInstanceOf[js.Any])
      
      inline def set_previewService(value: Any): Self = StObject.set(x, "_previewService", value.asInstanceOf[js.Any])
    }
  }
}
