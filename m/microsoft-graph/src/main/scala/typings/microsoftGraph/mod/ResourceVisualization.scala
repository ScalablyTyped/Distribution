package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceVisualization extends StObject {
  
  /**
    * A string describing where the item is stored. For example, the name of a SharePoint site or the user name identifying
    * the owner of the OneDrive storing the item.
    */
  var containerDisplayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Can be used for filtering by the type of container in which the file is stored. Such as Site or OneDriveBusiness.
  var containerType: js.UndefOr[NullableOption[String]] = js.undefined
  
  // A path leading to the folder in which the item is stored.
  var containerWebUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The item's media type. Can be used for filtering for a specific type of file based on supported IANA Media Mime Types.
    * Note that not all Media Mime Types are supported.
    */
  var mediaType: js.UndefOr[NullableOption[String]] = js.undefined
  
  // A URL leading to the preview image for the item.
  var previewImageUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  // A preview text for the item.
  var previewText: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The item's title text.
  var title: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The item's media type. Can be used for filtering for a specific file based on a specific type. See below for supported
    * types.
    */
  var `type`: js.UndefOr[NullableOption[String]] = js.undefined
}
object ResourceVisualization {
  
  inline def apply(): ResourceVisualization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceVisualization]
  }
  
  extension [Self <: ResourceVisualization](x: Self) {
    
    inline def setContainerDisplayName(value: NullableOption[String]): Self = StObject.set(x, "containerDisplayName", value.asInstanceOf[js.Any])
    
    inline def setContainerDisplayNameNull: Self = StObject.set(x, "containerDisplayName", null)
    
    inline def setContainerDisplayNameUndefined: Self = StObject.set(x, "containerDisplayName", js.undefined)
    
    inline def setContainerType(value: NullableOption[String]): Self = StObject.set(x, "containerType", value.asInstanceOf[js.Any])
    
    inline def setContainerTypeNull: Self = StObject.set(x, "containerType", null)
    
    inline def setContainerTypeUndefined: Self = StObject.set(x, "containerType", js.undefined)
    
    inline def setContainerWebUrl(value: NullableOption[String]): Self = StObject.set(x, "containerWebUrl", value.asInstanceOf[js.Any])
    
    inline def setContainerWebUrlNull: Self = StObject.set(x, "containerWebUrl", null)
    
    inline def setContainerWebUrlUndefined: Self = StObject.set(x, "containerWebUrl", js.undefined)
    
    inline def setMediaType(value: NullableOption[String]): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    inline def setMediaTypeNull: Self = StObject.set(x, "mediaType", null)
    
    inline def setMediaTypeUndefined: Self = StObject.set(x, "mediaType", js.undefined)
    
    inline def setPreviewImageUrl(value: NullableOption[String]): Self = StObject.set(x, "previewImageUrl", value.asInstanceOf[js.Any])
    
    inline def setPreviewImageUrlNull: Self = StObject.set(x, "previewImageUrl", null)
    
    inline def setPreviewImageUrlUndefined: Self = StObject.set(x, "previewImageUrl", js.undefined)
    
    inline def setPreviewText(value: NullableOption[String]): Self = StObject.set(x, "previewText", value.asInstanceOf[js.Any])
    
    inline def setPreviewTextNull: Self = StObject.set(x, "previewText", null)
    
    inline def setPreviewTextUndefined: Self = StObject.set(x, "previewText", js.undefined)
    
    inline def setTitle(value: NullableOption[String]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: NullableOption[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
