package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContenttypeUrl extends StObject {
  
  var content_type: String = js.native
  
  var url: String = js.native
}
object ContenttypeUrl {
  
  @scala.inline
  def apply(content_type: String, url: String): ContenttypeUrl = {
    val __obj = js.Dynamic.literal(content_type = content_type.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContenttypeUrl]
  }
  
  @scala.inline
  implicit class ContenttypeUrlMutableBuilder[Self <: ContenttypeUrl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent_type(value: String): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
