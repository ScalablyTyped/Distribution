package typings.node.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stream extends js.Object {
  var stream: js.UndefOr[Boolean] = js.undefined
}

object Stream {
  @scala.inline
  def apply(stream: js.UndefOr[Boolean] = js.undefined): Stream = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(stream)) __obj.updateDynamic("stream")(stream.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stream]
  }
}

