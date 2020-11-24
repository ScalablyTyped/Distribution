package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceVisualization extends js.Object {
  
  /**
    * A string describing where the item is stored. For example, the name of a SharePoint site or the user name identifying
    * the owner of the OneDrive storing the item.
    */
  var containerDisplayName: js.UndefOr[NullableOption[String]] = js.native
  
  // Can be used for filtering by the type of container in which the file is stored. Such as Site or OneDriveBusiness.
  var containerType: js.UndefOr[NullableOption[String]] = js.native
  
  // A path leading to the folder in which the item is stored.
  var containerWebUrl: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * The item's media type. Can be used for filtering for a specific type of file based on supported IANA Media Mime Types.
    * Note that not all Media Mime Types are supported.
    */
  var mediaType: js.UndefOr[NullableOption[String]] = js.native
  
  // A URL leading to the preview image for the item.
  var previewImageUrl: js.UndefOr[NullableOption[String]] = js.native
  
  // A preview text for the item.
  var previewText: js.UndefOr[NullableOption[String]] = js.native
  
  // The item's title text.
  var title: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * The item's media type. Can be used for filtering for a specific file based on a specific type. See below for supported
    * types.
    */
  var `type`: js.UndefOr[NullableOption[String]] = js.native
}
object ResourceVisualization {
  
  @scala.inline
  def apply(): ResourceVisualization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceVisualization]
  }
  
  @scala.inline
  implicit class ResourceVisualizationOps[Self <: ResourceVisualization] (val x: Self) extends AnyVal {
    
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
    def setContainerDisplayName(value: NullableOption[String]): Self = this.set("containerDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerDisplayName: Self = this.set("containerDisplayName", js.undefined)
    
    @scala.inline
    def setContainerDisplayNameNull: Self = this.set("containerDisplayName", null)
    
    @scala.inline
    def setContainerType(value: NullableOption[String]): Self = this.set("containerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerType: Self = this.set("containerType", js.undefined)
    
    @scala.inline
    def setContainerTypeNull: Self = this.set("containerType", null)
    
    @scala.inline
    def setContainerWebUrl(value: NullableOption[String]): Self = this.set("containerWebUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerWebUrl: Self = this.set("containerWebUrl", js.undefined)
    
    @scala.inline
    def setContainerWebUrlNull: Self = this.set("containerWebUrl", null)
    
    @scala.inline
    def setMediaType(value: NullableOption[String]): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMediaType: Self = this.set("mediaType", js.undefined)
    
    @scala.inline
    def setMediaTypeNull: Self = this.set("mediaType", null)
    
    @scala.inline
    def setPreviewImageUrl(value: NullableOption[String]): Self = this.set("previewImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviewImageUrl: Self = this.set("previewImageUrl", js.undefined)
    
    @scala.inline
    def setPreviewImageUrlNull: Self = this.set("previewImageUrl", null)
    
    @scala.inline
    def setPreviewText(value: NullableOption[String]): Self = this.set("previewText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviewText: Self = this.set("previewText", js.undefined)
    
    @scala.inline
    def setPreviewTextNull: Self = this.set("previewText", null)
    
    @scala.inline
    def setTitle(value: NullableOption[String]): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTitleNull: Self = this.set("title", null)
    
    @scala.inline
    def setType(value: NullableOption[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setTypeNull: Self = this.set("type", null)
  }
}
