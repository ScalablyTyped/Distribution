package typings.playable.anon

import typings.playable.eventEmitterTypesMod.IEventEmitter
import typings.playable.playbackEngineTypesMod.IPlaybackEngine
import typings.playable.previewFullSizeTypesMod.IPreviewFullSize
import typings.playable.previewThumbnailTypesMod.IPreviewThumbnail
import typings.playable.textMapTypesMod.ITextMap
import typings.playable.themeTypesMod.IThemeService
import typings.playable.tooltipTypesMod.ITooltipService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LiveStateEngine extends StObject {
  
  var engine: IPlaybackEngine
  
  var eventEmitter: IEventEmitter
  
  var liveStateEngine: js.Any
  
  var previewFullSize: IPreviewFullSize
  
  var previewThumbnail: IPreviewThumbnail
  
  var textMap: ITextMap
  
  var theme: IThemeService
  
  var tooltipService: ITooltipService
}
object LiveStateEngine {
  
  inline def apply(
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
  
  extension [Self <: LiveStateEngine](x: Self) {
    
    inline def setEngine(value: IPlaybackEngine): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
    
    inline def setEventEmitter(value: IEventEmitter): Self = StObject.set(x, "eventEmitter", value.asInstanceOf[js.Any])
    
    inline def setLiveStateEngine(value: js.Any): Self = StObject.set(x, "liveStateEngine", value.asInstanceOf[js.Any])
    
    inline def setPreviewFullSize(value: IPreviewFullSize): Self = StObject.set(x, "previewFullSize", value.asInstanceOf[js.Any])
    
    inline def setPreviewThumbnail(value: IPreviewThumbnail): Self = StObject.set(x, "previewThumbnail", value.asInstanceOf[js.Any])
    
    inline def setTextMap(value: ITextMap): Self = StObject.set(x, "textMap", value.asInstanceOf[js.Any])
    
    inline def setTheme(value: IThemeService): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setTooltipService(value: ITooltipService): Self = StObject.set(x, "tooltipService", value.asInstanceOf[js.Any])
  }
}
