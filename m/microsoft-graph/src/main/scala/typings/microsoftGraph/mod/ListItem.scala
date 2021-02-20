package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListItem extends BaseItem {
  
  // Analytics about the view activities that took place on this item.
  var analytics: js.UndefOr[NullableOption[ItemAnalytics]] = js.native
  
  // The content type of this list item
  var contentType: js.UndefOr[NullableOption[ContentTypeInfo]] = js.native
  
  // For document libraries, the driveItem relationship exposes the listItem as a [driveItem][]
  var driveItem: js.UndefOr[NullableOption[DriveItem]] = js.native
  
  // The values of the columns set on this list item.
  var fields: js.UndefOr[NullableOption[FieldValueSet]] = js.native
  
  // Returns identifiers useful for SharePoint REST compatibility. Read-only.
  var sharepointIds: js.UndefOr[NullableOption[SharepointIds]] = js.native
  
  // The list of previous versions of the list item.
  var versions: js.UndefOr[NullableOption[js.Array[ListItemVersion]]] = js.native
}
object ListItem {
  
  @scala.inline
  def apply(): ListItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListItem]
  }
  
  @scala.inline
  implicit class ListItemMutableBuilder[Self <: ListItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnalytics(value: NullableOption[ItemAnalytics]): Self = StObject.set(x, "analytics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnalyticsNull: Self = StObject.set(x, "analytics", null)
    
    @scala.inline
    def setAnalyticsUndefined: Self = StObject.set(x, "analytics", js.undefined)
    
    @scala.inline
    def setContentType(value: NullableOption[ContentTypeInfo]): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeNull: Self = StObject.set(x, "contentType", null)
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    @scala.inline
    def setDriveItem(value: NullableOption[DriveItem]): Self = StObject.set(x, "driveItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriveItemNull: Self = StObject.set(x, "driveItem", null)
    
    @scala.inline
    def setDriveItemUndefined: Self = StObject.set(x, "driveItem", js.undefined)
    
    @scala.inline
    def setFields(value: NullableOption[FieldValueSet]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsNull: Self = StObject.set(x, "fields", null)
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setSharepointIds(value: NullableOption[SharepointIds]): Self = StObject.set(x, "sharepointIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharepointIdsNull: Self = StObject.set(x, "sharepointIds", null)
    
    @scala.inline
    def setSharepointIdsUndefined: Self = StObject.set(x, "sharepointIds", js.undefined)
    
    @scala.inline
    def setVersions(value: NullableOption[js.Array[ListItemVersion]]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionsNull: Self = StObject.set(x, "versions", null)
    
    @scala.inline
    def setVersionsUndefined: Self = StObject.set(x, "versions", js.undefined)
    
    @scala.inline
    def setVersionsVarargs(value: ListItemVersion*): Self = StObject.set(x, "versions", js.Array(value :_*))
  }
}
