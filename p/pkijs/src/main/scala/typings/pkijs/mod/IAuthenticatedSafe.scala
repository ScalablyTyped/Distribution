package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAuthenticatedSafe extends StObject {
  
  var parsedValue: Any
  
  var safeContents: js.Array[ContentInfo]
}
object IAuthenticatedSafe {
  
  inline def apply(parsedValue: Any, safeContents: js.Array[ContentInfo]): IAuthenticatedSafe = {
    val __obj = js.Dynamic.literal(parsedValue = parsedValue.asInstanceOf[js.Any], safeContents = safeContents.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAuthenticatedSafe]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IAuthenticatedSafe] (val x: Self) extends AnyVal {
    
    inline def setParsedValue(value: Any): Self = StObject.set(x, "parsedValue", value.asInstanceOf[js.Any])
    
    inline def setSafeContents(value: js.Array[ContentInfo]): Self = StObject.set(x, "safeContents", value.asInstanceOf[js.Any])
    
    inline def setSafeContentsVarargs(value: ContentInfo*): Self = StObject.set(x, "safeContents", js.Array(value*))
  }
}
