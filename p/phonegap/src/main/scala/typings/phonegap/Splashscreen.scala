package typings.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Splashscreen extends js.Object {
  def hide(): Unit
  def show(): Unit
}

object Splashscreen {
  @scala.inline
  def apply(hide: () => Unit, show: () => Unit): Splashscreen = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[Splashscreen]
  }
}

