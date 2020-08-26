package typings.officeJsPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides connection session for a remote workbook.
  */
@js.native
trait Session extends js.Object {
  /**
    * Close the session.
    */
  def close(): js.Promise[Unit] = js.native
}

object Session {
  @scala.inline
  def apply(close: () => js.Promise[Unit]): Session = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close))
    __obj.asInstanceOf[Session]
  }
  @scala.inline
  implicit class SessionOps[Self <: Session] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClose(value: () => js.Promise[Unit]): Self = this.set("close", js.Any.fromFunction0(value))
  }
  
}

