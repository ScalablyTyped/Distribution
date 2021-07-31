package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Specifies which properties to load on the `format.fill` object.
  *
  * [Api set: ExcelApi 1.9]
  */
trait CellPropertiesFillLoadOptions extends StObject {
  
  /**
    *
    * Specifies whether to load the `color` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var color: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies whether to load the `pattern` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var pattern: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies whether to load the `patternColor` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var patternColor: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies whether to load the `patternTintAndShade` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var patternTintAndShade: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies whether to load the `tintAndShade` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var tintAndShade: js.UndefOr[Boolean] = js.undefined
}
object CellPropertiesFillLoadOptions {
  
  @scala.inline
  def apply(): CellPropertiesFillLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellPropertiesFillLoadOptions]
  }
  
  @scala.inline
  implicit class CellPropertiesFillLoadOptionsMutableBuilder[Self <: CellPropertiesFillLoadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: Boolean): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setPattern(value: Boolean): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternColor(value: Boolean): Self = StObject.set(x, "patternColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternColorUndefined: Self = StObject.set(x, "patternColor", js.undefined)
    
    @scala.inline
    def setPatternTintAndShade(value: Boolean): Self = StObject.set(x, "patternTintAndShade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternTintAndShadeUndefined: Self = StObject.set(x, "patternTintAndShade", js.undefined)
    
    @scala.inline
    def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    @scala.inline
    def setTintAndShade(value: Boolean): Self = StObject.set(x, "tintAndShade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTintAndShadeUndefined: Self = StObject.set(x, "tintAndShade", js.undefined)
  }
}
