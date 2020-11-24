package typings.openssiWebsdk.mod

import typings.openssiWebsdk.anon.Attributes
import typings.openssiWebsdk.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Credential extends js.Object {
  
  var credential_definition_id: CredentialDefinitionID = js.native
  
  var id: String = js.native
  
  var issuer_did: DID = js.native
  
  var offer: js.UndefOr[Attributes] = js.native
  
  var properties: Properties = js.native
  
  var role: String = js.native
  
  var schema_name: String = js.native
  
  var schema_version: String = js.native
  
  var state: CredentialState = js.native
  
  var to: Name = js.native
}
object Credential {
  
  @scala.inline
  def apply(
    credential_definition_id: CredentialDefinitionID,
    id: String,
    issuer_did: DID,
    properties: Properties,
    role: String,
    schema_name: String,
    schema_version: String,
    state: CredentialState,
    to: Name
  ): Credential = {
    val __obj = js.Dynamic.literal(credential_definition_id = credential_definition_id.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], issuer_did = issuer_did.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], schema_name = schema_name.asInstanceOf[js.Any], schema_version = schema_version.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[Credential]
  }
  
  @scala.inline
  implicit class CredentialOps[Self <: Credential] (val x: Self) extends AnyVal {
    
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
    def setCredential_definition_id(value: CredentialDefinitionID): Self = this.set("credential_definition_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuer_did(value: DID): Self = this.set("issuer_did", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: Properties): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchema_name(value: String): Self = this.set("schema_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchema_version(value: String): Self = this.set("schema_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: CredentialState): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTo(value: Name): Self = this.set("to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffer(value: Attributes): Self = this.set("offer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffer: Self = this.set("offer", js.undefined)
  }
}
