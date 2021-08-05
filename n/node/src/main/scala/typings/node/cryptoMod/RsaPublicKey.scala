package typings.node.cryptoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RsaPublicKey extends StObject {
  
  var key: KeyLike
  
  var padding: js.UndefOr[Double] = js.undefined
}
object RsaPublicKey {
  
  inline def apply(key: KeyLike): RsaPublicKey = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[RsaPublicKey]
  }
  
  extension [Self <: RsaPublicKey](x: Self) {
    
    inline def setKey(value: KeyLike): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
  }
}
