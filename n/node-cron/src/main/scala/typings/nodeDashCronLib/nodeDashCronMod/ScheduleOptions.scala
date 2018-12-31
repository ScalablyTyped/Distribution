package typings
package nodeDashCronLib.nodeDashCronMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScheduleOptions extends js.Object {
  /**
    * A boolean to set if the created task is scheduled.
    *
    * Defaults to `true`
    */
  var scheduled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The timezone that is used for job scheduling
    */
  var timezone: js.UndefOr[java.lang.String] = js.undefined
}

