package typings.pixiJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPosition extends js.Object {
  var position: js.UndefOr[Boolean] = js.undefined
  var rotation: js.UndefOr[Boolean] = js.undefined
  var tint: js.UndefOr[Boolean] = js.undefined
  var uvs: js.UndefOr[Boolean] = js.undefined
  var vertices: js.UndefOr[Boolean] = js.undefined
}

object AnonPosition {
  @scala.inline
  def apply(
    position: js.UndefOr[Boolean] = js.undefined,
    rotation: js.UndefOr[Boolean] = js.undefined,
    tint: js.UndefOr[Boolean] = js.undefined,
    uvs: js.UndefOr[Boolean] = js.undefined,
    vertices: js.UndefOr[Boolean] = js.undefined
  ): AnonPosition = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(position)) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(rotation)) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (!js.isUndefined(tint)) __obj.updateDynamic("tint")(tint.asInstanceOf[js.Any])
    if (!js.isUndefined(uvs)) __obj.updateDynamic("uvs")(uvs.asInstanceOf[js.Any])
    if (!js.isUndefined(vertices)) __obj.updateDynamic("vertices")(vertices.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPosition]
  }
}

