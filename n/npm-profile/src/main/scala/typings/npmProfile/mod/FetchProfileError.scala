package typings.npmProfile.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FetchProfileError
  extends StObject
     with Error {
  
  var body: js.typedarray.Uint8Array
  
  var code: String
  
  var headers: StringDictionary[Any]
  
  var method: String
  
  var pkgid: js.UndefOr[String] = js.undefined
  
  var statucCode: Double
  
  var uri: String
}
object FetchProfileError {
  
  inline def apply(
    body: js.typedarray.Uint8Array,
    code: String,
    headers: StringDictionary[Any],
    message: String,
    method: String,
    name: String,
    statucCode: Double,
    uri: String
  ): FetchProfileError = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], statucCode = statucCode.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchProfileError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FetchProfileError] (val x: Self) extends AnyVal {
    
    inline def setBody(value: js.typedarray.Uint8Array): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: StringDictionary[Any]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setPkgid(value: String): Self = StObject.set(x, "pkgid", value.asInstanceOf[js.Any])
    
    inline def setPkgidUndefined: Self = StObject.set(x, "pkgid", js.undefined)
    
    inline def setStatucCode(value: Double): Self = StObject.set(x, "statucCode", value.asInstanceOf[js.Any])
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
