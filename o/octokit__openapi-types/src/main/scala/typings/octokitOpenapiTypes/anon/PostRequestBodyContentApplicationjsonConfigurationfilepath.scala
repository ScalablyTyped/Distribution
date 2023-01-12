package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostRequestBodyContentApplicationjsonConfigurationfilepath extends StObject {
  
  /** Generate a name and body describing a [release](https://docs.github.com/rest/reference/repos#releases). The body content will be markdown formatted and contain information like the changes since last release and users who contributed. The generated release notes are not saved anywhere. They are intended to be generated and used when creating a new release. */
  var post: RequestBodyContentApplicationjsonConfigurationfilepath
}
object PostRequestBodyContentApplicationjsonConfigurationfilepath {
  
  inline def apply(post: RequestBodyContentApplicationjsonConfigurationfilepath): PostRequestBodyContentApplicationjsonConfigurationfilepath = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostRequestBodyContentApplicationjsonConfigurationfilepath]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PostRequestBodyContentApplicationjsonConfigurationfilepath] (val x: Self) extends AnyVal {
    
    inline def setPost(value: RequestBodyContentApplicationjsonConfigurationfilepath): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
