package typings.opentok.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialOptions extends StObject {
  
  var auth: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var from: String
  
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var observeForceMute: js.UndefOr[Boolean] = js.undefined
  
  var secure: Boolean
  
  var video: js.UndefOr[Boolean] = js.undefined
}
object DialOptions {
  
  inline def apply(from: String, secure: Boolean): DialOptions = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DialOptions] (val x: Self) extends AnyVal {
    
    inline def setAuth(value: StringDictionary[String]): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setObserveForceMute(value: Boolean): Self = StObject.set(x, "observeForceMute", value.asInstanceOf[js.Any])
    
    inline def setObserveForceMuteUndefined: Self = StObject.set(x, "observeForceMute", js.undefined)
    
    inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    
    inline def setVideo(value: Boolean): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    inline def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
  }
}
