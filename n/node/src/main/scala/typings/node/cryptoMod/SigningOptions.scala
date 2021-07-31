package typings.node.cryptoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SigningOptions extends StObject {
  
  var dsaEncoding: js.UndefOr[DSAEncoding] = js.undefined
  
  /**
    * @See crypto.constants.RSA_PKCS1_PADDING
    */
  var padding: js.UndefOr[Double] = js.undefined
  
  var saltLength: js.UndefOr[Double] = js.undefined
}
object SigningOptions {
  
  @scala.inline
  def apply(): SigningOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SigningOptions]
  }
  
  @scala.inline
  implicit class SigningOptionsMutableBuilder[Self <: SigningOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDsaEncoding(value: DSAEncoding): Self = StObject.set(x, "dsaEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDsaEncodingUndefined: Self = StObject.set(x, "dsaEncoding", js.undefined)
    
    @scala.inline
    def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setSaltLength(value: Double): Self = StObject.set(x, "saltLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaltLengthUndefined: Self = StObject.set(x, "saltLength", js.undefined)
  }
}
