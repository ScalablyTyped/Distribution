package typings.miniprogram

import typings.miniprogram.anon.AuthCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignContractArgs
  extends StObject
     with AsyncCallback[AuthCode] {
  
  var signStr: String
}
object SignContractArgs {
  
  inline def apply(signStr: String): SignContractArgs = {
    val __obj = js.Dynamic.literal(signStr = signStr.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignContractArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SignContractArgs] (val x: Self) extends AnyVal {
    
    inline def setSignStr(value: String): Self = StObject.set(x, "signStr", value.asInstanceOf[js.Any])
  }
}
