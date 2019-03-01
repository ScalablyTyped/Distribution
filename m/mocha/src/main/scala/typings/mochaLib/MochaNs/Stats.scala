package typings
package mochaLib.MochaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Test statistics
  */
trait Stats extends js.Object {
  var duration: js.UndefOr[scala.Double] = js.undefined
  var end: js.UndefOr[stdLib.Date] = js.undefined
  var failures: scala.Double
  var passes: scala.Double
  var pending: scala.Double
  var start: js.UndefOr[stdLib.Date] = js.undefined
  var suites: scala.Double
  var tests: scala.Double
}

object Stats {
  @scala.inline
  def apply(
    failures: scala.Double,
    passes: scala.Double,
    pending: scala.Double,
    suites: scala.Double,
    tests: scala.Double,
    duration: scala.Int | scala.Double = null,
    end: stdLib.Date = null,
    start: stdLib.Date = null
  ): Stats = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("failures")(failures)
    __obj.updateDynamic("passes")(passes)
    __obj.updateDynamic("pending")(pending)
    __obj.updateDynamic("suites")(suites)
    __obj.updateDynamic("tests")(tests)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end)
    if (start != null) __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[Stats]
  }
}

