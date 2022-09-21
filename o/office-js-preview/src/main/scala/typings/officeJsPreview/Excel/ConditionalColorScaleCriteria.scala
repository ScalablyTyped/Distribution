package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the criteria of the color scale.
  *
  * @remarks
  * [Api set: ExcelApi 1.6]
  */
trait ConditionalColorScaleCriteria extends StObject {
  
  /**
    * The maximum point of the color scale criterion.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var maximum: ConditionalColorScaleCriterion
  
  /**
    * The midpoint of the color scale criterion, if the color scale is a 3-color scale.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var midpoint: js.UndefOr[ConditionalColorScaleCriterion] = js.undefined
  
  /**
    * The minimum point of the color scale criterion.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var minimum: ConditionalColorScaleCriterion
}
object ConditionalColorScaleCriteria {
  
  inline def apply(maximum: ConditionalColorScaleCriterion, minimum: ConditionalColorScaleCriterion): ConditionalColorScaleCriteria = {
    val __obj = js.Dynamic.literal(maximum = maximum.asInstanceOf[js.Any], minimum = minimum.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalColorScaleCriteria]
  }
  
  extension [Self <: ConditionalColorScaleCriteria](x: Self) {
    
    inline def setMaximum(value: ConditionalColorScaleCriterion): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
    
    inline def setMidpoint(value: ConditionalColorScaleCriterion): Self = StObject.set(x, "midpoint", value.asInstanceOf[js.Any])
    
    inline def setMidpointUndefined: Self = StObject.set(x, "midpoint", js.undefined)
    
    inline def setMinimum(value: ConditionalColorScaleCriterion): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
  }
}
