package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalizedString extends StObject {
  
  /** A map of arguments used when creating the localized message. Keys represent parameter names which may be used by the localized version when substituting dynamic values. */
  var args: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientSpanner.maximMazurokGapiClientSpannerStrings.LocalizedString & TopLevel[Any]
  ] = js.undefined
  
  /** The canonical English version of this message. If no token is provided or the front-end has no message associated with the token, this text will be displayed as-is. */
  var message: js.UndefOr[String] = js.undefined
  
  /** The token identifying the message, e.g. 'METRIC_READ_CPU'. This should be unique within the service. */
  var token: js.UndefOr[String] = js.undefined
}
object LocalizedString {
  
  inline def apply(): LocalizedString = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalizedString]
  }
  
  extension [Self <: LocalizedString](x: Self) {
    
    inline def setArgs(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientSpanner.maximMazurokGapiClientSpannerStrings.LocalizedString & TopLevel[Any]
    ): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}
