package typings.nodeJose.mod.JWS

import typings.node.Buffer
import typings.nodeJose.mod.JWK.Key
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
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.updateDynamic("protected")(`protected`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerificationResult]
  }
}

