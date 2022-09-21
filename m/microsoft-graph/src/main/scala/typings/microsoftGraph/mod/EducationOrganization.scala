package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EducationOrganization
  extends StObject
     with Entity {
  
  // Organization description.
  var description: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Organization display name.
  var displayName: js.UndefOr[String] = js.undefined
  
  // Source where this organization was created from. Possible values are: sis, manual.
  var externalSource: js.UndefOr[NullableOption[EducationExternalSource]] = js.undefined
  
  // The name of the external source this resources was generated from.
  var externalSourceDetail: js.UndefOr[NullableOption[String]] = js.undefined
}
object EducationOrganization {
  
  inline def apply(): EducationOrganization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EducationOrganization]
  }
  
  extension [Self <: EducationOrganization](x: Self) {
    
    inline def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setExternalSource(value: NullableOption[EducationExternalSource]): Self = StObject.set(x, "externalSource", value.asInstanceOf[js.Any])
    
    inline def setExternalSourceDetail(value: NullableOption[String]): Self = StObject.set(x, "externalSourceDetail", value.asInstanceOf[js.Any])
    
    inline def setExternalSourceDetailNull: Self = StObject.set(x, "externalSourceDetail", null)
    
    inline def setExternalSourceDetailUndefined: Self = StObject.set(x, "externalSourceDetail", js.undefined)
    
    inline def setExternalSourceNull: Self = StObject.set(x, "externalSource", null)
    
    inline def setExternalSourceUndefined: Self = StObject.set(x, "externalSource", js.undefined)
  }
}
