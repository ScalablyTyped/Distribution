package typings.playable.anon

import typings.playable.eventEmitterTypesMod.IEventEmitter
import typings.playable.playbackEngineTypesMod.IPlaybackEngine
import typings.playable.previewFullSizeTypesMod.IPreviewFullSize
import typings.playable.previewThumbnailTypesMod.IPreviewThumbnail
import typings.playable.textMapTypesMod.ITextMap
import typings.playable.themeTypesMod.IThemeService
import typings.playable.tooltipTypesMod.ITooltipService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiveStateEngine extends js.Object {
  
  var engine: IPlaybackEngine = js.native
  
  var eventEmitter: IEventEmitter = js.native
  
  var liveStateEngine: js.Any = js.native
  
  var previewFullSize: IPreviewFullSize = js.native
  
  var previewThumbnail: IPreviewThumbnail = js.native
  
  var textMap: ITextMap = js.native
  
  var theme: IThemeService = js.native
  
  var tooltipService: ITooltipService = js.native
}
object LiveStateEngine {
  
  @scala.inline
  def apply(
    engine: IPlaybackEngine,
    eventEmitter: IEventEmitter,
    liveStateEngine: js.Any,
    previewFullSize: IPreviewFullSize,
    previewThumbnail: IPreviewThumbnail,
    textMap: ITextMap,
    theme: IThemeService,
    tooltipService: ITooltipService
  ): LiveStateEngine = {
    val __obj = js.Dynamic.literal(engine = engine.asInstanceOf[js.Any], eventEmitter = eventEmitter.asInstanceOf[js.Any], liveStateEngine = liveStateEngine.asInstanceOf[js.Any], previewFullSize = previewFullSize.asInstanceOf[js.Any], previewThumbnail = previewThumbnail.asInstanceOf[js.Any], textMap = textMap.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], tooltipService = tooltipService.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveStateEngine]
  }
  
  @scala.inline
  implicit class LiveStateEngineOps[Self <: LiveStateEngine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEngine(value: IPlaybackEngine): Self = this.set("engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventEmitter(value: IEventEmitter): Self = this.set("eventEmitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLiveStateEngine(value: js.Any): Self = this.set("liveStateEngine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviewFullSize(value: IPreviewFullSize): Self = this.set("previewFullSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviewThumbnail(value: IPreviewThumbnail): Self = this.set("previewThumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextMap(value: ITextMap): Self = this.set("textMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTheme(value: IThemeService): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipService(value: ITooltipService): Self = this.set("tooltipService", value.asInstanceOf[js.Any])
  }
}
