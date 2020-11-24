package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PivotGroupLimit extends js.Object {
  
  /**
    * The order in which the group limit is applied to the pivot table. Pivot group limits are applied from lower to higher order number. Order numbers are normalized to consecutive
    * integers from 0. For write request, to fully customize the applying orders, all pivot group limits should have this field set with an unique number. Otherwise, the order is
    * determined by the index in the PivotTable.rows list and then the PivotTable.columns list.
    */
  var applyOrder: js.UndefOr[Double] = js.native
  
  /** The count limit. */
  var countLimit: js.UndefOr[Double] = js.native
}
object PivotGroupLimit {
  
  @scala.inline
  def apply(): PivotGroupLimit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotGroupLimit]
  }
  
  @scala.inline
  implicit class PivotGroupLimitOps[Self <: PivotGroupLimit] (val x: Self) extends AnyVal {
    
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
    def setApplyOrder(value: Double): Self = this.set("applyOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplyOrder: Self = this.set("applyOrder", js.undefined)
    
    @scala.inline
    def setCountLimit(value: Double): Self = this.set("countLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountLimit: Self = this.set("countLimit", js.undefined)
  }
}
