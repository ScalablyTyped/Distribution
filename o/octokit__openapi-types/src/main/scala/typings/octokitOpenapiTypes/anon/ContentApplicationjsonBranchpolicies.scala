package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonBranchpolicies extends StObject {
  
  var content: ApplicationjsonBranchpolicies
}
object ContentApplicationjsonBranchpolicies {
  
  inline def apply(content: ApplicationjsonBranchpolicies): ContentApplicationjsonBranchpolicies = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonBranchpolicies]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonBranchpolicies] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonBranchpolicies): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
