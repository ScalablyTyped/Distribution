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
  
  @scala.inline
  def apply(): DriveRecipient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DriveRecipient]
  }
  
  @scala.inline
  implicit class DriveRecipientMutableBuilder[Self <: DriveRecipient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlias(value: NullableOption[String]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasNull: Self = StObject.set(x, "alias", null)
    
    @scala.inline
    def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    @scala.inline
    def setEmail(value: NullableOption[String]): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailNull: Self = StObject.set(x, "email", null)
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setObjectId(value: NullableOption[String]): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdNull: Self = StObject.set(x, "objectId", null)
    
    @scala.inline
    def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
  }
}
