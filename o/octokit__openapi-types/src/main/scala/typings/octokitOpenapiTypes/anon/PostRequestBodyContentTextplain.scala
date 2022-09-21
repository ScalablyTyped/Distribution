package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostRequestBodyContentTextplain extends StObject {
  
  /** You must send Markdown as plain text (using a `Content-Type` header of `text/plain` or `text/x-markdown`) to this endpoint, rather than using JSON format. In raw mode, [GitHub Flavored Markdown](https://github.github.com/gfm/) is not supported and Markdown will be rendered in plain format like a README.md file. Markdown content must be 400 KB or less. */
  var post: RequestBodyContentTextplain
}
object PostRequestBodyContentTextplain {
  
  inline def apply(post: RequestBodyContentTextplain): PostRequestBodyContentTextplain = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostRequestBodyContentTextplain]
  }
  
  extension [Self <: PostRequestBodyContentTextplain](x: Self) {
    
    inline def setPost(value: RequestBodyContentTextplain): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
