package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonAutotriggerchecks extends StObject {
  
  var content: ApplicationjsonAutotriggerchecks
}
object ContentApplicationjsonAutotriggerchecks {
  
  inline def apply(content: ApplicationjsonAutotriggerchecks): ContentApplicationjsonAutotriggerchecks = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonAutotriggerchecks]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonAutotriggerchecks] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonAutotriggerchecks): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
