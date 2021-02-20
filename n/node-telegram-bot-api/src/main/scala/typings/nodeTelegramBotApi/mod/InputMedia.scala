package typings.nodeTelegramBotApi.mod

import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.photo
import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.nodeTelegramBotApi.mod.InputMediaPhoto
  - typings.nodeTelegramBotApi.mod.InputMediaVideo
*/
trait InputMedia extends StObject
object InputMedia {
  
  @scala.inline
  def InputMediaPhoto(media: String, `type`: photo): typings.nodeTelegramBotApi.mod.InputMediaPhoto = {
    val __obj = js.Dynamic.literal(media = media.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.nodeTelegramBotApi.mod.InputMediaPhoto]
  }
  
  @scala.inline
  def InputMediaVideo(media: String, `type`: video): typings.nodeTelegramBotApi.mod.InputMediaVideo = {
    val __obj = js.Dynamic.literal(media = media.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.nodeTelegramBotApi.mod.InputMediaVideo]
  }
}
