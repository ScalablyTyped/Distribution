package typings.playable.anon

import typings.playable.configMod.IPlayerConfig
import typings.playable.eventEmitterTypesMod.IEventEmitter
import typings.playable.playbackEngineTypesMod.IPlaybackEngine
import typings.playable.rootContainerTypesMod.IRootContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RootContainer extends StObject {
  
  var config: IPlayerConfig
  
  var engine: IPlaybackEngine
  
  var eventEmitter: IEventEmitter
  
  var rootContainer: IRootContainer
}
object RootContainer {
  
  @scala.inline
  def apply(
    config: IPlayerConfig,
    engine: IPlaybackEngine,
    eventEmitter: IEventEmitter,
    rootContainer: IRootContainer
  ): RootContainer = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], engine = engine.asInstanceOf[js.Any], eventEmitter = eventEmitter.asInstanceOf[js.Any], rootContainer = rootContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[RootContainer]
  }
  
  @scala.inline
  implicit class RootContainerMutableBuilder[Self <: RootContainer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: IPlayerConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngine(value: IPlaybackEngine): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventEmitter(value: IEventEmitter): Self = StObject.set(x, "eventEmitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootContainer(value: IRootContainer): Self = StObject.set(x, "rootContainer", value.asInstanceOf[js.Any])
  }
}
