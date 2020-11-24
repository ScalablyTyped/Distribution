package typings.nodeTelegramBotApi.mod

import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.photo
import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.video
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.nodeTelegramBotApi.mod.InputMediaPhoto
  - typings.nodeTelegramBotApi.mod.InputMediaVideo
*/
trait InputMedia extends js.Object
object InputMedia {
  
  @scala.inline
  def InputMediaPhoto(media: String, `type`: photo): InputMedia = {
    val __obj = js.Dynamic.literal(media = media.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputMedia]
  }
  
  @scala.inline
  def InputMediaVideo(media: String, `type`: video): InputMedia = {
    val __obj = js.Dynamic.literal(media = media.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputMedia]
  }
}
