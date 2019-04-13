package typings
package nodeDashRsaLib.nodeDashRsaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdvancedSigningSchemePSS extends AdvancedSigningScheme {
  var hash: HashingAlgorithm
  var saltLength: scala.Double
  var scheme: nodeDashRsaLib.nodeDashRsaLibStrings.pss
}

object AdvancedSigningSchemePSS {
  @scala.inline
  def apply(hash: HashingAlgorithm, saltLength: scala.Double, scheme: nodeDashRsaLib.nodeDashRsaLibStrings.pss): AdvancedSigningSchemePSS = {
    val __obj = js.Dynamic.literal(hash = hash, saltLength = saltLength, scheme = scheme)
  
    __obj.asInstanceOf[AdvancedSigningSchemePSS]
  }
}

