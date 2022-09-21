package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the IterativeCalculation object, for use in `iterativeCalculation.set({ ... })`. */
trait IterativeCalculationUpdateData extends StObject {
  
  /**
    * True if Excel will use iteration to resolve circular references.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the maximum amount of change between each iteration as Excel resolves circular references.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var maxChange: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the maximum number of iterations that Excel can use to resolve a circular reference.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var maxIteration: js.UndefOr[Double] = js.undefined
}
object IterativeCalculationUpdateData {
  
  inline def apply(): IterativeCalculationUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IterativeCalculationUpdateData]
  }
  
  extension [Self <: IterativeCalculationUpdateData](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setMaxChange(value: Double): Self = StObject.set(x, "maxChange", value.asInstanceOf[js.Any])
    
    inline def setMaxChangeUndefined: Self = StObject.set(x, "maxChange", js.undefined)
    
    inline def setMaxIteration(value: Double): Self = StObject.set(x, "maxIteration", value.asInstanceOf[js.Any])
    
    inline def setMaxIterationUndefined: Self = StObject.set(x, "maxIteration", js.undefined)
  }
}
