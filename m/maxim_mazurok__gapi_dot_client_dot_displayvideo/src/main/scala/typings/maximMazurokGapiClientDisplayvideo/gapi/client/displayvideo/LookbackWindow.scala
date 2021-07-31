package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LookbackWindow extends StObject {
  
  /** Lookback window, in days, from the last time a given user clicked on one of your ads. */
  var clickDays: js.UndefOr[Double] = js.undefined
  
  /** Lookback window, in days, from the last time a given user viewed one of your ads. */
  var impressionDays: js.UndefOr[Double] = js.undefined
}
object LookbackWindow {
  
  @scala.inline
  def apply(): LookbackWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LookbackWindow]
  }
  
  @scala.inline
  implicit class LookbackWindowMutableBuilder[Self <: LookbackWindow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClickDays(value: Double): Self = StObject.set(x, "clickDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickDaysUndefined: Self = StObject.set(x, "clickDays", js.undefined)
    
    @scala.inline
    def setImpressionDays(value: Double): Self = StObject.set(x, "impressionDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImpressionDaysUndefined: Self = StObject.set(x, "impressionDays", js.undefined)
  }
}
