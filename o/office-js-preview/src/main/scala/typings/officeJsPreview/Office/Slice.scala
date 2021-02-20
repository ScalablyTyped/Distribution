package typings.officeJsPreview.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a slice of a document file. The Slice object is accessed with the `File.getSliceAsync` method.
  */
@js.native
trait Slice extends StObject {
  
  /**
    * Gets the raw data of the file slice in `Office.FileType.Text` or `Office.FileType.Compressed` format as specified
    * by the `fileType` parameter of the call to the `Document.getFileAsync` method.
    *
    * @remarks
    *
    * Files in the "compressed" format will return a byte array that can be transformed to a base64-encoded string if required.
    */
  var data: js.Any = js.native
  
  /**
    * Gets the zero-based index of the file slice.
    */
  var index: Double = js.native
  
  /**
    * Gets the size of the slice in bytes.
    */
  var size: Double = js.native
}
object Slice {
  
  @scala.inline
  def apply(data: js.Any, index: Double, size: Double): Slice = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Slice]
  }
  
  @scala.inline
  implicit class SliceMutableBuilder[Self <: Slice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
