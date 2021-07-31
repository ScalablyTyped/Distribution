package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LicensesGetResponseData extends StObject {
  
  var body: String
  
  var conditions: js.Array[String]
  
  var description: String
  
  var featured: Boolean
  
  var html_url: String
  
  var implementation: String
  
  var key: String
  
  var limitations: js.Array[String]
  
  var name: String
  
  var node_id: String
  
  var permissions: js.Array[String]
  
  var spdx_id: String
  
  var url: String
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
  implicit class LicensesGetResponseDataMutableBuilder[Self <: LicensesGetResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditions(value: js.Array[String]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionsVarargs(value: String*): Self = StObject.set(x, "conditions", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatured(value: Boolean): Self = StObject.set(x, "featured", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImplementation(value: String): Self = StObject.set(x, "implementation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitations(value: js.Array[String]): Self = StObject.set(x, "limitations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitationsVarargs(value: String*): Self = StObject.set(x, "limitations", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissions(value: js.Array[String]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionsVarargs(value: String*): Self = StObject.set(x, "permissions", js.Array(value :_*))
    
    @scala.inline
    def setSpdx_id(value: String): Self = StObject.set(x, "spdx_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
