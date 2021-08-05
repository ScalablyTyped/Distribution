package typings.naverWhale.whale.contentSettings

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDetails extends StObject {
  
  /** Optional. Whether to check the content settings for an incognito session. (default false)  */
  var incognito: js.UndefOr[Boolean] = js.undefined
  
  /** The primary URL for which the content setting should be retrieved. Note that the meaning of a primary URL depends on the content type. */
  var primaryUrl: String
  
  /** Optional. A more specific identifier of the type of content for which the settings should be retrieved.  */
  var resourceIdentifier: js.UndefOr[typings.chrome.chrome.contentSettings.ResourceIdentifier] = js.undefined
  
  /** Optional. The secondary URL for which the content setting should be retrieved. Defaults to the primary URL. Note that the meaning of a secondary URL depends on the content type, and not all content types use secondary URLs.  */
  var secondaryUrl: js.UndefOr[String] = js.undefined
}
object GetDetails {
  
  inline def apply(primaryUrl: String): GetDetails = {
    val __obj = js.Dynamic.literal(primaryUrl = primaryUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDetails]
  }
  
  extension [Self <: GetDetails](x: Self) {
    
    inline def setIncognito(value: Boolean): Self = StObject.set(x, "incognito", value.asInstanceOf[js.Any])
    
    inline def setIncognitoUndefined: Self = StObject.set(x, "incognito", js.undefined)
    
    inline def setPrimaryUrl(value: String): Self = StObject.set(x, "primaryUrl", value.asInstanceOf[js.Any])
    
    inline def setResourceIdentifier(value: typings.chrome.chrome.contentSettings.ResourceIdentifier): Self = StObject.set(x, "resourceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setResourceIdentifierUndefined: Self = StObject.set(x, "resourceIdentifier", js.undefined)
    
    inline def setSecondaryUrl(value: String): Self = StObject.set(x, "secondaryUrl", value.asInstanceOf[js.Any])
    
    inline def setSecondaryUrlUndefined: Self = StObject.set(x, "secondaryUrl", js.undefined)
  }
}
