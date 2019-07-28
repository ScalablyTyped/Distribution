package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Stream extends js.Object {
  var stream: js.UndefOr[Boolean] = js.undefined
}

object Anon_Stream {
  @scala.inline
  def apply(stream: js.UndefOr[Boolean] = js.undefined): Anon_Stream = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(stream)) __obj.updateDynamic("stream")(stream)
    __obj.asInstanceOf[Anon_Stream]
  }
}

