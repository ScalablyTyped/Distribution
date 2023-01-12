package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a line inside a worksheet. To get the corresponding `Shape` object, use `Line.shape`.
  *
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
trait LineLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the length of the arrowhead at the beginning of the specified line.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var beginArrowheadLength: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the style of the arrowhead at the beginning of the specified line.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var beginArrowheadStyle: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the width of the arrowhead at the beginning of the specified line.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var beginArrowheadWidth: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the shape to which the beginning of the specified line is attached.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var beginConnectedShape: js.UndefOr[ShapeLoadOptions] = js.undefined
  
  /**
    * Represents the connection site to which the beginning of a connector is connected. Returns `null` when the beginning of the line is not attached to any shape.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var beginConnectedSite: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the connector type for the line.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var connectorType: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the length of the arrowhead at the end of the specified line.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var endArrowheadLength: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the style of the arrowhead at the end of the specified line.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var endArrowheadStyle: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the width of the arrowhead at the end of the specified line.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var endArrowheadWidth: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the shape to which the end of the specified line is attached.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var endConnectedShape: js.UndefOr[ShapeLoadOptions] = js.undefined
  
  /**
    * Represents the connection site to which the end of a connector is connected. Returns `null` when the end of the line is not attached to any shape.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var endConnectedSite: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the shape identifier.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var id: js.UndefOr[Boolean] = js.undefined
  
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
  
  /**
    * Returns the `Shape` object associated with the line.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var shape: js.UndefOr[ShapeLoadOptions] = js.undefined
}
object LineLoadOptions {
  
  inline def apply(): LineLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineLoadOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LineLoadOptions] (val x: Self) extends AnyVal {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setBeginArrowheadLength(value: Boolean): Self = StObject.set(x, "beginArrowheadLength", value.asInstanceOf[js.Any])
    
    inline def setBeginArrowheadLengthUndefined: Self = StObject.set(x, "beginArrowheadLength", js.undefined)
    
    inline def setBeginArrowheadStyle(value: Boolean): Self = StObject.set(x, "beginArrowheadStyle", value.asInstanceOf[js.Any])
    
    inline def setBeginArrowheadStyleUndefined: Self = StObject.set(x, "beginArrowheadStyle", js.undefined)
    
    inline def setBeginArrowheadWidth(value: Boolean): Self = StObject.set(x, "beginArrowheadWidth", value.asInstanceOf[js.Any])
    
    inline def setBeginArrowheadWidthUndefined: Self = StObject.set(x, "beginArrowheadWidth", js.undefined)
    
    inline def setBeginConnectedShape(value: ShapeLoadOptions): Self = StObject.set(x, "beginConnectedShape", value.asInstanceOf[js.Any])
    
    inline def setBeginConnectedShapeUndefined: Self = StObject.set(x, "beginConnectedShape", js.undefined)
    
    inline def setBeginConnectedSite(value: Boolean): Self = StObject.set(x, "beginConnectedSite", value.asInstanceOf[js.Any])
    
    inline def setBeginConnectedSiteUndefined: Self = StObject.set(x, "beginConnectedSite", js.undefined)
    
    inline def setConnectorType(value: Boolean): Self = StObject.set(x, "connectorType", value.asInstanceOf[js.Any])
    
    inline def setConnectorTypeUndefined: Self = StObject.set(x, "connectorType", js.undefined)
    
    inline def setEndArrowheadLength(value: Boolean): Self = StObject.set(x, "endArrowheadLength", value.asInstanceOf[js.Any])
    
    inline def setEndArrowheadLengthUndefined: Self = StObject.set(x, "endArrowheadLength", js.undefined)
    
    inline def setEndArrowheadStyle(value: Boolean): Self = StObject.set(x, "endArrowheadStyle", value.asInstanceOf[js.Any])
    
    inline def setEndArrowheadStyleUndefined: Self = StObject.set(x, "endArrowheadStyle", js.undefined)
    
    inline def setEndArrowheadWidth(value: Boolean): Self = StObject.set(x, "endArrowheadWidth", value.asInstanceOf[js.Any])
    
    inline def setEndArrowheadWidthUndefined: Self = StObject.set(x, "endArrowheadWidth", js.undefined)
    
    inline def setEndConnectedShape(value: ShapeLoadOptions): Self = StObject.set(x, "endConnectedShape", value.asInstanceOf[js.Any])
    
    inline def setEndConnectedShapeUndefined: Self = StObject.set(x, "endConnectedShape", js.undefined)
    
    inline def setEndConnectedSite(value: Boolean): Self = StObject.set(x, "endConnectedSite", value.asInstanceOf[js.Any])
    
    inline def setEndConnectedSiteUndefined: Self = StObject.set(x, "endConnectedSite", js.undefined)
    
    inline def setId(value: Boolean): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIsBeginConnected(value: Boolean): Self = StObject.set(x, "isBeginConnected", value.asInstanceOf[js.Any])
    
    inline def setIsBeginConnectedUndefined: Self = StObject.set(x, "isBeginConnected", js.undefined)
    
    inline def setIsEndConnected(value: Boolean): Self = StObject.set(x, "isEndConnected", value.asInstanceOf[js.Any])
    
    inline def setIsEndConnectedUndefined: Self = StObject.set(x, "isEndConnected", js.undefined)
    
    inline def setShape(value: ShapeLoadOptions): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
  }
}
