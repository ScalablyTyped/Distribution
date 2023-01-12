package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchematizedData extends StObject {
  
  /** JSON output of the parser. */
  var data: js.UndefOr[String] = js.undefined
  
  /** The error output of the parser. */
  var error: js.UndefOr[String] = js.undefined
}
object SchematizedData {
  
  inline def apply(): SchematizedData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchematizedData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SchematizedData] (val x: Self) extends AnyVal {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
  }
}
