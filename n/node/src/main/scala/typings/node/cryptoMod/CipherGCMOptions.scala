package typings.node.cryptoMod

import typings.node.streamMod.TransformOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CipherGCMOptions
  extends StObject
     with TransformOptions {
  
  var authTagLength: js.UndefOr[Double] = js.undefined
}
object CipherGCMOptions {
  
  @scala.inline
  def apply(): CipherGCMOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CipherGCMOptions]
  }
  
  @scala.inline
  implicit class CipherGCMOptionsMutableBuilder[Self <: CipherGCMOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthTagLength(value: Double): Self = StObject.set(x, "authTagLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthTagLengthUndefined: Self = StObject.set(x, "authTagLength", js.undefined)
  }
}
