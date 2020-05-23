package typings.openseadragon.anon

import typings.openseadragon.mod.Tile
import typings.openseadragon.mod.TiledImage
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cutoff extends js.Object {
  var cutoff: js.UndefOr[Double] = js.undefined
  var image: HTMLImageElement
  var tile: Tile
   // TODO: check type
  var tiledImage: TiledImage
}

object Cutoff {
  @scala.inline
  def apply(
    image: HTMLImageElement,
    tile: Tile,
    tiledImage: TiledImage,
    cutoff: js.UndefOr[Double] = js.undefined
  ): Cutoff = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], tile = tile.asInstanceOf[js.Any], tiledImage = tiledImage.asInstanceOf[js.Any])
    if (!js.isUndefined(cutoff)) __obj.updateDynamic("cutoff")(cutoff.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cutoff]
  }
}

