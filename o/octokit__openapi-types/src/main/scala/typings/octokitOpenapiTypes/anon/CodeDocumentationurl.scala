package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeDocumentationurl extends StObject {
  
  var code: js.UndefOr[String] = js.undefined
  
  var documentation_url: js.UndefOr[String] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
}
object CodeDocumentationurl {
  
  inline def apply(): CodeDocumentationurl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeDocumentationurl]
  }
  
  extension [Self <: CodeDocumentationurl](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setDocumentation_url(value: String): Self = StObject.set(x, "documentation_url", value.asInstanceOf[js.Any])
    
    inline def setDocumentation_urlUndefined: Self = StObject.set(x, "documentation_url", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
