package typings
package officeDashJsLib.OneNoteNs

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
  var ocrLanguageId: java.lang.String
  /**
    *
    * Represents the text obtained by OCR of the image
    *
    * [Api set: OneNoteApi 1.1]
    */
  var ocrText: java.lang.String
}

object ImageOcrData {
  @scala.inline
  def apply(ocrLanguageId: java.lang.String, ocrText: java.lang.String): ImageOcrData = {
    val __obj = js.Dynamic.literal(ocrLanguageId = ocrLanguageId, ocrText = ocrText)
  
    __obj.asInstanceOf[ImageOcrData]
  }
}

