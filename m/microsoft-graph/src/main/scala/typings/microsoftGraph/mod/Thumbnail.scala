package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Thumbnail extends js.Object {
  
  // The content stream for the thumbnail.
  var content: js.UndefOr[NullableOption[_]] = js.native
  
  // The height of the thumbnail, in pixels.
  var height: js.UndefOr[NullableOption[Double]] = js.native
  
  /**
    * The unique identifier of the item that provided the thumbnail. This is only available when a folder thumbnail is
    * requested.
    */
  var sourceItemId: js.UndefOr[NullableOption[String]] = js.native
  
  // The URL used to fetch the thumbnail content.
  var url: js.UndefOr[NullableOption[String]] = js.native
  
  // The width of the thumbnail, in pixels.
  var width: js.UndefOr[NullableOption[Double]] = js.native
}
object Thumbnail {
  
  @scala.inline
  def apply(): Thumbnail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Thumbnail]
  }
  
  @scala.inline
  implicit class ThumbnailOps[Self <: Thumbnail] (val x: Self) extends AnyVal {
    
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
    def setContent(value: NullableOption[_]): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setContentNull: Self = this.set("content", null)
    
    @scala.inline
    def setHeight(value: NullableOption[Double]): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHeightNull: Self = this.set("height", null)
    
    @scala.inline
    def setSourceItemId(value: NullableOption[String]): Self = this.set("sourceItemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceItemId: Self = this.set("sourceItemId", js.undefined)
    
    @scala.inline
    def setSourceItemIdNull: Self = this.set("sourceItemId", null)
    
    @scala.inline
    def setUrl(value: NullableOption[String]): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setUrlNull: Self = this.set("url", null)
    
    @scala.inline
    def setWidth(value: NullableOption[Double]): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setWidthNull: Self = this.set("width", null)
  }
}
