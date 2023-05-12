package typings.microsoftGraph.mod.SecurityNamespace

import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OauthApplicationEvidence
  extends StObject
     with AlertEvidence {
  
  // Unique identifier of the application.
  var appId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Name of the application.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The unique identifier of the application object in Azure AD.
  var objectId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The name of the application publisher.
  var publisher: js.UndefOr[NullableOption[String]] = js.undefined
}
object OauthApplicationEvidence {
  
  inline def apply(): OauthApplicationEvidence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OauthApplicationEvidence]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OauthApplicationEvidence] (val x: Self) extends AnyVal {
    
    inline def setAppId(value: NullableOption[String]): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setAppIdNull: Self = StObject.set(x, "appId", null)
    
    inline def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setObjectId(value: NullableOption[String]): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdNull: Self = StObject.set(x, "objectId", null)
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    inline def setPublisher(value: NullableOption[String]): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    inline def setPublisherNull: Self = StObject.set(x, "publisher", null)
    
    inline def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
  }
}
