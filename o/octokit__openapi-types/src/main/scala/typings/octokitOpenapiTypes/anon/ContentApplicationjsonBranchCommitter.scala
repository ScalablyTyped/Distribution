package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonBranchCommitter extends StObject {
  
  var content: ApplicationjsonBranchCommitter
}
object ContentApplicationjsonBranchCommitter {
  
  inline def apply(content: ApplicationjsonBranchCommitter): ContentApplicationjsonBranchCommitter = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonBranchCommitter]
  }
  
  extension [Self <: ContentApplicationjsonBranchCommitter](x: Self) {
    
    inline def setContent(value: ApplicationjsonBranchCommitter): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
