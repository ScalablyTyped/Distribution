package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Shared extends StObject {
  
  // The identity of the owner of the shared item. Read-only.
  var owner: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
  
  // Indicates the scope of how the item is shared: anonymous, organization, or users. Read-only.
  var scope: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The identity of the user who shared the item. Read-only.
  var sharedBy: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
  
  // The UTC date and time when the item was shared. Read-only.
  var sharedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
}
object Shared {
  
  inline def apply(): Shared = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Shared]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Shared] (val x: Self) extends AnyVal {
    
    inline def setOwner(value: NullableOption[IdentitySet]): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerNull: Self = StObject.set(x, "owner", null)
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setScope(value: NullableOption[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeNull: Self = StObject.set(x, "scope", null)
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setSharedBy(value: NullableOption[IdentitySet]): Self = StObject.set(x, "sharedBy", value.asInstanceOf[js.Any])
    
    inline def setSharedByNull: Self = StObject.set(x, "sharedBy", null)
    
    inline def setSharedByUndefined: Self = StObject.set(x, "sharedBy", js.undefined)
    
    inline def setSharedDateTime(value: NullableOption[String]): Self = StObject.set(x, "sharedDateTime", value.asInstanceOf[js.Any])
    
    inline def setSharedDateTimeNull: Self = StObject.set(x, "sharedDateTime", null)
    
    inline def setSharedDateTimeUndefined: Self = StObject.set(x, "sharedDateTime", js.undefined)
  }
}
