package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PasswordAuthenticationMethod
  extends StObject
     with Entity {
  
  /**
    * The date and time when this password was last updated. This property is currently not populated. Read-only. The
    * Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example,
    * midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
    */
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // For security, the password is always returned as null from a LIST or GET operation.
  var password: js.UndefOr[NullableOption[String]] = js.undefined
}
object PasswordAuthenticationMethod {
  
  inline def apply(): PasswordAuthenticationMethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PasswordAuthenticationMethod]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PasswordAuthenticationMethod] (val x: Self) extends AnyVal {
    
    inline def setCreatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeNull: Self = StObject.set(x, "createdDateTime", null)
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setPassword(value: NullableOption[String]): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordNull: Self = StObject.set(x, "password", null)
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
  }
}
