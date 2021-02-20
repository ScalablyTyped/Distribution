package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the IterativeCalculation object, for use in `iterativeCalculation.set({ ... })`. */
@js.native
trait IterativeCalculationUpdateData extends StObject {
  
  /**
    *
    * True if Excel will use iteration to resolve circular references.
    *
    * [Api set: ExcelApi 1.9]
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Specifies the maximum amount of change between each iteration as Excel resolves circular references.
    *
    * [Api set: ExcelApi 1.9]
    */
  var maxChange: js.UndefOr[Double] = js.native
  
  /**
    *
    * Specifies the maximum number of iterations that Excel can use to resolve a circular reference.
    *
    * [Api set: ExcelApi 1.9]
    */
  var maxIteration: js.UndefOr[Double] = js.native
}
object IterativeCalculationUpdateData {
  
  @scala.inline
  def apply(): IterativeCalculationUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IterativeCalculationUpdateData]
  }
  
  @scala.inline
  implicit class IterativeCalculationUpdateDataMutableBuilder[Self <: IterativeCalculationUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setMaxChange(value: Double): Self = StObject.set(x, "maxChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxChangeUndefined: Self = StObject.set(x, "maxChange", js.undefined)
    
    @scala.inline
    def setMaxIteration(value: Double): Self = StObject.set(x, "maxIteration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxIterationUndefined: Self = StObject.set(x, "maxIteration", js.undefined)
  }
}
