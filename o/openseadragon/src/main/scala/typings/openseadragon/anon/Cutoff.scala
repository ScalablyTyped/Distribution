package typings.openseadragon.anon

import typings.openseadragon.mod.Tile
import typings.openseadragon.mod.TiledImage
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cutoff extends js.Object {
  
  var cutoff: js.UndefOr[Double] = js.native
  
  var image: HTMLImageElement = js.native
  
  var tile: Tile = js.native
  
   // TODO: check type
  var tiledImage: TiledImage = js.native
}
object Cutoff {
  
  @scala.inline
  def apply(image: HTMLImageElement, tile: Tile, tiledImage: TiledImage): Cutoff = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], tile = tile.asInstanceOf[js.Any], tiledImage = tiledImage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cutoff]
  }
  
  @scala.inline
  implicit class CutoffOps[Self <: Cutoff] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setImage(value: HTMLImageElement): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTile(value: Tile): Self = this.set("tile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTiledImage(value: TiledImage): Self = this.set("tiledImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCutoff(value: Double): Self = this.set("cutoff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCutoff: Self = this.set("cutoff", js.undefined)
  }
}
