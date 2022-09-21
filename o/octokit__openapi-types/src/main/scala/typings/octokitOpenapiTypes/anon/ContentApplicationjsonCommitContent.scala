package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonCommitContent extends StObject {
  
  var content: ApplicationjsonCommitContent
}
object ContentApplicationjsonCommitContent {
  
  inline def apply(content: ApplicationjsonCommitContent): ContentApplicationjsonCommitContent = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonCommitContent]
  }
  
  extension [Self <: ContentApplicationjsonCommitContent](x: Self) {
    
    inline def setContent(value: ApplicationjsonCommitContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
