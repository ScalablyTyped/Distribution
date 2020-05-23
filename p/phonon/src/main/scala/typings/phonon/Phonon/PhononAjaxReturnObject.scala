package typings.phonon.Phonon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhononAjaxReturnObject extends js.Object {
  def cancel(): Unit
}

object PhononAjaxReturnObject {
  @scala.inline
  def apply(cancel: () => Unit): PhononAjaxReturnObject = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel))
    __obj.asInstanceOf[PhononAjaxReturnObject]
  }
}

