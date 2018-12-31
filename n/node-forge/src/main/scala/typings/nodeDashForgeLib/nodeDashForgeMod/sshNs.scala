package typings
package nodeDashForgeLib.nodeDashForgeMod

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
    var delimiter: js.UndefOr[java.lang.String] = js.undefined
    /**
      * @description if not specified, the function will return `ByteStringBuffer`
      */
    var encoding: js.UndefOr[
        nodeDashForgeLib.nodeDashForgeLibStrings.hex | nodeDashForgeLib.nodeDashForgeLibStrings.binary
      ] = js.undefined
    /**
      * @description if not specified defaults to `md.md5`
      */
    var md: js.UndefOr[nodeDashForgeLib.nodeDashForgeMod.mdNs.MessageDigest] = js.undefined
  }
  
  /**
    * @description Gets the SSH fingerprint for the given public key
    */
  def getPublicKeyFingerprint(publicKey: nodeDashForgeLib.nodeDashForgeMod.pkiNs.PublicKey): nodeDashForgeLib.nodeDashForgeMod.utilNs.ByteStringBuffer | nodeDashForgeLib.nodeDashForgeMod.Hex | java.lang.String = js.native
  def getPublicKeyFingerprint(publicKey: nodeDashForgeLib.nodeDashForgeMod.pkiNs.PublicKey, options: FingerprintOptions): nodeDashForgeLib.nodeDashForgeMod.utilNs.ByteStringBuffer | nodeDashForgeLib.nodeDashForgeMod.Hex | java.lang.String = js.native
  /**
    * @description Encodes a private RSA key as an OpenSSH file
    */
  def privateKeyToOpenSSH(privateKey: nodeDashForgeLib.nodeDashForgeMod.pkiNs.PrivateKey): java.lang.String = js.native
  def privateKeyToOpenSSH(privateKey: nodeDashForgeLib.nodeDashForgeMod.pkiNs.PrivateKey, passphrase: java.lang.String): java.lang.String = js.native
  /**
    * @description Encodes (and optionally encrypts) a private RSA key as a Putty PPK file
    */
  def privateKeyToPutty(privateKey: nodeDashForgeLib.nodeDashForgeMod.pkiNs.PrivateKey): java.lang.String = js.native
  def privateKeyToPutty(privateKey: nodeDashForgeLib.nodeDashForgeMod.pkiNs.PrivateKey, passphrase: java.lang.String): java.lang.String = js.native
  def privateKeyToPutty(
    privateKey: nodeDashForgeLib.nodeDashForgeMod.pkiNs.PrivateKey,
    passphrase: java.lang.String,
    comment: java.lang.String
  ): java.lang.String = js.native
  /**
    * @description Encodes a public RSA key as an OpenSSH file
    */
  def publicKeyToOpenSSH(publicKey: nodeDashForgeLib.nodeDashForgeMod.pkiNs.PublicKey): java.lang.String | nodeDashForgeLib.nodeDashForgeMod.pkiNs.PEM = js.native
  def publicKeyToOpenSSH(publicKey: nodeDashForgeLib.nodeDashForgeMod.pkiNs.PublicKey, comment: java.lang.String): java.lang.String | nodeDashForgeLib.nodeDashForgeMod.pkiNs.PEM = js.native
}

