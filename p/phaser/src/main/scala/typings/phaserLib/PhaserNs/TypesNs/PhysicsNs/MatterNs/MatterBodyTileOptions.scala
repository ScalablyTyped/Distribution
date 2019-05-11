package typings
package phaserLib.PhaserNs.TypesNs.PhysicsNs.MatterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatterBodyTileOptions extends js.Object {
  /**
    * Whether or not to add the newly created body (or existing body if options.body is used) to the Matter world.
    */
  var addToWorld: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether or not the newly created body should be made static. This defaults to true since typically tiles should not be moved.
    */
  var isStatic: js.UndefOr[scala.Boolean] = js.undefined
}

object MatterBodyTileOptions {
  @scala.inline
  def apply(
    addToWorld: js.UndefOr[scala.Boolean] = js.undefined,
    isStatic: js.UndefOr[scala.Boolean] = js.undefined
  ): MatterBodyTileOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addToWorld)) __obj.updateDynamic("addToWorld")(addToWorld)
    if (!js.isUndefined(isStatic)) __obj.updateDynamic("isStatic")(isStatic)
    __obj.asInstanceOf[MatterBodyTileOptions]
  }
}

