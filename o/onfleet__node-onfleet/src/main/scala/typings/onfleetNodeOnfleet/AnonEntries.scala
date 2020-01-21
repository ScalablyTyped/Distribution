package typings.onfleetNodeOnfleet

import typings.onfleetNodeOnfleet.workersMod.WorkerSchedule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEntries extends js.Object {
  var entries: js.Array[WorkerSchedule]
}

object AnonEntries {
  @scala.inline
  def apply(entries: js.Array[WorkerSchedule]): AnonEntries = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEntries]
  }
}

