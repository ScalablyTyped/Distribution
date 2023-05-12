package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonArchivedColumnname extends StObject {
  
  var content: ApplicationjsonArchivedColumnname
}
object ContentApplicationjsonArchivedColumnname {
  
  inline def apply(content: ApplicationjsonArchivedColumnname): ContentApplicationjsonArchivedColumnname = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonArchivedColumnname]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonArchivedColumnname] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonArchivedColumnname): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
