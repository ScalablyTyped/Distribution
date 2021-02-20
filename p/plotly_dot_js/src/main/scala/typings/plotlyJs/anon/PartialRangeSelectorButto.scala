package typings.plotlyJs.anon

import typings.plotlyJs.plotlyJsStrings.all
import typings.plotlyJs.plotlyJsStrings.backward
import typings.plotlyJs.plotlyJsStrings.day
import typings.plotlyJs.plotlyJsStrings.hour
import typings.plotlyJs.plotlyJsStrings.minute
import typings.plotlyJs.plotlyJsStrings.month
import typings.plotlyJs.plotlyJsStrings.second
import typings.plotlyJs.plotlyJsStrings.todate
import typings.plotlyJs.plotlyJsStrings.year
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.RangeSelectorButton> */
@js.native
trait PartialRangeSelectorButto extends StObject {
  
  var count: js.UndefOr[Double] = js.native
  
  var label: js.UndefOr[String] = js.native
  
  var step: js.UndefOr[second | minute | hour | day | month | year | all] = js.native
  
  var stepmode: js.UndefOr[backward | todate] = js.native
}
object PartialRangeSelectorButto {
  
  @scala.inline
  def apply(): PartialRangeSelectorButto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRangeSelectorButto]
  }
  
  @scala.inline
  implicit class PartialRangeSelectorButtoMutableBuilder[Self <: PartialRangeSelectorButto] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setStep(value: second | minute | hour | day | month | year | all): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    @scala.inline
    def setStepmode(value: backward | todate): Self = StObject.set(x, "stepmode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepmodeUndefined: Self = StObject.set(x, "stepmode", js.undefined)
  }
}
