package typings.openidClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientOptions extends StObject {
  
  var additionalAuthorizedParties: js.UndefOr[String | js.Array[String]] = js.native
}
object ClientOptions {
  
  @scala.inline
  def apply(): ClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientOptions]
  }
  
  @scala.inline
  implicit class ClientOptionsMutableBuilder[Self <: ClientOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalAuthorizedParties(value: String | js.Array[String]): Self = StObject.set(x, "additionalAuthorizedParties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalAuthorizedPartiesUndefined: Self = StObject.set(x, "additionalAuthorizedParties", js.undefined)
    
    @scala.inline
    def setAdditionalAuthorizedPartiesVarargs(value: String*): Self = StObject.set(x, "additionalAuthorizedParties", js.Array(value :_*))
  }
}
