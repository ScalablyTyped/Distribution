package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PendingOperations extends js.Object {
  
  // A property that indicates that an operation that might update the binary content of a file is pending completion.
  var pendingContentUpdate: js.UndefOr[NullableOption[PendingContentUpdate]] = js.native
}
object PendingOperations {
  
  @scala.inline
  def apply(): PendingOperations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PendingOperations]
  }
  
  @scala.inline
  implicit class PendingOperationsOps[Self <: PendingOperations] (val x: Self) extends AnyVal {
    
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
    def setPendingContentUpdate(value: NullableOption[PendingContentUpdate]): Self = this.set("pendingContentUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePendingContentUpdate: Self = this.set("pendingContentUpdate", js.undefined)
    
    @scala.inline
    def setPendingContentUpdateNull: Self = this.set("pendingContentUpdate", null)
  }
}
