package typings.phaser.Phaser.Types.Tilemaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilteringOptions extends js.Object {
  /**
    * If true, only return tiles that have at least one interesting face.
    */
  var hasInterestingFace: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, only return tiles that collide on at least one side.
    */
  var isColliding: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, only return tiles that don't have -1 for an index.
    */
  var isNotEmpty: js.UndefOr[Boolean] = js.undefined
}

object FilteringOptions {
  @scala.inline
  def apply(
    hasInterestingFace: js.UndefOr[Boolean] = js.undefined,
    isColliding: js.UndefOr[Boolean] = js.undefined,
    isNotEmpty: js.UndefOr[Boolean] = js.undefined
  ): FilteringOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hasInterestingFace)) __obj.updateDynamic("hasInterestingFace")(hasInterestingFace)
    if (!js.isUndefined(isColliding)) __obj.updateDynamic("isColliding")(isColliding)
    if (!js.isUndefined(isNotEmpty)) __obj.updateDynamic("isNotEmpty")(isNotEmpty)
    __obj.asInstanceOf[FilteringOptions]
  }
}

