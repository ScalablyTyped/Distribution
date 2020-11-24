package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SharepointIds extends js.Object {
  
  // The unique identifier (guid) for the item's list in SharePoint.
  var listId: js.UndefOr[NullableOption[String]] = js.native
  
  // An integer identifier for the item within the containing list.
  var listItemId: js.UndefOr[NullableOption[String]] = js.native
  
  // The unique identifier (guid) for the item within OneDrive for Business or a SharePoint site.
  var listItemUniqueId: js.UndefOr[NullableOption[String]] = js.native
  
  // The unique identifier (guid) for the item's site collection (SPSite).
  var siteId: js.UndefOr[NullableOption[String]] = js.native
  
  // The SharePoint URL for the site that contains the item.
  var siteUrl: js.UndefOr[NullableOption[String]] = js.native
  
  // The unique identifier (guid) for the tenancy.
  var tenantId: js.UndefOr[NullableOption[String]] = js.native
  
  // The unique identifier (guid) for the item's site (SPWeb).
  var webId: js.UndefOr[NullableOption[String]] = js.native
}
object SharepointIds {
  
  @scala.inline
  def apply(): SharepointIds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharepointIds]
  }
  
  @scala.inline
  implicit class SharepointIdsOps[Self <: SharepointIds] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setListId(value: NullableOption[String]): Self = this.set("listId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListId: Self = this.set("listId", js.undefined)
    
    @scala.inline
    def setListIdNull: Self = this.set("listId", null)
    
    @scala.inline
    def setListItemId(value: NullableOption[String]): Self = this.set("listItemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListItemId: Self = this.set("listItemId", js.undefined)
    
    @scala.inline
    def setListItemIdNull: Self = this.set("listItemId", null)
    
    @scala.inline
    def setListItemUniqueId(value: NullableOption[String]): Self = this.set("listItemUniqueId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListItemUniqueId: Self = this.set("listItemUniqueId", js.undefined)
    
    @scala.inline
    def setListItemUniqueIdNull: Self = this.set("listItemUniqueId", null)
    
    @scala.inline
    def setSiteId(value: NullableOption[String]): Self = this.set("siteId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSiteId: Self = this.set("siteId", js.undefined)
    
    @scala.inline
    def setSiteIdNull: Self = this.set("siteId", null)
    
    @scala.inline
    def setSiteUrl(value: NullableOption[String]): Self = this.set("siteUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSiteUrl: Self = this.set("siteUrl", js.undefined)
    
    @scala.inline
    def setSiteUrlNull: Self = this.set("siteUrl", null)
    
    @scala.inline
    def setTenantId(value: NullableOption[String]): Self = this.set("tenantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTenantId: Self = this.set("tenantId", js.undefined)
    
    @scala.inline
    def setTenantIdNull: Self = this.set("tenantId", null)
    
    @scala.inline
    def setWebId(value: NullableOption[String]): Self = this.set("webId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebId: Self = this.set("webId", js.undefined)
    
    @scala.inline
    def setWebIdNull: Self = this.set("webId", null)
  }
}
