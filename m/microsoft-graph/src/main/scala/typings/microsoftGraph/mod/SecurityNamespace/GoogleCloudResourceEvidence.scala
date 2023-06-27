package typings.microsoftGraph.mod.SecurityNamespace

import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudResourceEvidence
  extends StObject
     with AlertEvidence {
  
  // The zone or region where the resource is located.
  var location: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The type of location. Possible values are: unknown, regional, zonal, global, unknownFutureValue.
  var locationType: js.UndefOr[NullableOption[GoogleCloudLocationType]] = js.undefined
  
  // The Google project ID as defined by the user.
  var projectId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The project number assigned by Google.
  var projectNumber: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The name of the resource.
  var resourceName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The type of the resource.
  var resourceType: js.UndefOr[NullableOption[String]] = js.undefined
}
object GoogleCloudResourceEvidence {
  
  inline def apply(): GoogleCloudResourceEvidence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudResourceEvidence]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudResourceEvidence] (val x: Self) extends AnyVal {
    
    inline def setLocation(value: NullableOption[String]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationNull: Self = StObject.set(x, "location", null)
    
    inline def setLocationType(value: NullableOption[GoogleCloudLocationType]): Self = StObject.set(x, "locationType", value.asInstanceOf[js.Any])
    
    inline def setLocationTypeNull: Self = StObject.set(x, "locationType", null)
    
    inline def setLocationTypeUndefined: Self = StObject.set(x, "locationType", js.undefined)
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setProjectId(value: NullableOption[String]): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdNull: Self = StObject.set(x, "projectId", null)
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setProjectNumber(value: NullableOption[Double]): Self = StObject.set(x, "projectNumber", value.asInstanceOf[js.Any])
    
    inline def setProjectNumberNull: Self = StObject.set(x, "projectNumber", null)
    
    inline def setProjectNumberUndefined: Self = StObject.set(x, "projectNumber", js.undefined)
    
    inline def setResourceName(value: NullableOption[String]): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameNull: Self = StObject.set(x, "resourceName", null)
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
    
    inline def setResourceType(value: NullableOption[String]): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeNull: Self = StObject.set(x, "resourceType", null)
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
  }
}
