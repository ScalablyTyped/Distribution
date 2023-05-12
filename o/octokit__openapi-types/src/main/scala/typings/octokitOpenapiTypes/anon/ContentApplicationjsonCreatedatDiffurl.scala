package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonCreatedatDiffurl extends StObject {
  
  var content: ApplicationjsonCreatedatDiffurl
}
object ContentApplicationjsonCreatedatDiffurl {
  
  inline def apply(content: ApplicationjsonCreatedatDiffurl): ContentApplicationjsonCreatedatDiffurl = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonCreatedatDiffurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonCreatedatDiffurl] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonCreatedatDiffurl): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
