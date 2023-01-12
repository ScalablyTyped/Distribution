package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryAccessibleDataResponse extends StObject {
  
  /** List of files, each of which contains a list of data_id(s) that are consented for a specified use in the request. */
  var gcsUris: js.UndefOr[js.Array[String]] = js.undefined
}
object QueryAccessibleDataResponse {
  
  inline def apply(): QueryAccessibleDataResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryAccessibleDataResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryAccessibleDataResponse] (val x: Self) extends AnyVal {
    
    inline def setGcsUris(value: js.Array[String]): Self = StObject.set(x, "gcsUris", value.asInstanceOf[js.Any])
    
    inline def setGcsUrisUndefined: Self = StObject.set(x, "gcsUris", js.undefined)
    
    inline def setGcsUrisVarargs(value: String*): Self = StObject.set(x, "gcsUris", js.Array(value*))
  }
}
