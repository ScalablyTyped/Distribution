package typings.openseadragon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TiledImageOptions
  extends StObject
     with ImageOptions {
  
  var tileSource: String | js.Object
}
object TiledImageOptions {
  
  @scala.inline
  def apply(tileSource: String | js.Object): TiledImageOptions = {
    val __obj = js.Dynamic.literal(tileSource = tileSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[TiledImageOptions]
  }
  
  @scala.inline
  implicit class TiledImageOptionsMutableBuilder[Self <: TiledImageOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTileSource(value: String | js.Object): Self = StObject.set(x, "tileSource", value.asInstanceOf[js.Any])
  }
}
