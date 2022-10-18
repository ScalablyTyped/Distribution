package typings.openui5.anon

import typings.openui5.float
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LengthComputable extends StObject {
  
  /**
    * The name of a file to be uploaded.
    */
  var fileName: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether or not the relative upload progress can be calculated out of loaded and total.
    */
  var lengthComputable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The number of bytes of the file which have been uploaded by the time the event was fired.
    */
  var loaded: js.UndefOr[float] = js.undefined
  
  /**
    * Http-Request-Headers.
    *
    * Required for receiving `requestHeaders` is to set the property `sendXHR` to true. This property is not
    * supported by Internet Explorer 9.
    */
  var requestHeaders: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  /**
    * The total size of the file to be uploaded in bytes.
    */
  var total: js.UndefOr[float] = js.undefined
}
object LengthComputable {
  
  inline def apply(): LengthComputable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LengthComputable]
  }
  
  extension [Self <: LengthComputable](x: Self) {
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    inline def setLengthComputable(value: Boolean): Self = StObject.set(x, "lengthComputable", value.asInstanceOf[js.Any])
    
    inline def setLengthComputableUndefined: Self = StObject.set(x, "lengthComputable", js.undefined)
    
    inline def setLoaded(value: float): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
    
    inline def setLoadedUndefined: Self = StObject.set(x, "loaded", js.undefined)
    
    inline def setRequestHeaders(value: js.Array[js.Object]): Self = StObject.set(x, "requestHeaders", value.asInstanceOf[js.Any])
    
    inline def setRequestHeadersUndefined: Self = StObject.set(x, "requestHeaders", js.undefined)
    
    inline def setRequestHeadersVarargs(value: js.Object*): Self = StObject.set(x, "requestHeaders", js.Array(value*))
    
    inline def setTotal(value: float): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
  }
}
