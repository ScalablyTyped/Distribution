package typings.nodeDashRsa.nodeDashRsaMod

import typings.nodeDashRsa.nodeDashRsaStrings.pkcs1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdvancedEncryptionSchemePKCS1 extends AdvancedEncryptionScheme {
  var padding: Double
  var scheme: pkcs1
}

object AdvancedEncryptionSchemePKCS1 {
  @scala.inline
  def apply(padding: Double, scheme: pkcs1): AdvancedEncryptionSchemePKCS1 = {
    val __obj = js.Dynamic.literal(padding = padding.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AdvancedEncryptionSchemePKCS1]
  }
}

