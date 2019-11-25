package typings.nodeDashRsa.nodeDashRsaMod

import typings.node.Buffer
import typings.nodeDashRsa.nodeDashRsaStrings.pkcs1_oaep
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdvancedEncryptionSchemePKCS1OAEP extends AdvancedEncryptionScheme {
  var hash: HashingAlgorithm
  /**
    * Mask generation function.
    */
  var mgf: js.UndefOr[
    js.Function3[/* data */ Buffer, /* length */ Double, /* hash */ HashingAlgorithm, Buffer]
  ] = js.undefined
  var scheme: pkcs1_oaep
}

object AdvancedEncryptionSchemePKCS1OAEP {
  @scala.inline
  def apply(
    hash: HashingAlgorithm,
    scheme: pkcs1_oaep,
    mgf: (/* data */ Buffer, /* length */ Double, /* hash */ HashingAlgorithm) => Buffer = null
  ): AdvancedEncryptionSchemePKCS1OAEP = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any])
    if (mgf != null) __obj.updateDynamic("mgf")(js.Any.fromFunction3(mgf))
    __obj.asInstanceOf[AdvancedEncryptionSchemePKCS1OAEP]
  }
}

