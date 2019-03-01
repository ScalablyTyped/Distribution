package typings
package npmLib.npmMod.NPMNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Spinner extends js.Object {
  var int: java.lang.String
  var started: scala.Boolean
  def start(): scala.Unit
  def stop(): scala.Unit
}

object Spinner {
  @scala.inline
  def apply(
    int: java.lang.String,
    start: js.Function0[scala.Unit],
    started: scala.Boolean,
    stop: js.Function0[scala.Unit]
  ): Spinner = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("int")(int)
    __obj.updateDynamic("start")(start)
    __obj.updateDynamic("started")(started)
    __obj.updateDynamic("stop")(stop)
    __obj.asInstanceOf[Spinner]
  }
}

