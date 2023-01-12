package typings.mparticleWebSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentityApiData extends StObject {
  
  var userIdentities: UserIdentities
}
object IdentityApiData {
  
  inline def apply(userIdentities: UserIdentities): IdentityApiData = {
    val __obj = js.Dynamic.literal(userIdentities = userIdentities.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityApiData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IdentityApiData] (val x: Self) extends AnyVal {
    
    inline def setUserIdentities(value: UserIdentities): Self = StObject.set(x, "userIdentities", value.asInstanceOf[js.Any])
  }
}
