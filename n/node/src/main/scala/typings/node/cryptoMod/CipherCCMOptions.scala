package typings.node.cryptoMod

import typings.node.streamMod.TransformOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CipherCCMOptions extends TransformOptions {
  
  var authTagLength: Double = js.native
}
object CipherCCMOptions {
  
  @scala.inline
  def apply(authTagLength: Double): CipherCCMOptions = {
    val __obj = js.Dynamic.literal(authTagLength = authTagLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[CipherCCMOptions]
  }
  
  @scala.inline
  implicit class CipherCCMOptionsMutableBuilder[Self <: CipherCCMOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthTagLength(value: Double): Self = StObject.set(x, "authTagLength", value.asInstanceOf[js.Any])
  }
}
