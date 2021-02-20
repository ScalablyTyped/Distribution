package typings.playable

import org.scalablytyped.runtime.Instantiable0
import typings.playable.anon.PreviewServiceIPreviewService
import typings.playable.previewThumbnailTypesMod.IPreviewThumbnail
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object previewThumbnailMod {
  
  @JSImport("playable/dist/src/modules/ui/preview-thumbnail/preview-thumbnail", JSImport.Default)
  @js.native
  class default protected () extends PreviewThumbnail {
    def this(hasPreviewService: PreviewServiceIPreviewService) = this()
  }
  /* static members */
  object default {
    
    @JSImport("playable/dist/src/modules/ui/preview-thumbnail/preview-thumbnail", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("playable/dist/src/modules/ui/preview-thumbnail/preview-thumbnail", "default.View")
    @js.native
    def View: Instantiable0[typings.playable.previewThumbnailViewMod.default] = js.native
    @scala.inline
    def View_=(x: Instantiable0[typings.playable.previewThumbnailViewMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("View")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/modules/ui/preview-thumbnail/preview-thumbnail", "default.dependencies")
    @js.native
    def dependencies: js.Array[String] = js.native
    @scala.inline
    def dependencies_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/modules/ui/preview-thumbnail/preview-thumbnail", "default.moduleName")
    @js.native
    def moduleName: String = js.native
    @scala.inline
    def moduleName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait PreviewThumbnail extends IPreviewThumbnail {
    
    var _currentFrames: js.Any = js.native
    
    var _initUI: js.Any = js.native
    
    var _previewService: js.Any = js.native
    
    var view: typings.playable.previewThumbnailViewMod.default = js.native
  }
  object PreviewThumbnail {
    
    @scala.inline
    def apply(
      _currentFrames: js.Any,
      _initUI: js.Any,
      _previewService: js.Any,
      destroy: () => Unit,
      getElement: () => HTMLElement,
      setTime: String => Unit,
      showAt: Double => Unit,
      view: typings.playable.previewThumbnailViewMod.default
    ): PreviewThumbnail = {
      val __obj = js.Dynamic.literal(_currentFrames = _currentFrames.asInstanceOf[js.Any], _initUI = _initUI.asInstanceOf[js.Any], _previewService = _previewService.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), getElement = js.Any.fromFunction0(getElement), setTime = js.Any.fromFunction1(setTime), showAt = js.Any.fromFunction1(showAt), view = view.asInstanceOf[js.Any])
      __obj.asInstanceOf[PreviewThumbnail]
    }
    
    @scala.inline
    implicit class PreviewThumbnailMutableBuilder[Self <: PreviewThumbnail] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setView(value: typings.playable.previewThumbnailViewMod.default): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_currentFrames(value: js.Any): Self = StObject.set(x, "_currentFrames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_initUI(value: js.Any): Self = StObject.set(x, "_initUI", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_previewService(value: js.Any): Self = StObject.set(x, "_previewService", value.asInstanceOf[js.Any])
    }
  }
}
