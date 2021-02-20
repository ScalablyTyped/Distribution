package typings.openlayers.mod.source

import typings.openlayers.mod.ProjectionLike
import typings.openlayers.mod.olx.source.TileImageOptions
import typings.openlayers.mod.tilegrid.TileGrid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @classdesc
  * Base class for sources providing images divided into a tile grid.
  *
  * @fires ol.source.TileEvent
  * @param options Image tile options.
  * @api
  */
@JSImport("openlayers", "source.TileImage")
@js.native
class TileImage protected () extends UrlTile {
  /**
    * @classdesc
    * Base class for sources providing images divided into a tile grid.
    *
    * @fires ol.source.TileEvent
    * @param options Image tile options.
    * @api
    */
  def this(options: TileImageOptions) = this()
  
  /**
    * Sets whether to render reprojection edges or not (usually for debugging).
    * @param render Render the edges.
    * @api
    */
  def setRenderReprojectionEdges(render: Boolean): Unit = js.native
  
  /**
    * Sets the tile grid to use when reprojecting the tiles to the given
    * projection instead of the default tile grid for the projection.
    *
    * This can be useful when the default tile grid cannot be created
    * (e.g. projection has no extent defined) or
    * for optimization reasons (custom tile size, resolutions, ...).
    *
    * @param projection Projection.
    * @param tilegrid Tile grid to use for the projection.
    * @api
    */
  def setTileGridForProjection(projection: ProjectionLike, tilegrid: TileGrid): Unit = js.native
}
