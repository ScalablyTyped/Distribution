package typings.microsoftGraph.mod.ExternalConnectors

import typings.microsoftGraph.mod.Entity
import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line: interface-name
trait Identity
  extends StObject
     with Entity {
  
  /**
    * The type of identity. Possible values are: user or group for Azure AD identities and externalgroup for groups in an
    * external system.
    */
  var `type`: js.UndefOr[NullableOption[IdentityType]] = js.undefined
}
object Identity {
  
  inline def apply(): Identity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Identity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Identity] (val x: Self) extends AnyVal {
    
    inline def setType(value: NullableOption[IdentityType]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
