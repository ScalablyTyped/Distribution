package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinkedResource extends Entity {
  
  // Field indicating the app name of the source that is sending the linkedResource.
  var applicationName: js.UndefOr[NullableOption[String]] = js.native
  
  // Field indicating the title of the linkedResource.
  var displayName: js.UndefOr[NullableOption[String]] = js.native
  
  // Id of the object that is associated with this task on the third-party/partner system.
  var externalId: js.UndefOr[NullableOption[String]] = js.native
  
  // Deep link to the linkedResource.
  var webUrl: js.UndefOr[NullableOption[String]] = js.native
}
object LinkedResource {
  
  @scala.inline
  def apply(): LinkedResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkedResource]
  }
  
  @scala.inline
  implicit class LinkedResourceMutableBuilder[Self <: LinkedResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationName(value: NullableOption[String]): Self = StObject.set(x, "applicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationNameNull: Self = StObject.set(x, "applicationName", null)
    
    @scala.inline
    def setApplicationNameUndefined: Self = StObject.set(x, "applicationName", js.undefined)
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setExternalId(value: NullableOption[String]): Self = StObject.set(x, "externalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalIdNull: Self = StObject.set(x, "externalId", null)
    
    @scala.inline
    def setExternalIdUndefined: Self = StObject.set(x, "externalId", js.undefined)
    
    @scala.inline
    def setWebUrl(value: NullableOption[String]): Self = StObject.set(x, "webUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebUrlNull: Self = StObject.set(x, "webUrl", null)
    
    @scala.inline
    def setWebUrlUndefined: Self = StObject.set(x, "webUrl", js.undefined)
  }
}
