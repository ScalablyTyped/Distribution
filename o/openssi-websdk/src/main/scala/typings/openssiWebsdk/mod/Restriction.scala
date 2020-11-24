package typings.openssiWebsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Restriction extends js.Object {
  
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
  implicit class RestrictionOps[Self <: Restriction] (val x: Self) extends AnyVal {
    
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
    def setCred_def_id(value: CredentialDefinitionID): Self = this.set("cred_def_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCred_def_id: Self = this.set("cred_def_id", js.undefined)
    
    @scala.inline
    def setIssuer_did(value: DID): Self = this.set("issuer_did", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIssuer_did: Self = this.set("issuer_did", js.undefined)
    
    @scala.inline
    def setSchema_id(value: CredentialSchemaID): Self = this.set("schema_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchema_id: Self = this.set("schema_id", js.undefined)
    
    @scala.inline
    def setSchema_issuer_did(value: DID): Self = this.set("schema_issuer_did", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchema_issuer_did: Self = this.set("schema_issuer_did", js.undefined)
    
    @scala.inline
    def setSchema_name(value: String): Self = this.set("schema_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchema_name: Self = this.set("schema_name", js.undefined)
    
    @scala.inline
    def setSchema_version(value: String): Self = this.set("schema_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchema_version: Self = this.set("schema_version", js.undefined)
  }
}
