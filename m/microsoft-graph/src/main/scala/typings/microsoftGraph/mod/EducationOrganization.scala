package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EducationOrganization extends Entity {
  
  // Organization description.
  var description: js.UndefOr[NullableOption[String]] = js.native
  
  // Organization display name.
  var displayName: js.UndefOr[String] = js.native
  
  // Source where this organization was created from. The possible values are: sis, manual, unknownFutureValue.
  var externalSource: js.UndefOr[NullableOption[EducationExternalSource]] = js.native
}
object EducationOrganization {
  
  @scala.inline
  def apply(): EducationOrganization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EducationOrganization]
  }
  
  @scala.inline
  implicit class EducationOrganizationMutableBuilder[Self <: EducationOrganization] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setExternalSource(value: NullableOption[EducationExternalSource]): Self = StObject.set(x, "externalSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalSourceNull: Self = StObject.set(x, "externalSource", null)
    
    @scala.inline
    def setExternalSourceUndefined: Self = StObject.set(x, "externalSource", js.undefined)
  }
}
