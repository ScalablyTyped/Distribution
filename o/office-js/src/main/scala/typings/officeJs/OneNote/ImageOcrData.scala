package typings.officeJs.OneNote

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents data obtained by OCR (optical character recognition) of an image.
  *
  * [Api set: OneNoteApi 1.1]
  */
trait ImageOcrData extends StObject {
  
  /**
    *
    * Represents the OCR language, with values such as EN-US
    *
    * [Api set: OneNoteApi 1.1]
    */
  var ocrLanguageId: String
  
  /**
    *
    * Represents the text obtained by OCR of the image
    *
    * [Api set: OneNoteApi 1.1]
    */
  var ocrText: String
}
object ImageOcrData {
  
  @scala.inline
  def apply(ocrLanguageId: String, ocrText: String): ImageOcrData = {
    val __obj = js.Dynamic.literal(ocrLanguageId = ocrLanguageId.asInstanceOf[js.Any], ocrText = ocrText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageOcrData]
  }
  
  @scala.inline
  implicit class ImageOcrDataMutableBuilder[Self <: ImageOcrData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOcrLanguageId(value: String): Self = StObject.set(x, "ocrLanguageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOcrText(value: String): Self = StObject.set(x, "ocrText", value.asInstanceOf[js.Any])
  }
}
