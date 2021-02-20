package typings.openssiWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PredicateChoice extends StObject {
  
  var cred_def_id: CredentialDefinitionID = js.native
  
  var predicate: String = js.native
  
  var schema_id: CredentialSchemaID = js.native
}
object PredicateChoice {
  
  @scala.inline
  def apply(cred_def_id: CredentialDefinitionID, predicate: String, schema_id: CredentialSchemaID): PredicateChoice = {
    val __obj = js.Dynamic.literal(cred_def_id = cred_def_id.asInstanceOf[js.Any], predicate = predicate.asInstanceOf[js.Any], schema_id = schema_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PredicateChoice]
  }
  
  @scala.inline
  implicit class PredicateChoiceMutableBuilder[Self <: PredicateChoice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCred_def_id(value: CredentialDefinitionID): Self = StObject.set(x, "cred_def_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredicate(value: String): Self = StObject.set(x, "predicate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchema_id(value: CredentialSchemaID): Self = StObject.set(x, "schema_id", value.asInstanceOf[js.Any])
  }
}
