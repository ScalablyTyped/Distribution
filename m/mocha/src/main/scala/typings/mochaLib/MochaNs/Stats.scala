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

