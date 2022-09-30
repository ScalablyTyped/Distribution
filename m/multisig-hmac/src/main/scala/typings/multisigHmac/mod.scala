package typings.multisigHmac

import typings.multisigHmac.multisigHmacInts.`128`
import typings.multisigHmac.multisigHmacInts.`32`
import typings.multisigHmac.multisigHmacInts.`48`
import typings.multisigHmac.multisigHmacInts.`64`
import typings.multisigHmac.multisigHmacStrings.sha256
import typings.multisigHmac.multisigHmacStrings.sha384
import typings.multisigHmac.multisigHmacStrings.sha512
import typings.multisigHmac.multisigHmacStrings.sha512_256
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Multisig scheme for HMAC authentication.
    *
    *
    *
    * Key management can happen in either of two modes, either by storing every of the
    * component keys, or by storing a single master seed and using that to derive keys
    * ad hoc.
    *
    * @example
    * // Using stored keys
    *
    * import MultisigHMAC = require('multisig-hmac')
    *
    * const multisigHmac = new MultisigHMAC()
    *
    * // generate keys, which need to be stored securely
    * // and need to be shared securely with each party
    * const k1 = multisigHmac.keygen(1)
    * const k2 = multisigHmac.keygen(2)
    * const k3 = multisigHmac.keygen(3)
    *
    * // Sign by each client with 2-of-3
    * const data = Buffer.from('Hello world')
    *
    * // Notice no mention of nonce here. The data can follow whatever format you
    * // desire, but should include a nonce
    * const s1 = multisigHmac.sign(k1, data)
    * const s3 = multisigHmac.sign(k3, data)
    *
    * const signature = multisigHmac.combine([s1, s3])
    *
    * // Verify on the server
    * const threshold = 2
    * const keys = [k1, k2, k3]
    * const verified = multisigHmac.verify(keys, signature, data, threshold)
    * console.log(verified)
    *
    * @example
    * // Using a derived master key
    *
    * import MultisigHMAC = require('multisig-hmac')
    *
    * const multisigHmac = new MultisigHMAC()
    *
    * // Generate a master seed, which needs to be stored securely
    * // This seed must NOT be shared with any other party
    * const seed = multisigHmac.seedgen()
    *
    * const k1 = multisigHmac.deriveKey(seed, 1)
    * const k2 = multisigHmac.deriveKey(seed, 2)
    * const k3 = multisigHmac.deriveKey(seed, 3)
    *
    * // Sign by each client with 2-of-3
    * const data = Buffer.from('Hello world')
    *
    * // Notice no mention of nonce here. The data can follow whatever format you
    * // desire, but should include a nonce
    * const s1 = multisigHmac.sign(k1, data)
    * const s3 = multisigHmac.sign(k3, data)
    *
    * const signature = multisigHmac.combine([s1, s3])
    *
    * // Verify on the server, but now keys are dynamically derived
    * const threshold = 2
    * const verified = multisigHmac.verifyDerived(seed, signature, data, threshold)
    * console.log(verified)
    */
  @JSImport("multisig-hmac", JSImport.Namespace)
  @js.native
  /**
    * Create a new instance of `MultisigHMAC`, which can be used as a global singleton.
    * Just sets the algorithm to be used for subsequent methods and associated constants.
    */
  open class ^ ()
    extends StObject
       with MultisigHMAC {
    def this(/** @default 'sha256' */
    algorithm: sha256 | sha384 | sha512 | sha512_256) = this()
  }
  @JSImport("multisig-hmac", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /** Default signature length in bytes */
  /* static member */
  @JSImport("multisig-hmac", "BYTES")
  @js.native
  val BYTES: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MultisigHMAC.SHA256_BYTES */ Any = js.native
  
  /** Default key length in bytes */
  /* static member */
  @JSImport("multisig-hmac", "KEYBYTES")
  @js.native
  val KEYBYTES: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MultisigHMAC.SHA256_KEYBYTES */ Any = js.native
  
  /** Default algorithm (`'sha256'`) */
  /* static member */
  @JSImport("multisig-hmac", "PRIMITIVE")
  @js.native
  val PRIMITIVE: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MultisigHMAC.SHA256_PRIMITIVE */ Any = js.native
  
  /** `'sha256'` signature length in bytes */
  /* static member */
  @JSImport("multisig-hmac", "SHA256_BYTES")
  @js.native
  val SHA256_BYTES: `32` = js.native
  
  /** `'sha256'` key length in bytes */
  /* static member */
  @JSImport("multisig-hmac", "SHA256_KEYBYTES")
  @js.native
  val SHA256_KEYBYTES: `64` = js.native
  
  /** `'sha256'` algorithm name */
  /* static member */
  @JSImport("multisig-hmac", "SHA256_PRIMITIVE")
  @js.native
  val SHA256_PRIMITIVE: sha256 = js.native
  
  /** `'sha384'` signature length in bytes */
  /* static member */
  @JSImport("multisig-hmac", "SHA384_BYTES")
  @js.native
  val SHA384_BYTES: `48` = js.native
  
  /** `'sha384'` key length in bytes */
  /* static member */
  @JSImport("multisig-hmac", "SHA384_KEYBYTES")
  @js.native
  val SHA384_KEYBYTES: `128` = js.native
  
  /** `'sha384'` algorithm name */
  /* static member */
  @JSImport("multisig-hmac", "SHA384_PRIMITIVE")
  @js.native
  val SHA384_PRIMITIVE: sha384 = js.native
  
  /** `'sha512_256'` signature length in bytes */
  /* static member */
  @JSImport("multisig-hmac", "SHA512_256_BYTES")
  @js.native
  val SHA512_256_BYTES: `32` = js.native
  
  /** `'sha512_256'` key length in bytes */
  /* static member */
  @JSImport("multisig-hmac", "SHA512_256_KEYBYTES")
  @js.native
  val SHA512_256_KEYBYTES: `128` = js.native
  
  /** `'sha512_256'` algorithm name (also knowns as SHA512/256) */
  /* static member */
  @JSImport("multisig-hmac", "SHA512_256_PRIMITIVE")
  @js.native
  val SHA512_256_PRIMITIVE: sha512_256 = js.native
  
  /** `'sha512'` signature length in bytes */
  /* static member */
  @JSImport("multisig-hmac", "SHA512_BYTES")
  @js.native
  val SHA512_BYTES: `64` = js.native
  
  /** `'sha512'` key length in bytes */
  /* static member */
  @JSImport("multisig-hmac", "SHA512_KEYBYTES")
  @js.native
  val SHA512_KEYBYTES: `128` = js.native
  
  /** `'sha512'` algorithm name */
  /* static member */
  @JSImport("multisig-hmac", "SHA512_PRIMITIVE")
  @js.native
  val SHA512_PRIMITIVE: sha512 = js.native
  
  /**
    * Determines the indexes of the keys (ie. high bits) in `bitfield` as an array.
    *
    * @param bitfield Must be a `uint32`.
    * @example
    * import { strict as assert } from 'assert'
    * import MultisigHMAC = require('miltisig-hmac')
    *
    * assert.equal(MultisigHMAC.keyIndexes(0b101), [0, 2])
    */
  /* static member */
  inline def keyIndexes(bitfield: Double): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("keyIndexes")(bitfield.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  /**
    * Determines the number of keys (ie. high bits) in `bitfield`.
    *
    * @param bitfield Must be a `uint32`.
    * @example
    * import { strict as assert } from 'assert'
    * import MultisigHMAC = require('miltisig-hmac')
    *
    * assert.equal(MultisigHMAC.keysCount(0b101), 2)
    */
  /* static member */
  inline def keysCount(bitfield: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("keysCount")(bitfield.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  trait Key extends StObject {
    
    var index: Double
    
    var key: Buffer
  }
  object Key {
    
    inline def apply(index: Double, key: Buffer): Key = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    extension [Self <: Key](x: Self) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setKey(value: Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Multisig scheme for HMAC authentication.
    *
    *
    *
    * Key management can happen in either of two modes, either by storing every of the
    * component keys, or by storing a single master seed and using that to derive keys
    * ad hoc.
    *
    * @example
    * // Using stored keys
    *
    * import MultisigHMAC = require('multisig-hmac')
    *
    * const multisigHmac = new MultisigHMAC()
    *
    * // generate keys, which need to be stored securely
    * // and need to be shared securely with each party
    * const k1 = multisigHmac.keygen(1)
    * const k2 = multisigHmac.keygen(2)
    * const k3 = multisigHmac.keygen(3)
    *
    * // Sign by each client with 2-of-3
    * const data = Buffer.from('Hello world')
    *
    * // Notice no mention of nonce here. The data can follow whatever format you
    * // desire, but should include a nonce
    * const s1 = multisigHmac.sign(k1, data)
    * const s3 = multisigHmac.sign(k3, data)
    *
    * const signature = multisigHmac.combine([s1, s3])
    *
    * // Verify on the server
    * const threshold = 2
    * const keys = [k1, k2, k3]
    * const verified = multisigHmac.verify(keys, signature, data, threshold)
    * console.log(verified)
    *
    * @example
    * // Using a derived master key
    *
    * import MultisigHMAC = require('multisig-hmac')
    *
    * const multisigHmac = new MultisigHMAC()
    *
    * // Generate a master seed, which needs to be stored securely
    * // This seed must NOT be shared with any other party
    * const seed = multisigHmac.seedgen()
    *
    * const k1 = multisigHmac.deriveKey(seed, 1)
    * const k2 = multisigHmac.deriveKey(seed, 2)
    * const k3 = multisigHmac.deriveKey(seed, 3)
    *
    * // Sign by each client with 2-of-3
    * const data = Buffer.from('Hello world')
    *
    * // Notice no mention of nonce here. The data can follow whatever format you
    * // desire, but should include a nonce
    * const s1 = multisigHmac.sign(k1, data)
    * const s3 = multisigHmac.sign(k3, data)
    *
    * const signature = multisigHmac.combine([s1, s3])
    *
    * // Verify on the server, but now keys are dynamically derived
    * const threshold = 2
    * const verified = multisigHmac.verifyDerived(seed, signature, data, threshold)
    * console.log(verified)
    */
  @js.native
  trait MultisigHMAC extends StObject {
    
    /**
      * Combine a list of signatures, which have all been signed independently. Only include each signature
      * once or they will cancel out. Signatures can be combined in any order and over several passes for
      * more advanced aggregation schemes.
      *
      * @param signatures The signatures to combine.
      * @param buffer Will store the aggregate signature. Must be at least `BYTES` long.
      */
    def combine(signatures: js.Array[Signature]): Signature = js.native
    def combine(signatures: js.Array[Signature], buffer: Buffer): Signature = js.native
    
    /**
      * Derive a new sub key from a master seed.
      *
      * Keys are derived using a KDF based on HMAC:
      *
      * ```
      *  b[0...BYTES] = HMAC(Key = masterSeed, data = 'derive' || U32LE(index) || 0x00)
      *  b[BYTES...] = HMAC(Key = masterSeed, b[0...BYTES] || 0x01)
      * ```
      *
      * @param masterSeed A random master seed.
      * @param index Must be a `uint32`, but in practice you want to keep a much lower number, as the
      * bitfield used with the signature has as many bits as the largest index. A simple counter suffices.
      * *Note*: `index` should be counted from `0`.
      * @param buffer Pass a `Buffer` of length `KEYBYTES` that the key will be written to. This `Buffer`
      * will the be returned instead of a new one.
      */
    def deriveKey(masterSeed: Buffer, index: Double): Key = js.native
    def deriveKey(masterSeed: Buffer, index: Double, buffer: Buffer): Key = js.native
    
    /**
      * Generate a new cryptographically random key.
      *
      * @param index The index of the key to generate. *Note*: `index` should be counted from `0`.
      * @param buffer Pass a `Buffer` of length `KEYBYTES` that the key will be written to. This `Buffer`
      * will the be returned instead of a new one.
      */
    def keygen(index: Double): Key = js.native
    def keygen(index: Double, buffer: Buffer): Key = js.native
    
    /**
      * Generate a new cryptographically random master seed. Optionally
      *
      * @param buffer Pass a `Buffer` of length `KEYBYTES` that the seed will be written to. This `Buffer`
      * will the be returned instead of a new one.
      */
    def seedgen(): Buffer = js.native
    def seedgen(buffer: Buffer): Buffer = js.native
    
    /**
      * Independently sign data with a key.
      *
      * @param key The key to use for signing.
      * @param data The data to sign.
      * @param buffer Use provided `Buffer` to store the signature. Must be at least `BYTES` long.
      * @return A `Signature` object. Can be passed to `combine()`.
      */
    def sign(key: Key, data: String): Signature = js.native
    def sign(key: Key, data: String, buffer: Buffer): Signature = js.native
    def sign(key: Key, data: Buffer): Signature = js.native
    def sign(key: Key, data: Buffer, buffer: Buffer): Signature = js.native
    
    /**
      * Verify a `signature` of `data` against a list of `keys`, over a given `threshold`.
      *
      * @param keys A list of keys required by `signature.bitfield`.
      * @param signature The signature to verify.
      * @param data The data for the `signature`.
      * @param threshold The minimum number of keys required to pass the verification.
      * @param sigScratchBuffer Will be used for intermediate signature verification.
      * Must be at least `BYTES` long.
      * @return Whether `signature` could be verified.
      */
    def verify(keys: js.Array[Key], signature: Signature, data: String, threshold: Double): Boolean = js.native
    def verify(
      keys: js.Array[Key],
      signature: Signature,
      data: String,
      threshold: Double,
      sigScratchBuffer: Buffer
    ): Boolean = js.native
    def verify(keys: js.Array[Key], signature: Signature, data: Buffer, threshold: Double): Boolean = js.native
    def verify(
      keys: js.Array[Key],
      signature: Signature,
      data: Buffer,
      threshold: Double,
      sigScratchBuffer: Buffer
    ): Boolean = js.native
    
    /**
      * Verify a `signature` of `data` against dynamically derived keys from `masterSeed`, over a given `threshold`.
      *
      * @param masterSeed The master seed. Must be at least `KEYBYTES` long. `signature.bitfield` defines
      * which keys must be derived and verified.
      * @param signature The signature to verify.
      * @param data The data for the `signature`.
      * @param threshold The minimum number of keys required to pass the verification.
      * @param keyScratchBuffer Will be used to derive intermediate keys into. Must be `KEYBYTES` long.
      * @param sigScratchBuffer Will be used for intermediate signature verification. Must be `BYTES` long.
      * @return Whether `signature` could be verified.
      */
    def verifyDerived(masterSeed: Buffer, signature: Signature, data: String, threshold: Double): Boolean = js.native
    def verifyDerived(
      masterSeed: Buffer,
      signature: Signature,
      data: String,
      threshold: Double,
      keyScratchBuffer: Unit,
      sigScratchBuffer: Buffer
    ): Boolean = js.native
    def verifyDerived(
      masterSeed: Buffer,
      signature: Signature,
      data: String,
      threshold: Double,
      keyScratchBuffer: Buffer
    ): Boolean = js.native
    def verifyDerived(
      masterSeed: Buffer,
      signature: Signature,
      data: String,
      threshold: Double,
      keyScratchBuffer: Buffer,
      sigScratchBuffer: Buffer
    ): Boolean = js.native
    def verifyDerived(masterSeed: Buffer, signature: Signature, data: Buffer, threshold: Double): Boolean = js.native
    def verifyDerived(
      masterSeed: Buffer,
      signature: Signature,
      data: Buffer,
      threshold: Double,
      keyScratchBuffer: Unit,
      sigScratchBuffer: Buffer
    ): Boolean = js.native
    def verifyDerived(
      masterSeed: Buffer,
      signature: Signature,
      data: Buffer,
      threshold: Double,
      keyScratchBuffer: Buffer
    ): Boolean = js.native
    def verifyDerived(
      masterSeed: Buffer,
      signature: Signature,
      data: Buffer,
      threshold: Double,
      keyScratchBuffer: Buffer,
      sigScratchBuffer: Buffer
    ): Boolean = js.native
  }
  
  trait Signature extends StObject {
    
    var bitfield: Double
    
    var signature: Buffer
  }
  object Signature {
    
    inline def apply(bitfield: Double, signature: Buffer): Signature = {
      val __obj = js.Dynamic.literal(bitfield = bitfield.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
      __obj.asInstanceOf[Signature]
    }
    
    extension [Self <: Signature](x: Self) {
      
      inline def setBitfield(value: Double): Self = StObject.set(x, "bitfield", value.asInstanceOf[js.Any])
      
      inline def setSignature(value: Buffer): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    }
  }
}
