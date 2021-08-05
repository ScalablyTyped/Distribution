package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommentSnippetAuthorChannelId extends StObject {
  
  var value: js.UndefOr[String] = js.undefined
}
object CommentSnippetAuthorChannelId {
  
  inline def apply(): CommentSnippetAuthorChannelId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentSnippetAuthorChannelId]
  }
  
  extension [Self <: CommentSnippetAuthorChannelId](x: Self) {
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
