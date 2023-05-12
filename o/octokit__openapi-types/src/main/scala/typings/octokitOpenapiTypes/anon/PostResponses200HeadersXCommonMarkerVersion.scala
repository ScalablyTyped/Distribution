package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostResponses200HeadersXCommonMarkerVersion extends StObject {
  
  /**
    * Render a Markdown document in raw mode
    * @description You must send Markdown as plain text (using a `Content-Type` header of `text/plain` or `text/x-markdown`) to this endpoint, rather than using JSON format. In raw mode, [GitHub Flavored Markdown](https://github.github.com/gfm/) is not supported and Markdown will be rendered in plain format like a README.md file. Markdown content must be 400 KB or less.
    */
  var post: Responses200HeadersXCommonMarkerVersion
}
object PostResponses200HeadersXCommonMarkerVersion {
  
  inline def apply(post: Responses200HeadersXCommonMarkerVersion): PostResponses200HeadersXCommonMarkerVersion = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostResponses200HeadersXCommonMarkerVersion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PostResponses200HeadersXCommonMarkerVersion] (val x: Self) extends AnyVal {
    
    inline def setPost(value: Responses200HeadersXCommonMarkerVersion): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
