package typings.pdfViewerReactjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Err extends js.Object {
  var message: String
}

object Err {
  @scala.inline
  def apply(message: String): Err = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Err]
  }
}

