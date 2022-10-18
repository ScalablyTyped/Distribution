package typings.next.anon

import typings.next.distServerRenderResultMod.ContentTypeOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentType extends StObject {
  
  var contentType: js.UndefOr[ContentTypeOption] = js.undefined
}
object ContentType {
  
  inline def apply(): ContentType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentType]
  }
  
  extension [Self <: ContentType](x: Self) {
    
    inline def setContentType(value: ContentTypeOption): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
  }
}
