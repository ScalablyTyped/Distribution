package typings.osrm.osrmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This generates Mapbox Vector Tiles that can be viewed with a vector-tile capable slippy-map viewer.
  * The tiles contain road geometries and metadata that can be used to examine the routing graph.
  * The tiles are generated directly from the data in-memory, so are in sync with actual routing results,
  * and let you examine which roads are actually routable, and what weights they have applied.
  *
  * https://github.com/Project-OSRM/node-osrm/blob/master/docs/api.md#tile
  */
trait TileOptions extends Options {
  /**
    * Array an array consisting of x, y, and z values representing tile coordinates like wiki.openstreetmap.org/wiki/Slippy_map_tilenames
    * and are supported by vector tile viewers like Mapbox GL JS.
    */
  var ZXY: js.UndefOr[Tile] = js.undefined
}

object TileOptions {
  @scala.inline
  def apply(
    ZXY: Tile = null,
    bearings: js.Array[Bearing] = null,
    coordinates: js.Array[Coordinate] = null,
    generate_hints: js.UndefOr[Boolean] = js.undefined,
    hints: js.Array[Hint] = null,
    radiuses: js.Array[Radius] = null
  ): TileOptions = {
    val __obj = js.Dynamic.literal()
    if (ZXY != null) __obj.updateDynamic("ZXY")(ZXY.asInstanceOf[js.Any])
    if (bearings != null) __obj.updateDynamic("bearings")(bearings.asInstanceOf[js.Any])
    if (coordinates != null) __obj.updateDynamic("coordinates")(coordinates.asInstanceOf[js.Any])
    if (!js.isUndefined(generate_hints)) __obj.updateDynamic("generate_hints")(generate_hints.asInstanceOf[js.Any])
    if (hints != null) __obj.updateDynamic("hints")(hints.asInstanceOf[js.Any])
    if (radiuses != null) __obj.updateDynamic("radiuses")(radiuses.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileOptions]
  }
}

