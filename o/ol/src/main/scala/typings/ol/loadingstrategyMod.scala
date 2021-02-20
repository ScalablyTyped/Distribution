package typings.ol

import typings.ol.extentMod.Extent
import typings.ol.tilegridTileGridMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loadingstrategyMod {
  
  @JSImport("ol/loadingstrategy", "all")
  @js.native
  def all(extent: Extent, resolution: Double): js.Array[Extent] = js.native
  
  @JSImport("ol/loadingstrategy", "bbox")
  @js.native
  def bbox(extent: Extent, resolution: Double): js.Array[Extent] = js.native
  
  @JSImport("ol/loadingstrategy", "tile")
  @js.native
  def tile(tileGrid: default): js.Function2[/* p0 */ Extent, /* p1 */ Double, js.Array[Extent]] = js.native
}
