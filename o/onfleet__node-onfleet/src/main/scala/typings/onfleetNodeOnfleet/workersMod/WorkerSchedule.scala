package typings.onfleetNodeOnfleet.workersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkerSchedule extends js.Object {
  var date: String
  var shifts: js.Array[js.Tuple2[Double, Double]]
  var timezone: String
}

object WorkerSchedule {
  @scala.inline
  def apply(date: String, shifts: js.Array[js.Tuple2[Double, Double]], timezone: String): WorkerSchedule = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], shifts = shifts.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WorkerSchedule]
  }
}

