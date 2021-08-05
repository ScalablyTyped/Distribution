package typings.naverWhale.whale.webRequest

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadData extends StObject {
  
  /** Optional. An ArrayBuffer with a copy of the data. */
  var bytes: js.UndefOr[ArrayBuffer] = js.undefined
  
  /** Optional. A string with the file's path and name. */
  var file: js.UndefOr[String] = js.undefined
}
object UploadData {
  
  inline def apply(): UploadData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadData]
  }
  
  extension [Self <: UploadData](x: Self) {
    
    inline def setBytes(value: ArrayBuffer): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
    
    inline def setBytesUndefined: Self = StObject.set(x, "bytes", js.undefined)
    
    inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
  }
}
