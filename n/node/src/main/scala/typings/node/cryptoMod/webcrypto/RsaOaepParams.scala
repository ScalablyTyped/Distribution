package typings.node.cryptoMod.webcrypto

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RsaOaepParams
  extends StObject
     with Algorithm {
  
  var label: js.UndefOr[BufferSource] = js.undefined
}
object RsaOaepParams {
  
  inline def apply(name: String): RsaOaepParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RsaOaepParams]
  }
  
  extension [Self <: RsaOaepParams](x: Self) {
    
    inline def setLabel(value: BufferSource): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}
