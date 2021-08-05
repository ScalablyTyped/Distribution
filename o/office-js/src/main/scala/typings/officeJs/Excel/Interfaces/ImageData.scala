package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.PictureFormat
import typings.officeJs.officeJsStrings.BMP
import typings.officeJs.officeJsStrings.GIF
import typings.officeJs.officeJsStrings.JPEG
import typings.officeJs.officeJsStrings.PNG
import typings.officeJs.officeJsStrings.SVG
import typings.officeJs.officeJsStrings.UNKNOWN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `image.toJSON()`. */
trait ImageData extends StObject {
  
  /**
    *
    * Returns the format of the image.
    *
    * [Api set: ExcelApi 1.9]
    */
  var format: js.UndefOr[PictureFormat | UNKNOWN | BMP | JPEG | GIF | PNG | SVG] = js.undefined
  
  /**
    *
    * Specifies the shape identifier for the image object.
    *
    * [Api set: ExcelApi 1.9]
    */
  var id: js.UndefOr[String] = js.undefined
}
object ImageData {
  
  inline def apply(): ImageData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageData]
  }
  
  extension [Self <: ImageData](x: Self) {
    
    inline def setFormat(value: PictureFormat | UNKNOWN | BMP | JPEG | GIF | PNG | SVG): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
