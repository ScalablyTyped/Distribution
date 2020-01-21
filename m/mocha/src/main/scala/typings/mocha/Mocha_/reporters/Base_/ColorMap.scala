package typings.mocha.Mocha_.reporters.Base_

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Default color map
  *
  * @see https://mochajs.org/api/module-base#.colors
  */
trait ColorMap extends /* key */ StringDictionary[Double] {
  var `bright fail`: Double
  var `bright pass`: Double
  var `bright yellow`: Double
  var checkmark: Double
  var `diff added`: Double
  var `diff gutter`: Double
  var `diff removed`: Double
  var `error message`: Double
  var `error stack`: Double
  var `error title`: Double
  var fail: Double
  var fast: Double
  var green: Double
  var light: Double
  var medium: Double
  // added by Base
  var pass: Double
  var pending: Double
  // added by Landing
  var plane: Double
  var `plane crash`: Double
  // added by Progress
  var progress: Double
  var runway: Double
  var slow: Double
  var suite: Double
}

object ColorMap {
  @scala.inline
  def apply(
    `bright fail`: Double,
    `bright pass`: Double,
    `bright yellow`: Double,
    checkmark: Double,
    `diff added`: Double,
    `diff gutter`: Double,
    `diff removed`: Double,
    `error message`: Double,
    `error stack`: Double,
    `error title`: Double,
    fail: Double,
    fast: Double,
    green: Double,
    light: Double,
    medium: Double,
    pass: Double,
    pending: Double,
    plane: Double,
    `plane crash`: Double,
    progress: Double,
    runway: Double,
    slow: Double,
    suite: Double,
    StringDictionary: /* key */ StringDictionary[Double] = null
  ): ColorMap = {
    val __obj = js.Dynamic.literal(checkmark = checkmark.asInstanceOf[js.Any], fail = fail.asInstanceOf[js.Any], fast = fast.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any], medium = medium.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], plane = plane.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], runway = runway.asInstanceOf[js.Any], slow = slow.asInstanceOf[js.Any], suite = suite.asInstanceOf[js.Any])
    __obj.updateDynamic("bright fail")(`bright fail`.asInstanceOf[js.Any])
    __obj.updateDynamic("bright pass")(`bright pass`.asInstanceOf[js.Any])
    __obj.updateDynamic("bright yellow")(`bright yellow`.asInstanceOf[js.Any])
    __obj.updateDynamic("diff added")(`diff added`.asInstanceOf[js.Any])
    __obj.updateDynamic("diff gutter")(`diff gutter`.asInstanceOf[js.Any])
    __obj.updateDynamic("diff removed")(`diff removed`.asInstanceOf[js.Any])
    __obj.updateDynamic("error message")(`error message`.asInstanceOf[js.Any])
    __obj.updateDynamic("error stack")(`error stack`.asInstanceOf[js.Any])
    __obj.updateDynamic("error title")(`error title`.asInstanceOf[js.Any])
    __obj.updateDynamic("plane crash")(`plane crash`.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ColorMap]
  }
}

