package typings.noiseHandshake

import typings.node.bufferMod.global.Buffer
import typings.noiseHandshake.noiseHandshakeStrings.IK
import typings.noiseHandshake.noiseHandshakeStrings.XX
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Create a new handshake state for a given pattern. Initiator should be either `true` or `false` depending on the role. A preexisting keypair may be passed as `staticKeypair`
    *
    * @example
    * import Noise = require('noise-handshake')
    * import Cipher = require('noise-handshake/cipher')
    * const initiator = new Noise('IK', true)
    * const responder = new Noise('IK', false)
    *
    * const prologue = Buffer.alloc(0)
    *
    * // preshared key
    * initiator.initialise(prologue, responder.s.publicKey)
    * responder.initialise(prologue)
    *
    * // -> e, es, s, ss
    * const message = initiator.send()
    * responder.recv(message)
    *
    * // <- e, ee, se
    * const reply = responder.send()
    * initiator.recv(reply)
    *
    * console.log(initiator.complete) // true
    *
    * // convention is to use rx for
    * // sending and tx for receiving
    *
    * // initiator.rx === responder.tx
    * // responder.rx === initiator.tx
    *
    * // instantiate a cipher using shared secrets
    * const send = new Cipher(initiator.rx!)
    * const receive = new Cipher(responder.tx!)
    *
    * const msg = Buffer.from('hello, world')
    *
    * const enc = send.encrypt(msg)
    * console.log(receive.decrypt(enc)) // hello, world
    */
  @JSImport("noise-handshake", JSImport.Namespace)
  @js.native
  open class ^ protected () extends NoiseState {
    def this(pattern: XX | IK, initiator: Boolean) = this()
    def this(pattern: XX | IK, initiator: Boolean, staticKeypair: KeyPair) = this()
    def this(
      pattern: XX | IK,
      initiator: Boolean,
      staticKeypair: Unit,
      opts: typings.noiseHandshake.symmetricStateMod.Options
    ) = this()
    def this(
      pattern: XX | IK,
      initiator: Boolean,
      staticKeypair: KeyPair,
      opts: typings.noiseHandshake.symmetricStateMod.Options
    ) = this()
  }
  
  type Curve = typings.noiseHandshake.symmetricStateMod.Curve
  
  type KeyPair = typings.noiseHandshake.dhMod.KeyPair
  
  /**
    * Create a new handshake state for a given pattern. Initiator should be either `true` or `false` depending on the role. A preexisting keypair may be passed as `staticKeypair`
    *
    * @example
    * import Noise = require('noise-handshake')
    * import Cipher = require('noise-handshake/cipher')
    * const initiator = new Noise('IK', true)
    * const responder = new Noise('IK', false)
    *
    * const prologue = Buffer.alloc(0)
    *
    * // preshared key
    * initiator.initialise(prologue, responder.s.publicKey)
    * responder.initialise(prologue)
    *
    * // -> e, es, s, ss
    * const message = initiator.send()
    * responder.recv(message)
    *
    * // <- e, ee, se
    * const reply = responder.send()
    * initiator.recv(reply)
    *
    * console.log(initiator.complete) // true
    *
    * // convention is to use rx for
    * // sending and tx for receiving
    *
    * // initiator.rx === responder.tx
    * // responder.rx === initiator.tx
    *
    * // instantiate a cipher using shared secrets
    * const send = new Cipher(initiator.rx!)
    * const receive = new Cipher(responder.tx!)
    *
    * const msg = Buffer.from('hello, world')
    *
    * const enc = send.encrypt(msg)
    * console.log(receive.decrypt(enc)) // hello, world
    */
  @js.native
  trait NoiseState
    extends typings.noiseHandshake.symmetricStateMod.^ {
    
    /**
      * Indicates whether `rx` and `tx` have been created yet.
      *
      * When complete, the working handshake state shall be cleared *only* the following state shall remain on the object:
      *
      * ```
      * {
      *   tx, // session key to decrypt messages from remote peer
      *   rx, // session key to encrypt messages to remote peer
      *   rs, // the remote peer's public key,
      *   hash, // a hash of the entire handshake state
      * }
      * ```
      */
    var complete: Boolean = js.native
    
    val e: KeyPair | Null = js.native
    
    def `final`(): Unit = js.native
    
    val handshake: js.Array[js.Symbol | js.Array[js.Symbol]] = js.native
    
    var hash: Buffer | js.typedarray.Uint8Array | Null = js.native
    
    def initialise(prologue: js.typedarray.Uint8Array): Unit = js.native
    def initialise(prologue: js.typedarray.Uint8Array, remoteStatic: js.typedarray.Uint8Array): Unit = js.native
    def initialise(prologue: js.typedarray.Uint8Array, remoteStatic: Buffer): Unit = js.native
    /**
      * Initialise the handshake state with a prologue and any preshared keys.
      */
    def initialise(prologue: Buffer): Unit = js.native
    def initialise(prologue: Buffer, remoteStatic: js.typedarray.Uint8Array): Unit = js.native
    def initialise(prologue: Buffer, remoteStatic: Buffer): Unit = js.native
    
    val initiator: Boolean = js.native
    
    val pattern: XX | IK = js.native
    
    val protocol: Buffer | js.typedarray.Uint8Array = js.native
    
    var re: Buffer | js.typedarray.Uint8Array | Null = js.native
    
    def recv(buf: js.typedarray.Uint8Array): Buffer | js.typedarray.Uint8Array = js.native
    /**
      * Receive a handshake message from the peer and return the encrypted payload.
      */
    def recv(buf: Buffer): Buffer | js.typedarray.Uint8Array = js.native
    
    var rs: Buffer | js.typedarray.Uint8Array | Null = js.native
    
    var rx: Buffer | js.typedarray.Uint8Array | Null = js.native
    
    val s: KeyPair = js.native
    
    /**
      * Send the next message in the handshake, add an optional payload buffer to be included in the message,
      * payload is a zero length buffer by default.
      */
    def send(): Buffer | js.typedarray.Uint8Array = js.native
    def send(payload: js.typedarray.Uint8Array): Buffer | js.typedarray.Uint8Array = js.native
    def send(payload: Buffer): Buffer | js.typedarray.Uint8Array = js.native
    
    var tx: Buffer | js.typedarray.Uint8Array | Null = js.native
  }
  
  type Options = typings.noiseHandshake.symmetricStateMod.Options
}
