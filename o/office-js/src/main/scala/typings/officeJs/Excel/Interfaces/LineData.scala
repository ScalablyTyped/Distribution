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

/** An interface describing the data returned by calling `line.toJSON()`. */
trait LineData extends StObject {
  
  /**
    * Represents the length of the arrowhead at the beginning of the specified line.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var beginArrowheadLength: js.UndefOr[ArrowheadLength | Short | Medium | Long] = js.undefined
  
  /**
    * Represents the style of the arrowhead at the beginning of the specified line.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var beginArrowheadStyle: js.UndefOr[ArrowheadStyle | None | Triangle | Stealth | Diamond | Oval | Open] = js.undefined
  
  /**
    * Represents the width of the arrowhead at the beginning of the specified line.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var beginArrowheadWidth: js.UndefOr[ArrowheadWidth | Narrow | Medium | Wide] = js.undefined
  
  /**
    * Represents the connection site to which the beginning of a connector is connected. Returns `null` when the beginning of the line is not attached to any shape.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var beginConnectedSite: js.UndefOr[Double] = js.undefined
  
  /**
    * Represents the connector type for the line.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var connectorType: js.UndefOr[ConnectorType | Straight | Elbow | Curve] = js.undefined
  
  /**
    * Represents the length of the arrowhead at the end of the specified line.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var endArrowheadLength: js.UndefOr[ArrowheadLength | Short | Medium | Long] = js.undefined
  
  /**
    * Represents the style of the arrowhead at the end of the specified line.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var endArrowheadStyle: js.UndefOr[ArrowheadStyle | None | Triangle | Stealth | Diamond | Oval | Open] = js.undefined
  
  /**
    * Represents the width of the arrowhead at the end of the specified line.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var endArrowheadWidth: js.UndefOr[ArrowheadWidth | Narrow | Medium | Wide] = js.undefined
  
  /**
    * Represents the connection site to which the end of a connector is connected. Returns `null` when the end of the line is not attached to any shape.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var endConnectedSite: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the shape identifier.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies if the beginning of the specified line is connected to a shape.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var isBeginConnected: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies if the end of the specified line is connected to a shape.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var isEndConnected: js.UndefOr[Boolean] = js.undefined
}
object LineData {
  
  inline def apply(): LineData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineData]
  }
  
  extension [Self <: LineData](x: Self) {
    
    inline def setBeginArrowheadLength(value: ArrowheadLength | Short | Medium | Long): Self = StObject.set(x, "beginArrowheadLength", value.asInstanceOf[js.Any])
    
    inline def setBeginArrowheadLengthUndefined: Self = StObject.set(x, "beginArrowheadLength", js.undefined)
    
    inline def setBeginArrowheadStyle(value: ArrowheadStyle | None | Triangle | Stealth | Diamond | Oval | Open): Self = StObject.set(x, "beginArrowheadStyle", value.asInstanceOf[js.Any])
    
    inline def setBeginArrowheadStyleUndefined: Self = StObject.set(x, "beginArrowheadStyle", js.undefined)
    
    inline def setBeginArrowheadWidth(value: ArrowheadWidth | Narrow | Medium | Wide): Self = StObject.set(x, "beginArrowheadWidth", value.asInstanceOf[js.Any])
    
    inline def setBeginArrowheadWidthUndefined: Self = StObject.set(x, "beginArrowheadWidth", js.undefined)
    
    inline def setBeginConnectedSite(value: Double): Self = StObject.set(x, "beginConnectedSite", value.asInstanceOf[js.Any])
    
    inline def setBeginConnectedSiteUndefined: Self = StObject.set(x, "beginConnectedSite", js.undefined)
    
    inline def setConnectorType(value: ConnectorType | Straight | Elbow | Curve): Self = StObject.set(x, "connectorType", value.asInstanceOf[js.Any])
    
    inline def setConnectorTypeUndefined: Self = StObject.set(x, "connectorType", js.undefined)
    
    inline def setEndArrowheadLength(value: ArrowheadLength | Short | Medium | Long): Self = StObject.set(x, "endArrowheadLength", value.asInstanceOf[js.Any])
    
    inline def setEndArrowheadLengthUndefined: Self = StObject.set(x, "endArrowheadLength", js.undefined)
    
    inline def setEndArrowheadStyle(value: ArrowheadStyle | None | Triangle | Stealth | Diamond | Oval | Open): Self = StObject.set(x, "endArrowheadStyle", value.asInstanceOf[js.Any])
    
    inline def setEndArrowheadStyleUndefined: Self = StObject.set(x, "endArrowheadStyle", js.undefined)
    
    inline def setEndArrowheadWidth(value: ArrowheadWidth | Narrow | Medium | Wide): Self = StObject.set(x, "endArrowheadWidth", value.asInstanceOf[js.Any])
    
    inline def setEndArrowheadWidthUndefined: Self = StObject.set(x, "endArrowheadWidth", js.undefined)
    
    inline def setEndConnectedSite(value: Double): Self = StObject.set(x, "endConnectedSite", value.asInstanceOf[js.Any])
    
    inline def setEndConnectedSiteUndefined: Self = StObject.set(x, "endConnectedSite", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIsBeginConnected(value: Boolean): Self = StObject.set(x, "isBeginConnected", value.asInstanceOf[js.Any])
    
    inline def setIsBeginConnectedUndefined: Self = StObject.set(x, "isBeginConnected", js.undefined)
    
    inline def setIsEndConnected(value: Boolean): Self = StObject.set(x, "isEndConnected", value.asInstanceOf[js.Any])
    
    inline def setIsEndConnectedUndefined: Self = StObject.set(x, "isEndConnected", js.undefined)
  }
}
