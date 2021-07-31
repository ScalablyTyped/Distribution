package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemReference extends StObject {
  
  // Unique identifier of the drive instance that contains the item. Read-only.
  var driveId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Identifies the type of drive. See [drive][] resource for values.
  var driveType: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Unique identifier of the item in the drive. Read-only.
  var id: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The name of the item being referenced. Read-only.
  var name: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Path that can be used to navigate to the item. Read-only.
  var path: js.UndefOr[NullableOption[String]] = js.undefined
  
  // A unique identifier for a shared resource that can be accessed via the [Shares][] API.
  var shareId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Returns identifiers useful for SharePoint REST compatibility. Read-only.
  var sharepointIds: js.UndefOr[NullableOption[SharepointIds]] = js.undefined
  
  var siteId: js.UndefOr[NullableOption[String]] = js.undefined
}
object ItemReference {
  
  @scala.inline
  def apply(): ItemReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemReference]
  }
  
  @scala.inline
  implicit class ItemReferenceMutableBuilder[Self <: ItemReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDriveId(value: NullableOption[String]): Self = StObject.set(x, "driveId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriveIdNull: Self = StObject.set(x, "driveId", null)
    
    @scala.inline
    def setDriveIdUndefined: Self = StObject.set(x, "driveId", js.undefined)
    
    @scala.inline
    def setDriveType(value: NullableOption[String]): Self = StObject.set(x, "driveType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriveTypeNull: Self = StObject.set(x, "driveType", null)
    
    @scala.inline
    def setDriveTypeUndefined: Self = StObject.set(x, "driveType", js.undefined)
    
    @scala.inline
    def setId(value: NullableOption[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdNull: Self = StObject.set(x, "id", null)
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setName(value: NullableOption[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPath(value: NullableOption[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathNull: Self = StObject.set(x, "path", null)
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setShareId(value: NullableOption[String]): Self = StObject.set(x, "shareId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShareIdNull: Self = StObject.set(x, "shareId", null)
    
    @scala.inline
    def setShareIdUndefined: Self = StObject.set(x, "shareId", js.undefined)
    
    @scala.inline
    def setSharepointIds(value: NullableOption[SharepointIds]): Self = StObject.set(x, "sharepointIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharepointIdsNull: Self = StObject.set(x, "sharepointIds", null)
    
    @scala.inline
    def setSharepointIdsUndefined: Self = StObject.set(x, "sharepointIds", js.undefined)
    
    @scala.inline
    def setSiteId(value: NullableOption[String]): Self = StObject.set(x, "siteId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSiteIdNull: Self = StObject.set(x, "siteId", null)
    
    @scala.inline
    def setSiteIdUndefined: Self = StObject.set(x, "siteId", js.undefined)
  }
}
