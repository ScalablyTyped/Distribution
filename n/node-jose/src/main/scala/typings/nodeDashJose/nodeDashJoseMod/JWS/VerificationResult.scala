package typings.nodeDashJose.nodeDashJoseMod.JWS

import typings.node.Buffer
import typings.nodeDashJose.nodeDashJoseMod.JWK.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerificationResult extends BaseResult {
  /**
    * the verified signature
    */
  var signature: Buffer | String
}

object VerificationResult {
  @scala.inline
  def apply(
    header: js.Object,
    key: Key,
    payload: Buffer,
    `protected`: js.Array[String],
    signature: Buffer | String
  ): VerificationResult = {
    val __obj = js.Dynamic.literal(header = header, key = key, payload = payload, signature = signature.asInstanceOf[js.Any])
    __obj.updateDynamic("protected")(`protected`)
    __obj.asInstanceOf[VerificationResult]
  }
}

