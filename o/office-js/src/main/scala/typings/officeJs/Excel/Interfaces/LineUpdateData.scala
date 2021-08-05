package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.ArrowheadLength
import typings.officeJs.Excel.ArrowheadStyle
import typings.officeJs.Excel.ArrowheadWidth
import typings.officeJs.Excel.ConnectorType
import typings.officeJs.officeJsStrings.Curve
import typings.officeJs.officeJsStrings.Diamond
import typings.officeJs.officeJsStrings.Elbow
import typings.officeJs.officeJsStrings.Long
import typings.officeJs.officeJsStrings.Medium
import typings.officeJs.officeJsStrings.Narrow
import typings.officeJs.officeJsStrings.None
import typings.officeJs.officeJsStrings.Open
import typings.officeJs.officeJsStrings.Oval
import typings.officeJs.officeJsStrings.Short
import typings.officeJs.officeJsStrings.Stealth
import typings.officeJs.officeJsStrings.Straight
import typings.officeJs.officeJsStrings.Triangle
import typings.officeJs.officeJsStrings.Wide
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the Line object, for use in `line.set({ ... })`. */
trait LineUpdateData extends StObject {
  
  /**
    *
    * Represents the length of the arrowhead at the beginning of the specified line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var beginArrowheadLength: js.UndefOr[ArrowheadLength | Short | Medium | Long] = js.undefined
  
  /**
    *
    * Represents the style of the arrowhead at the beginning of the specified line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var beginArrowheadStyle: js.UndefOr[ArrowheadStyle | None | Triangle | Stealth | Diamond | Oval | Open] = js.undefined
  
  /**
    *
    * Represents the width of the arrowhead at the beginning of the specified line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var beginArrowheadWidth: js.UndefOr[ArrowheadWidth | Narrow | Medium | Wide] = js.undefined
  
  /**
    *
    * Represents the connector type for the line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var connectorType: js.UndefOr[ConnectorType | Straight | Elbow | Curve] = js.undefined
  
  /**
    *
    * Represents the length of the arrowhead at the end of the specified line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var endArrowheadLength: js.UndefOr[ArrowheadLength | Short | Medium | Long] = js.undefined
  
  /**
    *
    * Represents the style of the arrowhead at the end of the specified line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var endArrowheadStyle: js.UndefOr[ArrowheadStyle | None | Triangle | Stealth | Diamond | Oval | Open] = js.undefined
  
  /**
    *
    * Represents the width of the arrowhead at the end of the specified line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var endArrowheadWidth: js.UndefOr[ArrowheadWidth | Narrow | Medium | Wide] = js.undefined
}
object LineUpdateData {
  
  inline def apply(): LineUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineUpdateData]
  }
  
  extension [Self <: LineUpdateData](x: Self) {
    
    inline def setBeginArrowheadLength(value: ArrowheadLength | Short | Medium | Long): Self = StObject.set(x, "beginArrowheadLength", value.asInstanceOf[js.Any])
    
    inline def setBeginArrowheadLengthUndefined: Self = StObject.set(x, "beginArrowheadLength", js.undefined)
    
    inline def setBeginArrowheadStyle(value: ArrowheadStyle | None | Triangle | Stealth | Diamond | Oval | Open): Self = StObject.set(x, "beginArrowheadStyle", value.asInstanceOf[js.Any])
    
    inline def setBeginArrowheadStyleUndefined: Self = StObject.set(x, "beginArrowheadStyle", js.undefined)
    
    inline def setBeginArrowheadWidth(value: ArrowheadWidth | Narrow | Medium | Wide): Self = StObject.set(x, "beginArrowheadWidth", value.asInstanceOf[js.Any])
    
    inline def setBeginArrowheadWidthUndefined: Self = StObject.set(x, "beginArrowheadWidth", js.undefined)
    
    inline def setConnectorType(value: ConnectorType | Straight | Elbow | Curve): Self = StObject.set(x, "connectorType", value.asInstanceOf[js.Any])
    
    inline def setConnectorTypeUndefined: Self = StObject.set(x, "connectorType", js.undefined)
    
    inline def setEndArrowheadLength(value: ArrowheadLength | Short | Medium | Long): Self = StObject.set(x, "endArrowheadLength", value.asInstanceOf[js.Any])
    
    inline def setEndArrowheadLengthUndefined: Self = StObject.set(x, "endArrowheadLength", js.undefined)
    
    inline def setEndArrowheadStyle(value: ArrowheadStyle | None | Triangle | Stealth | Diamond | Oval | Open): Self = StObject.set(x, "endArrowheadStyle", value.asInstanceOf[js.Any])
    
    inline def setEndArrowheadStyleUndefined: Self = StObject.set(x, "endArrowheadStyle", js.undefined)
    
    inline def setEndArrowheadWidth(value: ArrowheadWidth | Narrow | Medium | Wide): Self = StObject.set(x, "endArrowheadWidth", value.asInstanceOf[js.Any])
    
    inline def setEndArrowheadWidthUndefined: Self = StObject.set(x, "endArrowheadWidth", js.undefined)
  }
}
