package typings.nodeDashForge.nodeDashForgeMod

import typings.nodeDashForge.nodeDashForgeMod.mdNs.MessageDigest
import typings.nodeDashForge.nodeDashForgeMod.pkiNs.PEM
import typings.nodeDashForge.nodeDashForgeMod.pkiNs.PrivateKey
import typings.nodeDashForge.nodeDashForgeMod.pkiNs.PublicKey
import typings.nodeDashForge.nodeDashForgeMod.sshNs.FingerprintOptions
import typings.nodeDashForge.nodeDashForgeMod.utilNs.ByteStringBuffer
import typings.nodeDashForge.nodeDashForgeStrings.binary
import typings.nodeDashForge.nodeDashForgeStrings.hex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-forge", "ssh")
@js.native
object sshNs extends js.Object {
  trait FingerprintOptions extends js.Object {
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
  
  /**
    * @description Gets the SSH fingerprint for the given public key
    */
  def getPublicKeyFingerprint(publicKey: PublicKey): ByteStringBuffer | Hex | String = js.native
  def getPublicKeyFingerprint(publicKey: PublicKey, options: FingerprintOptions): ByteStringBuffer | Hex | String = js.native
  /**
    * @description Encodes a private RSA key as an OpenSSH file
    */
  def privateKeyToOpenSSH(privateKey: PrivateKey): String = js.native
  def privateKeyToOpenSSH(privateKey: PrivateKey, passphrase: String): String = js.native
  /**
    * @description Encodes (and optionally encrypts) a private RSA key as a Putty PPK file
    */
  def privateKeyToPutty(privateKey: PrivateKey): String = js.native
  def privateKeyToPutty(privateKey: PrivateKey, passphrase: String): String = js.native
  def privateKeyToPutty(privateKey: PrivateKey, passphrase: String, comment: String): String = js.native
  /**
    * @description Encodes a public RSA key as an OpenSSH file
    */
  def publicKeyToOpenSSH(publicKey: PublicKey): String | PEM = js.native
  def publicKeyToOpenSSH(publicKey: PublicKey, comment: String): String | PEM = js.native
}

