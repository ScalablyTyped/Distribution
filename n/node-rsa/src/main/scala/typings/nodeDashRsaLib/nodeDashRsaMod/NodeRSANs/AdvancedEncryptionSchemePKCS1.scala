package typings
package nodeDashRsaLib.nodeDashRsaMod.NodeRSANs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdvancedEncryptionSchemePKCS1 extends AdvancedEncryptionScheme {
  var padding: scala.Double
  var scheme: nodeDashRsaLib.nodeDashRsaLibStrings.pkcs1
}

object AdvancedEncryptionSchemePKCS1 {
  @scala.inline
  def apply(padding: scala.Double, scheme: nodeDashRsaLib.nodeDashRsaLibStrings.pkcs1): AdvancedEncryptionSchemePKCS1 = {
    val __obj = js.Dynamic.literal(padding = padding, scheme = scheme)
  
    __obj.asInstanceOf[AdvancedEncryptionSchemePKCS1]
  }
}

