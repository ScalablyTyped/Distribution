package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WaterfallChartDomain extends StObject {
  
  /** The data of the WaterfallChartDomain. */
  var data: js.UndefOr[ChartData] = js.native
  
  /** True to reverse the order of the domain values (horizontal axis). */
  var reversed: js.UndefOr[Boolean] = js.native
}
object WaterfallChartDomain {
  
  @scala.inline
  def apply(): WaterfallChartDomain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WaterfallChartDomain]
  }
  
  @scala.inline
  implicit class WaterfallChartDomainMutableBuilder[Self <: WaterfallChartDomain] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: ChartData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
  }
}
