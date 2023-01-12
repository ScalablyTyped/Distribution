package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonAltdomain extends StObject {
  
  var content: ApplicationjsonAltdomain
}
object ContentApplicationjsonAltdomain {
  
  inline def apply(content: ApplicationjsonAltdomain): ContentApplicationjsonAltdomain = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonAltdomain]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonAltdomain] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonAltdomain): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
