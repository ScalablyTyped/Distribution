package typings.openssiWebsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgentResponse extends js.Object {
  var did: DID = js.native
  var name: AgentName = js.native
  var results: js.Array[CredentialDefinition | CredentialSchema] = js.native
}

object AgentResponse {
  @scala.inline
  def apply(did: DID, name: AgentName, results: js.Array[CredentialDefinition | CredentialSchema]): AgentResponse = {
    val __obj = js.Dynamic.literal(did = did.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentResponse]
  }
  @scala.inline
  implicit class AgentResponseOps[Self <: AgentResponse] (val x: Self) extends AnyVal {
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
    def setDid(value: DID): Self = this.set("did", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: AgentName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setResultsVarargs(value: (CredentialDefinition | CredentialSchema)*): Self = this.set("results", js.Array(value :_*))
    @scala.inline
    def setResults(value: js.Array[CredentialDefinition | CredentialSchema]): Self = this.set("results", value.asInstanceOf[js.Any])
  }
  
}

