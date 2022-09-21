package typings.node.cryptoMod.webcrypto

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @since v15.0.0
  */
trait CryptoKey extends StObject {
  
  /**
    * An object detailing the algorithm for which the key can be used along with additional algorithm-specific parameters.
    * @since v15.0.0
    */
  val algorithm: KeyAlgorithm
  
  /**
    * When `true`, the {@link CryptoKey} can be extracted using either `subtleCrypto.exportKey()` or `subtleCrypto.wrapKey()`.
    * @since v15.0.0
    */
  val extractable: Boolean
  
  /**
    * A string identifying whether the key is a symmetric (`'secret'`) or asymmetric (`'private'` or `'public'`) key.
    * @since v15.0.0
    */
  val `type`: KeyType
  
  /**
    * An array of strings identifying the operations for which the key may be used.
    *
    * The possible usages are:
    * - `'encrypt'` - The key may be used to encrypt data.
    * - `'decrypt'` - The key may be used to decrypt data.
    * - `'sign'` - The key may be used to generate digital signatures.
    * - `'verify'` - The key may be used to verify digital signatures.
    * - `'deriveKey'` - The key may be used to derive a new key.
    * - `'deriveBits'` - The key may be used to derive bits.
    * - `'wrapKey'` - The key may be used to wrap another key.
    * - `'unwrapKey'` - The key may be used to unwrap another key.
    *
    * Valid key usages depend on the key algorithm (identified by `cryptokey.algorithm.name`).
    * @since v15.0.0
    */
  val usages: js.Array[KeyUsage]
}
object CryptoKey {
  
  inline def apply(algorithm: KeyAlgorithm, extractable: Boolean, `type`: KeyType, usages: js.Array[KeyUsage]): CryptoKey = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], extractable = extractable.asInstanceOf[js.Any], usages = usages.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CryptoKey]
  }
  
  extension [Self <: CryptoKey](x: Self) {
    
    inline def setAlgorithm(value: KeyAlgorithm): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    inline def setExtractable(value: Boolean): Self = StObject.set(x, "extractable", value.asInstanceOf[js.Any])
    
    inline def setType(value: KeyType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUsages(value: js.Array[KeyUsage]): Self = StObject.set(x, "usages", value.asInstanceOf[js.Any])
    
    inline def setUsagesVarargs(value: KeyUsage*): Self = StObject.set(x, "usages", js.Array(value*))
  }
}
