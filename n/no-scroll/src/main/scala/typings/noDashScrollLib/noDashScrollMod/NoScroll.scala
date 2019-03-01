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
  def apply(off: js.Function0[scala.Unit], on: js.Function0[scala.Unit], toggle: js.Function0[scala.Unit]): NoScroll = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("off")(off)
    __obj.updateDynamic("on")(on)
    __obj.updateDynamic("toggle")(toggle)
    __obj.asInstanceOf[NoScroll]
  }
}

