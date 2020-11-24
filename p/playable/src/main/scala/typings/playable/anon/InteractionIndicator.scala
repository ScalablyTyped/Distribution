package typings.playable.anon

import typings.playable.configMod.IPlayerConfig
import typings.playable.eventEmitterTypesMod.IEventEmitter
import typings.playable.fullScreenManagerTypesMod.IFullScreenManager
import typings.playable.interactionIndicatorTypesMod.IInteractionIndicator
import typings.playable.playbackEngineTypesMod.IPlaybackEngine
import typings.playable.rootContainerTypesMod.IRootContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InteractionIndicator extends js.Object {
  
  var config: IPlayerConfig = js.native
  
  var engine: IPlaybackEngine = js.native
  
  var eventEmitter: IEventEmitter = js.native
  
  var fullScreenManager: IFullScreenManager = js.native
  
  var interactionIndicator: IInteractionIndicator = js.native
  
  var rootContainer: IRootContainer = js.native
}
object InteractionIndicator {
  
  @scala.inline
  def apply(
    config: IPlayerConfig,
    engine: IPlaybackEngine,
    eventEmitter: IEventEmitter,
    fullScreenManager: IFullScreenManager,
    interactionIndicator: IInteractionIndicator,
    rootContainer: IRootContainer
  ): InteractionIndicator = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], engine = engine.asInstanceOf[js.Any], eventEmitter = eventEmitter.asInstanceOf[js.Any], fullScreenManager = fullScreenManager.asInstanceOf[js.Any], interactionIndicator = interactionIndicator.asInstanceOf[js.Any], rootContainer = rootContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractionIndicator]
  }
  
  @scala.inline
  implicit class InteractionIndicatorOps[Self <: InteractionIndicator] (val x: Self) extends AnyVal {
    
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
    def setConfig(value: IPlayerConfig): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngine(value: IPlaybackEngine): Self = this.set("engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventEmitter(value: IEventEmitter): Self = this.set("eventEmitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullScreenManager(value: IFullScreenManager): Self = this.set("fullScreenManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInteractionIndicator(value: IInteractionIndicator): Self = this.set("interactionIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootContainer(value: IRootContainer): Self = this.set("rootContainer", value.asInstanceOf[js.Any])
  }
}
