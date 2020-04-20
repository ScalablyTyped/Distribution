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
  def apply(length: Int | Double = null, offset: Int | Double = null, position: Int | Double = null): ReadSyncOptions = {
    val __obj = js.Dynamic.literal()
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadSyncOptions]
  }
}

