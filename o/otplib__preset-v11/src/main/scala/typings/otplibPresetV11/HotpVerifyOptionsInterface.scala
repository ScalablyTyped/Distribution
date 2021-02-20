package typings.otplibPresetV11

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HotpVerifyOptionsInterface extends StObject {
  
  var counter: js.UndefOr[Double] = js.native
  
  var secret: js.UndefOr[String] = js.native
  
  var token: js.UndefOr[String] = js.native
}
object HotpVerifyOptionsInterface {
  
  @scala.inline
  def apply(): HotpVerifyOptionsInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HotpVerifyOptionsInterface]
  }
  
  @scala.inline
  implicit class HotpVerifyOptionsInterfaceMutableBuilder[Self <: HotpVerifyOptionsInterface] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCounter(value: Double): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCounterUndefined: Self = StObject.set(x, "counter", js.undefined)
    
    @scala.inline
    def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
    
    @scala.inline
    def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}
