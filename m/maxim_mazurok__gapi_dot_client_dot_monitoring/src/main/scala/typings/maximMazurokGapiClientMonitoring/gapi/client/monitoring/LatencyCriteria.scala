package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LatencyCriteria extends js.Object {
  
  /** Good service is defined to be the count of requests made to this service that return in no more than threshold. */
  var threshold: js.UndefOr[String] = js.native
}
object LatencyCriteria {
  
  @scala.inline
  def apply(): LatencyCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LatencyCriteria]
  }
  
  @scala.inline
  implicit class LatencyCriteriaOps[Self <: LatencyCriteria] (val x: Self) extends AnyVal {
    
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
    def setThreshold(value: String): Self = this.set("threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreshold: Self = this.set("threshold", js.undefined)
  }
}
