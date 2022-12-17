package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonCommitid extends StObject {
  
  var content: ApplicationjsonCommitid
}
object ContentApplicationjsonCommitid {
  
  inline def apply(content: ApplicationjsonCommitid): ContentApplicationjsonCommitid = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonCommitid]
  }
  
  extension [Self <: ContentApplicationjsonCommitid](x: Self) {
    
    inline def setContent(value: ApplicationjsonCommitid): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
