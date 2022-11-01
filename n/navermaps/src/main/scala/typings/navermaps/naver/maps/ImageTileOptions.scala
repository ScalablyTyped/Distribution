package typings.navermaps.naver.maps

import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageTileOptions
  extends StObject
     with TileOptions {
  
  var imgonerror: js.UndefOr[js.Function1[/* img */ HTMLImageElement, Unit]] = js.undefined
  
  var imgonload: js.UndefOr[js.Function1[/* img */ HTMLImageElement, Unit]] = js.undefined
  
  var urls: js.Array[String]
}
object ImageTileOptions {
  
  inline def apply(urls: js.Array[String]): ImageTileOptions = {
    val __obj = js.Dynamic.literal(urls = urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageTileOptions]
  }
  
  extension [Self <: ImageTileOptions](x: Self) {
    
    inline def setImgonerror(value: /* img */ HTMLImageElement => Unit): Self = StObject.set(x, "imgonerror", js.Any.fromFunction1(value))
    
    inline def setImgonerrorUndefined: Self = StObject.set(x, "imgonerror", js.undefined)
    
    inline def setImgonload(value: /* img */ HTMLImageElement => Unit): Self = StObject.set(x, "imgonload", js.Any.fromFunction1(value))
    
    inline def setImgonloadUndefined: Self = StObject.set(x, "imgonload", js.undefined)
    
    inline def setUrls(value: js.Array[String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    
    inline def setUrlsVarargs(value: String*): Self = StObject.set(x, "urls", js.Array(value*))
  }
}
