package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.ConditionalRangeBorderIndex
import typings.officeJs.Excel.ConditionalRangeBorderLineStyle
import typings.officeJs.officeJsStrings.Continuous
import typings.officeJs.officeJsStrings.Dash
import typings.officeJs.officeJsStrings.DashDot
import typings.officeJs.officeJsStrings.DashDotDot
import typings.officeJs.officeJsStrings.Dot
import typings.officeJs.officeJsStrings.EdgeBottom
import typings.officeJs.officeJsStrings.EdgeLeft
import typings.officeJs.officeJsStrings.EdgeRight
import typings.officeJs.officeJsStrings.EdgeTop
import typings.officeJs.officeJsStrings.None
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `conditionalRangeBorder.toJSON()`. */
trait ConditionalRangeBorderData extends StObject {
  
  /**
    *
    * HTML color code representing the color of the border line, of the form #RRGGBB (e.g., "FFA500") or as a named HTML color (e.g., "orange").
    *
    * [Api set: ExcelApi 1.6]
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Constant value that indicates the specific side of the border. See Excel.ConditionalRangeBorderIndex for details.
    *
    * [Api set: ExcelApi 1.6]
    */
  var sideIndex: js.UndefOr[ConditionalRangeBorderIndex | EdgeTop | EdgeBottom | EdgeLeft | EdgeRight] = js.undefined
  
  /**
    *
    * One of the constants of line style specifying the line style for the border. See Excel.BorderLineStyle for details.
    *
    * [Api set: ExcelApi 1.6]
    */
  var style: js.UndefOr[
    ConditionalRangeBorderLineStyle | None | Continuous | Dash | DashDot | DashDotDot | Dot
  ] = js.undefined
}
object ConditionalRangeBorderData {
  
  @scala.inline
  def apply(): ConditionalRangeBorderData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalRangeBorderData]
  }
  
  @scala.inline
  implicit class ConditionalRangeBorderDataMutableBuilder[Self <: ConditionalRangeBorderData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setSideIndex(value: ConditionalRangeBorderIndex | EdgeTop | EdgeBottom | EdgeLeft | EdgeRight): Self = StObject.set(x, "sideIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSideIndexUndefined: Self = StObject.set(x, "sideIndex", js.undefined)
    
    @scala.inline
    def setStyle(value: ConditionalRangeBorderLineStyle | None | Continuous | Dash | DashDot | DashDotDot | Dot): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
