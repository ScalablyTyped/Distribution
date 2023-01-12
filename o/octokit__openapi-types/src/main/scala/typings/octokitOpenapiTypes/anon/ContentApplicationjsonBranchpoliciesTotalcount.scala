package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonBranchpoliciesTotalcount extends StObject {
  
  var content: ApplicationjsonBranchpoliciesTotalcount
}
object ContentApplicationjsonBranchpoliciesTotalcount {
  
  inline def apply(content: ApplicationjsonBranchpoliciesTotalcount): ContentApplicationjsonBranchpoliciesTotalcount = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonBranchpoliciesTotalcount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonBranchpoliciesTotalcount] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonBranchpoliciesTotalcount): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
