package typings.node.cryptoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerifyKeyObjectInput
  extends StObject
     with SigningOptions {
  
  var key: KeyObject
}
object VerifyKeyObjectInput {
  
  @scala.inline
  def apply(key: KeyObject): VerifyKeyObjectInput = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyKeyObjectInput]
  }
  
  @scala.inline
  implicit class VerifyKeyObjectInputMutableBuilder[Self <: VerifyKeyObjectInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: KeyObject): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
