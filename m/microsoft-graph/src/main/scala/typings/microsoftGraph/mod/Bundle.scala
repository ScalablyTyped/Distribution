package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bundle extends StObject {
  
  // If the bundle is an [album][], then the album property is included
  var album: js.UndefOr[NullableOption[Album]] = js.undefined
  
  // Number of children contained immediately within this container.
  var childCount: js.UndefOr[NullableOption[Double]] = js.undefined
}
object Bundle {
  
  inline def apply(): Bundle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bundle]
  }
  
  extension [Self <: Bundle](x: Self) {
    
    inline def setAlbum(value: NullableOption[Album]): Self = StObject.set(x, "album", value.asInstanceOf[js.Any])
    
    inline def setAlbumNull: Self = StObject.set(x, "album", null)
    
    inline def setAlbumUndefined: Self = StObject.set(x, "album", js.undefined)
    
    inline def setChildCount(value: NullableOption[Double]): Self = StObject.set(x, "childCount", value.asInstanceOf[js.Any])
    
    inline def setChildCountNull: Self = StObject.set(x, "childCount", null)
    
    inline def setChildCountUndefined: Self = StObject.set(x, "childCount", js.undefined)
  }
}
