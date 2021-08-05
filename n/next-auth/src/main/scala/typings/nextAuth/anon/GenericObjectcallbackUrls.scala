package typings.nextAuth.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined next-auth.next-auth/_utils.GenericObject & {  callbackUrl :string | undefined} */
trait GenericObjectcallbackUrls
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var callbackUrl: js.UndefOr[String] = js.undefined
}
object GenericObjectcallbackUrls {
  
  inline def apply(): GenericObjectcallbackUrls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenericObjectcallbackUrls]
  }
  
  extension [Self <: GenericObjectcallbackUrls](x: Self) {
    
    inline def setCallbackUrl(value: String): Self = StObject.set(x, "callbackUrl", value.asInstanceOf[js.Any])
    
    inline def setCallbackUrlUndefined: Self = StObject.set(x, "callbackUrl", js.undefined)
  }
}
