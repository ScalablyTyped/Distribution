package typings.node.http2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecureServerOptions extends SecureServerSessionOptions {
  
  var allowHTTP1: js.UndefOr[Boolean] = js.native
  
  var origins: js.UndefOr[js.Array[String]] = js.native
}
object SecureServerOptions {
  
  @scala.inline
  def apply(): SecureServerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecureServerOptions]
  }
  
  @scala.inline
  implicit class SecureServerOptionsMutableBuilder[Self <: SecureServerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowHTTP1(value: Boolean): Self = StObject.set(x, "allowHTTP1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowHTTP1Undefined: Self = StObject.set(x, "allowHTTP1", js.undefined)
    
    @scala.inline
    def setOrigins(value: js.Array[String]): Self = StObject.set(x, "origins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginsUndefined: Self = StObject.set(x, "origins", js.undefined)
    
    @scala.inline
    def setOriginsVarargs(value: String*): Self = StObject.set(x, "origins", js.Array(value :_*))
  }
}
