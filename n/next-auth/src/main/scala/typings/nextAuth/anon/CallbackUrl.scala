package typings.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallbackUrl extends StObject {
  
  var callbackUrl: js.UndefOr[String] = js.native
}
object CallbackUrl {
  
  @scala.inline
  def apply(): CallbackUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallbackUrl]
  }
  
  @scala.inline
  implicit class CallbackUrlMutableBuilder[Self <: CallbackUrl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallbackUrl(value: String): Self = StObject.set(x, "callbackUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallbackUrlUndefined: Self = StObject.set(x, "callbackUrl", js.undefined)
  }
}
