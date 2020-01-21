package typings.openssiWebsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentResponse extends js.Object {
  var did: DID
  var name: AgentName
  var results: js.Array[CredentialDefinition | CredentialSchema]
}

object AgentResponse {
  @scala.inline
  def apply(did: DID, name: AgentName, results: js.Array[CredentialDefinition | CredentialSchema]): AgentResponse = {
    val __obj = js.Dynamic.literal(did = did.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AgentResponse]
  }
}

