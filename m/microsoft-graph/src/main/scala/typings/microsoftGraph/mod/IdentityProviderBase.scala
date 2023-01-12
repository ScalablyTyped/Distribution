package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentityProviderBase
  extends StObject
     with Entity {
  
  // The display name of the identity provider.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
}
object IdentityProviderBase {
  
  inline def apply(): IdentityProviderBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityProviderBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IdentityProviderBase] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
  }
}
