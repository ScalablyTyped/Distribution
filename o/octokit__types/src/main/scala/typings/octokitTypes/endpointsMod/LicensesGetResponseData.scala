package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LicensesGetResponseData extends js.Object {
  
  var body: String = js.native
  
  var conditions: js.Array[String] = js.native
  
  var description: String = js.native
  
  var featured: Boolean = js.native
  
  var html_url: String = js.native
  
  var implementation: String = js.native
  
  var key: String = js.native
  
  var limitations: js.Array[String] = js.native
  
  var name: String = js.native
  
  var node_id: String = js.native
  
  var permissions: js.Array[String] = js.native
  
  var spdx_id: String = js.native
  
  var url: String = js.native
}
object LicensesGetResponseData {
  
  @scala.inline
  def apply(
    body: String,
    conditions: js.Array[String],
    description: String,
    featured: Boolean,
    html_url: String,
    implementation: String,
    key: String,
    limitations: js.Array[String],
    name: String,
    node_id: String,
    permissions: js.Array[String],
    spdx_id: String,
    url: String
  ): LicensesGetResponseData = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], conditions = conditions.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], featured = featured.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], implementation = implementation.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], limitations = limitations.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], spdx_id = spdx_id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[LicensesGetResponseData]
  }
  
  @scala.inline
  implicit class LicensesGetResponseDataOps[Self <: LicensesGetResponseData] (val x: Self) extends AnyVal {
    
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
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionsVarargs(value: String*): Self = this.set("conditions", js.Array(value :_*))
    
    @scala.inline
    def setConditions(value: js.Array[String]): Self = this.set("conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatured(value: Boolean): Self = this.set("featured", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml_url(value: String): Self = this.set("html_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImplementation(value: String): Self = this.set("implementation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitationsVarargs(value: String*): Self = this.set("limitations", js.Array(value :_*))
    
    @scala.inline
    def setLimitations(value: js.Array[String]): Self = this.set("limitations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode_id(value: String): Self = this.set("node_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionsVarargs(value: String*): Self = this.set("permissions", js.Array(value :_*))
    
    @scala.inline
    def setPermissions(value: js.Array[String]): Self = this.set("permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpdx_id(value: String): Self = this.set("spdx_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}
