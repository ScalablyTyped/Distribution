package typings.officeDashJsDashPreview.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides an option for preserving context data of any type, unchanged, for use in a callback.
  */
trait AsyncContextOptions extends js.Object {
  /**
    * A user-defined item of any type that is returned, unchanged, in the asyncContext property of the AsyncResult object that is passed to a callback.
    */
  var asyncContext: js.UndefOr[js.Any] = js.undefined
}

object AsyncContextOptions {
  @scala.inline
  def apply(asyncContext: js.Any = null): AsyncContextOptions = {
    val __obj = js.Dynamic.literal()
    if (asyncContext != null) __obj.updateDynamic("asyncContext")(asyncContext)
    __obj.asInstanceOf[AsyncContextOptions]
  }
}

