package typings.openssiWebsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProofSchema extends js.Object {
  
  var id: String = js.native
  
  var name: String = js.native
  
  var requested_attributes: js.Any = js.native
  
  var requested_predicates: js.UndefOr[js.Any] = js.native
  
  var version: String = js.native
}
object ProofSchema {
  
  @scala.inline
  def apply(id: String, name: String, requested_attributes: js.Any, version: String): ProofSchema = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], requested_attributes = requested_attributes.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProofSchema]
  }
  
  @scala.inline
  implicit class ProofSchemaOps[Self <: ProofSchema] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequested_attributes(value: js.Any): Self = this.set("requested_attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequested_predicates(value: js.Any): Self = this.set("requested_predicates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequested_predicates: Self = this.set("requested_predicates", js.undefined)
  }
}
