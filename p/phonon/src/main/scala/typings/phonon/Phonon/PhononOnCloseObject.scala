package typings.phonon.Phonon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhononOnCloseObject extends js.Object {
  def close(): Unit
}

object PhononOnCloseObject {
  @scala.inline
  def apply(close: () => Unit): PhononOnCloseObject = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close))
    __obj.asInstanceOf[PhononOnCloseObject]
  }
}

