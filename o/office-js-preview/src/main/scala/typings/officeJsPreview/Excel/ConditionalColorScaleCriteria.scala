package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the criteria of the color scale.
  *
  * [Api set: ExcelApi 1.6]
  */
trait ConditionalColorScaleCriteria extends StObject {
  
  /**
    *
    * The maximum point Color Scale Criterion.
    *
    * [Api set: ExcelApi 1.6]
    */
  var maximum: ConditionalColorScaleCriterion
  
  /**
    *
    * The midpoint Color Scale Criterion if the color scale is a 3-color scale.
    *
    * [Api set: ExcelApi 1.6]
    */
  var midpoint: js.UndefOr[ConditionalColorScaleCriterion] = js.undefined
  
  /**
    *
    * The minimum point Color Scale Criterion.
    *
    * [Api set: ExcelApi 1.6]
    */
  var minimum: ConditionalColorScaleCriterion
}
object ConditionalColorScaleCriteria {
  
  @scala.inline
  def apply(maximum: ConditionalColorScaleCriterion, minimum: ConditionalColorScaleCriterion): ConditionalColorScaleCriteria = {
    val __obj = js.Dynamic.literal(maximum = maximum.asInstanceOf[js.Any], minimum = minimum.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalColorScaleCriteria]
  }
  
  @scala.inline
  implicit class ConditionalColorScaleCriteriaMutableBuilder[Self <: ConditionalColorScaleCriteria] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaximum(value: ConditionalColorScaleCriterion): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMidpoint(value: ConditionalColorScaleCriterion): Self = StObject.set(x, "midpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMidpointUndefined: Self = StObject.set(x, "midpoint", js.undefined)
    
    @scala.inline
    def setMinimum(value: ConditionalColorScaleCriterion): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
  }
}
