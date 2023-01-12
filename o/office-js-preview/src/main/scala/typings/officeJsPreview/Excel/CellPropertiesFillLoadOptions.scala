package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies which properties to load on the `format.fill` object.
  *
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
trait CellPropertiesFillLoadOptions extends StObject {
  
  /**
    * Specifies whether to load the `color` property.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var color: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether to load the `pattern` property.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var pattern: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether to load the `patternColor` property.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var patternColor: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether to load the `patternTintAndShade` property.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var patternTintAndShade: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether to load the `tintAndShade` property.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var tintAndShade: js.UndefOr[Boolean] = js.undefined
}
object CellPropertiesFillLoadOptions {
  
  inline def apply(): CellPropertiesFillLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellPropertiesFillLoadOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CellPropertiesFillLoadOptions] (val x: Self) extends AnyVal {
    
    inline def setColor(value: Boolean): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setPattern(value: Boolean): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternColor(value: Boolean): Self = StObject.set(x, "patternColor", value.asInstanceOf[js.Any])
    
    inline def setPatternColorUndefined: Self = StObject.set(x, "patternColor", js.undefined)
    
    inline def setPatternTintAndShade(value: Boolean): Self = StObject.set(x, "patternTintAndShade", value.asInstanceOf[js.Any])
    
    inline def setPatternTintAndShadeUndefined: Self = StObject.set(x, "patternTintAndShade", js.undefined)
    
    inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    inline def setTintAndShade(value: Boolean): Self = StObject.set(x, "tintAndShade", value.asInstanceOf[js.Any])
    
    inline def setTintAndShadeUndefined: Self = StObject.set(x, "tintAndShade", js.undefined)
  }
}
