package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EducationTeamsAppResource
  extends StObject
     with EducationResource {
  
  var appIconWebUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  var appId: js.UndefOr[NullableOption[String]] = js.undefined
  
  var teamsEmbeddedContentUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  var webUrl: js.UndefOr[NullableOption[String]] = js.undefined
}
object EducationTeamsAppResource {
  
  inline def apply(): EducationTeamsAppResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EducationTeamsAppResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EducationTeamsAppResource] (val x: Self) extends AnyVal {
    
    inline def setAppIconWebUrl(value: NullableOption[String]): Self = StObject.set(x, "appIconWebUrl", value.asInstanceOf[js.Any])
    
    inline def setAppIconWebUrlNull: Self = StObject.set(x, "appIconWebUrl", null)
    
    inline def setAppIconWebUrlUndefined: Self = StObject.set(x, "appIconWebUrl", js.undefined)
    
    inline def setAppId(value: NullableOption[String]): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setAppIdNull: Self = StObject.set(x, "appId", null)
    
    inline def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
    
    inline def setTeamsEmbeddedContentUrl(value: NullableOption[String]): Self = StObject.set(x, "teamsEmbeddedContentUrl", value.asInstanceOf[js.Any])
    
    inline def setTeamsEmbeddedContentUrlNull: Self = StObject.set(x, "teamsEmbeddedContentUrl", null)
    
    inline def setTeamsEmbeddedContentUrlUndefined: Self = StObject.set(x, "teamsEmbeddedContentUrl", js.undefined)
    
    inline def setWebUrl(value: NullableOption[String]): Self = StObject.set(x, "webUrl", value.asInstanceOf[js.Any])
    
    inline def setWebUrlNull: Self = StObject.set(x, "webUrl", null)
    
    inline def setWebUrlUndefined: Self = StObject.set(x, "webUrl", js.undefined)
  }
}
