package typings.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Albumid extends StObject {
  
  var access_key: js.UndefOr[String] = js.undefined
  
  var album_id: Double
  
  var can_comment: js.UndefOr[typings.nextAuth.nextAuthInts.`0` | typings.nextAuth.nextAuthInts.`1`] = js.undefined
  
  var date: Double
  
  var has_tags: Boolean
  
  var height: js.UndefOr[Double] = js.undefined
  
  var id: Double
  
  var images: js.UndefOr[js.Array[Height]] = js.undefined
  
  var lat: js.UndefOr[Double] = js.undefined
  
  var long: js.UndefOr[Double] = js.undefined
  
  var owner_id: Double
  
  var photo_256: js.UndefOr[String] = js.undefined
  
  var place: js.UndefOr[String] = js.undefined
  
  var post_id: js.UndefOr[Double] = js.undefined
  
  var sizes: js.UndefOr[js.Array[Src]] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
  
  var user_id: js.UndefOr[Double] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object Albumid {
  
  inline def apply(album_id: Double, date: Double, has_tags: Boolean, id: Double, owner_id: Double): Albumid = {
    val __obj = js.Dynamic.literal(album_id = album_id.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], has_tags = has_tags.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], owner_id = owner_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Albumid]
  }
  
  extension [Self <: Albumid](x: Self) {
    
    inline def setAccess_key(value: String): Self = StObject.set(x, "access_key", value.asInstanceOf[js.Any])
    
    inline def setAccess_keyUndefined: Self = StObject.set(x, "access_key", js.undefined)
    
    inline def setAlbum_id(value: Double): Self = StObject.set(x, "album_id", value.asInstanceOf[js.Any])
    
    inline def setCan_comment(value: typings.nextAuth.nextAuthInts.`0` | typings.nextAuth.nextAuthInts.`1`): Self = StObject.set(x, "can_comment", value.asInstanceOf[js.Any])
    
    inline def setCan_commentUndefined: Self = StObject.set(x, "can_comment", js.undefined)
    
    inline def setDate(value: Double): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setHas_tags(value: Boolean): Self = StObject.set(x, "has_tags", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setImages(value: js.Array[Height]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    inline def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
    
    inline def setImagesVarargs(value: Height*): Self = StObject.set(x, "images", js.Array(value*))
    
    inline def setLat(value: Double): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
    
    inline def setLatUndefined: Self = StObject.set(x, "lat", js.undefined)
    
    inline def setLong(value: Double): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
    
    inline def setLongUndefined: Self = StObject.set(x, "long", js.undefined)
    
    inline def setOwner_id(value: Double): Self = StObject.set(x, "owner_id", value.asInstanceOf[js.Any])
    
    inline def setPhoto_256(value: String): Self = StObject.set(x, "photo_256", value.asInstanceOf[js.Any])
    
    inline def setPhoto_256Undefined: Self = StObject.set(x, "photo_256", js.undefined)
    
    inline def setPlace(value: String): Self = StObject.set(x, "place", value.asInstanceOf[js.Any])
    
    inline def setPlaceUndefined: Self = StObject.set(x, "place", js.undefined)
    
    inline def setPost_id(value: Double): Self = StObject.set(x, "post_id", value.asInstanceOf[js.Any])
    
    inline def setPost_idUndefined: Self = StObject.set(x, "post_id", js.undefined)
    
    inline def setSizes(value: js.Array[Src]): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
    
    inline def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
    
    inline def setSizesVarargs(value: Src*): Self = StObject.set(x, "sizes", js.Array(value*))
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setUser_id(value: Double): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
    
    inline def setUser_idUndefined: Self = StObject.set(x, "user_id", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
