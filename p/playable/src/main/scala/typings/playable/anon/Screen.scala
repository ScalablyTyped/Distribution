package typings.playable.anon

import typings.playable.bottomBlockTypesMod.IBottomBlock
import typings.playable.configMod.IPlayerConfig
import typings.playable.eventEmitterTypesMod.IEventEmitter
import typings.playable.rootContainerTypesMod.IRootContainer
import typings.playable.screenTypesMod.IScreen
import typings.playable.tooltipTypesMod.ITooltipService
import typings.playable.topBlockTypesMod.ITopBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Screen extends StObject {
  
  var bottomBlock: IBottomBlock
  
  var config: IPlayerConfig
  
  var eventEmitter: IEventEmitter
  
  var rootContainer: IRootContainer
  
  var screen: IScreen
  
  var tooltipService: ITooltipService
  
  var topBlock: ITopBlock
}
object Screen {
  
  inline def apply(
    bottomBlock: IBottomBlock,
    config: IPlayerConfig,
    eventEmitter: IEventEmitter,
    rootContainer: IRootContainer,
    screen: IScreen,
    tooltipService: ITooltipService,
    topBlock: ITopBlock
  ): Screen = {
    val __obj = js.Dynamic.literal(bottomBlock = bottomBlock.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], eventEmitter = eventEmitter.asInstanceOf[js.Any], rootContainer = rootContainer.asInstanceOf[js.Any], screen = screen.asInstanceOf[js.Any], tooltipService = tooltipService.asInstanceOf[js.Any], topBlock = topBlock.asInstanceOf[js.Any])
    __obj.asInstanceOf[Screen]
  }
  
  extension [Self <: Screen](x: Self) {
    
    inline def setBottomBlock(value: IBottomBlock): Self = StObject.set(x, "bottomBlock", value.asInstanceOf[js.Any])
    
    inline def setConfig(value: IPlayerConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setEventEmitter(value: IEventEmitter): Self = StObject.set(x, "eventEmitter", value.asInstanceOf[js.Any])
    
    inline def setRootContainer(value: IRootContainer): Self = StObject.set(x, "rootContainer", value.asInstanceOf[js.Any])
    
    inline def setScreen(value: IScreen): Self = StObject.set(x, "screen", value.asInstanceOf[js.Any])
    
    inline def setTooltipService(value: ITooltipService): Self = StObject.set(x, "tooltipService", value.asInstanceOf[js.Any])
    
    inline def setTopBlock(value: ITopBlock): Self = StObject.set(x, "topBlock", value.asInstanceOf[js.Any])
  }
}
