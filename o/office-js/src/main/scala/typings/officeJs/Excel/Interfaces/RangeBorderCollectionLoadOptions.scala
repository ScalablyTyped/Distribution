package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the border objects that make up the range border.
  *
  * @remarks
  * [Api set: ExcelApi 1.1]
  */
trait RangeBorderCollectionLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: HTML color code representing the color of the border line, in the form #RRGGBB (e.g., "FFA500"), or as a named HTML color (e.g., "orange").
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var color: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Constant value that indicates the specific side of the border. See `Excel.BorderIndex` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var sideIndex: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: One of the constants of line style specifying the line style for the border. See `Excel.BorderLineStyle` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var style: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Specifies a double that lightens or darkens a color for the range border, the value is between -1 (darkest) and 1 (brightest), with 0 for the original color.
    A `null` value indicates that the border doesn't have a uniform `tintAndShade` setting.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var tintAndShade: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Specifies the weight of the border around a range. See `Excel.BorderWeight` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var weight: js.UndefOr[Boolean] = js.undefined
}
object RangeBorderCollectionLoadOptions {
  
  inline def apply(): RangeBorderCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeBorderCollectionLoadOptions]
  }
  
  extension [Self <: RangeBorderCollectionLoadOptions](x: Self) {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setColor(value: Boolean): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setSideIndex(value: Boolean): Self = StObject.set(x, "sideIndex", value.asInstanceOf[js.Any])
    
    inline def setSideIndexUndefined: Self = StObject.set(x, "sideIndex", js.undefined)
    
    inline def setStyle(value: Boolean): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTintAndShade(value: Boolean): Self = StObject.set(x, "tintAndShade", value.asInstanceOf[js.Any])
    
    inline def setTintAndShadeUndefined: Self = StObject.set(x, "tintAndShade", js.undefined)
    
    inline def setWeight(value: Boolean): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
