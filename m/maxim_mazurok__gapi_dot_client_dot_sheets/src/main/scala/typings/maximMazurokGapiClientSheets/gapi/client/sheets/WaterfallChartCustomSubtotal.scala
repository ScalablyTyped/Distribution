package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WaterfallChartCustomSubtotal extends StObject {
  
  /** True if the data point at subtotal_index is the subtotal. If false, the subtotal will be computed and appear after the data point. */
  var dataIsSubtotal: js.UndefOr[Boolean] = js.native
  
  /** A label for the subtotal column. */
  var label: js.UndefOr[String] = js.native
  
  /**
    * The 0-based index of a data point within the series. If data_is_subtotal is true, the data point at this index is the subtotal. Otherwise, the subtotal appears after the data point
    * with this index. A series can have multiple subtotals at arbitrary indices, but subtotals do not affect the indices of the data points. For example, if a series has three data
    * points, their indices will always be 0, 1, and 2, regardless of how many subtotals exist on the series or what data points they are associated with.
    */
  var subtotalIndex: js.UndefOr[Double] = js.native
}
object WaterfallChartCustomSubtotal {
  
  @scala.inline
  def apply(): WaterfallChartCustomSubtotal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WaterfallChartCustomSubtotal]
  }
  
  @scala.inline
  implicit class WaterfallChartCustomSubtotalMutableBuilder[Self <: WaterfallChartCustomSubtotal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataIsSubtotal(value: Boolean): Self = StObject.set(x, "dataIsSubtotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataIsSubtotalUndefined: Self = StObject.set(x, "dataIsSubtotal", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setSubtotalIndex(value: Double): Self = StObject.set(x, "subtotalIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtotalIndexUndefined: Self = StObject.set(x, "subtotalIndex", js.undefined)
  }
}
