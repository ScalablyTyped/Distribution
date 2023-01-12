package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Diagnostic extends StObject {
  
  var message: js.UndefOr[NullableOption[String]] = js.undefined
  
  var url: js.UndefOr[NullableOption[String]] = js.undefined
}
object Diagnostic {
  
  inline def apply(): Diagnostic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Diagnostic]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Diagnostic] (val x: Self) extends AnyVal {
    
    inline def setMessage(value: NullableOption[String]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageNull: Self = StObject.set(x, "message", null)
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setUrl(value: NullableOption[String]): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
