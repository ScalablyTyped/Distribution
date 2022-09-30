package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait List
  extends StObject
     with BaseItem {
  
  // The collection of field definitions for this list.
  var columns: js.UndefOr[NullableOption[js.Array[ColumnDefinition]]] = js.undefined
  
  // The collection of content types present in this list.
  var contentTypes: js.UndefOr[NullableOption[js.Array[ContentType]]] = js.undefined
  
  // The displayable title of the list.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Only present on document libraries. Allows access to the list as a [drive][] resource with [driveItems][driveItem].
  var drive: js.UndefOr[NullableOption[Drive]] = js.undefined
  
  // All items contained in the list.
  var items: js.UndefOr[NullableOption[js.Array[ListItem]]] = js.undefined
  
  // Provides additional details about the list.
  var list: js.UndefOr[NullableOption[ListInfo]] = js.undefined
  
  // The collection of long-running operations on the list.
  var operations: js.UndefOr[NullableOption[js.Array[RichLongRunningOperation]]] = js.undefined
  
  // Returns identifiers useful for SharePoint REST compatibility. Read-only.
  var sharepointIds: js.UndefOr[NullableOption[SharepointIds]] = js.undefined
  
  // The set of subscriptions on the list.
  var subscriptions: js.UndefOr[NullableOption[js.Array[Subscription]]] = js.undefined
  
  // If present, indicates that this is a system-managed list. Read-only.
  var system: js.UndefOr[NullableOption[SystemFacet]] = js.undefined
}
object List {
  
  inline def apply(): typings.microsoftGraph.mod.List = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.microsoftGraph.mod.List]
  }
  
  extension [Self <: typings.microsoftGraph.mod.List](x: Self) {
    
    inline def setColumns(value: NullableOption[js.Array[ColumnDefinition]]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsNull: Self = StObject.set(x, "columns", null)
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: ColumnDefinition*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setContentTypes(value: NullableOption[js.Array[ContentType]]): Self = StObject.set(x, "contentTypes", value.asInstanceOf[js.Any])
    
    inline def setContentTypesNull: Self = StObject.set(x, "contentTypes", null)
    
    inline def setContentTypesUndefined: Self = StObject.set(x, "contentTypes", js.undefined)
    
    inline def setContentTypesVarargs(value: ContentType*): Self = StObject.set(x, "contentTypes", js.Array(value*))
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setDrive(value: NullableOption[Drive]): Self = StObject.set(x, "drive", value.asInstanceOf[js.Any])
    
    inline def setDriveNull: Self = StObject.set(x, "drive", null)
    
    inline def setDriveUndefined: Self = StObject.set(x, "drive", js.undefined)
    
    inline def setItems(value: NullableOption[js.Array[ListItem]]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsNull: Self = StObject.set(x, "items", null)
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: ListItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setList(value: NullableOption[ListInfo]): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    inline def setListNull: Self = StObject.set(x, "list", null)
    
    inline def setListUndefined: Self = StObject.set(x, "list", js.undefined)
    
    inline def setOperations(value: NullableOption[js.Array[RichLongRunningOperation]]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    inline def setOperationsNull: Self = StObject.set(x, "operations", null)
    
    inline def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
    
    inline def setOperationsVarargs(value: RichLongRunningOperation*): Self = StObject.set(x, "operations", js.Array(value*))
    
    inline def setSharepointIds(value: NullableOption[SharepointIds]): Self = StObject.set(x, "sharepointIds", value.asInstanceOf[js.Any])
    
    inline def setSharepointIdsNull: Self = StObject.set(x, "sharepointIds", null)
    
    inline def setSharepointIdsUndefined: Self = StObject.set(x, "sharepointIds", js.undefined)
    
    inline def setSubscriptions(value: NullableOption[js.Array[Subscription]]): Self = StObject.set(x, "subscriptions", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionsNull: Self = StObject.set(x, "subscriptions", null)
    
    inline def setSubscriptionsUndefined: Self = StObject.set(x, "subscriptions", js.undefined)
    
    inline def setSubscriptionsVarargs(value: Subscription*): Self = StObject.set(x, "subscriptions", js.Array(value*))
    
    inline def setSystem(value: NullableOption[SystemFacet]): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    
    inline def setSystemNull: Self = StObject.set(x, "system", null)
    
    inline def setSystemUndefined: Self = StObject.set(x, "system", js.undefined)
  }
}
