package typings.nodeDashRsa.nodeDashRsaMod

import typings.nodeDashRsa.nodeDashRsaStrings.pkcs1
import typings.nodeDashRsa.nodeDashRsaStrings.pss
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodeDashRsa.nodeDashRsaMod.AdvancedSigningSchemePSS
  - typings.nodeDashRsa.nodeDashRsaMod.AdvancedSigningSchemePKCS1
*/
trait AdvancedSigningScheme extends js.Object

object AdvancedSigningScheme {
  @scala.inline
  def AdvancedSigningSchemePSS(hash: HashingAlgorithm, saltLength: Double, scheme: pss): AdvancedSigningScheme = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], saltLength = saltLength.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AdvancedSigningScheme]
  }
  @scala.inline
  def AdvancedSigningSchemePKCS1(hash: HashingAlgorithm, scheme: pkcs1): AdvancedSigningScheme = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AdvancedSigningScheme]
  }
}

