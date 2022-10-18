package typings.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Crop extends StObject {
  
  var crop: X
  
  var photo: Albumid
  
  var rect: X
}
object Crop {
  
  inline def apply(crop: X, photo: Albumid, rect: X): Crop = {
    val __obj = js.Dynamic.literal(crop = crop.asInstanceOf[js.Any], photo = photo.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any])
    __obj.asInstanceOf[Crop]
  }
  
  extension [Self <: Crop](x: Self) {
    
    inline def setCrop(value: X): Self = StObject.set(x, "crop", value.asInstanceOf[js.Any])
    
    inline def setPhoto(value: Albumid): Self = StObject.set(x, "photo", value.asInstanceOf[js.Any])
    
    inline def setRect(value: X): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
  }
}
