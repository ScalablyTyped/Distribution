package typings.playable

import typings.playable.distSrcModulesUiPreviewServiceTypesMod.INormalizedFramesQuality
import typings.playable.distSrcModulesUiPreviewThumbnailTypesMod.IPreviewThumbnailViewStyles
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesUiPreviewThumbnailPreviewThumbnailDotviewMod {
  
  @JSImport("playable/dist/src/modules/ui/preview-thumbnail/preview-thumbnail.view", JSImport.Default)
  @js.native
  open class default () extends PreviewThumbnailView
  
  @js.native
  trait PreviewThumbnailView
    extends typings.playable.distSrcModulesUiCoreViewMod.default[IPreviewThumbnailViewStyles] {
    
    /* private */ @JSName("_$highQualityThumb")
    var _$highQualityThumb: Any = js.native
    
    /* private */ @JSName("_$lowQualityThumb")
    var _$lowQualityThumb: Any = js.native
    
    /* private */ @JSName("_$rootElement")
    var _$rootElement: Any = js.native
    
    /* private */ @JSName("_$timeText")
    var _$timeText: Any = js.native
    
    /* private */ var _applyQualityToThumbElement: Any = js.native
    
    /* private */ var _initDOM: Any = js.native
    
    def clearHighQualityPreview(): Unit = js.native
    
    def clearLowQualityPreview(): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def getElement(): HTMLElement = js.native
    
    def setHighQualityPreview(qualityData: INormalizedFramesQuality): Unit = js.native
    
    def setLowQualityPreview(qualityData: INormalizedFramesQuality): Unit = js.native
    
    def setTime(time: String): Unit = js.native
    
    def showAsEmpty(): Unit = js.native
    
    def showWithPreview(): Unit = js.native
  }
}
