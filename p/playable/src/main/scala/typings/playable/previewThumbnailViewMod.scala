package typings.playable

import typings.playable.previewServiceTypesMod.INormalizedFramesQuality
import typings.playable.previewThumbnailTypesMod.IPreviewThumbnailViewStyles
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playable/dist/src/modules/ui/preview-thumbnail/preview-thumbnail.view", JSImport.Namespace)
@js.native
object previewThumbnailViewMod extends js.Object {
  
  @js.native
  trait PreviewThumbnailView
    extends typings.playable.stylableMod.default[IPreviewThumbnailViewStyles] {
    
    @JSName("_$highQualityThumb")
    var _$highQualityThumb: js.Any = js.native
    
    @JSName("_$lowQualityThumb")
    var _$lowQualityThumb: js.Any = js.native
    
    @JSName("_$rootElement")
    var _$rootElement: js.Any = js.native
    
    @JSName("_$timeText")
    var _$timeText: js.Any = js.native
    
    var _applyQualityToThumbElement: js.Any = js.native
    
    var _initDOM: js.Any = js.native
    
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
  
  @js.native
  class default () extends PreviewThumbnailView
}
