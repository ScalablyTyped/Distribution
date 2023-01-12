package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DriveRecipient extends StObject {
  
  // The alias of the domain object, for cases where an email address is unavailable (e.g. security groups).
  var alias: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The email address for the recipient, if the recipient has an associated email address.
  var email: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The unique identifier for the recipient in the directory.
  var objectId: js.UndefOr[NullableOption[String]] = js.undefined
}
object DriveRecipient {
  
  inline def apply(): DriveRecipient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DriveRecipient]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DriveRecipient] (val x: Self) extends AnyVal {
    
    inline def setAlias(value: NullableOption[String]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setAliasNull: Self = StObject.set(x, "alias", null)
    
    inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    inline def setEmail(value: NullableOption[String]): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setObjectId(value: NullableOption[String]): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdNull: Self = StObject.set(x, "objectId", null)
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
  }
}
