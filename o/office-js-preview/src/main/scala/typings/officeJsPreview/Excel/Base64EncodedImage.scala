package typings.officeJsPreview.Excel

import typings.officeJsPreview.officeJsPreviewStrings.JPG
import typings.officeJsPreview.officeJsPreviewStrings.PNG
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The base64 encoding type and data of an image.
  *
  * @remarks
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
trait Base64EncodedImage extends StObject {
  
  /**
    * The base64 string encoding.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var data: String
  
  /**
    * The file type of the encoded image.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var `type`: Base64EncodingType | JPG | PNG
}
object Base64EncodedImage {
  
  inline def apply(data: String, `type`: Base64EncodingType | JPG | PNG): Base64EncodedImage = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Base64EncodedImage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Base64EncodedImage] (val x: Self) extends AnyVal {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setType(value: Base64EncodingType | JPG | PNG): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
