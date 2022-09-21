package typings.openssiWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgentResponse extends StObject {
  
  var did: DID
  
  var name: AgentName
  
  var results: js.Array[CredentialDefinition | CredentialSchema]
}
object AgentResponse {
  
  inline def apply(did: DID, name: AgentName, results: js.Array[CredentialDefinition | CredentialSchema]): AgentResponse = {
    val __obj = js.Dynamic.literal(did = did.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentResponse]
  }
  
  extension [Self <: AgentResponse](x: Self) {
    
    inline def setDid(value: DID): Self = StObject.set(x, "did", value.asInstanceOf[js.Any])
    
    inline def setName(value: AgentName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setResults(value: js.Array[CredentialDefinition | CredentialSchema]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsVarargs(value: (CredentialDefinition | CredentialSchema)*): Self = StObject.set(x, "results", js.Array(value*))
  }
}
