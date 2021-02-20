package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BasicChartDomain extends StObject {
  
  /** The data of the domain. For example, if charting stock prices over time, this is the data representing the dates. */
  var domain: js.UndefOr[ChartData] = js.native
  
  /** True to reverse the order of the domain values (horizontal axis). */
  var reversed: js.UndefOr[Boolean] = js.native
}
object BasicChartDomain {
  
  @scala.inline
  def apply(): BasicChartDomain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasicChartDomain]
  }
  
  @scala.inline
  implicit class BasicChartDomainMutableBuilder[Self <: BasicChartDomain] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomain(value: ChartData): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    @scala.inline
    def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
  }
}
