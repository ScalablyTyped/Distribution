package typings.officeDashJs.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a slice of a document file. The Slice object is accessed with the `File.getSliceAsync` method.
  */
trait Slice extends js.Object {
  /**
    * Gets the raw data of the file slice in `Office.FileType.Text` ("text") or `Office.FileType.Compressed` ("compressed") format as specified 
    * by the fileType parameter of the call to the Document.getFileAsync method.
    *
    * @remarks
    * 
    * Files in the "compressed" format will return a byte array that can be transformed to a base64-encoded string if required.
    */
  var data: js.Any
  /**
    * Gets the zero-based index of the file slice.
    */
  var index: Double
  /**
    * Gets the size of the slice in bytes.
    */
  var size: Double
}

object Slice {
  @scala.inline
  def apply(data: js.Any, index: Double, size: Double): Slice = {
    val __obj = js.Dynamic.literal(data = data, index = index, size = size)
  
    __obj.asInstanceOf[Slice]
  }
}

