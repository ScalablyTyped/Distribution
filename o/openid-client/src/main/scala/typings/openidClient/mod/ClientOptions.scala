package typings.openidClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientOptions extends StObject {
  
  var additionalAuthorizedParties: js.UndefOr[String | js.Array[String]] = js.undefined
}
object ClientOptions {
  
  inline def apply(): ClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClientOptions] (val x: Self) extends AnyVal {
    
    inline def setAdditionalAuthorizedParties(value: String | js.Array[String]): Self = StObject.set(x, "additionalAuthorizedParties", value.asInstanceOf[js.Any])
    
    inline def setAdditionalAuthorizedPartiesUndefined: Self = StObject.set(x, "additionalAuthorizedParties", js.undefined)
    
    inline def setAdditionalAuthorizedPartiesVarargs(value: String*): Self = StObject.set(x, "additionalAuthorizedParties", js.Array(value*))
  }
}
