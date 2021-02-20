package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OmaSetting extends StObject {
  
  // Description.
  var description: js.UndefOr[NullableOption[String]] = js.native
  
  // Display Name.
  var displayName: js.UndefOr[String] = js.native
  
  // OMA.
  var omaUri: js.UndefOr[String] = js.native
}
object OmaSetting {
  
  @scala.inline
  def apply(): OmaSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmaSetting]
  }
  
  @scala.inline
  implicit class OmaSettingMutableBuilder[Self <: OmaSetting] (val x: Self) extends AnyVal {
    
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
    def setOmaUri(value: String): Self = StObject.set(x, "omaUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOmaUriUndefined: Self = StObject.set(x, "omaUri", js.undefined)
  }
}
