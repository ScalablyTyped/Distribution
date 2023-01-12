package typings.openseadragon.anon

import typings.openseadragon.mod.Tile
import typings.openseadragon.mod.TiledImage
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cutoff extends StObject {
  
  var cutoff: js.UndefOr[Double] = js.undefined
  
  var image: HTMLImageElement
  
  var tile: Tile
  
  // TODO: check type
  var tiledImage: TiledImage
}
object Cutoff {
  
  inline def apply(image: HTMLImageElement, tile: Tile, tiledImage: TiledImage): Cutoff = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], tile = tile.asInstanceOf[js.Any], tiledImage = tiledImage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cutoff]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cutoff] (val x: Self) extends AnyVal {
    
    inline def setCutoff(value: Double): Self = StObject.set(x, "cutoff", value.asInstanceOf[js.Any])
    
    inline def setCutoffUndefined: Self = StObject.set(x, "cutoff", js.undefined)
    
    inline def setImage(value: HTMLImageElement): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setTile(value: Tile): Self = StObject.set(x, "tile", value.asInstanceOf[js.Any])
    
    inline def setTiledImage(value: TiledImage): Self = StObject.set(x, "tiledImage", value.asInstanceOf[js.Any])
  }
}
