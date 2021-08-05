package typings.playable.anon

import typings.playable.bottomBlockTypesMod.IBottomBlock
import typings.playable.eventEmitterTypesMod.IEventEmitter
import typings.playable.playbackEngineTypesMod.IPlaybackEngine
import typings.playable.rootContainerTypesMod.IRootContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BottomBlockEngine extends StObject {
  
  var bottomBlock: IBottomBlock
  
  var engine: IPlaybackEngine
  
  var eventEmitter: IEventEmitter
  
  var rootContainer: IRootContainer
}
object BottomBlockEngine {
  
  inline def apply(
    bottomBlock: IBottomBlock,
    engine: IPlaybackEngine,
    eventEmitter: IEventEmitter,
    rootContainer: IRootContainer
  ): BottomBlockEngine = {
    val __obj = js.Dynamic.literal(bottomBlock = bottomBlock.asInstanceOf[js.Any], engine = engine.asInstanceOf[js.Any], eventEmitter = eventEmitter.asInstanceOf[js.Any], rootContainer = rootContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[BottomBlockEngine]
  }
  
  extension [Self <: BottomBlockEngine](x: Self) {
    
    inline def setBottomBlock(value: IBottomBlock): Self = StObject.set(x, "bottomBlock", value.asInstanceOf[js.Any])
    
    inline def setEngine(value: IPlaybackEngine): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
    
    inline def setEventEmitter(value: IEventEmitter): Self = StObject.set(x, "eventEmitter", value.asInstanceOf[js.Any])
    
    inline def setRootContainer(value: IRootContainer): Self = StObject.set(x, "rootContainer", value.asInstanceOf[js.Any])
  }
}
