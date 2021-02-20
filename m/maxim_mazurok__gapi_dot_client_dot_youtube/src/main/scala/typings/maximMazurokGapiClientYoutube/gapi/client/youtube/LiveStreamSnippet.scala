package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiveStreamSnippet extends StObject {
  
  /** The ID that YouTube uses to uniquely identify the channel that is transmitting the stream. */
  var channelId: js.UndefOr[String] = js.native
  
  /** The stream's description. The value cannot be longer than 10000 characters. */
  var description: js.UndefOr[String] = js.native
  
  var isDefaultStream: js.UndefOr[Boolean] = js.native
  
  /** The date and time that the stream was created. The value is specified in ISO 8601 format. */
  var publishedAt: js.UndefOr[String] = js.native
  
  /** The stream's title. The value must be between 1 and 128 characters long. */
  var title: js.UndefOr[String] = js.native
}
object LiveStreamSnippet {
  
  @scala.inline
  def apply(): LiveStreamSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveStreamSnippet]
  }
  
  @scala.inline
  implicit class LiveStreamSnippetMutableBuilder[Self <: LiveStreamSnippet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setIsDefaultStream(value: Boolean): Self = StObject.set(x, "isDefaultStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDefaultStreamUndefined: Self = StObject.set(x, "isDefaultStream", js.undefined)
    
    @scala.inline
    def setPublishedAt(value: String): Self = StObject.set(x, "publishedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishedAtUndefined: Self = StObject.set(x, "publishedAt", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
