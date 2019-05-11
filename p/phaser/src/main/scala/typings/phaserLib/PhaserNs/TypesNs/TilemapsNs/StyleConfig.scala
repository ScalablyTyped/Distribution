package typings
package phaserLib.PhaserNs.TypesNs.TilemapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleConfig extends js.Object {
  /**
    * Color to use for drawing a filled rectangle at colliding tile locations. If set to null, colliding tiles will not be drawn.
    */
  var collidingTileColor: js.UndefOr[phaserLib.PhaserNs.DisplayNs.Color | scala.Double | scala.Null] = js.undefined
  /**
    * Color to use for drawing a line at interesting tile faces. If set to null, interesting tile faces will not be drawn.
    */
  var faceColor: js.UndefOr[phaserLib.PhaserNs.DisplayNs.Color | scala.Double | scala.Null] = js.undefined
  /**
    * Color to use for drawing a filled rectangle at non-colliding tile locations. If set to null, non-colliding tiles will not be drawn.
    */
  var tileColor: js.UndefOr[phaserLib.PhaserNs.DisplayNs.Color | scala.Double | scala.Null] = js.undefined
}

object StyleConfig {
  @scala.inline
  def apply(
    collidingTileColor: phaserLib.PhaserNs.DisplayNs.Color | scala.Double = null,
    faceColor: phaserLib.PhaserNs.DisplayNs.Color | scala.Double = null,
    tileColor: phaserLib.PhaserNs.DisplayNs.Color | scala.Double = null
  ): StyleConfig = {
    val __obj = js.Dynamic.literal()
    if (collidingTileColor != null) __obj.updateDynamic("collidingTileColor")(collidingTileColor.asInstanceOf[js.Any])
    if (faceColor != null) __obj.updateDynamic("faceColor")(faceColor.asInstanceOf[js.Any])
    if (tileColor != null) __obj.updateDynamic("tileColor")(tileColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleConfig]
  }
}

