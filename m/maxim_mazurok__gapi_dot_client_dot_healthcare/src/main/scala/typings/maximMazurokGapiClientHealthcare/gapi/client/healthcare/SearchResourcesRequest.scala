package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchResourcesRequest extends js.Object {
  
  /**
    * The FHIR resource type to search, such as Patient or Observation. For a complete list, see the FHIR Resource Index
    * ([DSTU2](http://hl7.org/implement/standards/fhir/DSTU2/resourcelist.html), [STU3](http://hl7.org/implement/standards/fhir/STU3/resourcelist.html),
    * [R4](http://hl7.org/implement/standards/fhir/R4/resourcelist.html)).
    */
  var resourceType: js.UndefOr[String] = js.native
}
object SearchResourcesRequest {
  
  @scala.inline
  def apply(): SearchResourcesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchResourcesRequest]
  }
  
  @scala.inline
  implicit class SearchResourcesRequestOps[Self <: SearchResourcesRequest] (val x: Self) extends AnyVal {
    
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
    def setResourceType(value: String): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceType: Self = this.set("resourceType", js.undefined)
  }
}
