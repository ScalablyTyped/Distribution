package typings.nightwatch.nightwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NightwatchTestWorker extends js.Object {
  var enabled: Boolean
  var workers: String
}

object NightwatchTestWorker {
  @scala.inline
  def apply(enabled: Boolean, workers: String): NightwatchTestWorker = {
    val __obj = js.Dynamic.literal(enabled = enabled, workers = workers)
  
    __obj.asInstanceOf[NightwatchTestWorker]
  }
}

