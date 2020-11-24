package typings.playable.anon

import typings.playable.bottomBlockTypesMod.IBottomBlock
import typings.playable.configMod.IPlayerConfig
import typings.playable.eventEmitterTypesMod.IEventEmitter
import typings.playable.rootContainerTypesMod.IRootContainer
import typings.playable.screenTypesMod.IScreen
import typings.playable.tooltipTypesMod.ITooltipService
import typings.playable.topBlockTypesMod.ITopBlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Screen extends js.Object {
  
  var bottomBlock: IBottomBlock = js.native
  
  var config: IPlayerConfig = js.native
  
  var eventEmitter: IEventEmitter = js.native
  
  var rootContainer: IRootContainer = js.native
  
  var screen: IScreen = js.native
  
  var tooltipService: ITooltipService = js.native
  
  var topBlock: ITopBlock = js.native
}
object Screen {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class ScreenOps[Self <: Screen] (val x: Self) extends AnyVal {
    
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
    def setBottomBlock(value: IBottomBlock): Self = this.set("bottomBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfig(value: IPlayerConfig): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventEmitter(value: IEventEmitter): Self = this.set("eventEmitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootContainer(value: IRootContainer): Self = this.set("rootContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreen(value: IScreen): Self = this.set("screen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipService(value: ITooltipService): Self = this.set("tooltipService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopBlock(value: ITopBlock): Self = this.set("topBlock", value.asInstanceOf[js.Any])
  }
}
