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
    val __obj = js.Dynamic.literal(checkmark = checkmark, fail = fail, fast = fast, green = green, light = light, medium = medium, pass = pass, pending = pending, plane = plane, progress = progress, runway = runway, slow = slow, suite = suite)
    __obj.updateDynamic("bright fail")(`bright fail`)
    __obj.updateDynamic("bright pass")(`bright pass`)
    __obj.updateDynamic("bright yellow")(`bright yellow`)
    __obj.updateDynamic("diff added")(`diff added`)
    __obj.updateDynamic("diff gutter")(`diff gutter`)
    __obj.updateDynamic("diff removed")(`diff removed`)
    __obj.updateDynamic("error message")(`error message`)
    __obj.updateDynamic("error stack")(`error stack`)
    __obj.updateDynamic("error title")(`error title`)
    __obj.updateDynamic("plane crash")(`plane crash`)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ColorMap]
  }
}

