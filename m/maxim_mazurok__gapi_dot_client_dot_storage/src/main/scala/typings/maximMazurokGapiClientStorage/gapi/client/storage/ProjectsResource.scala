package typings.maximMazurokGapiClientStorage.gapi.client.storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectsResource extends js.Object {
  
  var hmacKeys: HmacKeysResource = js.native
  
  var serviceAccount: ServiceAccountResource = js.native
}
object ProjectsResource {
  
  @scala.inline
  def apply(hmacKeys: HmacKeysResource, serviceAccount: ServiceAccountResource): ProjectsResource = {
    val __obj = js.Dynamic.literal(hmacKeys = hmacKeys.asInstanceOf[js.Any], serviceAccount = serviceAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsResource]
  }
  
  @scala.inline
  implicit class ProjectsResourceOps[Self <: ProjectsResource] (val x: Self) extends AnyVal {
    
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
    def setHmacKeys(value: HmacKeysResource): Self = this.set("hmacKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceAccount(value: ServiceAccountResource): Self = this.set("serviceAccount", value.asInstanceOf[js.Any])
  }
}
