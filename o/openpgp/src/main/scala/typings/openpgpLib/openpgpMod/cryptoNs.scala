package typings
package openpgpLib.openpgpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "crypto")
@js.native
object cryptoNs extends js.Object {
  trait Mpi extends js.Object {
    var data: scala.Double
    def read(input: java.lang.String): scala.Double
    def write(): java.lang.String
  }
  
  /** Generating a session key for the specified symmetric algorithm
    @param algo Algorithm to use
    */
  def generateSessionKey(algo: openpgpLib.openpgpMod.enumsNs.symmetric): java.lang.String = js.native
  /** generate random byte prefix as string for the specified algorithm
    @param algo Algorithm to use
    */
  def getPrefixRandom(algo: openpgpLib.openpgpMod.enumsNs.symmetric): java.lang.String = js.native
  /** Returns the number of integers comprising the private key of an algorithm
    @param algo The public key algorithm
    */
  def getPrivateMpiCount(algo: openpgpLib.openpgpMod.enumsNs.symmetric): scala.Double = js.native
  /** Decrypts data using the specified public key multiprecision integers of the private key, the specified secretMPIs of the private key and the specified algorithm.
    @param algo Algorithm to be used
    @param publicMPIs Algorithm dependent multiprecision integers of the public key part of the private key
    @param secretMPIs Algorithm dependent multiprecision integers of the private key used
    @param data Data to be encrypted as MPI
    */
  def publicKeyDecrypt(
    algo: openpgpLib.openpgpMod.enumsNs.publicKey,
    publicMPIs: js.Array[Mpi],
    secretMPIs: js.Array[Mpi],
    data: Mpi
  ): Mpi = js.native
  /** Encrypts data using the specified public key multiprecision integers and the specified algorithm.
    @param algo Algorithm to be used
    @param publicMPIs Algorithm dependent multiprecision integers
    @param data Data to be encrypted as MPI
    */
  def publicKeyEncrypt(algo: openpgpLib.openpgpMod.enumsNs.publicKey, publicMPIs: js.Array[Mpi], data: Mpi): js.Array[Mpi] = js.native
  @JSName("cfb")
  @js.native
  object cfbNs extends js.Object {
    /** This function decrypts a given plaintext using the specified blockcipher to decrypt a message
      @param cipherfn the algorithm cipher class to decrypt data in one block_size encryption
      @param key binary string representation of key to be used to decrypt the ciphertext. This will be passed to the cipherfn
      @param ciphertext to be decrypted provided as a string
      @param resync a boolean value specifying if a resync of the IV should be used or not. The encrypteddatapacket uses the "old" style with a resync. Decryption within an encryptedintegrityprotecteddata packet is not resyncing the IV.
      */
    def decrypt(
      cipherfn: java.lang.String,
      key: java.lang.String,
      ciphertext: java.lang.String,
      resync: scala.Boolean
    ): java.lang.String = js.native
    /** This function encrypts a given with the specified prefixrandom using the specified blockcipher to encrypt a message
      @param prefixrandom random bytes of block_size length provided as a string to be used in prefixing the data
      @param cipherfn the algorithm cipher class to encrypt data in one block_size encryption
      @param plaintext data to be encrypted provided as a string
      @param key binary string representation of key to be used to encrypt the plaintext. This will be passed to the cipherfn
      @param resync a boolean value specifying if a resync of the IV should be used or not. The encrypteddatapacket uses the "old" style with a resync. Encryption within an encryptedintegrityprotecteddata packet is not resyncing the IV.
      */
    def encrypt(
      prefixrandom: java.lang.String,
      cipherfn: java.lang.String,
      plaintext: java.lang.String,
      key: java.lang.String,
      resync: scala.Boolean
    ): java.lang.String = js.native
    /** Decrypts the prefixed data for the Modification Detection Code (MDC) computation
      @param cipherfn cipherfn.encrypt Cipher function to use
      @param key binary string representation of key to be used to check the mdc This will be passed to the cipherfn
      @param ciphertext The encrypted data
      */
    def mdc(cipherfn: js.Object, key: java.lang.String, ciphertext: java.lang.String): java.lang.String = js.native
  }
  
  @JSName("hash")
  @js.native
  object hashNs extends js.Object {
    /** Create a hash on the specified data using the specified algorithm
      @param algo Hash algorithm type
      @param data Data to be hashed
      */
    def digest(algo: openpgpLib.openpgpMod.enumsNs.hash, data: java.lang.String): java.lang.String = js.native
    /** Returns the hash size in bytes of the specified hash algorithm type
      @param algo Hash algorithm type
      */
    def getHashByteLength(algo: openpgpLib.openpgpMod.enumsNs.hash): scala.Double = js.native
  }
  
  @JSName("random")
  @js.native
  object randomNs extends js.Object {
    /** Create a secure random big integer of bits length
      @param bits Bit length of the MPI to create
      */
    def getRandomBigInteger(bits: scala.Double): scala.Double = js.native
    /** Retrieve secure random byte string of the specified length
      @param length Length in bytes to generate
      */
    def getRandomBytes(length: scala.Double): java.lang.String = js.native
    /** Helper routine which calls platform specific crypto random generator
      @param buf
      */
    def getRandomValues(buf: stdLib.Uint8Array): scala.Unit = js.native
    /** Return a secure random number in the specified range
      @param from Min of the random number
      @param to Max of the random number (max 32bit)
      */
    def getSecureRandom(from: scala.Double, to: scala.Double): scala.Double = js.native
  }
  
  @JSName("signature")
  @js.native
  object signatureNs extends js.Object {
    /** Create a signature on data using the specified algorithm
      @param hash_algo hash Algorithm to use
      @param algo Asymmetric cipher algorithm to use
      @param publicMPIs Public key multiprecision integers of the private key
      @param secretMPIs Private key multiprecision integers which is used to sign the data
      @param data Data to be signed
      */
    def sign(
      hash_algo: openpgpLib.openpgpMod.enumsNs.hash,
      algo: openpgpLib.openpgpMod.enumsNs.publicKey,
      publicMPIs: js.Array[openpgpLib.openpgpMod.cryptoNs.Mpi],
      secretMPIs: js.Array[openpgpLib.openpgpMod.cryptoNs.Mpi],
      data: java.lang.String
    ): openpgpLib.openpgpMod.cryptoNs.Mpi = js.native
    /**
      @param algo public Key algorithm
      @param hash_algo Hash algorithm
      @param msg_MPIs Signature multiprecision integers
      @param publickey_MPIs Public key multiprecision integers
      @param data Data on where the signature was computed on
      */
    def verify(
      algo: openpgpLib.openpgpMod.enumsNs.publicKey,
      hash_algo: openpgpLib.openpgpMod.enumsNs.hash,
      msg_MPIs: js.Array[openpgpLib.openpgpMod.cryptoNs.Mpi],
      publickey_MPIs: js.Array[openpgpLib.openpgpMod.cryptoNs.Mpi],
      data: java.lang.String
    ): scala.Boolean = js.native
  }
  
}

