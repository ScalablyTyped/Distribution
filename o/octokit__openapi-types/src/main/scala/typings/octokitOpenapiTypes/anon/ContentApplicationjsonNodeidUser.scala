package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonNodeidUser extends StObject {
  
  var content: ApplicationjsonNodeidUser
}
object ContentApplicationjsonNodeidUser {
  
  inline def apply(content: ApplicationjsonNodeidUser): ContentApplicationjsonNodeidUser = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonNodeidUser]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonNodeidUser] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonNodeidUser): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
