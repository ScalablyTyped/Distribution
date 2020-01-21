package typings.openssiWebsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Verification extends js.Object {
  var allow_proof_request_override: js.UndefOr[Boolean] = js.undefined
  var choices: js.UndefOr[Choices] = js.undefined
  var id: String
  var proof_request: ProofSchema
  var state: VerificationState
}

object Verification {
  @scala.inline
  def apply(
    id: String,
    proof_request: ProofSchema,
    state: VerificationState,
    allow_proof_request_override: js.UndefOr[Boolean] = js.undefined,
    choices: Choices = null
  ): Verification = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], proof_request = proof_request.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    if (!js.isUndefined(allow_proof_request_override)) __obj.updateDynamic("allow_proof_request_override")(allow_proof_request_override.asInstanceOf[js.Any])
    if (choices != null) __obj.updateDynamic("choices")(choices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Verification]
  }
}

