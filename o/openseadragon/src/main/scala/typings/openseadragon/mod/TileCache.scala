package typings.openseadragon.mod

import typings.openseadragon.anon.Cutoff
import typings.openseadragon.anon.MaxImageCacheCount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openseadragon", "TileCache")
@js.native
class TileCache protected () extends js.Object {
  def this(options: MaxImageCacheCount) = this()
  def cacheTile(options: Cutoff): Unit = js.native
  def clearTilesFor(tiledImage: TiledImage): Unit = js.native
  def numTilesLoaded(): Double = js.native
}

