package typings
package minilogLib.minilogMod.MinilogNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Console extends Transform {
  //Only available on client
  var color: Transform
  //Only available on backend
  var formatClean: Transform
  var formatColor: Transform
  var formatLearnboost: Transform
  var formatMinilog: Transform
  var formatNpm: Transform
  var formatWithStack: Transform
  /**
    * List of available formatters
    */
  var formatters: js.Array[java.lang.String]
  var minilog: Transform
}

object Console {
  @scala.inline
  def apply(
    color: Transform,
    formatClean: Transform,
    formatColor: Transform,
    formatLearnboost: Transform,
    formatMinilog: Transform,
    formatNpm: Transform,
    formatWithStack: Transform,
    formatters: js.Array[java.lang.String],
    minilog: Transform,
    mixin: js.Function1[js.Any, scala.Unit],
    pipe: js.Function1[js.Any, js.Any],
    unpipe: js.Function1[js.Any, Transform],
    write: js.Function3[js.Any, js.Any, js.Any, scala.Unit]
  ): Console = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("formatClean")(formatClean)
    __obj.updateDynamic("formatColor")(formatColor)
    __obj.updateDynamic("formatLearnboost")(formatLearnboost)
    __obj.updateDynamic("formatMinilog")(formatMinilog)
    __obj.updateDynamic("formatNpm")(formatNpm)
    __obj.updateDynamic("formatWithStack")(formatWithStack)
    __obj.updateDynamic("formatters")(formatters)
    __obj.updateDynamic("minilog")(minilog)
    __obj.updateDynamic("mixin")(mixin)
    __obj.updateDynamic("pipe")(pipe)
    __obj.updateDynamic("unpipe")(unpipe)
    __obj.updateDynamic("write")(write)
    __obj.asInstanceOf[Console]
  }
}

