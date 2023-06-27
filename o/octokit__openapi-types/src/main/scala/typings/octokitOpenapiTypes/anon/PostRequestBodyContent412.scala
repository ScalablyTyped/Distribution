package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostRequestBodyContent412 extends StObject {
  
  /**
    * Privately report a security vulnerability
    * @description Report a security vulnerability to the maintainers of the repository.
    * See "[Privately reporting a security vulnerability](https://docs.github.com/code-security/security-advisories/guidance-on-reporting-and-writing/privately-reporting-a-security-vulnerability)" for more information about private vulnerability reporting.
    */
  var post: RequestBodyContent412
}
object PostRequestBodyContent412 {
  
  inline def apply(post: RequestBodyContent412): PostRequestBodyContent412 = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostRequestBodyContent412]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PostRequestBodyContent412] (val x: Self) extends AnyVal {
    
    inline def setPost(value: RequestBodyContent412): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
