package typings.node.cryptoMod

import typings.node.NodeJS.ArrayBufferView
import typings.node.bufferMod.global.Buffer
import typings.node.bufferMod.global.BufferEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The `DiffieHellman` class is a utility for creating Diffie-Hellman key
  * exchanges.
  *
  * Instances of the `DiffieHellman` class can be created using the {@link createDiffieHellman} function.
  *
  * ```js
  * import assert from 'assert';
  *
  * const {
  *   createDiffieHellman
  * } = await import('crypto');
  *
  * // Generate Alice's keys...
  * const alice = createDiffieHellman(2048);
  * const aliceKey = alice.generateKeys();
  *
  * // Generate Bob's keys...
  * const bob = createDiffieHellman(alice.getPrime(), alice.getGenerator());
  * const bobKey = bob.generateKeys();
  *
  * // Exchange and generate the secret...
  * const aliceSecret = alice.computeSecret(bobKey);
  * const bobSecret = bob.computeSecret(aliceKey);
  *
  * // OK
  * assert.strictEqual(aliceSecret.toString('hex'), bobSecret.toString('hex'));
  * ```
  * @since v0.5.0
  */
@JSImport("crypto", "DiffieHellman")
@js.native
/* private */ open class DiffieHellman_ () extends StObject {
  
  def computeSecret(otherPublicKey: String, inputEncoding: BinaryToTextEncoding): Buffer = js.native
  def computeSecret(otherPublicKey: String, inputEncoding: BinaryToTextEncoding, outputEncoding: BinaryToTextEncoding): String = js.native
  /**
    * Computes the shared secret using `otherPublicKey` as the other
    * party's public key and returns the computed shared secret. The supplied
    * key is interpreted using the specified `inputEncoding`, and secret is
    * encoded using specified `outputEncoding`.
    * If the `inputEncoding` is not
    * provided, `otherPublicKey` is expected to be a `Buffer`,`TypedArray`, or `DataView`.
    *
    * If `outputEncoding` is given a string is returned; otherwise, a `Buffer` is returned.
    * @since v0.5.0
    * @param inputEncoding The `encoding` of an `otherPublicKey` string.
    * @param outputEncoding The `encoding` of the return value.
    */
  def computeSecret(otherPublicKey: ArrayBufferView): Buffer = js.native
  def computeSecret(otherPublicKey: ArrayBufferView, inputEncoding: Null, outputEncoding: BinaryToTextEncoding): String = js.native
  
  /**
    * Generates private and public Diffie-Hellman key values, and returns
    * the public key in the specified `encoding`. This key should be
    * transferred to the other party.
    * If `encoding` is provided a string is returned; otherwise a `Buffer` is returned.
    * @since v0.5.0
    * @param encoding The `encoding` of the return value.
    */
  def generateKeys(): Buffer = js.native
  def generateKeys(encoding: BinaryToTextEncoding): String = js.native
  
  /**
    * Returns the Diffie-Hellman generator in the specified `encoding`.
    * If `encoding` is provided a string is
    * returned; otherwise a `Buffer` is returned.
    * @since v0.5.0
    * @param encoding The `encoding` of the return value.
    */
  def getGenerator(): Buffer = js.native
  def getGenerator(encoding: BinaryToTextEncoding): String = js.native
  
  /**
    * Returns the Diffie-Hellman prime in the specified `encoding`.
    * If `encoding` is provided a string is
    * returned; otherwise a `Buffer` is returned.
    * @since v0.5.0
    * @param encoding The `encoding` of the return value.
    */
  def getPrime(): Buffer = js.native
  def getPrime(encoding: BinaryToTextEncoding): String = js.native
  
  /**
    * Returns the Diffie-Hellman private key in the specified `encoding`.
    * If `encoding` is provided a
    * string is returned; otherwise a `Buffer` is returned.
    * @since v0.5.0
    * @param encoding The `encoding` of the return value.
    */
  def getPrivateKey(): Buffer = js.native
  def getPrivateKey(encoding: BinaryToTextEncoding): String = js.native
  
  /**
    * Returns the Diffie-Hellman public key in the specified `encoding`.
    * If `encoding` is provided a
    * string is returned; otherwise a `Buffer` is returned.
    * @since v0.5.0
    * @param encoding The `encoding` of the return value.
    */
  def getPublicKey(): Buffer = js.native
  def getPublicKey(encoding: BinaryToTextEncoding): String = js.native
  
  def setPrivateKey(privateKey: String, encoding: BufferEncoding): Unit = js.native
  /**
    * Sets the Diffie-Hellman private key. If the `encoding` argument is provided,`privateKey` is expected
    * to be a string. If no `encoding` is provided, `privateKey` is expected
    * to be a `Buffer`, `TypedArray`, or `DataView`.
    * @since v0.5.0
    * @param encoding The `encoding` of the `privateKey` string.
    */
  def setPrivateKey(privateKey: ArrayBufferView): Unit = js.native
  
  def setPublicKey(publicKey: String, encoding: BufferEncoding): Unit = js.native
  /**
    * Sets the Diffie-Hellman public key. If the `encoding` argument is provided,`publicKey` is expected
    * to be a string. If no `encoding` is provided, `publicKey` is expected
    * to be a `Buffer`, `TypedArray`, or `DataView`.
    * @since v0.5.0
    * @param encoding The `encoding` of the `publicKey` string.
    */
  def setPublicKey(publicKey: ArrayBufferView): Unit = js.native
  
  /**
    * A bit field containing any warnings and/or errors resulting from a check
    * performed during initialization of the `DiffieHellman` object.
    *
    * The following values are valid for this property (as defined in `constants`module):
    *
    * * `DH_CHECK_P_NOT_SAFE_PRIME`
    * * `DH_CHECK_P_NOT_PRIME`
    * * `DH_UNABLE_TO_CHECK_GENERATOR`
    * * `DH_NOT_SUITABLE_GENERATOR`
    * @since v0.11.12
    */
  var verifyError: Double = js.native
}
