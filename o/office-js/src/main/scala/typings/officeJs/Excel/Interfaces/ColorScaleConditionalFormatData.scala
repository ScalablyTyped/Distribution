package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.ConditionalColorScaleCriteria
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `colorScaleConditionalFormat.toJSON()`. */
trait ColorScaleConditionalFormatData extends StObject {
  
  /**
    *
    * The criteria of the color scale. Midpoint is optional when using a two point color scale.
    *
    * [Api set: ExcelApi 1.6]
    */
  var criteria: js.UndefOr[ConditionalColorScaleCriteria] = js.undefined
  
  /**
    *
    * If true the color scale will have three points (minimum, midpoint, maximum), otherwise it will have two (minimum, maximum).
    *
    * [Api set: ExcelApi 1.6]
    */
  var threeColorScale: js.UndefOr[Boolean] = js.undefined
}
object ColorScaleConditionalFormatData {
  
  inline def apply(): ColorScaleConditionalFormatData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorScaleConditionalFormatData]
  }
  
  extension [Self <: ColorScaleConditionalFormatData](x: Self) {
    
    inline def setCriteria(value: ConditionalColorScaleCriteria): Self = StObject.set(x, "criteria", value.asInstanceOf[js.Any])
    
    inline def setCriteriaUndefined: Self = StObject.set(x, "criteria", js.undefined)
    
    inline def setThreeColorScale(value: Boolean): Self = StObject.set(x, "threeColorScale", value.asInstanceOf[js.Any])
    
    inline def setThreeColorScaleUndefined: Self = StObject.set(x, "threeColorScale", js.undefined)
  }
}
