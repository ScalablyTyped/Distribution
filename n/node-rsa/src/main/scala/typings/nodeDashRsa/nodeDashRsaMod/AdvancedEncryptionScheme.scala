package typings.nodeDashRsa.nodeDashRsaMod

import typings.node.Buffer
import typings.nodeDashRsa.nodeDashRsaStrings.pkcs1
import typings.nodeDashRsa.nodeDashRsaStrings.pkcs1_oaep
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodeDashRsa.nodeDashRsaMod.AdvancedEncryptionSchemePKCS1
  - typings.nodeDashRsa.nodeDashRsaMod.AdvancedEncryptionSchemePKCS1OAEP
*/
trait AdvancedEncryptionScheme extends js.Object

object AdvancedEncryptionScheme {
  @scala.inline
  def AdvancedEncryptionSchemePKCS1(padding: Double, scheme: pkcs1): AdvancedEncryptionScheme = {
    val __obj = js.Dynamic.literal(padding = padding.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AdvancedEncryptionScheme]
  }
  @scala.inline
  def AdvancedEncryptionSchemePKCS1OAEP(
    hash: HashingAlgorithm,
    scheme: pkcs1_oaep,
    mgf: (/* data */ Buffer, /* length */ Double, /* hash */ HashingAlgorithm) => Buffer = null
  ): AdvancedEncryptionScheme = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any])
    if (mgf != null) __obj.updateDynamic("mgf")(js.Any.fromFunction3(mgf))
    __obj.asInstanceOf[AdvancedEncryptionScheme]
  }
}

