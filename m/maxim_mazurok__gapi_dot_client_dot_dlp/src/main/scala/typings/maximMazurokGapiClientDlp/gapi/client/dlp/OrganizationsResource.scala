package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrganizationsResource extends StObject {
  
  var deidentifyTemplates: DeidentifyTemplatesResource
  
  var inspectTemplates: InspectTemplatesResource
  
  var locations: LocationsResource
  
  var storedInfoTypes: StoredInfoTypesResource
}
object OrganizationsResource {
  
  inline def apply(
    deidentifyTemplates: DeidentifyTemplatesResource,
    inspectTemplates: InspectTemplatesResource,
    locations: LocationsResource,
    storedInfoTypes: StoredInfoTypesResource
  ): OrganizationsResource = {
    val __obj = js.Dynamic.literal(deidentifyTemplates = deidentifyTemplates.asInstanceOf[js.Any], inspectTemplates = inspectTemplates.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any], storedInfoTypes = storedInfoTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationsResource]
  }
  
  extension [Self <: OrganizationsResource](x: Self) {
    
    inline def setDeidentifyTemplates(value: DeidentifyTemplatesResource): Self = StObject.set(x, "deidentifyTemplates", value.asInstanceOf[js.Any])
    
    inline def setInspectTemplates(value: InspectTemplatesResource): Self = StObject.set(x, "inspectTemplates", value.asInstanceOf[js.Any])
    
    inline def setLocations(value: LocationsResource): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    inline def setStoredInfoTypes(value: StoredInfoTypesResource): Self = StObject.set(x, "storedInfoTypes", value.asInstanceOf[js.Any])
  }
}
