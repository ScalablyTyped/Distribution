package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.ShapeFillType
import typings.officeJsPreview.officeJsPreviewStrings.Gradient
import typings.officeJsPreview.officeJsPreviewStrings.Mixed
import typings.officeJsPreview.officeJsPreviewStrings.NoFill
import typings.officeJsPreview.officeJsPreviewStrings.Pattern
import typings.officeJsPreview.officeJsPreviewStrings.PictureAndTexture
import typings.officeJsPreview.officeJsPreviewStrings.Solid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `shapeFill.toJSON()`. */
trait ShapeFillData extends StObject {
  
  /**
    *
    * Represents the shape fill foreground color in HTML color format, of the form #RRGGBB (e.g., "FFA500") or as a named HTML color (e.g., "orange")
    *
    * [Api set: ExcelApi 1.9]
    */
  var foregroundColor: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Specifies the transparency percentage of the fill as a value from 0.0 (opaque) through 1.0 (clear). Returns null if the shape type does not support transparency or the shape fill has inconsistent transparency, such as with a gradient fill type.
    *
    * [Api set: ExcelApi 1.9]
    */
  var transparency: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * Returns the fill type of the shape. See Excel.ShapeFillType for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var `type`: js.UndefOr[ShapeFillType | NoFill | Solid | Gradient | Pattern | PictureAndTexture | Mixed] = js.undefined
}
object ShapeFillData {
  
  @scala.inline
  def apply(): ShapeFillData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShapeFillData]
  }
  
  @scala.inline
  implicit class ShapeFillDataMutableBuilder[Self <: ShapeFillData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForegroundColor(value: String): Self = StObject.set(x, "foregroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForegroundColorUndefined: Self = StObject.set(x, "foregroundColor", js.undefined)
    
    @scala.inline
    def setTransparency(value: Double): Self = StObject.set(x, "transparency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransparencyUndefined: Self = StObject.set(x, "transparency", js.undefined)
    
    @scala.inline
    def setType(value: ShapeFillType | NoFill | Solid | Gradient | Pattern | PictureAndTexture | Mixed): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
