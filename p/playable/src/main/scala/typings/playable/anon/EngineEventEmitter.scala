package typings.playable.anon

import typings.playable.distSrcModulesEventEmitterTypesMod.IEventEmitter
import typings.playable.distSrcModulesPlaybackEngineTypesMod.IPlaybackEngine
import typings.playable.distSrcModulesUiCoreThemeTypesMod.IThemeService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EngineEventEmitter extends StObject {
  
  var engine: IPlaybackEngine
  
  var eventEmitter: IEventEmitter
  
  var theme: IThemeService
}
object EngineEventEmitter {
  
  inline def apply(engine: IPlaybackEngine, eventEmitter: IEventEmitter, theme: IThemeService): EngineEventEmitter = {
    val __obj = js.Dynamic.literal(engine = engine.asInstanceOf[js.Any], eventEmitter = eventEmitter.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[EngineEventEmitter]
  }
  
  extension [Self <: EngineEventEmitter](x: Self) {
    
    inline def setEngine(value: IPlaybackEngine): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
    
    inline def setEventEmitter(value: IEventEmitter): Self = StObject.set(x, "eventEmitter", value.asInstanceOf[js.Any])
    
    inline def setTheme(value: IThemeService): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}
