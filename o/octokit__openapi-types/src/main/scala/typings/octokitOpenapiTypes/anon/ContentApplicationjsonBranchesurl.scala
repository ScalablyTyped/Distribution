package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonBranchesurl extends StObject {
  
  var content: ApplicationjsonBranchesurl
}
object ContentApplicationjsonBranchesurl {
  
  inline def apply(content: ApplicationjsonBranchesurl): ContentApplicationjsonBranchesurl = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonBranchesurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonBranchesurl] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonBranchesurl): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
