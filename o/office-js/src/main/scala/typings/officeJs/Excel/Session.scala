package typings.officeJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides connection session for a remote workbook.
  */
trait Session extends js.Object {
  /**
    * Close the session.
    */
  def close(): js.Promise[Unit]
}

object Session {
  @scala.inline
  def apply(close: () => js.Promise[Unit]): Session = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close))
    __obj.asInstanceOf[Session]
  }
}

