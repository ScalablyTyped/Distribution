package typings
package phaserLib.PhaserNs.TypesNs.PhysicsNs.ImpactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollisionOptions extends js.Object {
  /**
    * If specified, the default slope ID to
    * assign to a colliding tile. If not specified, the tile's index is used.
    */
  var defaultCollidingSlope: js.UndefOr[phaserLib.integer] = js.undefined
  /**
    * The default slope ID to assign to a
    * non-colliding tile.
    */
  var defaultNonCollidingSlope: js.UndefOr[phaserLib.integer] = js.undefined
  /**
    * A tile index to slope definition map.
    */
  var slopeMap: js.UndefOr[js.Object] = js.undefined
  /**
    * Slope IDs can be stored on tiles directly
    * using Impacts tileset editor. If a tile has a property with the given slopeTileProperty string
    * name, the value of that property for the tile will be used for its slope mapping. E.g. a 45
    * degree slope upward could be given a "slope" property with a value of 2.
    */
  var slopeTileProperty: js.UndefOr[java.lang.String] = js.undefined
}

object CollisionOptions {
  @scala.inline
  def apply(
    defaultCollidingSlope: js.UndefOr[phaserLib.integer] = js.undefined,
    defaultNonCollidingSlope: js.UndefOr[phaserLib.integer] = js.undefined,
    slopeMap: js.Object = null,
    slopeTileProperty: java.lang.String = null
  ): CollisionOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(defaultCollidingSlope)) __obj.updateDynamic("defaultCollidingSlope")(defaultCollidingSlope)
    if (!js.isUndefined(defaultNonCollidingSlope)) __obj.updateDynamic("defaultNonCollidingSlope")(defaultNonCollidingSlope)
    if (slopeMap != null) __obj.updateDynamic("slopeMap")(slopeMap)
    if (slopeTileProperty != null) __obj.updateDynamic("slopeTileProperty")(slopeTileProperty)
    __obj.asInstanceOf[CollisionOptions]
  }
}

