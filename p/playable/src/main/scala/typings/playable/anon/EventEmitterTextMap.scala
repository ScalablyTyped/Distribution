package typings.playable.anon

import typings.playable.distSrcModulesEventEmitterTypesMod.IEventEmitter
import typings.playable.distSrcModulesPlaybackEngineTypesMod.IPlaybackEngine
import typings.playable.distSrcModulesTextMapTypesMod.ITextMap
import typings.playable.distSrcModulesUiCoreTooltipTypesMod.ITooltipService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventEmitterTextMap extends StObject {
  
  var engine: IPlaybackEngine
  
  var eventEmitter: IEventEmitter
  
  var textMap: ITextMap
  
  var tooltipService: ITooltipService
}
object EventEmitterTextMap {
  
  inline def apply(
    engine: IPlaybackEngine,
    eventEmitter: IEventEmitter,
    textMap: ITextMap,
    tooltipService: ITooltipService
  ): EventEmitterTextMap = {
    val __obj = js.Dynamic.literal(engine = engine.asInstanceOf[js.Any], eventEmitter = eventEmitter.asInstanceOf[js.Any], textMap = textMap.asInstanceOf[js.Any], tooltipService = tooltipService.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventEmitterTextMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventEmitterTextMap] (val x: Self) extends AnyVal {
    
    inline def setEngine(value: IPlaybackEngine): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
    
    inline def setEventEmitter(value: IEventEmitter): Self = StObject.set(x, "eventEmitter", value.asInstanceOf[js.Any])
    
    inline def setTextMap(value: ITextMap): Self = StObject.set(x, "textMap", value.asInstanceOf[js.Any])
    
    inline def setTooltipService(value: ITooltipService): Self = StObject.set(x, "tooltipService", value.asInstanceOf[js.Any])
  }
}
