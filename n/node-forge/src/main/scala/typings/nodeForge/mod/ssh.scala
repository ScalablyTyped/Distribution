package typings.nodeForge.mod

import typings.nodeForge.mod.md.MessageDigest
import typings.nodeForge.mod.pki.PEM
import typings.nodeForge.mod.pki.PrivateKey
import typings.nodeForge.mod.pki.PublicKey
import typings.nodeForge.mod.util.ByteStringBuffer
import typings.nodeForge.nodeForgeStrings.binary
import typings.nodeForge.nodeForgeStrings.hex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ssh {
  
  @JSImport("node-forge", "ssh")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @description Gets the SSH fingerprint for the given public key
    */
  @scala.inline
  def getPublicKeyFingerprint(publicKey: PublicKey): ByteStringBuffer | Hex | String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPublicKeyFingerprint")(publicKey.asInstanceOf[js.Any]).asInstanceOf[ByteStringBuffer | Hex | String]
  @scala.inline
  def getPublicKeyFingerprint(publicKey: PublicKey, options: FingerprintOptions): ByteStringBuffer | Hex | String = (^.asInstanceOf[js.Dynamic].applyDynamic("getPublicKeyFingerprint")(publicKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ByteStringBuffer | Hex | String]
  
  /**
    * @description Encodes a private RSA key as an OpenSSH file
    */
  @scala.inline
  def privateKeyToOpenSSH(privateKey: PrivateKey): String = ^.asInstanceOf[js.Dynamic].applyDynamic("privateKeyToOpenSSH")(privateKey.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def privateKeyToOpenSSH(privateKey: PrivateKey, passphrase: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("privateKeyToOpenSSH")(privateKey.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * @description Encodes (and optionally encrypts) a private RSA key as a Putty PPK file
    */
  @scala.inline
  def privateKeyToPutty(privateKey: PrivateKey): String = ^.asInstanceOf[js.Dynamic].applyDynamic("privateKeyToPutty")(privateKey.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def privateKeyToPutty(privateKey: PrivateKey, passphrase: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("privateKeyToPutty")(privateKey.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def privateKeyToPutty(privateKey: PrivateKey, passphrase: String, comment: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("privateKeyToPutty")(privateKey.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any], comment.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def privateKeyToPutty(privateKey: PrivateKey, passphrase: Unit, comment: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("privateKeyToPutty")(privateKey.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any], comment.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * @description Encodes a public RSA key as an OpenSSH file
    */
  @scala.inline
  def publicKeyToOpenSSH(publicKey: PublicKey): String | PEM = ^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyToOpenSSH")(publicKey.asInstanceOf[js.Any]).asInstanceOf[String | PEM]
  @scala.inline
  def publicKeyToOpenSSH(publicKey: PublicKey, comment: String): String | PEM = (^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyToOpenSSH")(publicKey.asInstanceOf[js.Any], comment.asInstanceOf[js.Any])).asInstanceOf[String | PEM]
  
  trait FingerprintOptions extends StObject {
    
    /**
      * @description the delimiter to use between bytes for `hex` encoded output
      */
    var delimiter: js.UndefOr[String] = js.undefined
    
    /**
      * @description if not specified, the function will return `ByteStringBuffer`
      */
    var encoding: js.UndefOr[hex | binary] = js.undefined
    
    /**
      * @description if not specified defaults to `md.md5`
      */
    var md: js.UndefOr[MessageDigest] = js.undefined
  }
  object FingerprintOptions {
    
    @scala.inline
    def apply(): FingerprintOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FingerprintOptions]
    }
    
    @scala.inline
    implicit class FingerprintOptionsMutableBuilder[Self <: FingerprintOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      @scala.inline
      def setEncoding(value: hex | binary): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setMd(value: MessageDigest): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMdUndefined: Self = StObject.set(x, "md", js.undefined)
    }
  }
}
