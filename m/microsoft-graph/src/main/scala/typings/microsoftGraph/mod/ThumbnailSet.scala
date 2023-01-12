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
  
  inline def apply(): ThumbnailSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThumbnailSet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ThumbnailSet] (val x: Self) extends AnyVal {
    
    inline def setLarge(value: NullableOption[Thumbnail]): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
    
    inline def setLargeNull: Self = StObject.set(x, "large", null)
    
    inline def setLargeUndefined: Self = StObject.set(x, "large", js.undefined)
    
    inline def setMedium(value: NullableOption[Thumbnail]): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
    
    inline def setMediumNull: Self = StObject.set(x, "medium", null)
    
    inline def setMediumUndefined: Self = StObject.set(x, "medium", js.undefined)
    
    inline def setSmall(value: NullableOption[Thumbnail]): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
    
    inline def setSmallNull: Self = StObject.set(x, "small", null)
    
    inline def setSmallUndefined: Self = StObject.set(x, "small", js.undefined)
    
    inline def setSource(value: NullableOption[Thumbnail]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceNull: Self = StObject.set(x, "source", null)
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
