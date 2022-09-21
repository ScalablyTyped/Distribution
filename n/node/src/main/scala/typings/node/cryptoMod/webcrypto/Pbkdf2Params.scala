package typings.node.cryptoMod.webcrypto

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pbkdf2Params
  extends StObject
     with Algorithm {
  
  var hash: HashAlgorithmIdentifier
  
  var iterations: Double
  
  var salt: BufferSource
}
object Pbkdf2Params {
  
  inline def apply(hash: HashAlgorithmIdentifier, iterations: Double, name: String, salt: BufferSource): Pbkdf2Params = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pbkdf2Params]
  }
  
  extension [Self <: Pbkdf2Params](x: Self) {
    
    inline def setHash(value: HashAlgorithmIdentifier): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setIterations(value: Double): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
    
    inline def setSalt(value: BufferSource): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
  }
}
