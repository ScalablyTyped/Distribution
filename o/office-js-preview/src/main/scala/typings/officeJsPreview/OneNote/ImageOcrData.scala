package typings.officeJsPreview.OneNote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents data obtained by OCR (optical character recognition) of an image.
  *
  * [Api set: OneNoteApi 1.1]
  */
trait ImageOcrData extends js.Object {
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
}

