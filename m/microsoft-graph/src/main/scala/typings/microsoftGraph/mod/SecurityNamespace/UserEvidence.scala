package typings.microsoftGraph.mod.SecurityNamespace

import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserEvidence
  extends StObject
     with AlertEvidence {
  
  // The user account details.
  var userAccount: js.UndefOr[NullableOption[UserAccount]] = js.undefined
}
object UserEvidence {
  
  inline def apply(): UserEvidence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserEvidence]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UserEvidence] (val x: Self) extends AnyVal {
    
    inline def setUserAccount(value: NullableOption[UserAccount]): Self = StObject.set(x, "userAccount", value.asInstanceOf[js.Any])
    
    inline def setUserAccountNull: Self = StObject.set(x, "userAccount", null)
    
    inline def setUserAccountUndefined: Self = StObject.set(x, "userAccount", js.undefined)
  }
}
