package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Specifies which properties to load on the `format.borders` object.
  *
  * [Api set: ExcelApi 1.9]
  */
trait CellPropertiesBorderLoadOptions extends StObject {
  
  /**
    *
    * Specifies whether to load on the `color` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var color: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies whether to load on the `style` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var style: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies whether to load on the `tintAndShade` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var tintAndShade: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies whether to load on the `weight` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var weight: js.UndefOr[Boolean] = js.undefined
}
object CellPropertiesBorderLoadOptions {
  
  @scala.inline
  def apply(): CellPropertiesBorderLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellPropertiesBorderLoadOptions]
  }
  
  @scala.inline
  implicit class CellPropertiesBorderLoadOptionsMutableBuilder[Self <: CellPropertiesBorderLoadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: Boolean): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setStyle(value: Boolean): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTintAndShade(value: Boolean): Self = StObject.set(x, "tintAndShade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTintAndShadeUndefined: Self = StObject.set(x, "tintAndShade", js.undefined)
    
    @scala.inline
    def setWeight(value: Boolean): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
