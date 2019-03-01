package typings
package nodeDashRsaLib.nodeDashRsaMod.NodeRSANs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hash")(hash)
    __obj.updateDynamic("saltLength")(saltLength)
    __obj.updateDynamic("scheme")(scheme)
    __obj.asInstanceOf[AdvancedSigningSchemePSS]
  }
}

