package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrganizationsResource extends js.Object {
  
  var deidentifyTemplates: DeidentifyTemplatesResource = js.native
  
  var inspectTemplates: InspectTemplatesResource = js.native
  
  var locations: LocationsResource = js.native
  
  var storedInfoTypes: StoredInfoTypesResource = js.native
}
object OrganizationsResource {
  
  @scala.inline
  def apply(
    deidentifyTemplates: DeidentifyTemplatesResource,
    inspectTemplates: InspectTemplatesResource,
    locations: LocationsResource,
    storedInfoTypes: StoredInfoTypesResource
  ): OrganizationsResource = {
    val __obj = js.Dynamic.literal(deidentifyTemplates = deidentifyTemplates.asInstanceOf[js.Any], inspectTemplates = inspectTemplates.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any], storedInfoTypes = storedInfoTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationsResource]
  }
  
  @scala.inline
  implicit class OrganizationsResourceOps[Self <: OrganizationsResource] (val x: Self) extends AnyVal {
    
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
    def setDeidentifyTemplates(value: DeidentifyTemplatesResource): Self = this.set("deidentifyTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInspectTemplates(value: InspectTemplatesResource): Self = this.set("inspectTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocations(value: LocationsResource): Self = this.set("locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoredInfoTypes(value: StoredInfoTypesResource): Self = this.set("storedInfoTypes", value.asInstanceOf[js.Any])
  }
}
