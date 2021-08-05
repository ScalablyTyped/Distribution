package typings.node.http2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecureServerOptions
  extends StObject
     with SecureServerSessionOptions {
  
  var allowHTTP1: js.UndefOr[Boolean] = js.undefined
  
  var origins: js.UndefOr[js.Array[String]] = js.undefined
}
object SecureServerOptions {
  
  inline def apply(): SecureServerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecureServerOptions]
  }
  
  extension [Self <: SecureServerOptions](x: Self) {
    
    inline def setAllowHTTP1(value: Boolean): Self = StObject.set(x, "allowHTTP1", value.asInstanceOf[js.Any])
    
    inline def setAllowHTTP1Undefined: Self = StObject.set(x, "allowHTTP1", js.undefined)
    
    inline def setOrigins(value: js.Array[String]): Self = StObject.set(x, "origins", value.asInstanceOf[js.Any])
    
    inline def setOriginsUndefined: Self = StObject.set(x, "origins", js.undefined)
    
    inline def setOriginsVarargs(value: String*): Self = StObject.set(x, "origins", js.Array(value :_*))
  }
}
