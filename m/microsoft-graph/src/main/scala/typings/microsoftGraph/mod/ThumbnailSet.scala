package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThumbnailSet
  extends StObject
     with Entity {
  
  // A 1920x1920 scaled thumbnail.
  var large: js.UndefOr[NullableOption[Thumbnail]] = js.undefined
  
  // A 176x176 scaled thumbnail.
  var medium: js.UndefOr[NullableOption[Thumbnail]] = js.undefined
  
  // A 48x48 cropped thumbnail.
  var small: js.UndefOr[NullableOption[Thumbnail]] = js.undefined
  
  // A custom thumbnail image or the original image used to generate other thumbnails.
  var source: js.UndefOr[NullableOption[Thumbnail]] = js.undefined
}
object ThumbnailSet {
  
  @scala.inline
  def apply(): ThumbnailSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThumbnailSet]
  }
  
  @scala.inline
  implicit class ThumbnailSetMutableBuilder[Self <: ThumbnailSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLarge(value: NullableOption[Thumbnail]): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLargeNull: Self = StObject.set(x, "large", null)
    
    @scala.inline
    def setLargeUndefined: Self = StObject.set(x, "large", js.undefined)
    
    @scala.inline
    def setMedium(value: NullableOption[Thumbnail]): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediumNull: Self = StObject.set(x, "medium", null)
    
    @scala.inline
    def setMediumUndefined: Self = StObject.set(x, "medium", js.undefined)
    
    @scala.inline
    def setSmall(value: NullableOption[Thumbnail]): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmallNull: Self = StObject.set(x, "small", null)
    
    @scala.inline
    def setSmallUndefined: Self = StObject.set(x, "small", js.undefined)
    
    @scala.inline
    def setSource(value: NullableOption[Thumbnail]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceNull: Self = StObject.set(x, "source", null)
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
