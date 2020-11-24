package typings.ol.sourceVectorTileMod

import typings.ol.extentMod.Extent
import typings.ol.olFeatureMod.FeatureLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VectorTile
  extends typings.ol.urlTileMod.default {
  
  /**
    * Get features whose bounding box intersects the provided extent. Only features for cached
    * tiles for the last rendered zoom level are available in the source. So this method is only
    * suitable for requesting tiles for extents that are currently rendered.
    * Features are returned in random tile order and as they are included in the tiles. This means
    * they can be clipped, duplicated across tiles, and simplified to the render resolution.
    */
  def getFeaturesInExtent(extent: Extent): js.Array[FeatureLike] = js.native
  
  def getOverlaps(): Boolean = js.native
  
  def getSourceTiles(
    pixelRatio: Double,
    projection: typings.ol.projectionMod.default,
    tile: typings.ol.vectorRenderTileMod.default
  ): js.Array[typings.ol.olVectorTileMod.default] = js.native
  
  var tileClass: typings.ol.olVectorTileMod.default = js.native
}
