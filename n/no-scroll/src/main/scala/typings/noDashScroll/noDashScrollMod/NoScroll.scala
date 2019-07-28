package typings.noDashScroll.noDashScrollMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoScroll extends js.Object {
  def off(): Unit
  def on(): Unit
  def toggle(): Unit
}

object NoScroll {
  @scala.inline
  def apply(off: () => Unit, on: () => Unit, toggle: () => Unit): NoScroll = {
    val __obj = js.Dynamic.literal(off = js.Any.fromFunction0(off), on = js.Any.fromFunction0(on), toggle = js.Any.fromFunction0(toggle))
  
    __obj.asInstanceOf[NoScroll]
  }
}

