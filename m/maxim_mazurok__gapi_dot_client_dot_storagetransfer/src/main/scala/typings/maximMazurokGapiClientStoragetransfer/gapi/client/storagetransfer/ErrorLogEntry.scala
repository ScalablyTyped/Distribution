package typings.maximMazurokGapiClientStoragetransfer.gapi.client.storagetransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorLogEntry extends StObject {
  
  /** A list of messages that carry the error details. */
  var errorDetails: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Required. A URL that refers to the target (a data source, a data sink, or an object) with which the error is associated. */
  var url: js.UndefOr[String] = js.undefined
}
object ErrorLogEntry {
  
  inline def apply(): ErrorLogEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorLogEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ErrorLogEntry] (val x: Self) extends AnyVal {
    
    inline def setErrorDetails(value: js.Array[String]): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
    
    inline def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
    
    inline def setErrorDetailsVarargs(value: String*): Self = StObject.set(x, "errorDetails", js.Array(value*))
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
