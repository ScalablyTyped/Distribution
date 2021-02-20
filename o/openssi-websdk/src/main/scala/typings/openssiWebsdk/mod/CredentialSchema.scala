package typings.openssiWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CredentialSchema extends StObject {
  
  var attr_names: js.Array[String] = js.native
  
  var id: CredentialSchemaID = js.native
  
  var name: String = js.native
  
  var namever: String = js.native
  
  var version: String = js.native
}
object CredentialSchema {
  
  @scala.inline
  def apply(
    attr_names: js.Array[String],
    id: CredentialSchemaID,
    name: String,
    namever: String,
    version: String
  ): CredentialSchema = {
    val __obj = js.Dynamic.literal(attr_names = attr_names.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namever = namever.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[CredentialSchema]
  }
  
  @scala.inline
  implicit class CredentialSchemaMutableBuilder[Self <: CredentialSchema] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttr_names(value: js.Array[String]): Self = StObject.set(x, "attr_names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttr_namesVarargs(value: String*): Self = StObject.set(x, "attr_names", js.Array(value :_*))
    
    @scala.inline
    def setId(value: CredentialSchemaID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamever(value: String): Self = StObject.set(x, "namever", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
