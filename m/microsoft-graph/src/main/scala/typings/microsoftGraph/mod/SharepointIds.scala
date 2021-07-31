package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharepointIds extends StObject {
  
  // The unique identifier (guid) for the item's list in SharePoint.
  var listId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // An integer identifier for the item within the containing list.
  var listItemId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The unique identifier (guid) for the item within OneDrive for Business or a SharePoint site.
  var listItemUniqueId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The unique identifier (guid) for the item's site collection (SPSite).
  var siteId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The SharePoint URL for the site that contains the item.
  var siteUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The unique identifier (guid) for the tenancy.
  var tenantId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The unique identifier (guid) for the item's site (SPWeb).
  var webId: js.UndefOr[NullableOption[String]] = js.undefined
}
object SharepointIds {
  
  @scala.inline
  def apply(): SharepointIds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharepointIds]
  }
  
  @scala.inline
  implicit class SharepointIdsMutableBuilder[Self <: SharepointIds] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setListId(value: NullableOption[String]): Self = StObject.set(x, "listId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListIdNull: Self = StObject.set(x, "listId", null)
    
    @scala.inline
    def setListIdUndefined: Self = StObject.set(x, "listId", js.undefined)
    
    @scala.inline
    def setListItemId(value: NullableOption[String]): Self = StObject.set(x, "listItemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListItemIdNull: Self = StObject.set(x, "listItemId", null)
    
    @scala.inline
    def setListItemIdUndefined: Self = StObject.set(x, "listItemId", js.undefined)
    
    @scala.inline
    def setListItemUniqueId(value: NullableOption[String]): Self = StObject.set(x, "listItemUniqueId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListItemUniqueIdNull: Self = StObject.set(x, "listItemUniqueId", null)
    
    @scala.inline
    def setListItemUniqueIdUndefined: Self = StObject.set(x, "listItemUniqueId", js.undefined)
    
    @scala.inline
    def setSiteId(value: NullableOption[String]): Self = StObject.set(x, "siteId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSiteIdNull: Self = StObject.set(x, "siteId", null)
    
    @scala.inline
    def setSiteIdUndefined: Self = StObject.set(x, "siteId", js.undefined)
    
    @scala.inline
    def setSiteUrl(value: NullableOption[String]): Self = StObject.set(x, "siteUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSiteUrlNull: Self = StObject.set(x, "siteUrl", null)
    
    @scala.inline
    def setSiteUrlUndefined: Self = StObject.set(x, "siteUrl", js.undefined)
    
    @scala.inline
    def setTenantId(value: NullableOption[String]): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTenantIdNull: Self = StObject.set(x, "tenantId", null)
    
    @scala.inline
    def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
    
    @scala.inline
    def setWebId(value: NullableOption[String]): Self = StObject.set(x, "webId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebIdNull: Self = StObject.set(x, "webId", null)
    
    @scala.inline
    def setWebIdUndefined: Self = StObject.set(x, "webId", js.undefined)
  }
}
