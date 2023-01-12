package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonBodytextCommitid extends StObject {
  
  var content: ApplicationjsonBodytextCommitid
}
object ContentApplicationjsonBodytextCommitid {
  
  inline def apply(content: ApplicationjsonBodytextCommitid): ContentApplicationjsonBodytextCommitid = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonBodytextCommitid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonBodytextCommitid] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonBodytextCommitid): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
