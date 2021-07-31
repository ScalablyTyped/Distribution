package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchResourcesRequest extends StObject {
  
  /**
    * The FHIR resource type to search, such as Patient or Observation. For a complete list, see the FHIR Resource Index
    * ([DSTU2](http://hl7.org/implement/standards/fhir/DSTU2/resourcelist.html), [STU3](http://hl7.org/implement/standards/fhir/STU3/resourcelist.html),
    * [R4](http://hl7.org/implement/standards/fhir/R4/resourcelist.html)).
    */
  var resourceType: js.UndefOr[String] = js.undefined
}
object SearchResourcesRequest {
  
  @scala.inline
  def apply(): SearchResourcesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchResourcesRequest]
  }
  
  @scala.inline
  implicit class SearchResourcesRequestMutableBuilder[Self <: SearchResourcesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceType(value: String): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
  }
}
