package typings.playable.anon

import typings.playable.eventEmitterTypesMod.IEventEmitter
import typings.playable.pictureInPictureTypesMod.IPictureInPicture
import typings.playable.textMapTypesMod.ITextMap
import typings.playable.themeTypesMod.IThemeService
import typings.playable.tooltipTypesMod.ITooltipService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PictureInPicture extends js.Object {
  
  var eventEmitter: IEventEmitter = js.native
  
  var pictureInPicture: IPictureInPicture = js.native
  
  var textMap: ITextMap = js.native
  
  var theme: IThemeService = js.native
  
  var tooltipService: ITooltipService = js.native
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
  implicit class PictureInPictureOps[Self <: PictureInPicture] (val x: Self) extends AnyVal {
    
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
    def setEventEmitter(value: IEventEmitter): Self = this.set("eventEmitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPictureInPicture(value: IPictureInPicture): Self = this.set("pictureInPicture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextMap(value: ITextMap): Self = this.set("textMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTheme(value: IThemeService): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipService(value: ITooltipService): Self = this.set("tooltipService", value.asInstanceOf[js.Any])
  }
}
