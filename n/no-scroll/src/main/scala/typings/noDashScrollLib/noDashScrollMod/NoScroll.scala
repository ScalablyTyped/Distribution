package typings
package noDashScrollLib.noDashScrollMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoScroll extends js.Object {
  def off(): scala.Unit
  def on(): scala.Unit
  def toggle(): scala.Unit
}

object NoScroll {
  @scala.inline
  def apply(off: () => scala.Unit, on: () => scala.Unit, toggle: () => scala.Unit): NoScroll = {
    val __obj = js.Dynamic.literal(off = js.Any.fromFunction0(off), on = js.Any.fromFunction0(on), toggle = js.Any.fromFunction0(toggle))
  
    __obj.asInstanceOf[NoScroll]
  }
}

