package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies which properties to load on the `format.borders` object.
  *
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
trait CellPropertiesBorderLoadOptions extends StObject {
  
  /**
    * Specifies whether to load the `color` property.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var color: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether to load the `style` property.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var style: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether to load the `tintAndShade` property.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var tintAndShade: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether to load the `weight` property.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var weight: js.UndefOr[Boolean] = js.undefined
}
object CellPropertiesBorderLoadOptions {
  
  inline def apply(): CellPropertiesBorderLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellPropertiesBorderLoadOptions]
  }
  
  extension [Self <: CellPropertiesBorderLoadOptions](x: Self) {
    
    inline def setColor(value: Boolean): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setStyle(value: Boolean): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTintAndShade(value: Boolean): Self = StObject.set(x, "tintAndShade", value.asInstanceOf[js.Any])
    
    inline def setTintAndShadeUndefined: Self = StObject.set(x, "tintAndShade", js.undefined)
    
    inline def setWeight(value: Boolean): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
