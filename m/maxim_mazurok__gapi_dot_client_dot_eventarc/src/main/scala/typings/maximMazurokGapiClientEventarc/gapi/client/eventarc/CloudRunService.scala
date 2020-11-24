package typings.maximMazurokGapiClientEventarc.gapi.client.eventarc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloudRunService extends js.Object {
  
  /**
    * Optional. The relative path on the Cloud Run service the events should be sent to. The value must conform to the definition of URI path segment (section 3.3 of RFC2396). Examples:
    * "/route", "route", "route/subroute".
    */
  var path: js.UndefOr[String] = js.native
  
  /** Required. The region the Cloud Run service is deployed in. */
  var region: js.UndefOr[String] = js.native
  
  /**
    * Required. The name of the Cloud run service being addressed (see https://cloud.google.com/run/docs/reference/rest/v1/namespaces.services). Only services located in the same project
    * of the trigger object can be addressed.
    */
  var service: js.UndefOr[String] = js.native
}
object CloudRunService {
  
  @scala.inline
  def apply(): CloudRunService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudRunService]
  }
  
  @scala.inline
  implicit class CloudRunServiceOps[Self <: CloudRunService] (val x: Self) extends AnyVal {
    
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
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    
    @scala.inline
    def setService(value: String): Self = this.set("service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteService: Self = this.set("service", js.undefined)
  }
}
