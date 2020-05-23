package typings.nodeSass.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyncContext extends Context {
  @JSName("callback")
  var callback_SyncContext: js.UndefOr[scala.Nothing] = js.undefined
}

object SyncContext {
  @scala.inline
  def apply(options: Options, callback: (/* err */ SassError, /* result */ Result) => js.Any = null): SyncContext = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction2(callback))
    __obj.asInstanceOf[SyncContext]
  }
}

