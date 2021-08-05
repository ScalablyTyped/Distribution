package typings.msRest.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApiKeyCredentialOptions extends StObject {
  
  /**
    * @property {object} [inHeader]  A key value pair of the header parameters that need to be applied to the request.
    */
  var inHeader: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  /**
    * @property {object} [inQuery]   A key value pair of the query parameters that need to be applied to the request.
    */
  var inQuery: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}
object ApiKeyCredentialOptions {
  
  inline def apply(): ApiKeyCredentialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiKeyCredentialOptions]
  }
  
  extension [Self <: ApiKeyCredentialOptions](x: Self) {
    
    inline def setInHeader(value: StringDictionary[js.Any]): Self = StObject.set(x, "inHeader", value.asInstanceOf[js.Any])
    
    inline def setInHeaderUndefined: Self = StObject.set(x, "inHeader", js.undefined)
    
    inline def setInQuery(value: StringDictionary[js.Any]): Self = StObject.set(x, "inQuery", value.asInstanceOf[js.Any])
    
    inline def setInQueryUndefined: Self = StObject.set(x, "inQuery", js.undefined)
  }
}
