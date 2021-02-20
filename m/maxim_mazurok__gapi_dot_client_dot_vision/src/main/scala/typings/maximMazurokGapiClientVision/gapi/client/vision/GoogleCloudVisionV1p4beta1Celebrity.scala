package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVisionV1p4beta1Celebrity extends StObject {
  
  /** The Celebrity's description. */
  var description: js.UndefOr[String] = js.native
  
  /** The Celebrity's display name. */
  var displayName: js.UndefOr[String] = js.native
  
  /** The resource name of the preloaded Celebrity. Has the format `builtin/{mid}`. */
  var name: js.UndefOr[String] = js.native
}
object GoogleCloudVisionV1p4beta1Celebrity {
  
  @scala.inline
  def apply(): GoogleCloudVisionV1p4beta1Celebrity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVisionV1p4beta1Celebrity]
  }
  
  @scala.inline
  implicit class GoogleCloudVisionV1p4beta1CelebrityMutableBuilder[Self <: GoogleCloudVisionV1p4beta1Celebrity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
