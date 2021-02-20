package typings.nodeTelegramBotApi.mod

import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.article
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InlineQueryResultArticle
  extends InlineQueryResultBase
     with InlineQueryResult {
  
  var description: js.UndefOr[String] = js.native
  
  var hide_url: js.UndefOr[Boolean] = js.native
  
  var input_message_content: InputMessageContent = js.native
  
  var thumb_height: js.UndefOr[Double] = js.native
  
  var thumb_url: js.UndefOr[String] = js.native
  
  var thumb_width: js.UndefOr[Double] = js.native
  
  var title: String = js.native
  
  var `type`: article = js.native
  
  var url: js.UndefOr[String] = js.native
}
object InlineQueryResultArticle {
  
  @scala.inline
  def apply(id: String, input_message_content: InputMessageContent, title: String, `type`: article): InlineQueryResultArticle = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], input_message_content = input_message_content.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineQueryResultArticle]
  }
  
  @scala.inline
  implicit class InlineQueryResultArticleMutableBuilder[Self <: InlineQueryResultArticle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setHide_url(value: Boolean): Self = StObject.set(x, "hide_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHide_urlUndefined: Self = StObject.set(x, "hide_url", js.undefined)
    
    @scala.inline
    def setInput_message_content(value: InputMessageContent): Self = StObject.set(x, "input_message_content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumb_height(value: Double): Self = StObject.set(x, "thumb_height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumb_heightUndefined: Self = StObject.set(x, "thumb_height", js.undefined)
    
    @scala.inline
    def setThumb_url(value: String): Self = StObject.set(x, "thumb_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumb_urlUndefined: Self = StObject.set(x, "thumb_url", js.undefined)
    
    @scala.inline
    def setThumb_width(value: Double): Self = StObject.set(x, "thumb_width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumb_widthUndefined: Self = StObject.set(x, "thumb_width", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: article): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
