package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TeamsTabConfiguration extends StObject {
  
  // Url used for rendering tab contents in Teams. Required.
  var contentUrl: js.UndefOr[NullableOption[String]] = js.native
  
  // Identifier for the entity hosted by the tab provider.
  var entityId: js.UndefOr[NullableOption[String]] = js.native
  
  // Url called by Teams client when a Tab is removed using the Teams Client.
  var removeUrl: js.UndefOr[NullableOption[String]] = js.native
  
  // Url for showing tab contents outside of Teams.
  var websiteUrl: js.UndefOr[NullableOption[String]] = js.native
}
object TeamsTabConfiguration {
  
  @scala.inline
  def apply(): TeamsTabConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TeamsTabConfiguration]
  }
  
  @scala.inline
  implicit class TeamsTabConfigurationMutableBuilder[Self <: TeamsTabConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentUrl(value: NullableOption[String]): Self = StObject.set(x, "contentUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUrlNull: Self = StObject.set(x, "contentUrl", null)
    
    @scala.inline
    def setContentUrlUndefined: Self = StObject.set(x, "contentUrl", js.undefined)
    
    @scala.inline
    def setEntityId(value: NullableOption[String]): Self = StObject.set(x, "entityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityIdNull: Self = StObject.set(x, "entityId", null)
    
    @scala.inline
    def setEntityIdUndefined: Self = StObject.set(x, "entityId", js.undefined)
    
    @scala.inline
    def setRemoveUrl(value: NullableOption[String]): Self = StObject.set(x, "removeUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveUrlNull: Self = StObject.set(x, "removeUrl", null)
    
    @scala.inline
    def setRemoveUrlUndefined: Self = StObject.set(x, "removeUrl", js.undefined)
    
    @scala.inline
    def setWebsiteUrl(value: NullableOption[String]): Self = StObject.set(x, "websiteUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebsiteUrlNull: Self = StObject.set(x, "websiteUrl", null)
    
    @scala.inline
    def setWebsiteUrlUndefined: Self = StObject.set(x, "websiteUrl", js.undefined)
  }
}
