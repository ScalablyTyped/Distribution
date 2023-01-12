package typings.openssiWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Verification extends StObject {
  
  var allow_proof_request_override: js.UndefOr[Boolean] = js.undefined
  
  var choices: js.UndefOr[Choices] = js.undefined
  
  var id: String
  
  var proof_request: ProofSchema
  
  var state: VerificationState
}
object Verification {
  
  inline def apply(id: String, proof_request: ProofSchema, state: VerificationState): Verification = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], proof_request = proof_request.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Verification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Verification] (val x: Self) extends AnyVal {
    
    inline def setAllow_proof_request_override(value: Boolean): Self = StObject.set(x, "allow_proof_request_override", value.asInstanceOf[js.Any])
    
    inline def setAllow_proof_request_overrideUndefined: Self = StObject.set(x, "allow_proof_request_override", js.undefined)
    
    inline def setChoices(value: Choices): Self = StObject.set(x, "choices", value.asInstanceOf[js.Any])
    
    inline def setChoicesUndefined: Self = StObject.set(x, "choices", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setProof_request(value: ProofSchema): Self = StObject.set(x, "proof_request", value.asInstanceOf[js.Any])
    
    inline def setState(value: VerificationState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
