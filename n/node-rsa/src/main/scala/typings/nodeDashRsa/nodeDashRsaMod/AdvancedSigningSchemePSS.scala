package typings.nodeDashRsa.nodeDashRsaMod

import typings.nodeDashRsa.nodeDashRsaStrings.pss
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdvancedSigningSchemePSS extends AdvancedSigningScheme {
  var hash: HashingAlgorithm
  var saltLength: Double
  var scheme: pss
}

object AdvancedSigningSchemePSS {
  @scala.inline
  def apply(hash: HashingAlgorithm, saltLength: Double, scheme: pss): AdvancedSigningSchemePSS = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], saltLength = saltLength.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AdvancedSigningSchemePSS]
  }
}

