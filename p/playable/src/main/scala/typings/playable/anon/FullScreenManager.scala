package typings.playable.anon

import typings.playable.eventEmitterTypesMod.IEventEmitter
import typings.playable.fullScreenManagerTypesMod.IFullScreenManager
import typings.playable.textMapTypesMod.ITextMap
import typings.playable.themeTypesMod.IThemeService
import typings.playable.tooltipTypesMod.ITooltipService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FullScreenManager extends StObject {
  
  var eventEmitter: IEventEmitter = js.native
  
  var fullScreenManager: IFullScreenManager = js.native
  
  var textMap: ITextMap = js.native
  
  var theme: IThemeService = js.native
  
  var tooltipService: ITooltipService = js.native
}
object FullScreenManager {
  
  @scala.inline
  def apply(
    eventEmitter: IEventEmitter,
    fullScreenManager: IFullScreenManager,
    textMap: ITextMap,
    theme: IThemeService,
    tooltipService: ITooltipService
  ): FullScreenManager = {
    val __obj = js.Dynamic.literal(eventEmitter = eventEmitter.asInstanceOf[js.Any], fullScreenManager = fullScreenManager.asInstanceOf[js.Any], textMap = textMap.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], tooltipService = tooltipService.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullScreenManager]
  }
  
  @scala.inline
  implicit class FullScreenManagerMutableBuilder[Self <: FullScreenManager] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventEmitter(value: IEventEmitter): Self = StObject.set(x, "eventEmitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullScreenManager(value: IFullScreenManager): Self = StObject.set(x, "fullScreenManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextMap(value: ITextMap): Self = StObject.set(x, "textMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTheme(value: IThemeService): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipService(value: ITooltipService): Self = StObject.set(x, "tooltipService", value.asInstanceOf[js.Any])
  }
}
