package typings.openlayers.mod.source

import typings.openlayers.mod.SourceTileOptions
import typings.openlayers.mod.tilegrid.TileGrid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @classdesc
  * Abstract base class; normally only used for creating subclasses and not
  * instantiated in apps.
  * Base class for sources providing images divided into a tile grid.
  *
  * @param options Tile source options.
  * @api
  */
@JSImport("openlayers", "source.Tile")
@js.native
open class Tile protected () extends Source {
  /**
    * @classdesc
    * Abstract base class; normally only used for creating subclasses and not
    * instantiated in apps.
    * Base class for sources providing images divided into a tile grid.
    *
    * @param options Tile source options.
    * @api
    */
  def this(options: SourceTileOptions) = this()
  
  /**
    * Return the tile grid of the tile source.
    * @return Tile grid.
    * @api stable
    */
  def getTileGrid(): TileGrid = js.native
}
