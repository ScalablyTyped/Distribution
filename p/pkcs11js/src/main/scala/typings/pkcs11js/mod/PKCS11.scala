package typings.pkcs11js.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pkcs11js", "PKCS11")
@js.native
open class PKCS11 () extends StObject {
  
  /**
    * Closes all sessions with a token
    * @param slot The token's slot
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def C_CloseAllSessions(slot: Handle): Unit = js.native
  
  /**
    * Closes a session between an application and a token
    * @param session The session's handle
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def C_CloseSession(session: Handle): Unit = js.native
  
  /**
    * Copies an object, creating a new object for the copy
    * @param session The session's handle
    * @param object The object's handle
    * @param template Template for new object
    * @returns A handle of copy
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def C_CopyObject(session: Handle, `object`: Handle, template: Template): Handle = js.native
  
  //#endregion
  //#region Object management
  /**
    * Creates a new object
    * @param session The session's handle
    * @param template The object's template
    * @returns A new object's handle
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def C_CreateObject(session: Handle, template: Template): Handle = js.native
  
  /**
    * Decrypts encrypted data in a single part
    * @param session The session's handle
    * @param inData Incoming data
    * @param outData Output data
    * @returns Sliced output data with decrypted message
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def C_Decrypt(session: Handle, inData: Buffer, outData: Buffer): Buffer = js.native
  /**
    * Decrypts encrypted data in a single part
    * @param session The session's handle
    * @param inData Incoming data
    * @param outData Output data
    * @param cb Async callback with sliced output data
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def C_Decrypt(
    session: Handle,
    inData: Buffer,
    outData: Buffer,
    cb: js.Function2[/* error */ js.Error, /* data */ Buffer, Unit]
  ): Unit = js.native
  
  /**
    * Decrypts encrypted data in a single part
    * @param session The session's handle
    * @param inData Incoming data
    * @param outData Output data
    * @returns Sliced output data with decrypted message
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def C_DecryptAsync(session: Handle, inData: Buffer, outData: Buffer): js.Promise[Buffer] = js.native
  
  /**
    * Finishes a multiple-part decryption operation
    * @param session The session's handle
    * @param outData Last part of output data
    * @returns Sliced output data with decrypted final block
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def C_DecryptFinal(session: Handle, outData: Buffer): Buffer = js.native
  
  /**
    * Initializes a decryption operation
    * @param session The session's handle
    * @param mechanism The decryption mechanism
    * @param key Handle of decryption key
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def C_DecryptInit(session: Handle, mechanism: Mechanism, key: Handle): Unit = js.native
  
  /**
    * continues a multiple-part decryption operation
    * @param session The session's handle
    * @param inData Incoming data
    * @param outData Output data
    * @returns Sliced output data with decrypted block
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def C_DecryptUpdate(session: Handle, inData: Buffer, outData: Buffer): Buffer = js.native
  
  /**
    * Derives a key from a base key, creating a new key object
    * @param session The session's handle
    * @param mechanism The key derivation mechanism
    * @param key The base key
    * @param template The template for the new key
    * @returns The derived key handle
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def C_DeriveKey(session: Handle, mechanism: Mechanism, key: Handle, template: Template): Handle = js.native
  /**
    * Derives a key from a base key, creating a new key object
    * @param session The session's handle
    * @param mechanism The key derivation mechanism
    * @param key The base key
    * @param template The template for the new key
    * @param cb Async callback with the derived key handle
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def C_DeriveKey(
    session: Handle,
    mechanism: Mechanism,
    key: Handle,
    template: Template,
    cb: js.Function2[/* error */ js.Error, /* hKey */ Handle, Unit]
  ): Unit = js.native
  
  /**
    * Derives a key from a base key, creating a new key object
    * @param session The session's handle
    * @param mechanism The key derivation mechanism
    * @param key The base key
    * @param template The template for the new key
    * @returns The derived key handle
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def C_DeriveKeyAsync(session: Handle, mechanism: Mechanism, key: Handle, template: Template): js.Promise[Handle] = js.native
  
  /**
    * Destroys an object
    * @param session The session's handle
    * @param object The object's handle
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def C_DestroyObject(session: Handle, `object`: Handle): Unit = js.native
  
  /**
    * Digests data in a single part
    * @param session The session's handle
    * @param inData Incoming data
    * @param outData Output data
    * @returns Sliced output data
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def C_Digest(session: Handle, inData: Buffer, outData: Buffer): Buffer = js.native
  /**
    * Digests data in a single part
    * @param session The session's handle
    * @param inData Incoming data
    * @param outData Output data
    * @param cb Async callback with sliced output data
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def C_Digest(
    session: Handle,
    inData: Buffer,
    outData: Buffer,
    cb: js.Function2[/* error */ js.Error, /* data */ Buffer, Unit]
  ): Unit = js.native
  
  /**
    * Digests data in a single part
    * @param session The session's handle
    * @param inData Incoming data
    * @param outData Output data
    * @returns Sliced output data
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def C_DigestAsync(session: Handle, inData: Buffer, outData: Buffer): js.Promise[Buffer] = js.native
  
  /**
    * Finishes a multiple-part message-digesting operation
    * @param session The session's handle
    * @param outData Output data
    * @returns Sliced output data
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def C_DigestFinal(session: Handle, outData: Buffer): Buffer = js.native
  
  /* Message digesting */
  /**
    * Initializes a message-digesting operation
    * @param session The session's handle
    * @param mechanism Digesting mechanism
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def C_DigestInit(session: Handle, mechanism: Mechanism): Unit = js.native
  
  /**
    * Continues a multiple-part message-digesting operation by digesting the value of a secret key
    * @param session The session's handle
    * @param key The handle of the secret key to be digested
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def C_DigestKey(session: Handle, key: Handle): Unit = js.native
  
  /**
    * continues a multiple-part message-digesting operation
    * operation, by digesting the value of a secret key as part of
    * the data already digested
    * @param session The session's handle
    * @param inData Incoming data
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def C_DigestUpdate(session: Handle, inData: Buffer): Unit = js.native
  
  /**
    * Encrypts single-part data
    * @param session The session's handle
    * @param inData Incoming data
    * @param outData Output data
    * @returns Sliced output data with encrypted message
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def C_Encrypt(session: Handle, inData: Buffer, outData: Buffer): Buffer = js.native
  /**
    * Encrypts single-part data
    * @param session The session's handle
    * @param inData Incoming data
    * @param outData Output data
    * @param cb Async callback with sliced output data
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def C_Encrypt(
    session: Handle,
    inData: Buffer,
    outData: Buffer,
    cb: js.Function2[/* error */ js.Error, /* data */ Buffer, Unit]
  ): Unit = js.native
  
  /**
    * Encrypts single-part data
    * @param session The session's handle
    * @param inData Incoming data
    * @param outData Output data
    * @returns Sliced output data with encrypted message
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def C_EncryptAsync(session: Handle, inData: Buffer, outData: Buffer): js.Promise[Buffer] = js.native
  
  /**
    * Finishes a multiple-part encryption operation
    * @param session The session's handle
    * @param outData Last output data
    * @returns Sliced output data
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def C_EncryptFinal(session: Handle, outData: Buffer): Buffer = js.native
  
  //#endregion
  //#region Encryption and decryption
  /**
    * Initializes an encryption operation
    * @param session The session's handle
    * @param mechanism The encryption mechanism
    * @param key Handle of encryption key
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def C_EncryptInit(session: Handle, mechanism: Mechanism, key: Handle): Unit = js.native
  
  /**
    * Continues a multiple-part encryption operation
    * @param session The session's handle
    * @param inData Incoming data
    * @param outData Output data
    * @returns Sliced output data
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def C_EncryptUpdate(session: Handle, inData: Buffer, outData: Buffer): Buffer = js.native
  
  /**
    * Indicates that an application is done with the Cryptoki library
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def C_Finalize(): Unit = js.native
  
  /**
    * Continues a search for token and session
    * objects that match a template, obtaining additional object
    * handles
    * @param session The session's handle
    * @returns Object's handle. If object is not found
    * the result is null
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def C_FindObjects(session: Handle): Handle | Null = js.native
  /**
    * Continues a search for token and session
    * objects that match a template, obtaining additional object
    * handles
    * @param session The session's handle
    * @param session The maximum number of object handles to be returned
    * @returns List of handles
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def C_FindObjects(session: Handle, maxObjectCount: Double): js.Array[Handle] = js.native
  
  /**
    * Finishes a search for token and session objects
    * @param session The session's handle
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def C_FindObjectsFinal(session: Handle): Unit = js.native
  
  /**
    * Initializes a search for token and session objects that match a template
    * @param session The session's handle
    * @param template Attribute values to match
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def C_FindObjectsInit(session: Handle, template: Template): Unit = js.native
  
  //#endregion
  //#region Key management
  /**
    * Generates a secret key, creating a new key object
    * @param session The session's handle
    * @param mechanism Key generation mechanism
    * @param template Template for new key
    * @returns The handle of the new key
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def C_GenerateKey(session: Handle, mechanism: Mechanism, template: Template): Handle = js.native
  /**
    * Generates a secret key, creating a new key object
    * @param session The session's handle
    * @param mechanism Key generation mechanism
    * @param template Template for new key
    * @param cb Async callback with handle of new key
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def C_GenerateKey(
    session: Handle,
    mechanism: Mechanism,
    template: Template,
    cb: js.Function2[/* error */ js.Error, /* key */ Handle, Unit]
  ): Unit = js.native
  
  /**
    * Generates a secret key, creating a new key object
    * @param session The session's handle
    * @param mechanism The key generation mechanism
    * @param template The template for the new key
    * @returns The handle of the new key
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def C_GenerateKeyAsync(session: Handle, mechanism: Mechanism, template: Template): js.Promise[Handle] = js.native
  
  /**
    * Generates a public-key/private-key pair,
    * creating new key objects
    * @param session The session's handle
    * @param mechanism Key generation mechanism
    * @param publicTmpl Template for public key
    * @param privateTmpl Template for private key
    * @returns The pair of handles for private and public keys
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def C_GenerateKeyPair(session: Handle, mechanism: Mechanism, publicTmpl: Template, privateTmpl: Template): KeyPair = js.native
  /**
    * Generates a public-key/private-key pair,
    * creating new key objects
    * @param session The session's handle
    * @param mechanism Key generation mechanism
    * @param publicTmpl Template for public key
    * @param privateTmpl Template for private key
    * @param cb Async callback with handles for private and public keys
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def C_GenerateKeyPair(
    session: Handle,
    mechanism: Mechanism,
    publicTmpl: Template,
    privateTmpl: Template,
    cb: js.Function2[/* error */ js.Error, /* keys */ KeyPair, Unit]
  ): Unit = js.native
  
  /**
    * Generates a public-key/private-key pair,
    * creating new key objects
    * @param session The session's handle
    * @param mechanism Key generation mechanism
    * @param publicTmpl Template for public key
    * @param privateTmpl Template for private key
    * @returns Handles for private and public keys
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def C_GenerateKeyPairAsync(session: Handle, mechanism: Mechanism, publicTmpl: Template, privateTmpl: Template): js.Promise[KeyPair] = js.native
  
  /**
    * Generates random data
    * @param session The session's handle
    * @param buf Init buffer
    * @returns The random data
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def C_GenerateRandom(session: Handle, buf: Buffer): Buffer = js.native
  
  /**
    * Obtains the value of one or more object attributes
    * @param session The session's handle
    * @param object The object's handle
    * @param template Specifies attrs; gets values
    * @returns List of Attributes with values
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def C_GetAttributeValue(session: Handle, `object`: Handle, template: Template): Template = js.native
  
  /**
    * Returns general information about Cryptoki
    * @returns Information about Cryptoki
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def C_GetInfo(): ModuleInfo = js.native
  
  /**
    * Obtains information about a particular mechanism possibly supported by a token
    * @param slot ID of the token's slot
    * @param mech Type of mechanism
    * @returns Information about mechanism
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def C_GetMechanismInfo(slot: Handle, mech: Double): MechanismInfo = js.native
  
  /**
    * Obtains a list of mechanism types supported by a token
    * @param slot ID of token's slot
    * @returns A list of mechanism types
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def C_GetMechanismList(slot: Handle): js.Array[Double] = js.native
  
  /**
    * Gets the size of an object in bytes
    * @param session The session's handle
    * @param object The object's handle
    * @returns Size of an object in bytes
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def C_GetObjectSize(session: Handle, `object`: Handle): Double = js.native
  
  /**
    * Obtains information about the session
    * @param session The session's handle
    * @returns Receives session info
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def C_GetSessionInfo(session: Handle): SessionInfo = js.native
  
  /**
    * Obtains information about a particular slot in the system
    * @param  slot The ID of the slot
    * @returns Information about a slot
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def C_GetSlotInfo(slot: Handle): SlotInfo = js.native
  
  //#region Slot and token management
  /**
    * Obtains a list of slots in the system
    * @param [tokenPresent] Only slots with tokens?
    * @returns Array of slot IDs
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def C_GetSlotList(): js.Array[Handle] = js.native
  def C_GetSlotList(tokenPresent: Boolean): js.Array[Handle] = js.native
  
  /**
    * Obtains information about a particular token in the system
    * @param slot ID of the token's slot
    * @returns Information about a token
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def C_GetTokenInfo(slot: Handle): TokenInfo = js.native
  
  /**
    * Initializes the normal user's PIN
    * @param session The session's handle
    * @param pin The normal user's PIN
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def C_InitPIN(session: Handle): Unit = js.native
  def C_InitPIN(session: Handle, pin: String): Unit = js.native
  
  /**
    * Initializes a token
    * @param slot ID of the token's slot
    * @param [pin] The SO's initial PIN
    * @returns 32-byte token label (blank padded)
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def C_InitToken(slot: Handle): String = js.native
  def C_InitToken(slot: Handle, pin: String): String = js.native
  def C_InitToken(slot: Handle, pin: String, label: String): String = js.native
  def C_InitToken(slot: Handle, pin: Unit, label: String): String = js.native
  
  /**
    * Initializes the Cryptoki library
    * @param options Initialization options
    * Supports implementation of standard `CK_C_INITIALIZE_ARGS` and extended NSS format.
    * - if `options` is null or empty, it calls native `C_Initialize` with `NULL`
    * - if `options` doesn't have `libraryParameters`, it uses `CK_C_INITIALIZE_ARGS` structure
    * - if `options` has `libraryParameters`, it uses extended NSS structure
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def C_Initialize(): Unit = js.native
  def C_Initialize(options: InitializationOptions): Unit = js.native
  
  /**
    * Logs a user into a token
    * @param session The session's handle
    * @param userType The user type
    * @param [pin] The user's PIN
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def C_Login(session: Handle, userType: Double): Unit = js.native
  def C_Login(session: Handle, userType: Double, pin: String): Unit = js.native
  
  /**
    * Logs a user out from a token
    * @param session The session's handle
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def C_Logout(session: Handle): Unit = js.native
  
  //#endregion
  //#region Session management
  /**
    * Opens a session between an application and a token
    * @param slot The slot's ID
    * @param flags From CK_SESSION_INFO
    * @returns Session handle
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def C_OpenSession(slot: Handle, flags: Double): Handle = js.native
  
  /**
    * Mixes additional seed material into the token's random number generator
    * @param session The session's handle
    * @param buf The seed material
    * @returns The seeded data
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def C_SeedRandom(session: Handle, buf: Buffer): Buffer = js.native
  
  /**
    * Modifies the value of one or more object attributes
    * @param session The session's handle
    * @param object The object's handle
    * @param template Specifies attrs and values
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def C_SetAttributeValue(session: Handle, `object`: Handle, template: Template): Unit = js.native
  
  /**
    * Modifies the PIN of the user who is logged in
    * @param session The session's handle
    * @param oldPin The old PIN
    * @param newPin The new PIN
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def C_SetPIN(session: Handle, oldPin: String, newPin: String): Unit = js.native
  
  /**
    * Signs (encrypts with private key) data in a single
    * part, where the signature is (will be) an appendix to the
    * data, and plaintext cannot be recovered from the signature
    * @param session The session's handle
    * @param inData Incoming data
    * @param outData Output data
    * @returns Sliced output data
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def C_Sign(session: Handle, inData: Buffer, outData: Buffer): Buffer = js.native
  /**
    * Signs (encrypts with private key) data in a single
    * part, where the signature is (will be) an appendix to the
    * data, and plaintext cannot be recovered from the signature
    * @param session The session's handle
    * @param inData Incoming data
    * @param outData Output data
    * @param cb Async callback with sliced output data
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def C_Sign(
    session: Handle,
    inData: Buffer,
    outData: Buffer,
    cb: js.Function2[/* error */ js.Error, /* data */ Buffer, Unit]
  ): Unit = js.native
  
  /**
    * Signs (encrypts with private key) data in a single
    * part, where the signature is (will be) an appendix to the
    * data, and plaintext cannot be recovered from the signature
    * @param session The session's handle
    * @param inData Incoming data
    * @param outData Output data
    * @returns Sliced output data
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def C_SignAsync(session: Handle, inData: Buffer, outData: Buffer): js.Promise[Buffer] = js.native
  
  /**
    * Finishes a multiple-part signature operation,
    * returning the signature
    * @param session The session's handle
    * @param outData Output data
    * @returns Sliced output data
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def C_SignFinal(session: Handle, outData: Buffer): Buffer = js.native
  
  //#endregion
  //#region Signing and MACing
  /**
    * initializes a signature (private key encryption)
    * operation, where the signature is (will be) an appendix to
    * the data, and plaintext cannot be recovered from the
    * signature
    * @param session The session's handle
    * @param mechanism Signature mechanism
    * @param key Handle of signature key
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def C_SignInit(session: Handle, mechanism: Mechanism, key: Handle): Unit = js.native
  
  /**
    * Signs data in a single operation, where the data can be recovered from the signature
    * @param session 
    * @param inData Incoming data
    * @param outData Output data
    * @returns Sliced output data
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def C_SignRecover(session: Handle, inData: Buffer, outData: Buffer): Buffer = js.native
  
  /**
    * Initializes a signature operation, where the data can be recovered from the signature
    * @param session The session's handle
    * @param mechanism The structure that specifies the signature mechanism 
    * @param key The handle of the signature key
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def C_SignRecoverInit(session: Handle, mechanism: Mechanism, key: Handle): Unit = js.native
  
  /**
    * Continues a multiple-part signature operation,
    * where the signature is (will be) an appendix to the data,
    * and plaintext cannot be recovered from the signature
    * @param session The session's handle
    * @param inData Incoming data
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def C_SignUpdate(session: Handle, inData: Buffer): Unit = js.native
  
  /**
    * Unwraps (decrypts) a wrapped key, creating a new key object
    * @param session The session's handle
    * @param mechanism Unwrapping mechanism
    * @param unwrappingKey Unwrapping key
    * @param wrappedKey Wrapped key
    * @param template New key template
    * @returns The unwrapped key handle
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
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
    * @param session The session's handle
    * @param mechanism Unwrapping mechanism
    * @param unwrappingKey Unwrapping key
    * @param wrappedKey Wrapped key
    * @param template New key template
    * @param cb Async callback with new key handle
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def C_UnwrapKey(
    session: Handle,
    mechanism: Mechanism,
    unwrappingKey: Handle,
    wrappedKey: Buffer,
    template: Template,
    cb: js.Function2[/* error */ js.Error, /* key */ Handle, Unit]
  ): Unit = js.native
  
  /**
    * Unwraps (decrypts) a wrapped key, creating a new key object
    * @param session The session's handle
    * @param mechanism Unwrapping mechanism
    * @param unwrappingKey Unwrapping key
    * @param wrappedKey Wrapped key
    * @param template New key template
    * @returns The unwrapped key handle
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def C_UnwrapKeyAsync(
    session: Handle,
    mechanism: Mechanism,
    unwrappingKey: Handle,
    wrappedKey: Buffer,
    template: Template
  ): js.Promise[Handle] = js.native
  
  /**
    * Verifies a signature in a single-part operation,
    * where the signature is an appendix to the data, and plaintext
    * cannot be recovered from the signature
    * @param session The session's handle
    * @param inData Incoming data
    * @param signature Signature to verify
    * @returns Verification result
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def C_Verify(session: Handle, inData: Buffer, signature: Buffer): Boolean = js.native
  /**
    * Verifies a signature in a single-part operation,
    * where the signature is an appendix to the data, and plaintext
    * cannot be recovered from the signature
    * @param session The session's handle
    * @param inData Incoming data
    * @param signature Signature to verify
    * @param cb Async callback with verification result
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def C_Verify(
    session: Handle,
    inData: Buffer,
    signature: Buffer,
    cb: js.Function2[/* error */ js.Error, /* verify */ Boolean, Unit]
  ): Unit = js.native
  
  /**
    * Verifies a signature in a single-part operation,
    * where the signature is an appendix to the data, and plaintext
    * cannot be recovered from the signature
    * @param session The session's handle
    * @param inData Incoming data
    * @param signature Signature to verify
    * @returns Verification result
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def C_VerifyAsync(session: Handle, inData: Buffer, signature: Buffer): js.Promise[Boolean] = js.native
  
  /**
    * Finishes a multiple-part verification
    * operation, checking the signature
    * @param session The session's handle
    * @param signature Signature to verify
    * @returns
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def C_VerifyFinal(session: Handle, signature: Buffer): Boolean = js.native
  
  //#endregion
  //#region Verifying signatures and MACs
  /**
    * initializes a verification operation, where the
    * signature is an appendix to the data, and plaintext cannot
    * cannot be recovered from the signature (e.g. DSA)
    * @param session The session's handle
    * @param mechanism Verification mechanism
    * @param key Verification key
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def C_VerifyInit(session: Handle, mechanism: Mechanism, key: Handle): Unit = js.native
  
  /**
    * Verifies a signature in a single-part operation, where the data is recovered from the signature
    * @param session The session's handle
    * @param signature The signature to verify
    * @param outData The allocated buffer for recovered data
    * @return The sliced output data with recovered data
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def C_VerifyRecover(session: Handle, signature: Buffer, outData: Buffer): Buffer = js.native
  
  /**
    * Initializes a signature verification operation, where the data is recovered from the signature
    * @param session The session's handle
    * @param mechanism The structure that specifies the verification mechanism
    * @param key The handle of the verification key
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def C_VerifyRecoverInit(session: Handle, mechanism: Mechanism, key: Handle): Unit = js.native
  
  /**
    * Continues a multiple-part verification
    * operation, where the signature is an appendix to the data,
    * and plaintext cannot be recovered from the signature
    * @param session The session's handle
    * @param inData Incoming data
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def C_VerifyUpdate(session: Handle, inData: Buffer): Unit = js.native
  
  //#endregion
  //#region Event management
  /**
    * Waits for a slot event, such as token insertion or token removal, to occur.
    * @param flags Determines whether or not the C_WaitForSlotEvent call blocks (i.e., waits for a slot event to occur); use CKF_DONT_BLOCK for no blocking call
    * @param slotID The ID of the slot
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def C_WaitForSlotEvent(flags: Double, slotID: Handle): Unit = js.native
  
  /**
    * Wraps (i.e., encrypts) a key
    * @param session The session's handle
    * @param mechanism Wrapping mechanism
    * @param wrappingKey Wrapping key
    * @param key Key to be wrapped
    * @param wrappedKey Init buffer for wrapped key
    * @returns Sliced wrapped key
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def C_WrapKey(session: Handle, mechanism: Mechanism, wrappingKey: Handle, key: Handle, wrappedKey: Buffer): Buffer = js.native
  /**
    * Wraps (i.e., encrypts) a key
    * @param session The session's handle
    * @param mechanism Wrapping mechanism
    * @param wrappingKey Wrapping key
    * @param key Key to be wrapped
    * @param wrappedKey Init buffer for wrapped key
    * @param cb Async callback with sliced wrapped key
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def C_WrapKey(
    session: Handle,
    mechanism: Mechanism,
    wrappingKey: Handle,
    key: Handle,
    wrappedKey: Buffer,
    cb: js.Function2[/* error */ js.Error, /* wrappedKey */ Buffer, Unit]
  ): Unit = js.native
  
  /**
    * Wraps (i.e., encrypts) a key
    * @param session The session's handle
    * @param mechanism Wrapping mechanism
    * @param wrappingKey Wrapping key
    * @param key Key to be wrapped
    * @param wrappedKey Init buffer for wrapped key
    * @returns Sliced wrapped key
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def C_WrapKeyAsync(session: Handle, mechanism: Mechanism, wrappingKey: Handle, key: Handle, wrappedKey: Buffer): js.Promise[Buffer] = js.native
  
  /**
    * Closes dynamic library
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def close(): Unit = js.native
  
  /**
    * Library path
    */
  var libPath: String = js.native
  
  /**
    * Loads dynamic library with PKCS#11 interface
    * @param path The path to PKCS#11 library
    * @throws {@link NativeError} if native error occurs
    * @throws {@link Pkcs11Error} if Cryptoki error occurs
    */
  def load(path: String): Unit = js.native
}
