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
  
  inline def apply(): SharepointIds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharepointIds]
  }
  
  extension [Self <: SharepointIds](x: Self) {
    
    inline def setListId(value: NullableOption[String]): Self = StObject.set(x, "listId", value.asInstanceOf[js.Any])
    
    inline def setListIdNull: Self = StObject.set(x, "listId", null)
    
    inline def setListIdUndefined: Self = StObject.set(x, "listId", js.undefined)
    
    inline def setListItemId(value: NullableOption[String]): Self = StObject.set(x, "listItemId", value.asInstanceOf[js.Any])
    
    inline def setListItemIdNull: Self = StObject.set(x, "listItemId", null)
    
    inline def setListItemIdUndefined: Self = StObject.set(x, "listItemId", js.undefined)
    
    inline def setListItemUniqueId(value: NullableOption[String]): Self = StObject.set(x, "listItemUniqueId", value.asInstanceOf[js.Any])
    
    inline def setListItemUniqueIdNull: Self = StObject.set(x, "listItemUniqueId", null)
    
    inline def setListItemUniqueIdUndefined: Self = StObject.set(x, "listItemUniqueId", js.undefined)
    
    inline def setSiteId(value: NullableOption[String]): Self = StObject.set(x, "siteId", value.asInstanceOf[js.Any])
    
    inline def setSiteIdNull: Self = StObject.set(x, "siteId", null)
    
    inline def setSiteIdUndefined: Self = StObject.set(x, "siteId", js.undefined)
    
    inline def setSiteUrl(value: NullableOption[String]): Self = StObject.set(x, "siteUrl", value.asInstanceOf[js.Any])
    
    inline def setSiteUrlNull: Self = StObject.set(x, "siteUrl", null)
    
    inline def setSiteUrlUndefined: Self = StObject.set(x, "siteUrl", js.undefined)
    
    inline def setTenantId(value: NullableOption[String]): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
    
    inline def setTenantIdNull: Self = StObject.set(x, "tenantId", null)
    
    inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
    
    inline def setWebId(value: NullableOption[String]): Self = StObject.set(x, "webId", value.asInstanceOf[js.Any])
    
    inline def setWebIdNull: Self = StObject.set(x, "webId", null)
    
    inline def setWebIdUndefined: Self = StObject.set(x, "webId", js.undefined)
  }
}
