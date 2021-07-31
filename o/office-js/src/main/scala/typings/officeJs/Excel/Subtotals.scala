package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Subtotals for the Pivot Field.
  *
  * [Api set: ExcelApi 1.8]
  */
trait Subtotals extends StObject {
  
  /**
    *
    * If Automatic is set to true, then all other values will be ignored when setting the Subtotals.
    *
    * [Api set: ExcelApi 1.8]
    */
  var automatic: js.UndefOr[Boolean] = js.undefined
  
  var average: js.UndefOr[Boolean] = js.undefined
  
  var count: js.UndefOr[Boolean] = js.undefined
  
  var countNumbers: js.UndefOr[Boolean] = js.undefined
  
  var max: js.UndefOr[Boolean] = js.undefined
  
  var min: js.UndefOr[Boolean] = js.undefined
  
  var product: js.UndefOr[Boolean] = js.undefined
  
  var standardDeviation: js.UndefOr[Boolean] = js.undefined
  
  var standardDeviationP: js.UndefOr[Boolean] = js.undefined
  
  var sum: js.UndefOr[Boolean] = js.undefined
  
  var variance: js.UndefOr[Boolean] = js.undefined
  
  var varianceP: js.UndefOr[Boolean] = js.undefined
}
object Subtotals {
  
  @scala.inline
  def apply(): Subtotals = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Subtotals]
  }
  
  @scala.inline
  implicit class SubtotalsMutableBuilder[Self <: Subtotals] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutomatic(value: Boolean): Self = StObject.set(x, "automatic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomaticUndefined: Self = StObject.set(x, "automatic", js.undefined)
    
    @scala.inline
    def setAverage(value: Boolean): Self = StObject.set(x, "average", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAverageUndefined: Self = StObject.set(x, "average", js.undefined)
    
    @scala.inline
    def setCount(value: Boolean): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountNumbers(value: Boolean): Self = StObject.set(x, "countNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountNumbersUndefined: Self = StObject.set(x, "countNumbers", js.undefined)
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setMax(value: Boolean): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: Boolean): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setProduct(value: Boolean): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
    
    @scala.inline
    def setStandardDeviation(value: Boolean): Self = StObject.set(x, "standardDeviation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandardDeviationP(value: Boolean): Self = StObject.set(x, "standardDeviationP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandardDeviationPUndefined: Self = StObject.set(x, "standardDeviationP", js.undefined)
    
    @scala.inline
    def setStandardDeviationUndefined: Self = StObject.set(x, "standardDeviation", js.undefined)
    
    @scala.inline
    def setSum(value: Boolean): Self = StObject.set(x, "sum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSumUndefined: Self = StObject.set(x, "sum", js.undefined)
    
    @scala.inline
    def setVariance(value: Boolean): Self = StObject.set(x, "variance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVarianceP(value: Boolean): Self = StObject.set(x, "varianceP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariancePUndefined: Self = StObject.set(x, "varianceP", js.undefined)
    
    @scala.inline
    def setVarianceUndefined: Self = StObject.set(x, "variance", js.undefined)
  }
}
