package typings
package nodeDashRsaLib.nodeDashRsaMod.NodeRSANs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Padding scheme for encrypt/decrypt. Default is 'pkcs1_oaep'.
    */
  var encryptionScheme: js.UndefOr[EncryptionScheme | AdvancedEncryptionScheme] = js.undefined
  /**
    * Working environment. (auto detects by default)
    */
  var environment: js.UndefOr[
    nodeDashRsaLib.nodeDashRsaLibStrings.browser | nodeDashRsaLib.nodeDashRsaLibStrings.node
  ] = js.undefined
  /**
    * scheme used for signing and verifying.. Default 'pkcs1-sha256', or, if chosen pss: 'pss-sha1'.
    */
  var signingScheme: js.UndefOr[SigningScheme | SigningSchemeHash | AdvancedSigningScheme] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    encryptionScheme: EncryptionScheme | AdvancedEncryptionScheme = null,
    environment: nodeDashRsaLib.nodeDashRsaLibStrings.browser | nodeDashRsaLib.nodeDashRsaLibStrings.node = null,
    signingScheme: SigningScheme | SigningSchemeHash | AdvancedSigningScheme = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (encryptionScheme != null) __obj.updateDynamic("encryptionScheme")(encryptionScheme.asInstanceOf[js.Any])
    if (environment != null) __obj.updateDynamic("environment")(environment.asInstanceOf[js.Any])
    if (signingScheme != null) __obj.updateDynamic("signingScheme")(signingScheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

