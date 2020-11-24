package typings.officeJsPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Specifies which properties to load on the `format.fill` object.
  *
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait CellPropertiesFillLoadOptions extends js.Object {
  
  /**
    *
    * Specifies whether to load the `color` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var color: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Specifies whether to load the `pattern` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var pattern: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Specifies whether to load the `patternColor` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var patternColor: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Specifies whether to load the `patternTintAndShade` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var patternTintAndShade: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Specifies whether to load the `tintAndShade` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var tintAndShade: js.UndefOr[Boolean] = js.native
}
object CellPropertiesFillLoadOptions {
  
  @scala.inline
  def apply(): CellPropertiesFillLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellPropertiesFillLoadOptions]
  }
  
  @scala.inline
  implicit class CellPropertiesFillLoadOptionsOps[Self <: CellPropertiesFillLoadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setColor(value: Boolean): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setPattern(value: Boolean): Self = this.set("pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePattern: Self = this.set("pattern", js.undefined)
    
    @scala.inline
    def setPatternColor(value: Boolean): Self = this.set("patternColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePatternColor: Self = this.set("patternColor", js.undefined)
    
    @scala.inline
    def setPatternTintAndShade(value: Boolean): Self = this.set("patternTintAndShade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePatternTintAndShade: Self = this.set("patternTintAndShade", js.undefined)
    
    @scala.inline
    def setTintAndShade(value: Boolean): Self = this.set("tintAndShade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTintAndShade: Self = this.set("tintAndShade", js.undefined)
  }
}
