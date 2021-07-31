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
  
  @scala.inline
  def apply(): GenericObjectcallbackUrls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenericObjectcallbackUrls]
  }
  
  @scala.inline
  implicit class GenericObjectcallbackUrlsMutableBuilder[Self <: GenericObjectcallbackUrls] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallbackUrl(value: String): Self = StObject.set(x, "callbackUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallbackUrlUndefined: Self = StObject.set(x, "callbackUrl", js.undefined)
  }
}
