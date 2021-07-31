package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents an image in the worksheet. To get the corresponding Shape object, use Image.shape.
  *
  * [Api set: ExcelApi 1.9]
  */
trait ImageLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Returns the format of the image.
    *
    * [Api set: ExcelApi 1.9]
    */
  var format: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies the shape identifier for the image object.
    *
    * [Api set: ExcelApi 1.9]
    */
  var id: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Returns the Shape object associated with the image.
    *
    * [Api set: ExcelApi 1.9]
    */
  var shape: js.UndefOr[ShapeLoadOptions] = js.undefined
}
object ImageLoadOptions {
  
  @scala.inline
  def apply(): ImageLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageLoadOptions]
  }
  
  @scala.inline
  implicit class ImageLoadOptionsMutableBuilder[Self <: ImageLoadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    @scala.inline
    def setFormat(value: Boolean): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setId(value: Boolean): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setShape(value: ShapeLoadOptions): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
  }
}
