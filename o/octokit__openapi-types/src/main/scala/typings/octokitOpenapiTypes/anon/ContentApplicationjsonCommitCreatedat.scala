package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonCommitCreatedat extends StObject {
  
  var content: ApplicationjsonCommitCreatedat
}
object ContentApplicationjsonCommitCreatedat {
  
  inline def apply(content: ApplicationjsonCommitCreatedat): ContentApplicationjsonCommitCreatedat = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonCommitCreatedat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonCommitCreatedat] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonCommitCreatedat): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
