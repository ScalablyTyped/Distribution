package typings.microsoftGraph.mod.SecurityNamespace

import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MailboxEvidence
  extends StObject
     with AlertEvidence {
  
  // The name associated with the mailbox.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The primary email address of the mailbox.
  var primaryAddress: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The user account of the mailbox.
  var userAccount: js.UndefOr[NullableOption[UserAccount]] = js.undefined
}
object MailboxEvidence {
  
  inline def apply(): MailboxEvidence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MailboxEvidence]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MailboxEvidence] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setPrimaryAddress(value: NullableOption[String]): Self = StObject.set(x, "primaryAddress", value.asInstanceOf[js.Any])
    
    inline def setPrimaryAddressNull: Self = StObject.set(x, "primaryAddress", null)
    
    inline def setPrimaryAddressUndefined: Self = StObject.set(x, "primaryAddress", js.undefined)
    
    inline def setUserAccount(value: NullableOption[UserAccount]): Self = StObject.set(x, "userAccount", value.asInstanceOf[js.Any])
    
    inline def setUserAccountNull: Self = StObject.set(x, "userAccount", null)
    
    inline def setUserAccountUndefined: Self = StObject.set(x, "userAccount", js.undefined)
  }
}
