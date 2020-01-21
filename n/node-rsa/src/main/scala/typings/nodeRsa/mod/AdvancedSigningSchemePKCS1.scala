package typings.nodeRsa.mod

import typings.nodeRsa.nodeRsaStrings.pkcs1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdvancedSigningSchemePKCS1 extends AdvancedSigningScheme {
  var hash: HashingAlgorithm
  var scheme: pkcs1
}

object AdvancedSigningSchemePKCS1 {
  @scala.inline
  def apply(hash: HashingAlgorithm, scheme: pkcs1): AdvancedSigningSchemePKCS1 = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AdvancedSigningSchemePKCS1]
  }
}

