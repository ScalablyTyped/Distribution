package typings.openpgp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignatureSignature extends StObject {
  
  var signature: typings.openpgp.mod.signature.Signature
}
object SignatureSignature {
  
  @scala.inline
  def apply(signature: typings.openpgp.mod.signature.Signature): SignatureSignature = {
    val __obj = js.Dynamic.literal(signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureSignature]
  }
  
  @scala.inline
  implicit class SignatureSignatureMutableBuilder[Self <: SignatureSignature] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSignature(value: typings.openpgp.mod.signature.Signature): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
  }
}
