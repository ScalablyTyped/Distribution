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

