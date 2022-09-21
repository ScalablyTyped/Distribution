package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListItem
  extends StObject
     with BaseItem {
  
  // Analytics about the view activities that took place on this item.
  var analytics: js.UndefOr[NullableOption[ItemAnalytics]] = js.undefined
  
  // The content type of this list item
  var contentType: js.UndefOr[NullableOption[ContentTypeInfo]] = js.undefined
  
  // Version information for a document set version created by a user.
  var documentSetVersions: js.UndefOr[NullableOption[js.Array[DocumentSetVersion]]] = js.undefined
  
  // For document libraries, the driveItem relationship exposes the listItem as a [driveItem][]
  var driveItem: js.UndefOr[NullableOption[DriveItem]] = js.undefined
  
  // The values of the columns set on this list item.
  var fields: js.UndefOr[NullableOption[FieldValueSet]] = js.undefined
  
  // Returns identifiers useful for SharePoint REST compatibility. Read-only.
  var sharepointIds: js.UndefOr[NullableOption[SharepointIds]] = js.undefined
  
  // The list of previous versions of the list item.
  var versions: js.UndefOr[NullableOption[js.Array[ListItemVersion]]] = js.undefined
}
object ListItem {
  
  inline def apply(): ListItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListItem]
  }
  
  extension [Self <: ListItem](x: Self) {
    
    inline def setAnalytics(value: NullableOption[ItemAnalytics]): Self = StObject.set(x, "analytics", value.asInstanceOf[js.Any])
    
    inline def setAnalyticsNull: Self = StObject.set(x, "analytics", null)
    
    inline def setAnalyticsUndefined: Self = StObject.set(x, "analytics", js.undefined)
    
    inline def setContentType(value: NullableOption[ContentTypeInfo]): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeNull: Self = StObject.set(x, "contentType", null)
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setDocumentSetVersions(value: NullableOption[js.Array[DocumentSetVersion]]): Self = StObject.set(x, "documentSetVersions", value.asInstanceOf[js.Any])
    
    inline def setDocumentSetVersionsNull: Self = StObject.set(x, "documentSetVersions", null)
    
    inline def setDocumentSetVersionsUndefined: Self = StObject.set(x, "documentSetVersions", js.undefined)
    
    inline def setDocumentSetVersionsVarargs(value: DocumentSetVersion*): Self = StObject.set(x, "documentSetVersions", js.Array(value*))
    
    inline def setDriveItem(value: NullableOption[DriveItem]): Self = StObject.set(x, "driveItem", value.asInstanceOf[js.Any])
    
    inline def setDriveItemNull: Self = StObject.set(x, "driveItem", null)
    
    inline def setDriveItemUndefined: Self = StObject.set(x, "driveItem", js.undefined)
    
    inline def setFields(value: NullableOption[FieldValueSet]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsNull: Self = StObject.set(x, "fields", null)
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setSharepointIds(value: NullableOption[SharepointIds]): Self = StObject.set(x, "sharepointIds", value.asInstanceOf[js.Any])
    
    inline def setSharepointIdsNull: Self = StObject.set(x, "sharepointIds", null)
    
    inline def setSharepointIdsUndefined: Self = StObject.set(x, "sharepointIds", js.undefined)
    
    inline def setVersions(value: NullableOption[js.Array[ListItemVersion]]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    
    inline def setVersionsNull: Self = StObject.set(x, "versions", null)
    
    inline def setVersionsUndefined: Self = StObject.set(x, "versions", js.undefined)
    
    inline def setVersionsVarargs(value: ListItemVersion*): Self = StObject.set(x, "versions", js.Array(value*))
  }
}
