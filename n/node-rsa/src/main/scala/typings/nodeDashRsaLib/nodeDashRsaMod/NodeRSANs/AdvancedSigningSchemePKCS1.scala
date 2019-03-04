package typings
package nodeDashRsaLib.nodeDashRsaMod.NodeRSANs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdvancedSigningSchemePKCS1 extends AdvancedSigningScheme {
  var hash: HashingAlgorithm
  var scheme: nodeDashRsaLib.nodeDashRsaLibStrings.pkcs1
}

object AdvancedSigningSchemePKCS1 {
  @scala.inline
  def apply(hash: HashingAlgorithm, scheme: nodeDashRsaLib.nodeDashRsaLibStrings.pkcs1): AdvancedSigningSchemePKCS1 = {
    val __obj = js.Dynamic.literal(hash = hash, scheme = scheme)
  
    __obj.asInstanceOf[AdvancedSigningSchemePKCS1]
  }
}

