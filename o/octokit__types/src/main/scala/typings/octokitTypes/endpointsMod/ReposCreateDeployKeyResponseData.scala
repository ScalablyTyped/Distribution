package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReposCreateDeployKeyResponseData extends StObject {
  
  var created_at: String = js.native
  
  var id: Double = js.native
  
  var key: String = js.native
  
  var read_only: Boolean = js.native
  
  var title: String = js.native
  
  var url: String = js.native
  
  var verified: Boolean = js.native
}
object ReposCreateDeployKeyResponseData {
  
  @scala.inline
  def apply(
    created_at: String,
    id: Double,
    key: String,
    read_only: Boolean,
    title: String,
    url: String,
    verified: Boolean
  ): ReposCreateDeployKeyResponseData = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], read_only = read_only.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCreateDeployKeyResponseData]
  }
  
  @scala.inline
  implicit class ReposCreateDeployKeyResponseDataMutableBuilder[Self <: ReposCreateDeployKeyResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRead_only(value: Boolean): Self = StObject.set(x, "read_only", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerified(value: Boolean): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
  }
}
