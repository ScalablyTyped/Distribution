package typings.navermaps.naver.maps

import typings.std.ImageData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasTileOptions
  extends StObject
     with TileOptions {
  
  var imageData: js.UndefOr[ImageData] = js.undefined
}
object CanvasTileOptions {
  
  inline def apply(): CanvasTileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanvasTileOptions]
  }
  
  extension [Self <: CanvasTileOptions](x: Self) {
    
    inline def setImageData(value: ImageData): Self = StObject.set(x, "imageData", value.asInstanceOf[js.Any])
    
    inline def setImageDataUndefined: Self = StObject.set(x, "imageData", js.undefined)
  }
}
