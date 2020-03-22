package typings.officeJsPreview

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined office-js-preview.Office.AsyncContextOptions & {  isRest ? :boolean} */
trait AsyncContextOptionsisRest extends js.Object {
  /**
    * A user-defined item of any type that is returned, unchanged, in the `asyncContext` property of the `AsyncResult` object
    * that is passed to a callback.
    */
  var asyncContext: js.UndefOr[js.Any] = js.undefined
  var isRest: js.UndefOr[Boolean] = js.undefined
}

object AsyncContextOptionsisRest {
  @scala.inline
  def apply(asyncContext: js.Any = null, isRest: js.UndefOr[Boolean] = js.undefined): AsyncContextOptionsisRest = {
    val __obj = js.Dynamic.literal()
    if (asyncContext != null) __obj.updateDynamic("asyncContext")(asyncContext.asInstanceOf[js.Any])
    if (!js.isUndefined(isRest)) __obj.updateDynamic("isRest")(isRest.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncContextOptionsisRest]
  }
}

