package typings.oidcProvider.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgnoreExpiration extends StObject {
  
  var ignoreExpiration: js.UndefOr[Boolean] = js.undefined
}
object IgnoreExpiration {
  
  inline def apply(): IgnoreExpiration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgnoreExpiration]
  }
  
  extension [Self <: IgnoreExpiration](x: Self) {
    
    inline def setIgnoreExpiration(value: Boolean): Self = StObject.set(x, "ignoreExpiration", value.asInstanceOf[js.Any])
    
    inline def setIgnoreExpirationUndefined: Self = StObject.set(x, "ignoreExpiration", js.undefined)
  }
}
