package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostResponses200ContentTexthtmlHeaders304 extends StObject {
  
  /** You must send Markdown as plain text (using a `Content-Type` header of `text/plain` or `text/x-markdown`) to this endpoint, rather than using JSON format. In raw mode, [GitHub Flavored Markdown](https://github.github.com/gfm/) is not supported and Markdown will be rendered in plain format like a README.md file. Markdown content must be 400 KB or less. */
  var post: Responses200ContentTexthtmlHeaders304
}
object PostResponses200ContentTexthtmlHeaders304 {
  
  inline def apply(post: Responses200ContentTexthtmlHeaders304): PostResponses200ContentTexthtmlHeaders304 = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostResponses200ContentTexthtmlHeaders304]
  }
  
  extension [Self <: PostResponses200ContentTexthtmlHeaders304](x: Self) {
    
    inline def setPost(value: Responses200ContentTexthtmlHeaders304): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
