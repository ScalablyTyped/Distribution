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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ssh {
  
  /**
    * @description Gets the SSH fingerprint for the given public key
    */
  @JSImport("node-forge", "ssh.getPublicKeyFingerprint")
  @js.native
  def getPublicKeyFingerprint(publicKey: PublicKey): ByteStringBuffer | Hex | String = js.native
  @JSImport("node-forge", "ssh.getPublicKeyFingerprint")
  @js.native
  def getPublicKeyFingerprint(publicKey: PublicKey, options: FingerprintOptions): ByteStringBuffer | Hex | String = js.native
  
  /**
    * @description Encodes a private RSA key as an OpenSSH file
    */
  @JSImport("node-forge", "ssh.privateKeyToOpenSSH")
  @js.native
  def privateKeyToOpenSSH(privateKey: PrivateKey): String = js.native
  @JSImport("node-forge", "ssh.privateKeyToOpenSSH")
  @js.native
  def privateKeyToOpenSSH(privateKey: PrivateKey, passphrase: String): String = js.native
  
  /**
    * @description Encodes (and optionally encrypts) a private RSA key as a Putty PPK file
    */
  @JSImport("node-forge", "ssh.privateKeyToPutty")
  @js.native
  def privateKeyToPutty(privateKey: PrivateKey): String = js.native
  @JSImport("node-forge", "ssh.privateKeyToPutty")
  @js.native
  def privateKeyToPutty(privateKey: PrivateKey, passphrase: js.UndefOr[scala.Nothing], comment: String): String = js.native
  @JSImport("node-forge", "ssh.privateKeyToPutty")
  @js.native
  def privateKeyToPutty(privateKey: PrivateKey, passphrase: String): String = js.native
  @JSImport("node-forge", "ssh.privateKeyToPutty")
  @js.native
  def privateKeyToPutty(privateKey: PrivateKey, passphrase: String, comment: String): String = js.native
  
  /**
    * @description Encodes a public RSA key as an OpenSSH file
    */
  @JSImport("node-forge", "ssh.publicKeyToOpenSSH")
  @js.native
  def publicKeyToOpenSSH(publicKey: PublicKey): String | PEM = js.native
  @JSImport("node-forge", "ssh.publicKeyToOpenSSH")
  @js.native
  def publicKeyToOpenSSH(publicKey: PublicKey, comment: String): String | PEM = js.native
  
  @js.native
  trait FingerprintOptions extends StObject {
    
    /**
      * @description the delimiter to use between bytes for `hex` encoded output
      */
    var delimiter: js.UndefOr[String] = js.native
    
    /**
      * @description if not specified, the function will return `ByteStringBuffer`
      */
    var encoding: js.UndefOr[hex | binary] = js.native
    
    /**
      * @description if not specified defaults to `md.md5`
      */
    var md: js.UndefOr[MessageDigest] = js.native
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
