package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Thumbnail extends StObject {
  
  // The content stream for the thumbnail.
  var content: js.UndefOr[NullableOption[js.Any]] = js.undefined
  
  // The height of the thumbnail, in pixels.
  var height: js.UndefOr[NullableOption[Double]] = js.undefined
  
  /**
    * The unique identifier of the item that provided the thumbnail. This is only available when a folder thumbnail is
    * requested.
    */
  var sourceItemId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The URL used to fetch the thumbnail content.
  var url: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The width of the thumbnail, in pixels.
  var width: js.UndefOr[NullableOption[Double]] = js.undefined
}
object Thumbnail {
  
  @scala.inline
  def apply(): Thumbnail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Thumbnail]
  }
  
  @scala.inline
  implicit class ThumbnailMutableBuilder[Self <: Thumbnail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: NullableOption[js.Any]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentNull: Self = StObject.set(x, "content", null)
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setHeight(value: NullableOption[Double]): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightNull: Self = StObject.set(x, "height", null)
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setSourceItemId(value: NullableOption[String]): Self = StObject.set(x, "sourceItemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceItemIdNull: Self = StObject.set(x, "sourceItemId", null)
    
    @scala.inline
    def setSourceItemIdUndefined: Self = StObject.set(x, "sourceItemId", js.undefined)
    
    @scala.inline
    def setUrl(value: NullableOption[String]): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlNull: Self = StObject.set(x, "url", null)
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setWidth(value: NullableOption[Double]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthNull: Self = StObject.set(x, "width", null)
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
