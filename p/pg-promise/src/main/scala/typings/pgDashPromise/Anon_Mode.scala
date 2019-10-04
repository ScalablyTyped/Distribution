package typings.pgDashPromise

import typings.pgDashPromise.pgDashPromiseMod.TransactionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Mode extends js.Object {
  var mode: js.UndefOr[TransactionMode | Null] = js.undefined
  var tag: js.UndefOr[js.Any] = js.undefined
}

object Anon_Mode {
  @scala.inline
  def apply(mode: TransactionMode = null, tag: js.Any = null): Anon_Mode = {
    val __obj = js.Dynamic.literal()
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    __obj.asInstanceOf[Anon_Mode]
  }
}

