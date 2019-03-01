package typings
package mochaLib.MochaNs.reportersNs.BaseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Default color map
  *
  * @see https://mochajs.org/api/module-base#.colors
  */
trait ColorMap
  extends /* key */ org.scalablytyped.runtime.StringDictionary[scala.Double] {
  var `bright fail`: scala.Double
  var `bright pass`: scala.Double
  var `bright yellow`: scala.Double
  var checkmark: scala.Double
  var `diff added`: scala.Double
  var `diff gutter`: scala.Double
  var `diff removed`: scala.Double
  var `error message`: scala.Double
  var `error stack`: scala.Double
  var `error title`: scala.Double
  var fail: scala.Double
  var fast: scala.Double
  var green: scala.Double
  var light: scala.Double
  var medium: scala.Double
  // added by Base
  var pass: scala.Double
  var pending: scala.Double
  // added by Landing
  var plane: scala.Double
  var `plane crash`: scala.Double
  // added by Progress
  var progress: scala.Double
  var runway: scala.Double
  var slow: scala.Double
  var suite: scala.Double
}

object ColorMap {
  @scala.inline
  def apply(
    `bright fail`: scala.Double,
    `bright pass`: scala.Double,
    `bright yellow`: scala.Double,
    checkmark: scala.Double,
    `diff added`: scala.Double,
    `diff gutter`: scala.Double,
    `diff removed`: scala.Double,
    `error message`: scala.Double,
    `error stack`: scala.Double,
    `error title`: scala.Double,
    fail: scala.Double,
    fast: scala.Double,
    green: scala.Double,
    light: scala.Double,
    medium: scala.Double,
    pass: scala.Double,
    pending: scala.Double,
    plane: scala.Double,
    `plane crash`: scala.Double,
    progress: scala.Double,
    runway: scala.Double,
    slow: scala.Double,
    suite: scala.Double,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[scala.Double] = null
  ): ColorMap = {
    val __obj = js.Dynamic.literal(`bright fail` = `bright fail`, `bright pass` = `bright pass`, `bright yellow` = `bright yellow`, `diff added` = `diff added`, `diff gutter` = `diff gutter`, `diff removed` = `diff removed`, `error message` = `error message`, `error stack` = `error stack`, `error title` = `error title`, `plane crash` = `plane crash`)
    __obj.updateDynamic("checkmark")(checkmark)
    __obj.updateDynamic("fail")(fail)
    __obj.updateDynamic("fast")(fast)
    __obj.updateDynamic("green")(green)
    __obj.updateDynamic("light")(light)
    __obj.updateDynamic("medium")(medium)
    __obj.updateDynamic("pass")(pass)
    __obj.updateDynamic("pending")(pending)
    __obj.updateDynamic("plane")(plane)
    __obj.updateDynamic("progress")(progress)
    __obj.updateDynamic("runway")(runway)
    __obj.updateDynamic("slow")(slow)
    __obj.updateDynamic("suite")(suite)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ColorMap]
  }
}

