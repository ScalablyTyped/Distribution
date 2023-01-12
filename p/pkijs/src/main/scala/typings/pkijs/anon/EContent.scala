package typings.pkijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EContent extends StObject {
  
  var eContent: js.UndefOr[String] = js.undefined
  
  var eContentType: js.UndefOr[String] = js.undefined
}
object EContent {
  
  inline def apply(): EContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EContent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EContent] (val x: Self) extends AnyVal {
    
    inline def setEContent(value: String): Self = StObject.set(x, "eContent", value.asInstanceOf[js.Any])
    
    inline def setEContentType(value: String): Self = StObject.set(x, "eContentType", value.asInstanceOf[js.Any])
    
    inline def setEContentTypeUndefined: Self = StObject.set(x, "eContentType", js.undefined)
    
    inline def setEContentUndefined: Self = StObject.set(x, "eContent", js.undefined)
  }
}
