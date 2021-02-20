package typings.openssiWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Restriction extends StObject {
  
  var cred_def_id: js.UndefOr[CredentialDefinitionID] = js.native
  
  var issuer_did: js.UndefOr[DID] = js.native
  
  var schema_id: js.UndefOr[CredentialSchemaID] = js.native
  
  var schema_issuer_did: js.UndefOr[DID] = js.native
  
  var schema_name: js.UndefOr[String] = js.native
  
  var schema_version: js.UndefOr[String] = js.native
}
object Restriction {
  
  @scala.inline
  def apply(): Restriction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Restriction]
  }
  
  @scala.inline
  implicit class RestrictionMutableBuilder[Self <: Restriction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCred_def_id(value: CredentialDefinitionID): Self = StObject.set(x, "cred_def_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCred_def_idUndefined: Self = StObject.set(x, "cred_def_id", js.undefined)
    
    @scala.inline
    def setIssuer_did(value: DID): Self = StObject.set(x, "issuer_did", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuer_didUndefined: Self = StObject.set(x, "issuer_did", js.undefined)
    
    @scala.inline
    def setSchema_id(value: CredentialSchemaID): Self = StObject.set(x, "schema_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchema_idUndefined: Self = StObject.set(x, "schema_id", js.undefined)
    
    @scala.inline
    def setSchema_issuer_did(value: DID): Self = StObject.set(x, "schema_issuer_did", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchema_issuer_didUndefined: Self = StObject.set(x, "schema_issuer_did", js.undefined)
    
    @scala.inline
    def setSchema_name(value: String): Self = StObject.set(x, "schema_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchema_nameUndefined: Self = StObject.set(x, "schema_name", js.undefined)
    
    @scala.inline
    def setSchema_version(value: String): Self = StObject.set(x, "schema_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchema_versionUndefined: Self = StObject.set(x, "schema_version", js.undefined)
  }
}
