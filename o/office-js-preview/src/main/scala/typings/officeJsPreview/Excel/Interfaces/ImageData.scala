package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.PictureFormat
import typings.officeJsPreview.officeJsPreviewStrings.BMP
import typings.officeJsPreview.officeJsPreviewStrings.GIF
import typings.officeJsPreview.officeJsPreviewStrings.JPEG
import typings.officeJsPreview.officeJsPreviewStrings.PNG
import typings.officeJsPreview.officeJsPreviewStrings.SVG
import typings.officeJsPreview.officeJsPreviewStrings.UNKNOWN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `image.toJSON()`. */
trait ImageData extends StObject {
  
  /**
    * Returns the format of the image.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var format: js.UndefOr[PictureFormat | UNKNOWN | BMP | JPEG | GIF | PNG | SVG] = js.undefined
  
  /**
    * Specifies the shape identifier for the image object.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var id: js.UndefOr[String] = js.undefined
}
object ImageData {
  
  inline def apply(): ImageData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageData] (val x: Self) extends AnyVal {
    
    inline def setFormat(value: PictureFormat | UNKNOWN | BMP | JPEG | GIF | PNG | SVG): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
