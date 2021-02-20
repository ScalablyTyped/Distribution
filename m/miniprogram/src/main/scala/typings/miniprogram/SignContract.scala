package typings.miniprogram

import typings.miniprogram.anon.AuthState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignContract extends AsyncCallback[AuthState] {
  
  var signStr: String = js.native
}
object SignContract {
  
  @scala.inline
  def apply(signStr: String): SignContract = {
    val __obj = js.Dynamic.literal(signStr = signStr.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignContract]
  }
  
  @scala.inline
  implicit class SignContractMutableBuilder[Self <: SignContract] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSignStr(value: String): Self = StObject.set(x, "signStr", value.asInstanceOf[js.Any])
  }
}
