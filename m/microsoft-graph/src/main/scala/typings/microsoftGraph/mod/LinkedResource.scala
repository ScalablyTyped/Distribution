package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinkedResource
  extends StObject
     with Entity {
  
  // Field indicating the app name of the source that is sending the linkedResource.
  var applicationName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Field indicating the title of the linkedResource.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Id of the object that is associated with this task on the third-party/partner system.
  var externalId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Deep link to the linkedResource.
  var webUrl: js.UndefOr[NullableOption[String]] = js.undefined
}
object LinkedResource {
  
  inline def apply(): LinkedResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkedResource]
  }
  
  extension [Self <: LinkedResource](x: Self) {
    
    inline def setApplicationName(value: NullableOption[String]): Self = StObject.set(x, "applicationName", value.asInstanceOf[js.Any])
    
    inline def setApplicationNameNull: Self = StObject.set(x, "applicationName", null)
    
    inline def setApplicationNameUndefined: Self = StObject.set(x, "applicationName", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setExternalId(value: NullableOption[String]): Self = StObject.set(x, "externalId", value.asInstanceOf[js.Any])
    
    inline def setExternalIdNull: Self = StObject.set(x, "externalId", null)
    
    inline def setExternalIdUndefined: Self = StObject.set(x, "externalId", js.undefined)
    
    inline def setWebUrl(value: NullableOption[String]): Self = StObject.set(x, "webUrl", value.asInstanceOf[js.Any])
    
    inline def setWebUrlNull: Self = StObject.set(x, "webUrl", null)
    
    inline def setWebUrlUndefined: Self = StObject.set(x, "webUrl", js.undefined)
  }
}
