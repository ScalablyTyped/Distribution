package typings.playable.anon

import typings.playable.eventEmitterTypesMod.IEventEmitter
import typings.playable.playbackEngineTypesMod.IPlaybackEngine
import typings.playable.themeTypesMod.IThemeService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EngineEventEmitter extends StObject {
  
  var engine: IPlaybackEngine = js.native
  
  var eventEmitter: IEventEmitter = js.native
  
  var theme: IThemeService = js.native
}
object EngineEventEmitter {
  
  @scala.inline
  def apply(engine: IPlaybackEngine, eventEmitter: IEventEmitter, theme: IThemeService): EngineEventEmitter = {
    val __obj = js.Dynamic.literal(engine = engine.asInstanceOf[js.Any], eventEmitter = eventEmitter.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[EngineEventEmitter]
  }
  
  @scala.inline
  implicit class EngineEventEmitterMutableBuilder[Self <: EngineEventEmitter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEngine(value: IPlaybackEngine): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventEmitter(value: IEventEmitter): Self = StObject.set(x, "eventEmitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTheme(value: IThemeService): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}
