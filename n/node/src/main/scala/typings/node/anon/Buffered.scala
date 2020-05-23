package typings.node.anon

import typings.node.perfHooksMod.EntryType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Buffered extends js.Object {
  var buffered: js.UndefOr[Boolean] = js.undefined
  var entryTypes: js.Array[EntryType]
}

object Buffered {
  @scala.inline
  def apply(entryTypes: js.Array[EntryType], buffered: js.UndefOr[Boolean] = js.undefined): Buffered = {
    val __obj = js.Dynamic.literal(entryTypes = entryTypes.asInstanceOf[js.Any])
    if (!js.isUndefined(buffered)) __obj.updateDynamic("buffered")(buffered.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buffered]
  }
}

