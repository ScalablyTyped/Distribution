package typings.onfleetNodeOnfleet.anon

import typings.onfleetNodeOnfleet.workersMod.WorkerSchedule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Entries extends js.Object {
  var entries: js.Array[WorkerSchedule]
}

object Entries {
  @scala.inline
  def apply(entries: js.Array[WorkerSchedule]): Entries = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entries]
  }
}

