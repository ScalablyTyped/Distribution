package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommentSnippetAuthorChannelId extends StObject {
  
  var value: js.UndefOr[String] = js.undefined
}
object CommentSnippetAuthorChannelId {
  
  @scala.inline
  def apply(): CommentSnippetAuthorChannelId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentSnippetAuthorChannelId]
  }
  
  @scala.inline
  implicit class CommentSnippetAuthorChannelIdMutableBuilder[Self <: CommentSnippetAuthorChannelId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
