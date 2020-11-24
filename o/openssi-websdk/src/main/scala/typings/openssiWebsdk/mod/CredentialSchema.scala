package typings.openssiWebsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CredentialSchema extends js.Object {
  
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
  implicit class CredentialSchemaOps[Self <: CredentialSchema] (val x: Self) extends AnyVal {
    
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
    def setAttr_namesVarargs(value: String*): Self = this.set("attr_names", js.Array(value :_*))
    
    @scala.inline
    def setAttr_names(value: js.Array[String]): Self = this.set("attr_names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: CredentialSchemaID): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamever(value: String): Self = this.set("namever", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
}
