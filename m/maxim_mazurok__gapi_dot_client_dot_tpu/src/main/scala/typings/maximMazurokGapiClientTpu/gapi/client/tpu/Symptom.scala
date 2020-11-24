package typings.maximMazurokGapiClientTpu.gapi.client.tpu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Symptom extends js.Object {
  
  /** Timestamp when the Symptom is created. */
  var createTime: js.UndefOr[String] = js.native
  
  /** Detailed information of the current Symptom. */
  var details: js.UndefOr[String] = js.native
  
  /** Type of the Symptom. */
  var symptomType: js.UndefOr[String] = js.native
  
  /** A string used to uniquely distinguish a worker within a TPU node. */
  var workerId: js.UndefOr[String] = js.native
}
object Symptom {
  
  @scala.inline
  def apply(): Symptom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Symptom]
  }
  
  @scala.inline
  implicit class SymptomOps[Self <: Symptom] (val x: Self) extends AnyVal {
    
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
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setDetails(value: String): Self = this.set("details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetails: Self = this.set("details", js.undefined)
    
    @scala.inline
    def setSymptomType(value: String): Self = this.set("symptomType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymptomType: Self = this.set("symptomType", js.undefined)
    
    @scala.inline
    def setWorkerId(value: String): Self = this.set("workerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkerId: Self = this.set("workerId", js.undefined)
  }
}
