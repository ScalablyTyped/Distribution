package typings.pgPromise.anon

import typings.pgPromise.mod.TransactionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mode extends js.Object {
  var mode: js.UndefOr[TransactionMode | Null] = js.undefined
  var tag: js.UndefOr[js.Any] = js.undefined
}

object Mode {
  @scala.inline
  def apply(mode: js.UndefOr[Null | TransactionMode] = js.undefined, tag: js.Any = null): Mode = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(mode)) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mode]
  }
}

