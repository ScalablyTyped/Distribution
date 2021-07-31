package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotGroupLimit extends StObject {
  
  /**
    * The order in which the group limit is applied to the pivot table. Pivot group limits are applied from lower to higher order number. Order numbers are normalized to consecutive
    * integers from 0. For write request, to fully customize the applying orders, all pivot group limits should have this field set with an unique number. Otherwise, the order is
    * determined by the index in the PivotTable.rows list and then the PivotTable.columns list.
    */
  var applyOrder: js.UndefOr[Double] = js.undefined
  
  /** The count limit. */
  var countLimit: js.UndefOr[Double] = js.undefined
}
object PivotGroupLimit {
  
  @scala.inline
  def apply(): PivotGroupLimit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotGroupLimit]
  }
  
  @scala.inline
  implicit class PivotGroupLimitMutableBuilder[Self <: PivotGroupLimit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplyOrder(value: Double): Self = StObject.set(x, "applyOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplyOrderUndefined: Self = StObject.set(x, "applyOrder", js.undefined)
    
    @scala.inline
    def setCountLimit(value: Double): Self = StObject.set(x, "countLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountLimitUndefined: Self = StObject.set(x, "countLimit", js.undefined)
  }
}
