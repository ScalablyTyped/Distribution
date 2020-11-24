package typings.pkcs11js.Pkcs11Js

import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PKCS11 extends js.Object {
  
  /**
    * Closes all sessions with a token
    *
    * @param {Handle} slot The token's slot
    */
  def C_CloseAllSessions(slot: Handle): Unit = js.native
  
  /**
    * Closes a session between an application and a token
    *
    * @param {Handle} session The session's handle
    */
  def C_CloseSession(session: Handle): Unit = js.native
  
  /**
    * Copies an object, creating a new object for the copy
    *
    * @param {Handle} session The session's handle
    * @param {Handle} object The object's handle
    * @param {Template} template Template for new object
    * @returns {Handle} Receives handle of copy
    */
  def C_CopyObject(session: Handle, `object`: Handle, template: Template): Handle = js.native
  
  //#endregion
  //#region Object management
  /**
    * Creates a new object
    *
    * @param {Handle} session The session's handle
    * @param {Template} template The object's template
    * @returns {Handle} Gets new object's handle
    */
  def C_CreateObject(session: Handle, template: Template): Handle = js.native
  
  /**
    * Decrypts encrypted data in a single part
    *
    * @param {Handle} session Session's handle
    * @param {Buffer} inData Incoming data
    * @param {Buffer} outData Coming data
    * @returns {Buffer} Sliced coming data
    */
  def C_Decrypt(session: Handle, inData: Buffer, outData: Buffer): Buffer = js.native
  /**
    * Decrypts encrypted data in a single part
    *
    * @param {Handle} session Session's handle
    * @param {Buffer} inData Incoming data
    * @param {Buffer} outData Coming data
    * @param {(error: Error, data: Buffer) => void} cb Async callback with sliced coming data
    */
  def C_Decrypt(
    session: Handle,
    inData: Buffer,
    outData: Buffer,
    cb: js.Function2[/* error */ Error, /* data */ Buffer, Unit]
  ): Unit = js.native
  
  /**
    * Finishes a multiple-part decryption operation
    *
    * @param {Handle} session Session's handle
    * @param {Buffer} outData Last part of coming data
    * @returns {Buffer} Coming data
    */
  def C_DecryptFinal(session: Handle, outData: Buffer): Buffer = js.native
  
  /**
    * Initializes a decryption operation
    *
    * @param {Handle} session The session's handle
    * @param {Mechanism} mechanism The decryption mechanism
    * @param {Handle} key Handle of decryption key
    */
  def C_DecryptInit(session: Handle, mechanism: Mechanism, key: Handle): Unit = js.native
  
  /**
    * continues a multiple-part decryption operation
    *
    * @param {Handle} session Session's handle
    * @param {Buffer} inData Incoming data
    * @param {Buffer} outData Coming data
    * @returns {Buffer} Sliced coming data
    */
  def C_DecryptUpdate(session: Handle, inData: Buffer, outData: Buffer): Buffer = js.native
  
  /**
    * Derives a key from a base key, creating a new key object
    *
    * @param {Handle} session Session's handle
    * @param {Mechanism} mechanism Key derivation mechanism
    * @param {Handle} key Base key
    * @param {Template} template new key template
    * @returns {Handle} Get new key handle
    */
  def C_DeriveKey(session: Handle, mechanism: Mechanism, key: Handle, template: Template): Handle = js.native
  /**
    * Derives a key from a base key, creating a new key object
    *
    * @param {Handle} session Session's handle
    * @param {Mechanism} mechanism Key derivation mechanism
    * @param {Handle} key Base key
    * @param {Template} template new key template
    * @param {(error: Error, hKey: Handle) => void} cb Async callback with new key handle
    */
  def C_DeriveKey(
    session: Handle,
    mechanism: Mechanism,
    key: Handle,
    template: Template,
    cb: js.Function2[/* error */ Error, /* hKey */ Handle, Unit]
  ): Unit = js.native
  
  /**
    * Destroys an object
    *
    * @param {Handle} session The session's handle
    * @param {Handle} object The object's handle
    */
  def C_DestroyObject(session: Handle, `object`: Handle): Unit = js.native
  
  /**
    * Digests data in a single part
    *
    * @param {Handle} session Session's handle
    * @param {Buffer} inData Incoming data
    * @param {Buffer} outData Coming data
    * @returns {Buffer} Sliced coming data
    */
  def C_Digest(session: Handle, inData: Buffer, outData: Buffer): Buffer = js.native
  /**
    * Digests data in a single part
    *
    * @param {Handle} session Session's handle
    * @param {Buffer} inData Incoming data
    * @param {Buffer} outData Coming data
    * @param {(error: Error, data: Buffer) => void} cb Async callback with sliced coming data
    */
  def C_Digest(
    session: Handle,
    inData: Buffer,
    outData: Buffer,
    cb: js.Function2[/* error */ Error, /* data */ Buffer, Unit]
  ): Unit = js.native
  
  /**
    * Finishes a multiple-part message-digesting operation
    *
    * @param {Handle} session Session's handle
    * @param {Buffer} outData Coming data
    * @returns {Buffer} Sliced coming data
    */
  def C_DigestFinal(session: Handle, outData: Buffer): Buffer = js.native
  
  /* Message digesting */
  /**
    * Initializes a message-digesting operation
    *
    * @param {Handle} session Session's handle
    * @param {Mechanism} mechanism Digesting mechanism
    */
  def C_DigestInit(session: Handle, mechanism: Mechanism): Unit = js.native
  
  /**
    * continues a multiple-part message-digesting operation
    * operation, by digesting the value of a secret key as part of
    * the data already digested
    *
    * @param {Handle} session Session's handle
    * @param {Buffer} inData Incoming data
    */
  def C_DigestUpdate(session: Handle, inData: Buffer): Unit = js.native
  
  /**
    * Encrypts single-part data
    *
    * @param {Handle} session Session's handle
    * @param {Buffer} inData Incoming data
    * @param {Buffer} outData Output data
    * @returns {Buffer}
    */
  def C_Encrypt(session: Handle, inData: Buffer, outData: Buffer): Buffer = js.native
  /**
    * Encrypts single-part data
    *
    * @param {Handle} session Session's handle
    * @param {Buffer} inData Incoming data
    * @param {Buffer} outData Output data
    * @param {(error: Error, data: Buffer) => void} cb Async callback with sliced output data
    */
  def C_Encrypt(
    session: Handle,
    inData: Buffer,
    outData: Buffer,
    cb: js.Function2[/* error */ Error, /* data */ Buffer, Unit]
  ): Unit = js.native
  
  /**
    * Finishes a multiple-part encryption operation
    *
    * @param {Handle} session Session's handle
    * @param {Buffer} outData Last coming data
    * @returns {Buffer} Sliced coming data
    */
  def C_EncryptFinal(session: Handle, outData: Buffer): Buffer = js.native
  
  //#endregion
  //#region Encryption and decryption
  /**
    * Initializes an encryption operation
    *
    * @param {Handle} session The session's handle
    * @param {Mechanism} mechanism The encryption mechanism
    * @param {Handle} key Handle of encryption key
    */
  def C_EncryptInit(session: Handle, mechanism: Mechanism, key: Handle): Unit = js.native
  
  /**
    * Continues a multiple-part encryption operation
    *
    * @param {Handle} session Session's handle
    * @param {Buffer} inData Incoming data
    * @param {Buffer} outData Coming data
    * @returns {Buffer} Sliced coming data
    */
  def C_EncryptUpdate(session: Handle, inData: Buffer, outData: Buffer): Buffer = js.native
  
  /**
    * Indicates that an application is done with the Cryptoki library
    */
  def C_Finalize(): Unit = js.native
  
  /**
    * Continues a search for token and session
    * objects that match a template, obtaining additional object
    * handles
    *
    * @param {Handle} session Session's handle
    * @returns {Handle} gets Object's handle. If Object is not found
    * the result is Null
    */
  def C_FindObjects(session: Handle): Handle = js.native
  /**
    * Continues a search for token and session
    * objects that match a template, obtaining additional object
    * handles
    *
    * @param {Handle} session Session's handle
    * @param {number} session The maximum number of object handles to be returned
    * @returns {Handle} gets list of Object handles
    */
  def C_FindObjects(session: Handle, maxObjectCount: Double): js.Array[Handle] = js.native
  
  /**
    * Finishes a search for token and session objects
    *
    * @param {Handle} session The session's handle
    */
  def C_FindObjectsFinal(session: Handle): Unit = js.native
  
  /**
    * Initializes a search for token and session objects that match a template
    *
    * @param {Handle} session The session's handle
    * @param {Template} template Attribute values to match
    */
  def C_FindObjectsInit(session: Handle, template: Template): Unit = js.native
  
  // C_VerifyRecoverInit();
  // C_VerifyRecover();
  //#endregion
  //#region Key management
  /**
    * Generates a secret key, creating a new key object
    *
    * @param {Handle} session Session's handle
    * @param {Mechanism} mechanism Key generation mechanism
    * @param {Template} template Template for new key
    * @returns {Handle} Gets handle of new key
    */
  def C_GenerateKey(session: Handle, mechanism: Mechanism, template: Template): Handle = js.native
  /**
    * Generates a secret key, creating a new key object
    *
    * @param {Handle} session Session's handle
    * @param {Mechanism} mechanism Key generation mechanism
    * @param {Template} template Template for new key
    * @param {(error: Error, key: Handle) => void} cb Async callback with handle of ne key
    */
  def C_GenerateKey(
    session: Handle,
    mechanism: Mechanism,
    template: Template,
    cb: js.Function2[/* error */ Error, /* key */ Handle, Unit]
  ): Unit = js.native
  
  /**
    * Generates a public-key/private-key pair,
    * creating new key objects
    *
    * @param {Handle} session Session's handle
    * @param {Mechanism} mechanism Key generation mechanism
    * @param {Template} publicTmpl Template for public key
    * @param {Template} privateTmpl Template for private key
    * @returns {KeyPair} Get handles for private and public keys
    */
  def C_GenerateKeyPair(session: Handle, mechanism: Mechanism, publicTmpl: Template, privateTmpl: Template): KeyPair = js.native
  /**
    * Generates a public-key/private-key pair,
    * creating new key objects
    *
    * @param {Handle} session Session's handle
    * @param {Mechanism} mechanism Key generation mechanism
    * @param {Template} publicTmpl Template for public key
    * @param {Template} privateTmpl Template for private key
    * @param {(error: Error, keys: KeyPair) => void} cb Async callback with handles for private and public keys
    */
  def C_GenerateKeyPair(
    session: Handle,
    mechanism: Mechanism,
    publicTmpl: Template,
    privateTmpl: Template,
    cb: js.Function2[/* error */ Error, /* keys */ KeyPair, Unit]
  ): Unit = js.native
  
  /**
    * Generates random data
    *
    * @param {Handle} session Session's handle
    * @param {Buffer} buf Init buffer
    * @returns {Buffer} Receives the random data
    */
  def C_GenerateRandom(session: Handle, buf: Buffer): Buffer = js.native
  
  /**
    * Obtains the value of one or more object attributes
    *
    * @param {Handle} session The session's handle
    * @param {Handle} object The object's handle
    * @param {Template} template Specifies attrs; gets values
    * @returns {Template} Receives attributes with values
    */
  def C_GetAttributeValue(session: Handle, `object`: Handle, template: Template): Template = js.native
  
  /**
    * Returns general information about Cryptoki
    *
    * @returns {ModuleInfo}
    */
  def C_GetInfo(): ModuleInfo = js.native
  
  /**
    * Obtains information about a particular mechanism possibly supported by a token
    *
    * @param {Handle} slot ID of the token's slot
    * @param {number} mech Type of mechanism
    * @returns {MechanismInfo} Receives mechanism info
    */
  def C_GetMechanismInfo(slot: Handle, mech: Double): MechanismInfo = js.native
  
  /**
    * Obtains a list of mechanism types supported by a token
    *
    * @param {Handle} slot ID of token's slot
    * @returns {number[]} Gets mech. array
    */
  def C_GetMechanismList(slot: Handle): js.Array[Double] = js.native
  
  /**
    * Gets the size of an object in bytes
    *
    * @param {Handle} session The session's handle
    * @param {Handle} object The object's handle
    * @returns {number} Receives size of object
    */
  def C_GetObjectSize(session: Handle, `object`: Handle): Double = js.native
  
  /**
    * Obtains information about the session
    *
    * @param {Handle} session The session's handle
    * @returns {SessionInfo} Receives session info
    */
  def C_GetSessionInfo(session: Handle): SessionInfo = js.native
  
  /**
    * Obtains information about a particular slot in the system
    *
    * @param {Handle} slot The ID of the slot
    * @returns {SlotInfo} Receives the slot information
    */
  def C_GetSlotInfo(slot: Handle): SlotInfo = js.native
  
  //#region Slot and token management
  /**
    * obtains a list of slots in the system
    *
    * @param {boolean} [tokenPresent] Only slots with tokens?
    * @returns {Handle[]} Array of slot IDs
    */
  def C_GetSlotList(): js.Array[Handle] = js.native
  def C_GetSlotList(tokenPresent: Boolean): js.Array[Handle] = js.native
  
  /**
    * Obtains information about a particular token in the system
    *
    * @param {Handle} slot ID of the token's slot
    * @returns {TokenInfo} Receives the token information
    */
  def C_GetTokenInfo(slot: Handle): TokenInfo = js.native
  
  /**
    * Initializes the normal user's PIN
    *
    * @param {Handle} session The session's handle
    * @param {string} [pin] The normal user's PIN
    */
  def C_InitPIN(session: Handle): Unit = js.native
  def C_InitPIN(session: Handle, pin: String): Unit = js.native
  
  /**
    * Initializes a token
    *
    * @param {Handle} slot ID of the token's slot
    * @param {string} [pin] The SO's initial PIN
    * @returns {string} 32-byte token label (blank padded)
    */
  def C_InitToken(slot: Handle): String = js.native
  def C_InitToken(slot: Handle, pin: js.UndefOr[scala.Nothing], label: String): String = js.native
  def C_InitToken(slot: Handle, pin: String): String = js.native
  def C_InitToken(slot: Handle, pin: String, label: String): String = js.native
  
  /**
    * Initializes the Cryptoki library
    * @param options Initialization options
    * Supports implementation of standard `CK_C_INITIALIZE_ARGS` and extended NSS format.
    * - if `options` is null or empty, it calls native `C_Initialize` with `NULL`
    * - if `options` doesn't have `libraryParameters`, it uses `CK_C_INITIALIZE_ARGS` structure
    * - if `options` has `libraryParameters`, it uses extended NSS structure
    */
  def C_Initialize(): Unit = js.native
  def C_Initialize(options: InitializationOptions): Unit = js.native
  
  /**
    * Logs a user into a token
    *
    * @param {Handle} session The session's handle
    * @param {number} userType The user type
    * @param {string} [pin] The user's PIN
    */
  def C_Login(session: Handle, userType: Double): Unit = js.native
  def C_Login(session: Handle, userType: Double, pin: String): Unit = js.native
  
  /**
    * Logs a user out from a token
    *
    * @param {Handle} session The session's handle
    */
  def C_Logout(session: Handle): Unit = js.native
  
  //#endregion
  //#region Session management
  /**
    * Opens a session between an application and a token
    *
    * @param {Handle} slot The slot's ID
    * @param {number} flags From CK_SESSION_INFO
    * @returns {Handle} Gets session handle
    */
  def C_OpenSession(slot: Handle, flags: Double): Handle = js.native
  
  /**
    * Mixes additional seed material into the token's random number generator
    *
    * @param {Handle} session Session's handle
    * @param {Buffer} buf The seed material
    * @returns {Buffer} Seeded data
    */
  def C_SeedRandom(session: Handle, buf: Buffer): Buffer = js.native
  
  /**
    * Modifies the value of one or more object attributes
    *
    * @param {Handle} session The session's handle
    * @param {Handle} object The object's handle
    * @param {Template} template Specifies attrs and values
    */
  def C_SetAttributeValue(session: Handle, `object`: Handle, template: Template): Unit = js.native
  
  /**
    * Modifies the PIN of the user who is logged in
    *
    * @param {Handle} session The session's handle
    * @param {string} oldPin The old PIN
    * @param {string} newPin The new PIN
    */
  def C_SetPIN(session: Handle, oldPin: String, newPin: String): Unit = js.native
  
  /**
    * Signs (encrypts with private key) data in a single
    * part, where the signature is (will be) an appendix to the
    * data, and plaintext cannot be recovered from the signature
    *
    * @param {Handle} session Session's handle
    * @param {Buffer} inData Incoming data
    * @param {Buffer} outData Coming data
    * @returns {Buffer} Sliced coming data
    */
  def C_Sign(session: Handle, inData: Buffer, outData: Buffer): Buffer = js.native
  /**
    * Signs (encrypts with private key) data in a single
    * part, where the signature is (will be) an appendix to the
    * data, and plaintext cannot be recovered from the signature
    *
    * @param {Handle} session Session's handle
    * @param {Buffer} inData Incoming data
    * @param {Buffer} outData Coming data
    * @param {(error: Error, data: Buffer) => void} cb Async callback with sliced coming data
    */
  def C_Sign(
    session: Handle,
    inData: Buffer,
    outData: Buffer,
    cb: js.Function2[/* error */ Error, /* data */ Buffer, Unit]
  ): Unit = js.native
  
  /**
    * Finishes a multiple-part signature operation,
    * returning the signature
    *
    * @param {Handle} session Session's handle
    * @param {Buffer} outData Coming data
    * @returns {Buffer} Sliced coming data
    */
  def C_SignFinal(session: Handle, outData: Buffer): Buffer = js.native
  
  // C_DigestKey();
  //#endregion
  //#region Signing and MACing
  /**
    * initializes a signature (private key encryption)
    * operation, where the signature is (will be) an appendix to
    * the data, and plaintext cannot be recovered from the
    * signature
    *
    * @param {Handle} session Session's handle
    * @param {Mechanism} mechanism Signature mechanism
    * @param {Handle} key Handle of signature key
    */
  def C_SignInit(session: Handle, mechanism: Mechanism, key: Handle): Unit = js.native
  
  /**
    * continues a multiple-part signature operation,
    * where the signature is (will be) an appendix to the data,
    * and plaintext cannot be recovered from the signature
    *
    * @param {Handle} session Session's handle
    * @param {Buffer} inData Incoming data
    */
  def C_SignUpdate(session: Handle, inData: Buffer): Unit = js.native
  
  /**
    * Unwraps (decrypts) a wrapped key, creating a new key object
    *
    * @param {Handle} session Session's handle
    * @param {Mechanism} mechanism Unwrapping mechanism
    * @param {Handle} unwrappingKey Unwrapping key
    * @param {Buffer} wrappedKey Wrapped key
    * @param {Template} template New key template
    * @returns {Handle} Gets new handle
    */
  def C_UnwrapKey(
    session: Handle,
    mechanism: Mechanism,
    unwrappingKey: Handle,
    wrappedKey: Buffer,
    template: Template
  ): Handle = js.native
  /**
    * Unwraps (decrypts) a wrapped key, creating a new key object
    *
    * @param {Handle} session Session's handle
    * @param {Mechanism} mechanism Unwrapping mechanism
    * @param {Handle} unwrappingKey Unwrapping key
    * @param {Buffer} wrappedKey Wrapped key
    * @param {Template} template New key template
    * @param {(error: Error, key: Handle) => void} cb Async callback with new key handle
    */
  def C_UnwrapKey(
    session: Handle,
    mechanism: Mechanism,
    unwrappingKey: Handle,
    wrappedKey: Buffer,
    template: Template,
    cb: js.Function2[/* error */ Error, /* key */ Handle, Unit]
  ): Unit = js.native
  
  /**
    * Verifies a signature in a single-part operation,
    * where the signature is an appendix to the data, and plaintext
    * cannot be recovered from the signature
    *
    * @param {Handle} session Session's handle
    * @param {Buffer} inData Incoming data
    * @param {Buffer} signature Signature to verify
    * @returns {boolean} Verification result
    */
  def C_Verify(session: Handle, inData: Buffer, signature: Buffer): Boolean = js.native
  /**
    * Verifies a signature in a single-part operation,
    * where the signature is an appendix to the data, and plaintext
    * cannot be recovered from the signature
    *
    * @param {Handle} session Session's handle
    * @param {Buffer} inData Incoming data
    * @param {Buffer} signature Signature to verify
    * @param {(error: Error, verify: boolean) => void} cb Async callback with verification result
    */
  def C_Verify(
    session: Handle,
    inData: Buffer,
    signature: Buffer,
    cb: js.Function2[/* error */ Error, /* verify */ Boolean, Unit]
  ): Unit = js.native
  
  /**
    * Finishes a multiple-part verification
    * operation, checking the signature
    *
    * @param {Handle} session Session's handle
    * @param {Buffer} signature Signature to verify
    * @returns {boolean}
    */
  def C_VerifyFinal(session: Handle, signature: Buffer): Boolean = js.native
  
  // C_SignRecoverInit();
  // C_SignRecover();
  //#endregion
  //#region Verifying signatures and MACs
  /**
    * initializes a verification operation, where the
    * signature is an appendix to the data, and plaintext cannot
    * cannot be recovered from the signature (e.g. DSA)
    *
    * @param {Handle} session Session's handle
    * @param {Mechanism} mechanism Verification mechanism
    * @param {Handle} key Verification key
    */
  def C_VerifyInit(session: Handle, mechanism: Mechanism, key: Handle): Unit = js.native
  
  /**
    * Continues a multiple-part verification
    * operation, where the signature is an appendix to the data,
    * and plaintext cannot be recovered from the signature
    *
    * @param {Handle} session Session's handle
    * @param {Buffer} inData Incoming data
    */
  def C_VerifyUpdate(session: Handle, inData: Buffer): Unit = js.native
  
  /**
    * Wraps (i.e., encrypts) a key
    *
    * @param {Handle} session Session's handle
    * @param {Mechanism} mechanism Wrapping mechanism
    * @param {Handle} wrappingKey Wrapping key
    * @param {Handle} key Key to be wrapped
    * @param {Buffer} wrappedKey Init buffer for wrapped key
    * @returns {Buffer} Sliced wrapped key
    */
  def C_WrapKey(session: Handle, mechanism: Mechanism, wrappingKey: Handle, key: Handle, wrappedKey: Buffer): Buffer = js.native
  /**
    * Wraps (i.e., encrypts) a key
    *
    * @param {Handle} session Session's handle
    * @param {Mechanism} mechanism Wrapping mechanism
    * @param {Handle} wrappingKey Wrapping key
    * @param {Handle} key Key to be wrapped
    * @param {Buffer} wrappedKey Init buffer for wrapped key
    * @param {(error: Error, wrappedKey: Buffer) => void} cb Async callback with sliced wrapped key
    */
  def C_WrapKey(
    session: Handle,
    mechanism: Mechanism,
    wrappingKey: Handle,
    key: Handle,
    wrappedKey: Buffer,
    cb: js.Function2[/* error */ Error, /* wrappedKey */ Buffer, Unit]
  ): Unit = js.native
  
  /**
    * Closes dynamic library
    *
    */
  def close(): Unit = js.native
  
  /**
    * Library path
    */
  var libPath: String = js.native
  
  /**
    * Loads dynamic library with PKCS#11 interface
    *
    * @param {string} path
    */
  def load(path: String): Unit = js.native
}
