package typings.openpgp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Signature extends StObject {
  
  var signature: String = js.native
}
object Signature {
  
  @scala.inline
  def apply(signature: String): Signature = {
    val __obj = js.Dynamic.literal(signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[Signature]
  }
  
  @scala.inline
  implicit class SignatureMutableBuilder[Self <: Signature] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
  }
}
