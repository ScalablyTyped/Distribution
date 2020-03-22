package typings.officeJsPreview

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined office-js-preview.Office.AsyncContextOptions & {  isInline  :boolean} */
trait AsyncContextOptionsisInli extends js.Object {
  /**
    * A user-defined item of any type that is returned, unchanged, in the `asyncContext` property of the `AsyncResult` object
    * that is passed to a callback.
    */
  var asyncContext: js.UndefOr[js.Any] = js.undefined
  var isInline: Boolean
}

object AsyncContextOptionsisInli {
  @scala.inline
  def apply(isInline: Boolean, asyncContext: js.Any = null): AsyncContextOptionsisInli = {
    val __obj = js.Dynamic.literal(isInline = isInline.asInstanceOf[js.Any])
    if (asyncContext != null) __obj.updateDynamic("asyncContext")(asyncContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncContextOptionsisInli]
  }
}

