package typings.maximMazurokGapiClientLogging.gapi.client.logging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuppressionInfo extends js.Object {
  
  /** The reason that entries were omitted from the session. */
  var reason: js.UndefOr[String] = js.native
  
  /** A lower bound on the count of entries omitted due to reason. */
  var suppressedCount: js.UndefOr[Double] = js.native
}
object SuppressionInfo {
  
  @scala.inline
  def apply(): SuppressionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuppressionInfo]
  }
  
  @scala.inline
  implicit class SuppressionInfoOps[Self <: SuppressionInfo] (val x: Self) extends AnyVal {
    
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
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
    
    @scala.inline
    def setSuppressedCount(value: Double): Self = this.set("suppressedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuppressedCount: Self = this.set("suppressedCount", js.undefined)
  }
}
