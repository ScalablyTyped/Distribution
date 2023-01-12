package typings.node.cryptoMod.webcrypto

import typings.node.NodeJS.TypedArray
import typings.node.anon._empty
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Calling `require('node:crypto').webcrypto` returns an instance of the `Crypto` class.
  * `Crypto` is a singleton that provides access to the remainder of the crypto API.
  * @since v15.0.0
  */
trait Crypto extends StObject {
  
  /** Illegal constructor */
  def CryptoKey(_underscore: _empty): scala.Nothing
  @JSName("CryptoKey")
  var CryptoKey_Original: CryptoKeyConstructor
  
  /**
    * Generates cryptographically strong random values.
    * The given `typedArray` is filled with random values, and a reference to `typedArray` is returned.
    *
    * The given `typedArray` must be an integer-based instance of {@link NodeJS.TypedArray}, i.e. `Float32Array` and `Float64Array` are not accepted.
    *
    * An error will be thrown if the given `typedArray` is larger than 65,536 bytes.
    * @since v15.0.0
    */
  def getRandomValues[T /* <: Exclude[TypedArray, js.typedarray.Float32Array | js.typedarray.Float64Array] */](typedArray: T): T
  
  /**
    * Generates a random {@link https://www.rfc-editor.org/rfc/rfc4122.txt RFC 4122} version 4 UUID.
    * The UUID is generated using a cryptographic pseudorandom number generator.
    * @since v16.7.0
    */
  def randomUUID(): String
  
  /**
    * Provides access to the `SubtleCrypto` API.
    * @since v15.0.0
    */
  val subtle: SubtleCrypto
}
object Crypto {
  
  inline def apply(
    CryptoKey: CryptoKeyConstructor,
    getRandomValues: Any => Any,
    randomUUID: () => String,
    subtle: SubtleCrypto
  ): Crypto = {
    val __obj = js.Dynamic.literal(CryptoKey = CryptoKey.asInstanceOf[js.Any], getRandomValues = js.Any.fromFunction1(getRandomValues), randomUUID = js.Any.fromFunction0(randomUUID), subtle = subtle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Crypto]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Crypto] (val x: Self) extends AnyVal {
    
    inline def setCryptoKey(value: CryptoKeyConstructor): Self = StObject.set(x, "CryptoKey", value.asInstanceOf[js.Any])
    
    inline def setGetRandomValues(value: Any => Any): Self = StObject.set(x, "getRandomValues", js.Any.fromFunction1(value))
    
    inline def setRandomUUID(value: () => String): Self = StObject.set(x, "randomUUID", js.Any.fromFunction0(value))
    
    inline def setSubtle(value: SubtleCrypto): Self = StObject.set(x, "subtle", value.asInstanceOf[js.Any])
  }
}
