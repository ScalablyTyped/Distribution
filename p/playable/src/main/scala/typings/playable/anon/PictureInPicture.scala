package typings.playable.anon

import typings.playable.eventEmitterTypesMod.IEventEmitter
import typings.playable.pictureInPictureTypesMod.IPictureInPicture
import typings.playable.textMapTypesMod.ITextMap
import typings.playable.themeTypesMod.IThemeService
import typings.playable.tooltipTypesMod.ITooltipService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PictureInPicture extends StObject {
  
  var eventEmitter: IEventEmitter
  
  var pictureInPicture: IPictureInPicture
  
  var textMap: ITextMap
  
  var theme: IThemeService
  
  var tooltipService: ITooltipService
}
object PictureInPicture {
  
  @scala.inline
  def apply(
    eventEmitter: IEventEmitter,
    pictureInPicture: IPictureInPicture,
    textMap: ITextMap,
    theme: IThemeService,
    tooltipService: ITooltipService
  ): PictureInPicture = {
    val __obj = js.Dynamic.literal(eventEmitter = eventEmitter.asInstanceOf[js.Any], pictureInPicture = pictureInPicture.asInstanceOf[js.Any], textMap = textMap.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], tooltipService = tooltipService.asInstanceOf[js.Any])
    __obj.asInstanceOf[PictureInPicture]
  }
  
  @scala.inline
  implicit class PictureInPictureMutableBuilder[Self <: PictureInPicture] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventEmitter(value: IEventEmitter): Self = StObject.set(x, "eventEmitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPictureInPicture(value: IPictureInPicture): Self = StObject.set(x, "pictureInPicture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextMap(value: ITextMap): Self = StObject.set(x, "textMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTheme(value: IThemeService): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipService(value: ITooltipService): Self = StObject.set(x, "tooltipService", value.asInstanceOf[js.Any])
  }
}
