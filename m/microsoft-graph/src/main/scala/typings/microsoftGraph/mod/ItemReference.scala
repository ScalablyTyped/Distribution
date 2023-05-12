package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemReference extends StObject {
  
  /**
    * Unique identifier of the drive instance that contains the driveItem. Only returned if the item is located in a
    * [drive][]. Read-only.
    */
  var driveId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Identifies the type of drive. Only returned if the item is located in a [drive][]. See [drive][] resource for values.
  var driveType: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Unique identifier of the driveItem in the drive or a listItem in a list. Read-only.
  var id: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The name of the item being referenced. Read-only.
  var name: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Path that can be used to navigate to the item. Read-only.
  var path: js.UndefOr[NullableOption[String]] = js.undefined
  
  // A unique identifier for a shared resource that can be accessed via the [Shares][] API.
  var shareId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Returns identifiers useful for SharePoint REST compatibility. Read-only.
  var sharepointIds: js.UndefOr[NullableOption[SharepointIds]] = js.undefined
  
  /**
    * For OneDrive for Business and SharePoint, this property represents the ID of the site that contains the parent document
    * library of the driveItem resource or the parent list of the listItem resource. The value is the same as the id property
    * of that [site][] resource. It is an opaque string that consists of three identifiers of the site. For OneDrive, this
    * property is not populated.
    */
  var siteId: js.UndefOr[NullableOption[String]] = js.undefined
}
object ItemReference {
  
  inline def apply(): ItemReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemReference]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ItemReference] (val x: Self) extends AnyVal {
    
    inline def setDriveId(value: NullableOption[String]): Self = StObject.set(x, "driveId", value.asInstanceOf[js.Any])
    
    inline def setDriveIdNull: Self = StObject.set(x, "driveId", null)
    
    inline def setDriveIdUndefined: Self = StObject.set(x, "driveId", js.undefined)
    
    inline def setDriveType(value: NullableOption[String]): Self = StObject.set(x, "driveType", value.asInstanceOf[js.Any])
    
    inline def setDriveTypeNull: Self = StObject.set(x, "driveType", null)
    
    inline def setDriveTypeUndefined: Self = StObject.set(x, "driveType", js.undefined)
    
    inline def setId(value: NullableOption[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: NullableOption[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPath(value: NullableOption[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathNull: Self = StObject.set(x, "path", null)
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setShareId(value: NullableOption[String]): Self = StObject.set(x, "shareId", value.asInstanceOf[js.Any])
    
    inline def setShareIdNull: Self = StObject.set(x, "shareId", null)
    
    inline def setShareIdUndefined: Self = StObject.set(x, "shareId", js.undefined)
    
    inline def setSharepointIds(value: NullableOption[SharepointIds]): Self = StObject.set(x, "sharepointIds", value.asInstanceOf[js.Any])
    
    inline def setSharepointIdsNull: Self = StObject.set(x, "sharepointIds", null)
    
    inline def setSharepointIdsUndefined: Self = StObject.set(x, "sharepointIds", js.undefined)
    
    inline def setSiteId(value: NullableOption[String]): Self = StObject.set(x, "siteId", value.asInstanceOf[js.Any])
    
    inline def setSiteIdNull: Self = StObject.set(x, "siteId", null)
    
    inline def setSiteIdUndefined: Self = StObject.set(x, "siteId", js.undefined)
  }
}
