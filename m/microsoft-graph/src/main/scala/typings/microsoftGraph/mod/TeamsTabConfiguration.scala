package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamsTabConfiguration extends StObject {
  
  // Url used for rendering tab contents in Teams. Required.
  var contentUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Identifier for the entity hosted by the tab provider.
  var entityId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Url called by Teams client when a Tab is removed using the Teams Client.
  var removeUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Url for showing tab contents outside of Teams.
  var websiteUrl: js.UndefOr[NullableOption[String]] = js.undefined
}
object TeamsTabConfiguration {
  
  inline def apply(): TeamsTabConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TeamsTabConfiguration]
  }
  
  extension [Self <: TeamsTabConfiguration](x: Self) {
    
    inline def setContentUrl(value: NullableOption[String]): Self = StObject.set(x, "contentUrl", value.asInstanceOf[js.Any])
    
    inline def setContentUrlNull: Self = StObject.set(x, "contentUrl", null)
    
    inline def setContentUrlUndefined: Self = StObject.set(x, "contentUrl", js.undefined)
    
    inline def setEntityId(value: NullableOption[String]): Self = StObject.set(x, "entityId", value.asInstanceOf[js.Any])
    
    inline def setEntityIdNull: Self = StObject.set(x, "entityId", null)
    
    inline def setEntityIdUndefined: Self = StObject.set(x, "entityId", js.undefined)
    
    inline def setRemoveUrl(value: NullableOption[String]): Self = StObject.set(x, "removeUrl", value.asInstanceOf[js.Any])
    
    inline def setRemoveUrlNull: Self = StObject.set(x, "removeUrl", null)
    
    inline def setRemoveUrlUndefined: Self = StObject.set(x, "removeUrl", js.undefined)
    
    inline def setWebsiteUrl(value: NullableOption[String]): Self = StObject.set(x, "websiteUrl", value.asInstanceOf[js.Any])
    
    inline def setWebsiteUrlNull: Self = StObject.set(x, "websiteUrl", null)
    
    inline def setWebsiteUrlUndefined: Self = StObject.set(x, "websiteUrl", js.undefined)
  }
}
