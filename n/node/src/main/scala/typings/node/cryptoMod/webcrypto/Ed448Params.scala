package typings.node.cryptoMod.webcrypto

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ed448Params
  extends StObject
     with Algorithm {
  
  var context: js.UndefOr[BufferSource] = js.undefined
}
object Ed448Params {
  
  inline def apply(name: String): Ed448Params = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ed448Params]
  }
  
  extension [Self <: Ed448Params](x: Self) {
    
    inline def setContext(value: BufferSource): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
  }
}
