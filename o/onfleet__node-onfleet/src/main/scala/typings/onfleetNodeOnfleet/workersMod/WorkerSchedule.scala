package typings.onfleetNodeOnfleet.workersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkerSchedule extends js.Object {
  
  var date: String = js.native
  
  var shifts: js.Array[js.Tuple2[Double, Double]] = js.native
  
  var timezone: String = js.native
}
object WorkerSchedule {
  
  @scala.inline
  def apply(date: String, shifts: js.Array[js.Tuple2[Double, Double]], timezone: String): WorkerSchedule = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], shifts = shifts.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkerSchedule]
  }
  
  @scala.inline
  implicit class WorkerScheduleOps[Self <: WorkerSchedule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDate(value: String): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShiftsVarargs(value: (js.Tuple2[Double, Double])*): Self = this.set("shifts", js.Array(value :_*))
    
    @scala.inline
    def setShifts(value: js.Array[js.Tuple2[Double, Double]]): Self = this.set("shifts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimezone(value: String): Self = this.set("timezone", value.asInstanceOf[js.Any])
  }
}
