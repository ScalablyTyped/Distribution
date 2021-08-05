package typings.miniprogram

import typings.miniprogram.anon.AuthState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignContract
  extends StObject
     with AsyncCallback[AuthState] {
  
  var signStr: String
}
object SignContract {
  
  inline def apply(signStr: String): SignContract = {
    val __obj = js.Dynamic.literal(signStr = signStr.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignContract]
  }
  
  extension [Self <: SignContract](x: Self) {
    
    inline def setSignStr(value: String): Self = StObject.set(x, "signStr", value.asInstanceOf[js.Any])
  }
}
