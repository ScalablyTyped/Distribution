package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Buffered extends js.Object {
  var buffered: js.UndefOr[Boolean] = js.undefined
  var entryTypes: js.Array[java.lang.String]
}

object Anon_Buffered {
  @scala.inline
  def apply(entryTypes: js.Array[java.lang.String], buffered: js.UndefOr[Boolean] = js.undefined): Anon_Buffered = {
    val __obj = js.Dynamic.literal(entryTypes = entryTypes.asInstanceOf[js.Any])
    if (!js.isUndefined(buffered)) __obj.updateDynamic("buffered")(buffered.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Buffered]
  }
}

