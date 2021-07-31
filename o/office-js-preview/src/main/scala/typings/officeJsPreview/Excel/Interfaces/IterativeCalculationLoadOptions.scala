package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the Iterative Calculation settings.
  *
  * [Api set: ExcelApi 1.9]
  */
trait IterativeCalculationLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * True if Excel will use iteration to resolve circular references.
    *
    * [Api set: ExcelApi 1.9]
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies the maximum amount of change between each iteration as Excel resolves circular references.
    *
    * [Api set: ExcelApi 1.9]
    */
  var maxChange: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies the maximum number of iterations that Excel can use to resolve a circular reference.
    *
    * [Api set: ExcelApi 1.9]
    */
  var maxIteration: js.UndefOr[Boolean] = js.undefined
}
object IterativeCalculationLoadOptions {
  
  @scala.inline
  def apply(): IterativeCalculationLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IterativeCalculationLoadOptions]
  }
  
  @scala.inline
  implicit class IterativeCalculationLoadOptionsMutableBuilder[Self <: IterativeCalculationLoadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setMaxChange(value: Boolean): Self = StObject.set(x, "maxChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxChangeUndefined: Self = StObject.set(x, "maxChange", js.undefined)
    
    @scala.inline
    def setMaxIteration(value: Boolean): Self = StObject.set(x, "maxIteration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxIterationUndefined: Self = StObject.set(x, "maxIteration", js.undefined)
  }
}
