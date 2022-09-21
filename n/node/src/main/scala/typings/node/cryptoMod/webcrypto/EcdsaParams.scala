package typings.node.cryptoMod.webcrypto

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EcdsaParams
  extends StObject
     with Algorithm {
  
  var hash: HashAlgorithmIdentifier
}
object EcdsaParams {
  
  inline def apply(hash: HashAlgorithmIdentifier, name: String): EcdsaParams = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EcdsaParams]
  }
  
  extension [Self <: EcdsaParams](x: Self) {
    
    inline def setHash(value: HashAlgorithmIdentifier): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
  }
}
