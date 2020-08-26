package typings.nodeJose.mod.JWS

import typings.node.Buffer
import typings.nodeJose.mod.JWK.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VerificationResult extends BaseResult {
  /**
    * the verified signature
    */
  var signature: Buffer | String = js.native
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
  @scala.inline
  implicit class VerificationResultOps[Self <: VerificationResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSignature(value: Buffer | String): Self = this.set("signature", value.asInstanceOf[js.Any])
  }
  
}

