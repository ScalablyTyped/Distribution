package typings.node.fsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadSyncOptions extends js.Object {
  /**
    * @default `length of buffer`
    */
  var length: js.UndefOr[Double] = js.undefined
  /**
    * @default 0
    */
  var offset: js.UndefOr[Double] = js.undefined
  /**
    * @default null
    */
  var position: js.UndefOr[Double | Null] = js.undefined
}

object ReadSyncOptions {
  @scala.inline
  def apply(
    length: js.UndefOr[Double] = js.undefined,
    offset: js.UndefOr[Double] = js.undefined,
    position: js.UndefOr[Null | Double] = js.undefined
  ): ReadSyncOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(position)) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadSyncOptions]
  }
}

