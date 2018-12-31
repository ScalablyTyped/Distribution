package typings
package newDashRelicDashBrowserLib.newDashRelicDashBrowserMod.NewRelicNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventObject extends js.Object {
  /** End time in ms since epoch.  Defaults to same as start resulting in trace object with a duration of zero. */
  var end: js.UndefOr[scala.Double] = js.undefined
  /** Event name */
  var name: java.lang.String
  /** Origin of event */
  var origin: js.UndefOr[java.lang.String] = js.undefined
  /** Start time in ms since epoch */
  var start: scala.Double
  /** Event type */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

