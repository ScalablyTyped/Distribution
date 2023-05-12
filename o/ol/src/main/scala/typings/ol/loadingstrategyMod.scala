package typings.ol

import typings.ol.extentMod.Extent
import typings.ol.projMod.Projection
import typings.ol.tilegridTileGridMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loadingstrategyMod {
  
  @JSImport("ol/loadingstrategy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def all(extent: Extent, resolution: Double): js.Array[Extent] = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(extent.asInstanceOf[js.Any], resolution.asInstanceOf[js.Any])).asInstanceOf[js.Array[Extent]]
  
  inline def bbox(extent: Extent, resolution: Double): js.Array[Extent] = (^.asInstanceOf[js.Dynamic].applyDynamic("bbox")(extent.asInstanceOf[js.Any], resolution.asInstanceOf[js.Any])).asInstanceOf[js.Array[Extent]]
  
  inline def tile(tileGrid: default): js.Function3[/* arg0 */ Extent, /* arg1 */ Double, /* arg2 */ Projection, js.Array[Extent]] = ^.asInstanceOf[js.Dynamic].applyDynamic("tile")(tileGrid.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* arg0 */ Extent, /* arg1 */ Double, /* arg2 */ Projection, js.Array[Extent]]]
}
