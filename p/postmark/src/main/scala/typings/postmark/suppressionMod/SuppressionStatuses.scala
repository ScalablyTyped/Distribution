package typings.postmark.suppressionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuppressionStatuses extends js.Object {
  
  var Suppressions: js.Array[SuppressionStatus] = js.native
}
object SuppressionStatuses {
  
  @scala.inline
  def apply(Suppressions: js.Array[SuppressionStatus]): SuppressionStatuses = {
    val __obj = js.Dynamic.literal(Suppressions = Suppressions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuppressionStatuses]
  }
  
  @scala.inline
  implicit class SuppressionStatusesOps[Self <: SuppressionStatuses] (val x: Self) extends AnyVal {
    
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
    def setSuppressionsVarargs(value: SuppressionStatus*): Self = this.set("Suppressions", js.Array(value :_*))
    
    @scala.inline
    def setSuppressions(value: js.Array[SuppressionStatus]): Self = this.set("Suppressions", value.asInstanceOf[js.Any])
  }
}
