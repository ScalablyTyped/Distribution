package typings.microsoftGraph.mod.SecurityNamespace

import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoggedOnUser extends StObject {
  
  // User account name of the logged-on user.
  var accountName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // User account domain of the logged-on user.
  var domainName: js.UndefOr[NullableOption[String]] = js.undefined
}
object LoggedOnUser {
  
  inline def apply(): LoggedOnUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoggedOnUser]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoggedOnUser] (val x: Self) extends AnyVal {
    
    inline def setAccountName(value: NullableOption[String]): Self = StObject.set(x, "accountName", value.asInstanceOf[js.Any])
    
    inline def setAccountNameNull: Self = StObject.set(x, "accountName", null)
    
    inline def setAccountNameUndefined: Self = StObject.set(x, "accountName", js.undefined)
    
    inline def setDomainName(value: NullableOption[String]): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
    
    inline def setDomainNameNull: Self = StObject.set(x, "domainName", null)
    
    inline def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
  }
}
