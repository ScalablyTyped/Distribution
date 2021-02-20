package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait List extends BaseItem {
  
  // The collection of field definitions for this list.
  var columns: js.UndefOr[NullableOption[js.Array[ColumnDefinition]]] = js.native
  
  // The collection of content types present in this list.
  var contentTypes: js.UndefOr[NullableOption[js.Array[ContentType]]] = js.native
  
  // The displayable title of the list.
  var displayName: js.UndefOr[NullableOption[String]] = js.native
  
  // Only present on document libraries. Allows access to the list as a [drive][] resource with [driveItems][driveItem].
  var drive: js.UndefOr[NullableOption[Drive]] = js.native
  
  // All items contained in the list.
  var items: js.UndefOr[NullableOption[js.Array[ListItem]]] = js.native
  
  // Provides additional details about the list.
  var list: js.UndefOr[NullableOption[ListInfo]] = js.native
  
  // Returns identifiers useful for SharePoint REST compatibility. Read-only.
  var sharepointIds: js.UndefOr[NullableOption[SharepointIds]] = js.native
  
  // The set of subscriptions on the list.
  var subscriptions: js.UndefOr[NullableOption[js.Array[Subscription]]] = js.native
  
  // If present, indicates that this is a system-managed list. Read-only.
  var system: js.UndefOr[NullableOption[SystemFacet]] = js.native
}
object List {
  
  @scala.inline
  def apply(): List = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[List]
  }
  
  @scala.inline
  implicit class ListMutableBuilder[Self <: List] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumns(value: NullableOption[js.Array[ColumnDefinition]]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsNull: Self = StObject.set(x, "columns", null)
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: ColumnDefinition*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    @scala.inline
    def setContentTypes(value: NullableOption[js.Array[ContentType]]): Self = StObject.set(x, "contentTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypesNull: Self = StObject.set(x, "contentTypes", null)
    
    @scala.inline
    def setContentTypesUndefined: Self = StObject.set(x, "contentTypes", js.undefined)
    
    @scala.inline
    def setContentTypesVarargs(value: ContentType*): Self = StObject.set(x, "contentTypes", js.Array(value :_*))
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setDrive(value: NullableOption[Drive]): Self = StObject.set(x, "drive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriveNull: Self = StObject.set(x, "drive", null)
    
    @scala.inline
    def setDriveUndefined: Self = StObject.set(x, "drive", js.undefined)
    
    @scala.inline
    def setItems(value: NullableOption[js.Array[ListItem]]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsNull: Self = StObject.set(x, "items", null)
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: ListItem*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setList(value: NullableOption[ListInfo]): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListNull: Self = StObject.set(x, "list", null)
    
    @scala.inline
    def setListUndefined: Self = StObject.set(x, "list", js.undefined)
    
    @scala.inline
    def setSharepointIds(value: NullableOption[SharepointIds]): Self = StObject.set(x, "sharepointIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharepointIdsNull: Self = StObject.set(x, "sharepointIds", null)
    
    @scala.inline
    def setSharepointIdsUndefined: Self = StObject.set(x, "sharepointIds", js.undefined)
    
    @scala.inline
    def setSubscriptions(value: NullableOption[js.Array[Subscription]]): Self = StObject.set(x, "subscriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionsNull: Self = StObject.set(x, "subscriptions", null)
    
    @scala.inline
    def setSubscriptionsUndefined: Self = StObject.set(x, "subscriptions", js.undefined)
    
    @scala.inline
    def setSubscriptionsVarargs(value: Subscription*): Self = StObject.set(x, "subscriptions", js.Array(value :_*))
    
    @scala.inline
    def setSystem(value: NullableOption[SystemFacet]): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemNull: Self = StObject.set(x, "system", null)
    
    @scala.inline
    def setSystemUndefined: Self = StObject.set(x, "system", js.undefined)
  }
}
