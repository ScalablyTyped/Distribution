package typings.openssiWebsdk.mod

import typings.openssiWebsdk.anon.Attributes
import typings.openssiWebsdk.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Credential extends StObject {
  
  var credential_definition_id: CredentialDefinitionID
  
  var id: String
  
  var issuer_did: DID
  
  var offer: js.UndefOr[Attributes] = js.undefined
  
  var properties: Properties
  
  var role: String
  
  var schema_name: String
  
  var schema_version: String
  
  var state: CredentialState
  
  var to: Name
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
  implicit class CredentialMutableBuilder[Self <: Credential] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCredential_definition_id(value: CredentialDefinitionID): Self = StObject.set(x, "credential_definition_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuer_did(value: DID): Self = StObject.set(x, "issuer_did", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffer(value: Attributes): Self = StObject.set(x, "offer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfferUndefined: Self = StObject.set(x, "offer", js.undefined)
    
    @scala.inline
    def setProperties(value: Properties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchema_name(value: String): Self = StObject.set(x, "schema_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchema_version(value: String): Self = StObject.set(x, "schema_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: CredentialState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTo(value: Name): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
