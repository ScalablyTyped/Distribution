package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonCommitter extends StObject {
  
  var content: ApplicationjsonCommitter
}
object ContentApplicationjsonCommitter {
  
  inline def apply(content: ApplicationjsonCommitter): ContentApplicationjsonCommitter = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonCommitter]
  }
  
  extension [Self <: ContentApplicationjsonCommitter](x: Self) {
    
    inline def setContent(value: ApplicationjsonCommitter): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
