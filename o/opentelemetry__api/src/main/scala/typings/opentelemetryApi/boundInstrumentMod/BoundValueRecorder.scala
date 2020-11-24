package typings.opentelemetryApi.boundInstrumentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BoundValueRecorder extends js.Object {
  
  /**
    * Records the given value to this value recorder.
    * @param value to record.
    */
  def record(value: Double): Unit = js.native
}
object BoundValueRecorder {
  
  @scala.inline
  def apply(record: Double => Unit): BoundValueRecorder = {
    val __obj = js.Dynamic.literal(record = js.Any.fromFunction1(record))
    __obj.asInstanceOf[BoundValueRecorder]
  }
  
  @scala.inline
  implicit class BoundValueRecorderOps[Self <: BoundValueRecorder] (val x: Self) extends AnyVal {
    
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
    def setRecord(value: Double => Unit): Self = this.set("record", js.Any.fromFunction1(value))
  }
}
