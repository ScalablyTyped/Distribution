package typings.openseadragon.mod

import typings.openseadragon.anon.Cutoff
import typings.openseadragon.anon.MaxImageCacheCount
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openseadragon", "TileCache")
@js.native
open class TileCache protected () extends StObject {
  def this(options: MaxImageCacheCount) = this()
  
  def cacheTile(options: Cutoff): Unit = js.native
  
  def clearTilesFor(tiledImage: TiledImage): Unit = js.native
  
  def numTilesLoaded(): Double = js.native
}
