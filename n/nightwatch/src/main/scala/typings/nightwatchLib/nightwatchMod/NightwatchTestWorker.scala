package typings
package nightwatchLib.nightwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NightwatchTestWorker extends js.Object {
  var enabled: scala.Boolean
  var workers: java.lang.String
}

object NightwatchTestWorker {
  @scala.inline
  def apply(enabled: scala.Boolean, workers: java.lang.String): NightwatchTestWorker = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("enabled")(enabled)
    __obj.updateDynamic("workers")(workers)
    __obj.asInstanceOf[NightwatchTestWorker]
  }
}

