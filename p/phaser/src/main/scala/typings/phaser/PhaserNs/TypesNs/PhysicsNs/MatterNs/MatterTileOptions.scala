package typings.phaser.PhaserNs.TypesNs.PhysicsNs.MatterNs

import typings.phaser.MatterJSNs.Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatterTileOptions extends js.Object {
  /**
    * Whether or not to add the newly created body (or existing body if options.body is used) to the Matter world.
    */
  var addToWorld: js.UndefOr[Boolean] = js.undefined
  /**
    * An existing Matter body to be used instead of creating a new one.
    */
  var body: js.UndefOr[Body] = js.undefined
  /**
    * Whether or not the newly created body should be made static. This defaults to true since typically tiles should not be moved.
    */
  var isStatic: js.UndefOr[Boolean] = js.undefined
}

object MatterTileOptions {
  @scala.inline
  def apply(
    addToWorld: js.UndefOr[Boolean] = js.undefined,
    body: Body = null,
    isStatic: js.UndefOr[Boolean] = js.undefined
  ): MatterTileOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addToWorld)) __obj.updateDynamic("addToWorld")(addToWorld)
    if (body != null) __obj.updateDynamic("body")(body)
    if (!js.isUndefined(isStatic)) __obj.updateDynamic("isStatic")(isStatic)
    __obj.asInstanceOf[MatterTileOptions]
  }
}

