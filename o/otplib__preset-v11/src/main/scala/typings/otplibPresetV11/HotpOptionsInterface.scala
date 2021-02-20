package typings.otplibPresetV11

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HotpOptionsInterface extends HmacOptions {
  
  var createHmacSecret: js.UndefOr[typings.otplibPresetV11.createHmacSecret] = js.native
  
  var crypto: js.UndefOr[js.Any] = js.native
  
  var digits: js.UndefOr[Double] = js.native
}
object HotpOptionsInterface {
  
  @scala.inline
  def apply(): HotpOptionsInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HotpOptionsInterface]
  }
  
  @scala.inline
  implicit class HotpOptionsInterfaceMutableBuilder[Self <: HotpOptionsInterface] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateHmacSecret(value: (/* secret */ String, /* options */ HmacOptions) => Buffer): Self = StObject.set(x, "createHmacSecret", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateHmacSecretUndefined: Self = StObject.set(x, "createHmacSecret", js.undefined)
    
    @scala.inline
    def setCrypto(value: js.Any): Self = StObject.set(x, "crypto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCryptoUndefined: Self = StObject.set(x, "crypto", js.undefined)
    
    @scala.inline
    def setDigits(value: Double): Self = StObject.set(x, "digits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigitsUndefined: Self = StObject.set(x, "digits", js.undefined)
  }
}
