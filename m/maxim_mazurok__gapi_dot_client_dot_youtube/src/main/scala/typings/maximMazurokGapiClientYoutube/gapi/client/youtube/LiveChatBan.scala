package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LiveChatBan extends StObject {
  
  /** Etag of this resource. */
  var etag: js.UndefOr[String] = js.undefined
  
  /** The ID that YouTube assigns to uniquely identify the ban. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string `"youtube#liveChatBan"`. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The `snippet` object contains basic details about the ban. */
  var snippet: js.UndefOr[LiveChatBanSnippet] = js.undefined
}
object LiveChatBan {
  
  @scala.inline
  def apply(): LiveChatBan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveChatBan]
  }
  
  @scala.inline
  implicit class LiveChatBanMutableBuilder[Self <: LiveChatBan] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setSnippet(value: LiveChatBanSnippet): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
  }
}
