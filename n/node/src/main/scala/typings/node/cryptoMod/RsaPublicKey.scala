package typings.node.cryptoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RsaPublicKey extends StObject {
  
  var key: KeyLike = js.native
  
  var padding: js.UndefOr[Double] = js.native
}
object RsaPublicKey {
  
  @scala.inline
  def apply(key: KeyLike): RsaPublicKey = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[RsaPublicKey]
  }
  
  @scala.inline
  implicit class RsaPublicKeyMutableBuilder[Self <: RsaPublicKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: KeyLike): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
  }
}
