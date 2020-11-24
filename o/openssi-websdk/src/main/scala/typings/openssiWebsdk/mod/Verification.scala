package typings.openssiWebsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Verification extends js.Object {
  
  var allow_proof_request_override: js.UndefOr[Boolean] = js.native
  
  var choices: js.UndefOr[Choices] = js.native
  
  var id: String = js.native
  
  var proof_request: ProofSchema = js.native
  
  var state: VerificationState = js.native
}
object Verification {
  
  @scala.inline
  def apply(id: String, proof_request: ProofSchema, state: VerificationState): Verification = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], proof_request = proof_request.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Verification]
  }
  
  @scala.inline
  implicit class VerificationOps[Self <: Verification] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProof_request(value: ProofSchema): Self = this.set("proof_request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: VerificationState): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllow_proof_request_override(value: Boolean): Self = this.set("allow_proof_request_override", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllow_proof_request_override: Self = this.set("allow_proof_request_override", js.undefined)
    
    @scala.inline
    def setChoices(value: Choices): Self = this.set("choices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChoices: Self = this.set("choices", js.undefined)
  }
}
