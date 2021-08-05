package typings.officeJs.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a slice of a document file. The Slice object is accessed with the `File.getSliceAsync` method.
  */
trait Slice extends StObject {
  
  /**
    * Gets the raw data of the file slice in `Office.FileType.Text` or `Office.FileType.Compressed` format as specified 
    * by the `fileType` parameter of the call to the `Document.getFileAsync` method.
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
  
  inline def apply(data: js.Any, index: Double, size: Double): Slice = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Slice]
  }
  
  extension [Self <: Slice](x: Self) {
    
    inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
