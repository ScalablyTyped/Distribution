package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SoftwareOathAuthenticationMethod
  extends StObject
     with Entity {
  
  // The secret key of the method. Always returns null.
  var secretKey: js.UndefOr[NullableOption[String]] = js.undefined
}
object SoftwareOathAuthenticationMethod {
  
  inline def apply(): SoftwareOathAuthenticationMethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SoftwareOathAuthenticationMethod]
  }
  
  extension [Self <: SoftwareOathAuthenticationMethod](x: Self) {
    
    inline def setSecretKey(value: NullableOption[String]): Self = StObject.set(x, "secretKey", value.asInstanceOf[js.Any])
    
    inline def setSecretKeyNull: Self = StObject.set(x, "secretKey", null)
    
    inline def setSecretKeyUndefined: Self = StObject.set(x, "secretKey", js.undefined)
  }
}
