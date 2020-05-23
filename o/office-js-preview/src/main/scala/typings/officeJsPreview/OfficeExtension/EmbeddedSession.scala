package typings.officeJsPreview.OfficeExtension

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmbeddedSession extends js.Object {
  def init(): js.Promise[_]
}

object EmbeddedSession {
  @scala.inline
  def apply(init: () => js.Promise[_]): EmbeddedSession = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction0(init))
    __obj.asInstanceOf[EmbeddedSession]
  }
}

