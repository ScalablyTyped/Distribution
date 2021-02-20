package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.ConditionalColorScaleCriteria
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `colorScaleConditionalFormat.toJSON()`. */
@js.native
trait ColorScaleConditionalFormatData extends StObject {
  
  /**
    *
    * The criteria of the color scale. Midpoint is optional when using a two point color scale.
    *
    * [Api set: ExcelApi 1.6]
    */
  var criteria: js.UndefOr[ConditionalColorScaleCriteria] = js.native
  
  /**
    *
    * If true the color scale will have three points (minimum, midpoint, maximum), otherwise it will have two (minimum, maximum).
    *
    * [Api set: ExcelApi 1.6]
    */
  var threeColorScale: js.UndefOr[Boolean] = js.native
}
object ColorScaleConditionalFormatData {
  
  @scala.inline
  def apply(): ColorScaleConditionalFormatData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorScaleConditionalFormatData]
  }
  
  @scala.inline
  implicit class ColorScaleConditionalFormatDataMutableBuilder[Self <: ColorScaleConditionalFormatData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCriteria(value: ConditionalColorScaleCriteria): Self = StObject.set(x, "criteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCriteriaUndefined: Self = StObject.set(x, "criteria", js.undefined)
    
    @scala.inline
    def setThreeColorScale(value: Boolean): Self = StObject.set(x, "threeColorScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreeColorScaleUndefined: Self = StObject.set(x, "threeColorScale", js.undefined)
  }
}
