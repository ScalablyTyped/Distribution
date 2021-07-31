package typings.node.cryptoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignKeyObjectInput
  extends StObject
     with SigningOptions {
  
  var key: KeyObject
}
object SignKeyObjectInput {
  
  @scala.inline
  def apply(key: KeyObject): SignKeyObjectInput = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignKeyObjectInput]
  }
  
  @scala.inline
  implicit class SignKeyObjectInputMutableBuilder[Self <: SignKeyObjectInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: KeyObject): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
