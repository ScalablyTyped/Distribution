package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlannerBucketTaskBoardTaskFormat extends Entity {
  
  // Hint used to order tasks in the Bucket view of the Task Board. The format is defined as outlined here.
  var orderHint: js.UndefOr[NullableOption[String]] = js.native
}
object PlannerBucketTaskBoardTaskFormat {
  
  @scala.inline
  def apply(): PlannerBucketTaskBoardTaskFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlannerBucketTaskBoardTaskFormat]
  }
  
  @scala.inline
  implicit class PlannerBucketTaskBoardTaskFormatOps[Self <: PlannerBucketTaskBoardTaskFormat] (val x: Self) extends AnyVal {
    
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
    def setOrderHint(value: NullableOption[String]): Self = this.set("orderHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderHint: Self = this.set("orderHint", js.undefined)
    
    @scala.inline
    def setOrderHintNull: Self = this.set("orderHint", null)
  }
}
